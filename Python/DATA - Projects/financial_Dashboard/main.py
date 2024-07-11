# bokeh serve --show main.py
import math
import datetime as dt

import numpy as np
import yfinance as yf

from bokeh.io import curdoc
from bokeh.plotting import figure
from bokeh.layouts import row, column
from bokeh.models import TextInput, Button, DatePicker, MultiChoice


def load_data(ticker1, ticker2, start, end):
    df1 = yf.download(ticker1, start, end)
    df2 = yf.download(ticker2, start, end)
    return df1, df2


def plot_data(data, indicators, sync_axis=None):
  df = data
  gain = df.Close > df.Open
  loss = df.Open > df.Close
  width = 12 * 60 * 60 * 1000

  if sync_axis is None:
    p = figure(x_axis_type='datetime', tools='pan,wheel_zoom,box_zoom,reset,save', width=1000, x_range=sync_axis)
  else:
    p = figure(x_axis_type='datetime', tools='pan,wheel_zoom,box_zoom,reset,save', width=1000)

  p.xaxis.major_label_orientation = math.pi / 4
  p.grid.grid_line_alpha = 0.25

  p.segment(df.index, df.High, df.index, df.Low, color='black')
  p.vbar(df.index[gain], width, df.Open[gain], df.Close[gain], fill_color='#00FF00', line_color='#00FF00')
  p.vbar(df.index[loss], width, df.Open[loss], df.Close[loss], fill_color='#FF0000', line_color='#FF0000')


  for indicator in indicators:
    if indicator == '30 DAY SMA':
      df['SMA30'] = df['Close'].rolling(30).mean()
      p.line(df.index, df.SMA30, color='blue', legend_label='30 DAY SMA')
    elif indicator == '100 DAY SMA':
      df['SMA100'] = df['Close'].rolling(100).mean()
      p.line(df.index, df.SMA100, color='green', legend_label='100 DAY SMA')
    elif indicator == 'Linear Regression Line':
      par = np.polyfit(range(len(df.index.values)), df.Close.values, 1, full=True)
      slope = par[0][0]
      intercept = par[0][1]
      y_pred = [slope * i + intercept for i in range(len(df.index.values))]
      p.segment(df.index[0], y_pred[0], df.index[-1], color='red', legend_label='Linear Regression Line')


    p.legend.location = 'top_left'
    p.legend.click_policy = 'hide'

  return p


def on_button_clicked(ticker1, ticker2, start, end, indicators):
  df1, df2 = load_data(ticker1, ticker2, start, end)
  pl1 = plot_data(df1, indicators)
  pl2 = plot_data(df2, indicators, sync_axis=pl1.x_range)

  curdoc().clear()
  curdoc().add_root(layout)
  curdoc().add_root(row(pl1, pl2))


stock1_text = TextInput(title='Stock 1')
stock2_text = TextInput(title='Stock 2')


date_Picker_From = DatePicker(title='Start Date', value='2024-01-01', 
                        min_date='2000-01-01', max_date=dt.datetime.now().strftime('%Y-%m-%d'))

date_Picker_To = DatePicker(title='End Date', value='2024-02-01', 
                        min_date='2000-01-01', max_date=dt.datetime.now().strftime('%Y-%m-%d'))


indicators_Choice = MultiChoice(title='Indicators', options=['100 DAY SMA', '30 DAY SMA', 'Linear Regression Line'])


load_button = Button(label='Load Data', button_type='success')
load_button.on_click(lambda: on_button_clicked(stock1_text.value, stock2_text.value, 
                                               date_Picker_From.value, date_Picker_To.value,
                                               indicators_Choice.value))


layout = column(stock1_text, stock2_text, date_Picker_From, date_Picker_To, indicators_Choice, load_button)

curdoc().clear()
curdoc().add_root(layout)
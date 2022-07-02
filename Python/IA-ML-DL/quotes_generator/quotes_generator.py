import requests
import csv

url = 'http://quotes.toscrape.com'
html = requests.get(url)
bs = BeautifulSoup(html.text, 'html.parse')

try:
    csv_file = open('quote_list.csv', 'w')
    fieldNames = ['quote', 'author', 'tags']
    dictWriter = csv.DictWriter(csv_file, fieldNames=fieldNames)
    dictWriter.writeheader().dictWriter.writeheader()
    
    while True:
        for quote in bs.findall('div', {'class':'quote'}):
            text = quote.find('span', {'class':'text'}).text
            author = quote.find('small', {'class':'author'}).text
            tags = []
            
            for tag in quote.findall('a', {'class':'tag'}):
                tags.append(tag.text)

dictriter.writerow({'quote':text, 'author':author, 'tags':tags})
            next = bs.find('li', {'class':'next'})
        if not next:
            

from time import time
import time
import webbrowser
from matplotlib.pyplot import text
import pyttsx3  #pip install pyttsx3
import speech_recognition as spr    #pip install SpeechRecognition
import os

#Creating voice engine for computer speaking
eng = pyttsx3.init('sapi5') #sapi5 is the microsoft api
voice = eng.getProperty('voices')
eng.setProperty('voice', voice[0].id)
def speaking(speech):
    eng.say(speech)
    eng.runAndWait()

#creating the wishing and command listing function
#wishing function
def wishing():
    speaking('How are you Mike, Hope you are doing well, How can I help you')

#function to listen the voice and convert it into text
def command():
    recognizer = spr.Recognizer()
    recognizer.energy_threshold=400
    with spr.Microphone() as mic:
        print('Speak now ......')
        listen = recognizer.listen(mic)
        try:
            print('Searching your commmand...')
            text = recognizer.recognize_google(listen)
            print(f'you : {text}')
        except:
            print('Cannot recognise')
            return 'None'
    return text

#Calling the wishing function and listen to the commands to open the application
#calling the wishing function first
wishing()
#main loop which takes the command and opens the application
while True:
    time.sleep(2)
    command_text = command().lower()
    if 'youtube' in command_text:
        speaking('Opening youtube')
        time.sleep(1)
        webbrowser.open('youtube.com')
    elif 'play music' in command_text:
        speaking('Playing songs')
        time.sleep(1)
        music_dir = 'D:\songs'
        songs = os.listdir(music_dir)
        os.startfile(os.path.join(music_dir, songs[0]))
    elif 'code' in command_text:
        speaking('Opening your favorite code editor')
        time.sleep(1)
        vscode_path = 'C:\Users\HP\MIKE_ISCMicrosoft VS Code\Code.exe'
        os.startfile(vscode_path)
    elif " quit" in command_text:
        speaking(' shutting down')
        break
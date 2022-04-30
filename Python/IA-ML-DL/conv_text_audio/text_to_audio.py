#   Convert Text Into Audio
#   Install gtts(Google Text-to-Speech) --> pip install gTTS
#   Install playsound --> pip install playsound
from gtts import gTTS
from playsound import playsound

audio = 'speech.mp3'
languaje = 'en'
# Enter your text which u want to convert into audio file
speech_a = gTTS(text = "This is a program to convert text into Audio",
                lang = languaje, slow=False)


speech_a.save(audio)
playsound(audio)
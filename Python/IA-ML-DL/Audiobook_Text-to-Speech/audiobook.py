#   pip install PyPDF2
import PyPDF2
from PyPDF2 import PdfReader
#   pip install pyttsx3
import pyttsx3


book = open('./books/Hábitos_Atómicos.pdf', 'rb')
pdf = PyPDF2.PdfFileReader(book)
pages = pdf.numPages



speaker = pyttsx3.init()

for i in range(2, pages):
    page = pdf.getPage(i)
    text = page.extractText()
    
    speaker.setProperty('rate', 150)
    voice = speaker.getProperty('voices')
    speaker.setProperty('voice', voice[0].id)

    speaker.say(text)
    speaker.runAndWait()
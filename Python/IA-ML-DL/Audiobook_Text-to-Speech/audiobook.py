#   pip install PyPDF2
import PyPDF2
from PyPDF2 import PdfReader
#   pip install pyttsx3
import pyttsx3


book = open('./books/Hábitos_Atómicos.pdf', 'rb')
pdf = PyPDF2.PdfFileReader(book)
pages = pdf.numPages




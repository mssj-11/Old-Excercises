import wikipedia    # pip install wikipedia

text = input("Buscar:\n")
wikipedia.set_lang("es")    # Idioma de resultados (es, en)
info = wikipedia.summary(text)

print("\nResultado: ", info)
#
# Un animal. py
#
importar sys

if sys.version> '3': raw_input = input # Python 3

Nodo de clase:
    "Los objetos de nodo tienen una pregunta y el puntero izquierdo y derecho a otros nodos"
    def __init__ (self, question, left = None, right = None):
        self.question = pregunta
        self.left = izquierda
        self.right = correcto

def si (ques):
    "El usuario responde 'sí' o algo similar. De lo contrario, es un no"
    mientras que es cierto:
        ans = raw_input (ques)
        ans = ans [0: 1] .lower ()
        if ans == 'y': return True
        else: return False

conocimiento = nodo ("pájaro")

def principal ():
    "Adivina el animal. Agrega un nuevo nodo para una suposición incorrecta".

    mientras que es cierto:
        print ("") # salto de línea, ya sea Python 2 o 3
        si no es así ("¿Estás pensando en un animal?"): rompe
        p = conocimiento
        while p.left! = Ninguno:
            en caso afirmativo (p.question + "?"): p = p.right
            si no: p = p.izquierda
    
        Si es así ("¿Es una" + p.question + "?"): continúe
        animal = raw_input ("¿Cuál es el nombre de los animales?")
        question = raw_input ("¿Qué pregunta distinguiría a% s de% s?"
                                  % (animal, p. pregunta))
        p.left = Nodo (p.question)
        p.right = Nodo (animal)
        p.question = question
    
        si no es así ("Si el animal fuera% s, la respuesta sería?"% animal):
            (p.derecha, p.izquierda) = (p.izquierda, p.derecha)

if __name__ == "__main__": main ()
import copy
 
class estructura:
    def __init__(self, estado, canoa):
        self.estado = estado
        self.canoa = canoa
        if not self.es_valido():
            raise ValueError("Estado no Válido")
 
    def es_valido(self):
        """Verifica si el estado es válido."""
        # evitamos un número inválido de personas
        for gente in self.estado:
            for persona in gente:
                if persona > 3 or persona < 0:
                    return False
        # los canibales nunca pueden superar a los misioneros
        for mis, can in self.estado:
            if mis and can > mis:
                return False
        return True
 
    def viaja(self, gente):
        """
            Genera un nuevo estado basado en el actual y aplicando un
            viaje como parámetro
        """
        estado = copy.deepcopy(self.estado)
        canoa = self.canoa
        estado[canoa][0] -= gente[0]
        estado[canoa][1] -= gente[1]
        canoa = 0 if canoa else 1
        estado[canoa][0] += gente[0]
        estado[canoa][1] += gente[1]
        return estructura(estado, canoa)
 
    def __str__(self):
        """Muestra el estado como una representación en texto"""
        return "M: %d C: %d | %s\\___/%s | M: %d C: %d" % (
            self.estado[0][0],
            self.estado[0][1],
            "~" * 8 * self.canoa,
            "~" * (8 - 8 * self.canoa),
            self.estado[1][0],
            self.estado[1][1],
        )
 
    def __eq__(self, other):
        return self.estado == other.estado and self.canoa == other.canoa
 
    def __ne__(self, other):
        return not self.__eq__(other)
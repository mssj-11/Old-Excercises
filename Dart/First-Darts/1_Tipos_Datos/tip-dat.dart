/*
    En DART se pueden declarar variables de tipado fuerte y dinamico
    Tipado Dinamico: El compilador de DART le asigna el tipo de dato dependido del valor que tenga
    Fuertemente Tipado: En dondde le podemos definir el tipo de dato a las variables al momento de su declaracion

    Tipos de datos:
    int, double, num(int-double)
    Cadenas de texto: String
    Valores de V o F: bool
    Tipo Propio de DART: dynamic (dinamico, pueden cambiar de int a string, bool etc)
*/


void main(){

    var nombre = "Michael";
    var edad = 23;

    print("Tipos de datos en DART");
    print("Mi Nombre es: $nombre & Tengo $edad");
}
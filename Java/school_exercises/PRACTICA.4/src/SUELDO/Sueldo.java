package SUELDO;

public class Sueldo {

    String Nombre_empleado;
    double Sueldo;

    public Sueldo(String Nombre_empleado, double Sueldo) {
        this.Nombre_empleado = Nombre_empleado;
        this.Sueldo = Sueldo;
    }

    public String getNombre_empleado() {
        return Nombre_empleado;
    }

    public void setNombre_empleado(String Nombre_empleado) {
        this.Nombre_empleado = Nombre_empleado;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void imprimir(){
    System.out.println(" Nombre "+ Nombre_empleado);
    System.out.println(" Sueldo "+ Sueldo);
    }
    
}

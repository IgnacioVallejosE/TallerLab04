package Estructura;

public class Desaparecidos extends Persona {
    private int cantidadPDesaparecidas;
    public Desaparecidos (int ccantidadPDesaparecidas, int edad, String sexo, String nombre){
        super(edad, sexo, nombre);
        this.cantidadPDesaparecidas=cantidadPDesaparecidas;
    }
}

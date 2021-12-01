package Estructura;

public class Persona {
    protected int edad;
    protected String nombre;
    protected String sexo;

    public Persona(int edad, String nombre, String sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }
}

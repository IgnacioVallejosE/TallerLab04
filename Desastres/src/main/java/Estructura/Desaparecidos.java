package Estructura;

public class Desaparecidos extends Persona {
    private int cantidadPDesaparecidas;
    private String estado;
    public Desaparecidos (int ccantidadPDesaparecidas, int edad, String sexo, String nombre, String estado){
        super(edad, sexo, nombre);
        this.cantidadPDesaparecidas=cantidadPDesaparecidas;
        this.estado=estado;
    }

    public int getCantidadPDesaparecidas() {
        return cantidadPDesaparecidas;
    }

    public void setCantidadPDesaparecidas(int cantidadPDesaparecidas) {
        this.cantidadPDesaparecidas = cantidadPDesaparecidas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

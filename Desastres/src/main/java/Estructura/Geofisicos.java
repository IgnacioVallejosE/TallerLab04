package Estructura;

public class Geofisicos {
    private int cantidadDesastres;
    private int fecha;
    private String tipoDesastre;
    private String lugar;

    public Geofisicos(int cantidadDesastres, int fecha, String tipoDesastre, String lugar) {
        this.cantidadDesastres = cantidadDesastres;
        this.fecha = fecha;
        this.tipoDesastre = tipoDesastre;
        this.lugar = lugar;
    }

    public int getCantidadDesastres() {
        return cantidadDesastres;
    }

    public void setCantidadDesastres(int cantidadDesastres) {
        this.cantidadDesastres = cantidadDesastres;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getTipoDesastre() {
        return tipoDesastre;
    }

    public void setTipoDesastre(String tipoDesastre) {
        this.tipoDesastre = tipoDesastre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void detalleDesastre(){

    }
}
}

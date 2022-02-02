package co.com.bancolombia.ejerciciouno.model;

public class Persona {
    protected String estadoCivil;
    protected int cantidadHijos;
    protected int cantidadHermanos;
    protected String nombreDelPadre;
    protected String nombreDeLaMadre;

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public int getCantidadHermanos() {
        return cantidadHermanos;
    }

    public void setCantidadHermanos(int cantidadHermanos) {
        this.cantidadHermanos = cantidadHermanos;
    }

    public String getNombreDelPadre() {
        return nombreDelPadre;
    }

    public void setNombreDelPadre(String nombreDelPadre) {
        this.nombreDelPadre = nombreDelPadre;
    }

    public String getNombreDeLaMadre() {
        return nombreDeLaMadre;
    }

    public void setNombreDeLaMadre(String nombreDeLaMadre) {
        this.nombreDeLaMadre = nombreDeLaMadre;
    }


}

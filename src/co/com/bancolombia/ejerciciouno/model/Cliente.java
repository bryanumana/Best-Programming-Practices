package co.com.bancolombia.ejerciciouno.model;

public class Cliente {

    private int cedulaCliente;
    private String nombreCliente;
    private String primerApellidoCliente;
    private String segundoApellidoCliente;

    private String estadoCivil;
    private int cantidadHijos;
    private int cantidadHermanos;
    private String nombreDelPadre;
    private String nombreDeLaMadre;

    public Cliente() {
    }

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

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPrimerApellidoCliente() {
        return primerApellidoCliente;
    }

    public void setPrimerApellidoCliente(String primerApellidoCliente) {
        this.primerApellidoCliente = primerApellidoCliente;
    }

    public String getSegundoApellidoCliente() {
        return segundoApellidoCliente;
    }

    public void setSegundoApellidoCliente(String segundoApellidoCliente) {
        this.segundoApellidoCliente = segundoApellidoCliente;
    }


    public void imprimirInformacionFamiliar(){
        System.out.println("Estado civil:" + this.getEstadoCivil());
        System.out.println("Número de hijos:" + this.getCantidadHijos());
        System.out.println("Número de hermanos: " + this.getCantidadHermanos());
        System.out.println("Nombre del padre: " + this.getNombreDelPadre());
        System.out.println("Nombre de la madre: " + this.getNombreDeLaMadre());
        System.out.println("");
    }
    public void imprimirInformacionCliente(){
        System.out.println("Número de cedula:" + this.getCedulaCliente());
        System.out.println("Nombre: " + this.getNombreCliente());
        System.out.println("Primer Apellido: " + this.getPrimerApellidoCliente());
        System.out.println("Segundo Apellido: " + this.getSegundoApellidoCliente());
        System.out.println("");
    }




}



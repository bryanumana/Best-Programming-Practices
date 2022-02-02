package co.com.bancolombia.ejerciciouno.model;

public class Cliente extends Persona{

    private int cedulaCliente;
    private String nombreCliente;
    private String primerApellidoCliente;
    private String segundoApellidoCliente;



    public Cliente() {
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



    public void imprimirInformacionCliente(){
        System.out.println("Número de cedula:" + this.getCedulaCliente());
        System.out.println("Nombre: " + this.getNombreCliente());
        System.out.println("Primer Apellido: " + this.getPrimerApellidoCliente());
        System.out.println("Segundo Apellido: " + this.getSegundoApellidoCliente());
        System.out.println("");
    }

    public void imprimirInformacionFamiliar(){
        System.out.println("Estado civil:" + this.getEstadoCivil());
        System.out.println("Número de hijos:" + this.getCantidadHijos());
        System.out.println("Número de hermanos: " + this.getCantidadHermanos());
        System.out.println("Nombre del padre: " + this.getNombreDelPadre());
        System.out.println("Nombre de la madre: " + this.getNombreDeLaMadre());
        System.out.println("");
    }




}



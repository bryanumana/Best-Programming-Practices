package co.com.bancolombia.ejerciciouno.model;

public class Compra {

    private final int idOrden;
    private Producto[] compras;
    private static int contadorCompras;
    private int contadorProductos;

    public Compra() {
        this.idOrden = ++contadorCompras;
        this.compras = new Producto[10];
    }

    public void agregarComputadora(Producto computadora) {
        if (this.contadorProductos < 10) {
            this.compras[this.contadorProductos++] = computadora;
        } else {
            System.out.println("Has superado el limite: 10");
        }

    }

    public void mostrarOrden() {
        System.out.println("PRODUCTOS COMPRADOS POR EL CLIENTE");
        System.out.println("Orden:" + this.idOrden);

        for(int i = 0; i < this.contadorProductos; ++i) { System.out.println("Producto: " + this.compras[i].getNombreProducto()); }

    }
}


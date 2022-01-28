package co.com.bancolombia.ejerciciouno.control;

import co.com.bancolombia.ejerciciouno.model.Cliente;
import co.com.bancolombia.ejerciciouno.model.Compra;
import co.com.bancolombia.ejerciciouno.model.Producto;

public class Control {
    public static void main(String[] args) {


        Cliente objCliente = new Cliente();

        objCliente.setCedulaCliente(123456789);
        objCliente.setNombreCliente("Antonio");
        objCliente.setPrimerApellidoCliente("Restrepo");
        objCliente.setSegundoApellidoCliente("Zapata");
        objCliente.setEstadoCivil("Casado");
        objCliente.setCantidadHijos(3);
        objCliente.setCantidadHermanos(4);
        objCliente.setNombreDelPadre("Jesús Zapata");
        objCliente.setNombreDeLaMadre("Patricia Restrepo");

        Producto cafe = new Producto();
        Producto maiz = new Producto();

        cafe.setNombreProducto("cafe");
        maiz.setNombreProducto("maiz");

        Compra orden1 = new Compra();
        orden1.agregarComputadora(cafe);
        orden1.agregarComputadora(maiz);

        System.out.println("_____INFORMACIÓN FAMILIAR_____");
        objCliente.imprimirInformacionFamiliar();

        System.out.println("_____INFORMACIÓN DEL CLIENTE_____");
        objCliente.imprimirInformacionCliente();

        System.out.println("_____INFORMACIÓN COMPLETA DEL CLIENTE_____");
        objCliente.imprimirInformacionCliente();
        orden1.mostrarOrden();
    }
}

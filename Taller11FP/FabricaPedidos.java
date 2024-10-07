import java.util.ArrayList;
import java.util.List;

public class FabricaPedidos {
    private int contadorPedidos = 0; 
    public Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        contadorPedidos++; 
        return new Pedido(contadorPedidos, cliente, productos);
    }

    public Cliente crearCliente(String nombre, String direccion) {
        return new Cliente(nombre, direccion);
    }

    public Producto crearProducto(String nombre, double precio, int cantidad) {
        return new Producto(nombre, precio, cantidad);
    }

    public static void main(String[] args) {
        FabricaPedidos fabrica = new FabricaPedidos();

        Cliente cliente = fabrica.crearCliente("katherin castano", "Calle F #12");

        List<Producto> productos = new ArrayList<>();
        productos.add(fabrica.crearProducto("Laptop", 800, 1));
        productos.add(fabrica.crearProducto("Ratón", 259, 2));
        productos.add(fabrica.crearProducto("Teclado", 450, 1));

        Pedido pedido = fabrica.crearPedido(cliente, productos);

        pedido.mostrarInfoPedido();
    }
}

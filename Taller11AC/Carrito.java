import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();
    private RepositorioProducto repositorio = new RepositorioProducto();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        System.out.println("Producto eliminado: " + producto.getNombre());
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void finalizarCompra() {
        for (Producto producto : productos) {
            repositorio.guardar(producto);
        }
        System.out.println("Total a pagar: " + calcularPrecioTotal());
    }
}

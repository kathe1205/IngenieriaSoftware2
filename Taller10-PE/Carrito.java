import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Libro> libros = new ArrayList<>();

    // Método para agregar libros al carrito
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para calcular el precio total del carrito
    public double calcularPrecioTotal() {
        double total = 0;
        for (Libro libro : libros) {
            total += libro.getPrecio() * libro.getCantidad();
        }
        return total;
    }
}

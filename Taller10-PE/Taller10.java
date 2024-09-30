public class Taller10 {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456", 20.99, 2);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "789012", 15.50, 1);

        // Crear un carrito y agregar libros
        Carrito carrito = new Carrito();
        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);

        // Calcular el precio total del carrito
        double total = carrito.calcularPrecioTotal();
        System.out.println("El precio total del carrito es: $" + total);
    }
}


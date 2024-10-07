public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.99, "Laptop de última generación");
        Producto producto2 = new Producto("Mouse", 25.50, "Mouse inalámbrico");

        Carrito carrito = new Carrito();

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        System.out.println("El precio total del carrito es: " + carrito.calcularPrecioTotal());

        carrito.finalizarCompra();
    }
}

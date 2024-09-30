public class Main {
    public static void main(String[] args) {
        Orden orden = new Orden();

        // Agregar computadoras a la orden
        orden.agregarComputadora("Intel Core i3", "NVIDIA GTX 3080", 16);
        orden.agregarComputadora("AMD Ryzen 5", "NVIDIA GTX 1660", 8);

        // Mostrar las computadoras de la orden
        orden.mostrarOrden();
    }
}

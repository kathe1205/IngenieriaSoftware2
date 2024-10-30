
public class Producto implements Cloneable {
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Método de clonación
    @Override
    public Producto clone() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Crear un producto original
        Producto productoOriginal = new Producto("Laptop", 1500.00, "Electrónica");

        // Clonar el producto
        Producto productoClonado = productoOriginal.clone();

        // Mostrar ambos productos
        System.out.println("Producto Original: " + productoOriginal);
        System.out.println("Producto Clonado: " + productoClonado);
    }
}

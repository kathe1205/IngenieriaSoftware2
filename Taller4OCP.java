abstract class Calculo {
    private String producto;
    private int cantidad;
    private int precio;

    public Calculo(String producto, int cantidad, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public int getPrecio() {
        return precio;
    }
    public abstract double calcularImpuesto();
}

class CalculoImpuestoIva extends Calculo {
    public CalculoImpuestoIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }
    @Override
    public double calcularImpuesto() {
        return getCantidad() * getPrecio() * 0.19;
    }
}
class CalculoImpuestoSaludable extends Calculo {
    public CalculoImpuestoSaludable(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }
    @Override
    public double calcularImpuesto() {
        return getCantidad() * getPrecio() * 0.05;
    }
}
class CalculoImpuestoReteIva extends Calculo {
    public CalculoImpuestoReteIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }
    @Override
    public double calcularImpuesto() {
        return getCantidad() * getPrecio() * 0.10;
    }
}

public class FacturacionOCP {
    public static void main(String[] args) {
        Calculo iva = new CalculoImpuestoIva("Manzana", 2, 5000);
        double impuestoIVA = iva.calcularImpuesto();
        System.out.println("El impuesto IVA para el producto " + iva.getProducto() + " es: $" + impuestoIVA);

        Calculo reteiva = new CalculoImpuestoReteIva("Arroz", 2, 18000);
        double impuestoReteIVA = reteiva.calcularImpuesto();
        System.out.println("El impuesto ReteIVA para el producto " + reteiva.getProducto() + " es: $" + impuestoReteIVA);

        Calculo saludable = new CalculoImpuestoSaludable("Pollo", 2, 5000);
        double impuestoSaludable = saludable.calcularImpuesto();
        System.out.println("El impuesto a la salud para el producto " + saludable.getProducto() + " es: $" + impuestoSaludable);
    }
}

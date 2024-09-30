import java.util.ArrayList;
import java.util.List;

class Entrada {
    private String tipo;
    private double precio;
    private boolean disponible;

    public Entrada(String tipo, double precio, boolean disponible) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

 class ControladorVenta {
    private List<Entrada> entradas = new ArrayList<>();

    public ControladorVenta() {
        entradas.add(new Entrada("General", 50.0, true));
        entradas.add(new Entrada("VIP", 150.0, true));
    }

    public void comprarEntrada(String tipoEntrada) {
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if (entrada != null) {
            if (entrada.isDisponible()) {
                if (procesarPago(entrada.getPrecio())) {
                    entrada.setDisponible(false);
                    System.out.println("Entrada comprada: " + tipoEntrada);
                } else {
                    System.out.println("Error en el procesamiento del pago.");
                }
            } else {
                System.out.println("La entrada '" + tipoEntrada + "' no está disponible.");
            }
        } else {
            System.out.println("No se encontró una entrada del tipo '" + tipoEntrada + "'.");
        }
    }

    private Entrada encontrarEntrada(String tipoEntrada) {
        for (Entrada entrada : entradas) {
            if (entrada.getTipo().equalsIgnoreCase(tipoEntrada)) {
                return entrada;
            }
        }
        return null;
    }

    private boolean procesarPago(double monto) {
        System.out.println("Procesando el pago de: $" + monto);
        return true; 
    }
}

public class Main1 {
    private ControladorVenta controlador = new ControladorVenta();

    public void comprar(String tipoEntrada) {
        controlador.comprarEntrada(tipoEntrada);
    }

    public static void main(String[] args) {
        Main1 usuario = new Main1();
        usuario.comprar("VIP");     
        usuario.comprar("General");  
        usuario.comprar("VIP");      
    }
}

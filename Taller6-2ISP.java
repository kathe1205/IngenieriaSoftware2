public class Main62 {

    public static void main(String[] args) {
        PaqueteGrande paqueteGrande = new PaqueteGrande(5.0, 10.0, 20.0, 30.0);
        PaquetePeligroso paquetePeligroso = new PaquetePeligroso(3.0, 5.0, 10.0, 15.0);
        PaquetePequeño paquetePequeño = new PaquetePequeño(1.0, 2.0, 3.0, 4.0);

        paqueteGrande.calcularCostoEnvioGrande();
        paquetePeligroso.verificarContenidoPeligroso();
        paquetePeligroso.asegurarPaquetePeligroso();
        paquetePequeño.calcularCostoEnvioPequeño();
    }
}

abstract class Paquete {
    private double peso;
    private double alto;
    private double ancho;
    private double largo;

    public Paquete(double peso, double alto, double ancho, double largo) {
        if (peso <= 0 || alto <= 0 || ancho <= 0 || largo <= 0) {
            throw new IllegalArgumentException("Los valores deben ser positivos.");
        }
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }
}

interface PaqueteG {
    void calcularCostoEnvioGrande();
}

class PaqueteGrande extends Paquete implements PaqueteG {
    private double volumen;

    public PaqueteGrande(double peso, double alto, double ancho, double largo) {
        super(peso, alto, ancho, largo);
        this.volumen = alto * ancho * largo;
    }

    @Override
    public void calcularCostoEnvioGrande() {
        double costo = (volumen * 0.1) + (getPeso() * 0.5); // Ejemplo de cálculo
        System.out.println("Costo de envío para paquete grande: " + costo);
    }
}

interface PaquetePg {
    void verificarContenidoPeligroso();
    void asegurarPaquetePeligroso();
}

// Clase para paquetes peligrosos
class PaquetePeligroso extends Paquete implements PaquetePg {
    private String etiquetasDePeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(double peso, double alto, double ancho, double largo) {
        super(peso, alto, ancho, largo);
        this.etiquetasDePeligro = "Etiquetas de peligro desconocidas";
        this.embalajeEspecial = false; // Asumir embalaje no especial por defecto
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Verificando contenido peligroso.");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        System.out.println("Asegurando paquete peligroso.");
    }
}

interface PaquetePq {
    void calcularCostoEnvioPequeño();
}

class PaquetePequeño extends Paquete implements PaquetePq {
    private double valorDeclarado;

    public PaquetePequeño(double peso, double alto, double ancho, double largo) {
        super(peso, alto, ancho, largo);
        this.valorDeclarado = 0.0; 
    }

    @Override
    public void calcularCostoEnvioPequeño() {
        double costo = (getAlto() * getAncho() * getLargo() * 0.05) + (getPeso() * 0.2); 
        System.out.println("Costo de envío para paquete pequeño: " + costo);
    }
}

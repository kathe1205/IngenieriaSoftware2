abstract class Paquete {
    protected double peso;
    protected String dimensiones;

    public Paquete(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public abstract void detallesPaquete();
}

class PaquetePequeno extends Paquete {
    private double valorDeclarado;

    public PaquetePequeno(double peso, String dimensiones, double valorDeclarado) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void detallesPaquete() {
        System.out.println("Paquete Pequeño -> Peso: " + peso + " kg, Dimensiones: " + dimensiones + ", Valor Declarado: $" + valorDeclarado);
    }
}

class PaqueteGrande extends Paquete {
    private double volumen;
    private String medioTransporte;

    public PaqueteGrande(double peso, String dimensiones, double volumen, String medioTransporte) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    @Override
    public void detallesPaquete() {
        System.out.println("Paquete Grande -> Peso: " + peso + " kg, Dimensiones: " + dimensiones + ", Volumen: " + volumen + " m3, Medio de Transporte: " + medioTransporte);
    }
}

class PaquetePeligroso extends Paquete {
    private String etiquetasPeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(double peso, String dimensiones, String etiquetasPeligro, boolean embalajeEspecial) {
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void detallesPaquete() {
        System.out.println("Paquete Peligroso -> Peso: " + peso + " kg, Dimensiones: " + dimensiones + ", Etiquetas de Peligro: " + etiquetasPeligro + ", Embalaje Especial: " + (embalajeEspecial ? "Sí" : "No"));
    }
}

public class Main7 {
    public static void main(String[] args) {
        PaquetePequeno pequeno = new PaquetePequeno(2.5, "30x20x10 cm", 150.0);
        PaqueteGrande grande = new PaqueteGrande(10.0, "100x50x50 cm", 0.25, "Marítimo");
        PaquetePeligroso peligroso = new PaquetePeligroso(5.0, "50x40x30 cm", "Inflamable", true);

        pequeno.detallesPaquete();
        grande.detallesPaquete();
        peligroso.detallesPaquete();
    }
}

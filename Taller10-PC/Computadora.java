public class Computadora {
    private String procesador;
    private String tarjetaGrafica;
    private int ram;

    public Computadora(String procesador, String tarjetaGrafica, int ram) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computadora [Procesador=" + procesador + ", Tarjeta Gráfica=" + tarjetaGrafica + ", RAM=" + ram + "GB]";
    }
}

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private FabricaComputadoras fabrica = new FabricaComputadoras();

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram) {
        Computadora computadora = fabrica.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
    }

    public void mostrarOrden() {
        if (computadoras.isEmpty()) {
            System.out.println("No hay computadoras en la orden.");
        } else {
            for (Computadora computadora : computadoras) {
                System.out.println(computadora);
            }
        }
    }
}


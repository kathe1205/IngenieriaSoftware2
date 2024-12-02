public class Main {
    public static void main(String[] args) {
        NuevoSistemaPagoOperacion nuevoSistema = new NuevoSistemaPagoOperacion();
        SistemaPago sistemaPago = new SistemaPagoAdapter(nuevoSistema);
        sistemaPago.realizarPago();
    }
}

public class Main {
    public static void main(String[] args) {
        ServicioEnvioFactory factoryExpress = new ServicioEnvioExpressFactory();
        ServicioEnvio servicioExpress = factoryExpress.crearServicioEnvio();
        servicioExpress.enviar("Documento importante");

        ServicioEnvioFactory factoryRegular = new ServicioEnvioRegularFactory();
        ServicioEnvio servicioRegular = factoryRegular.crearServicioEnvio();
        servicioRegular.enviar("Paquete estándar");
    }
}
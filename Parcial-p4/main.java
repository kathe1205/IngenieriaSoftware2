public class main {
    public static void main(String[] args) {
        Configuracion config1 = Configuracion.getInstance();
        config1.mostrarConfiguracion();

        Configuracion config2 = Configuracion.getInstance();
        System.out.println(config1 == config2);
    }
}
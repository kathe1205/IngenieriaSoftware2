public class Main {
    public static void main(String[] args) {
        EnviadorCorreo enviador = new EnviadorCorreo();

        GestorEnvioCorreos gestor = new GestorEnvioCorreos(enviador);

        CorreoElectronico correo = new CorreoElectronico("juan@example.com", "Hola", "Mensaje de prueba");

        gestor.enviarCorreo(correo);
    }
}

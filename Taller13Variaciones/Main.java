public class Main {
    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        
        Notificador notificador = new Notificador(canalCorreo);
        
        Notificacion notificacion = new Notificacion("Nueva notificación", "¡Hola!");
        
        notificador.enviarNotificacion(notificacion);

        CanalNotificacion canalSMS = new CanalSMS();
        notificador = new Notificador(canalSMS);
        notificador.enviarNotificacion(notificacion);

        CanalNotificacion canalWhatsApp = new CanalWhatsApp();
        notificador = new Notificador(canalWhatsApp);
        notificador.enviarNotificacion(notificacion);
    }
}
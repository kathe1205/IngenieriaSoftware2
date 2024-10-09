public class CanalWhatsApp implements CanalNotificacion {
    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviando notificación por WhatsApp: " + notificacion.getTitulo());
    }
}
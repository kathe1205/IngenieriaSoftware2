public class EnviadorCorreo {
    public void enviar(CorreoElectronico correo) {
        System.out.println("Enviando correo a: " + correo.getDestinatario() + ", Asunto:" + correo.getAsunto());
    }
}

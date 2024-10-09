public class GestorEnvioCorreos {
    private EnviadorCorreo enviador;

    public GestorEnvioCorreos(EnviadorCorreo enviador) {
        this.enviador = enviador;
    }

    public void enviarCorreo(CorreoElectronico correo) {
        enviador.enviar(correo);
    }
}

public class EncenderCommand implements Command {
    private Object dispositivo;

    public EncenderCommand(Object dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        if (dispositivo instanceof Computador) {
            ((Computador) dispositivo).encender();
        } else if (dispositivo instanceof Celular) {
            ((Celular) dispositivo).encender();
        }
    }
}

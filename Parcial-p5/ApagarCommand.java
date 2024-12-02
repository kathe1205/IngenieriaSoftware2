public class ApagarCommand implements Command {
    private Object dispositivo;

    public ApagarCommand(Object dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        if (dispositivo instanceof Computador) {
            ((Computador) dispositivo).apagar();
        } else if (dispositivo instanceof Celular) {
            ((Celular) dispositivo).apagar();
        }
    }
}

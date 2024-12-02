
public class ReiniciarCommand implements Command {
    private Object dispositivo;

    public ReiniciarCommand(Object dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        if (dispositivo instanceof Computador) {
            ((Computador) dispositivo).reiniciar();
        } else if (dispositivo instanceof Celular) {
            ((Celular) dispositivo).reiniciar();
        }
    }
}

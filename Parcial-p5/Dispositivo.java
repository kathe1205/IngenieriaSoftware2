
public class Dispositivo {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void ejecutarComando() {
        command.ejecutar();
    }
}

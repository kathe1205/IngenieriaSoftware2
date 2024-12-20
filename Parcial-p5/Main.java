public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        Celular celular = new Celular();

        Command encenderPc = new EncenderCommand(pc);
        Command reiniciarCelular = new ReiniciarCommand(celular);
        Command apagarPc = new ApagarCommand(pc);

        Dispositivo invoker = new Dispositivo();

        invoker.setCommand(encenderPc);
        invoker.ejecutarComando();

        invoker.setCommand(reiniciarCelular);
        invoker.ejecutarComando();

        invoker.setCommand(apagarPc);
        invoker.ejecutarComando();
    }
}

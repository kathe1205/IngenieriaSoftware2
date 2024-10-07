class Avion implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("El avión despega.");
    }

    @Override
    public void frenar() {
        System.out.println("El avión aterriza.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Este es un avión.");
    }
}

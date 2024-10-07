class Bicicleta implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("La bicicleta acelera.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta frena.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Esta es una bicicleta.");
    }
}

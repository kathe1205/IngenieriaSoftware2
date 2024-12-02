// Concrete Product 2
class ServicioEnvioRegular extends ServicioEnvio {
    @Override
    public void enviar(String paquete) {
        System.out.println("ENVIANDO PAQUETE DE FORMA REGULAR: " + paquete);
    }
}
class ServicioEnvioExpress extends ServicioEnvio {
    @Override
    public void enviar(String paquete) {
        System.out.println("ENVIANDO PAQUETE DE FORMA EXPRESS: " + paquete);
    }
}
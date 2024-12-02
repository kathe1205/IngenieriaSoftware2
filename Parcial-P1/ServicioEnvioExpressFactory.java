class ServicioEnvioExpressFactory implements ServicioEnvioFactory {
    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new ServicioEnvioExpress();
    }
}
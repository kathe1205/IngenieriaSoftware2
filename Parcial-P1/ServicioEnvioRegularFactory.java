class ServicioEnvioRegularFactory implements ServicioEnvioFactory {
    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new ServicioEnvioRegular();
    }
}
public class SistemaPagoAdapter implements SistemaPago {
    private NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion;

    public SistemaPagoAdapter(NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion) {
        this.nuevoSistemaPagoOperacion = nuevoSistemaPagoOperacion;
    }

    @Override
    public void realizarPago() {
        NuevoSistemaPago cliente = new NuevoSistemaPago("usuario", "123", "correo@example.com");
        nuevoSistemaPagoOperacion.crearSesion(cliente);
        nuevoSistemaPagoOperacion.validarCorreo(cliente);
        nuevoSistemaPagoOperacion.validarAutorizacion();
        nuevoSistemaPagoOperacion.realizarPago();
    }
}

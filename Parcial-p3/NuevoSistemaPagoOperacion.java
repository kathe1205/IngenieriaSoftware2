public class NuevoSistemaPagoOperacion {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("creando la sesión a: " + nuevoSistemaPago.getNombre());
    }

    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("validando el correo: " + nuevoSistemaPago.getCorreo());
    }

    public void validarAutorizacion() {
        System.out.println("validando autorización");
    }

    public void realizarPago() {
        System.out.println("realizando el pago");
    }
}

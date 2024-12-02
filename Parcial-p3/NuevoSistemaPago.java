public class NuevoSistemaPago {
    private String nombre;
    @SuppressWarnings("unused")
    private String identificacion;
    private String correo;

    public NuevoSistemaPago(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}


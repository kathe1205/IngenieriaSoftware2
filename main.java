// Clase Usuario - Se encarga de guardar la información del usuario
class Usuario {
    public String nombre;
    public String correo;
    
    // Constructor de la clase Usuario que recibe el nombre y correo del usuario
    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    // Método para obtener el nombre del usuario
    public String getNombre() {
        return nombre;
    }
    // Método para actualizar el nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método para obtener el correo electrónico del usuario
    public String getCorreo() {
        return correo;
    }
    // Método para actualizar el correo electrónico del usuario
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
// Clase ServicioCorreo - Simula el envío de correos electrónicos
class ServicioCorreo {
    // Método que simula el envío de un correo electrónico a un destino específico
    public void enviarCorreo(String destino, String asunto, String mensaje) {
        System.out.println("Enviando correo a: " + destino); // Muestra el destinatario en la consola
        System.out.println("Asunto: " + asunto); // Muestra el asunto en la consola
        System.out.println("Mensaje: " + mensaje); // Muestra el mensaje en la consola
    }
}
// Clase ValidadorContrasena - Verifica que las contraseñas cumplan con ciertos requisitos
class ValidadorContrasena {
    // Método que valida si la contraseña tiene al menos 7 caracteres
    public boolean validarContrasena(String contrasena) {
        return contrasena.length() >= 7; // Devuelve verdadero si la contraseña es lo suficientemente larga
    }
}
// Clase CalculadoraSalario - Calcula el salario de un usuario
class CalculadoraSalario {
    // Método que simula el cálculo del salario de un usuario
    public double calcularSalario(Usuario usuario) {
        System.out.println("Calculando salario para: " + usuario.getNombre()); // Muestra el nombre del usuario para el que se calcula el salario
        return 5000.0; // Retorna un salario fijo como ejemplo
    }
}
// Clase Main - Muestra cómo utilizar las clases anteriores en conjunto
public class Main {
    public static void main(String[] args) {
        // Crear un nuevo usuario con su nombre y correo
        Usuario usuario = new Usuario("katherin castaño", "katherinc22@email.com");


        // Validar si la contraseña cumple con los requisitos
        ValidadorContrasena validadorContrasena = new ValidadorContrasena();
        String contrasena = "miContrasenaSegura"; // Contraseña de ejemplo
        boolean esValida = validadorContrasena.validarContrasena(contrasena);
        System.out.println("Contraseña válida: " + esValida); // Muestra si la contraseña es válida


        // Simular el envío de un correo electrónico al usuario
        ServicioCorreo servicioCorreo = new ServicioCorreo();
        servicioCorreo.enviarCorreo(usuario.getCorreo(), "Bienvenida", "Hola " + usuario.getNombre() + ", bienvenido a nuestra plataforma."); // Saludo personalizado en el correo


        // Simular el cálculo del salario del usuario
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        double salario = calculadoraSalario.calcularSalario(usuario); // Calcular el salario del usuario
        System.out.println("Salario calculado: " + salario); // Muestra el salario calculado en la consola
    }
}

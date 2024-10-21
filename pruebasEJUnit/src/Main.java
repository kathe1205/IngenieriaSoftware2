

public class Main {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("Juan", 20);

        
        estudiante.agregarCalificacion(8.5);
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.0);

       
        System.out.println("El promedio de calificaciones es: " + estudiante.obtenerPromedio());

        
        System.out.println("Número de calificaciones: " + estudiante.getNumeroCalificaciones());
    }
}

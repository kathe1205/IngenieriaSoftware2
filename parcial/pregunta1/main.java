package pregunta1;

public class main {
    public void Main(String[] args) {
        libreria libreria = new libreria();

        libreria.anadirLibro(new libro("el principito","pepito",20.9, 2010));
        libreria.anadirLibro(new libro("romeo y julieta", "homero", 30.99, 2000));

        System.out.println("obtener libros");
        System.out.println(libreria.buscarLibroPorTitulo("romeo y julieta"));

        System.out.println("obtener libros");
        System.out.println(libreria.obtenerLibrosPorAno(2000));
    }
}

package pregunta1;

import java.util.ArrayList;
import java.util.List;

public class libreria {
    private List<libro> libros = new ArrayList<>();

    public void anadirLibro(libro libro) {
        libros.add(libro);
    }

    public libro buscarLibroPorTitulo(String titulo) {
        for (libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) return libro;
        }
        return null;
    }

    public List<libro> buscarLibrosPorAutor(String autor) {
        List<libro> resultado = new ArrayList<>();
        for (libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) resultado.add(libro);
        }
        return resultado;
    }

    public List<libro> obtenerLibrosEntrePrecios(double min, double max) {
        List<libro> resultado = new ArrayList<>();
        for (libro libro : libros) {
            if (libro.getPrecio() >= min && libro.getPrecio() <= max) resultado.add(libro);
        }
        return resultado;
    }

    public List<libro> obtenerLibrosPorAno(int anio) {
        List<libro> resultado = new ArrayList<>();
        for (libro libro : libros) {
            if (libro.getAnio() == anio) resultado.add(libro);
        }
        return resultado;
    }
}
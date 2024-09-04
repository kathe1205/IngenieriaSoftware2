interface LibreriaCartilla {
    void prestar();
    void devolver();
    void mantenimientoHojas();
}

interface LibreriaDVD {
    void prestar();
    void devolver();
}

interface LibreriaLibro {
    void prestar();
    void devolver();
}

class Cartilla implements LibreriaCartilla {
    private String nombre;
    private int numeroHojas;

    public Cartilla(String nombre, int numeroHojas) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
    }

    @Override
    public void prestar() {
        System.out.println("Cartilla '" + nombre + "' prestada.");
    }

    @Override
    public void devolver() {
        System.out.println("Cartilla '" + nombre + "' devuelta.");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Mantenimiento realizado en las hojas de la cartilla '" + nombre + "'.");
    }

    @Override
    public String toString() {
        return "Cartilla{" + "nombre=" + nombre + ", numeroHojas=" + numeroHojas + '}';
    }
}

class DVD implements LibreriaDVD {
    private String nombre;
    private String archivo;
    private int stock;

    public DVD(String nombre, String archivo, int stock) {
        this.nombre = nombre;
        this.archivo = archivo;
        this.stock = stock;
    }

    @Override
    public void prestar() {
        if (stock > 0) {
            stock--;
            System.out.println("DVD '" + nombre + "' prestado. Stock restante: " + stock);
        } else {
            System.out.println("No hay stock disponible para el DVD '" + nombre + "'.");
        }
    }

    @Override
    public void devolver() {
        stock++;
        System.out.println("DVD '" + nombre + "' devuelto. Stock actual: " + stock);
    }

    @Override
    public String toString() {
        return "DVD{" + "nombre=" + nombre + ", archivo=" + archivo + ", stock=" + stock + '}';
    }
}

class Libro implements LibreriaLibro {
    private String nombre;
    private String autor;
    private int numeroPaginas;

    public Libro(String nombre, String autor, int numeroPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void prestar() {
        System.out.println("Libro '" + nombre + "' prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("Libro '" + nombre + "' devuelto.");
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
}

public class Main61 {
    public static void main(String[] args) {
        Cartilla cartilla = new Cartilla("Cartilla de Ejemplo", 50);
        DVD dvd = new DVD("Película de Ejemplo", "archivo.mp4", 10);
        Libro libro = new Libro("Libro de Ejemplo", "Autor Ejemplo", 300);

        System.out.println(cartilla);
        cartilla.prestar();
        cartilla.devolver();
        cartilla.mantenimientoHojas();

        System.out.println(dvd);
        dvd.prestar();
        dvd.devolver();

        System.out.println(libro);
        libro.prestar();
        libro.devolver();
    }
}

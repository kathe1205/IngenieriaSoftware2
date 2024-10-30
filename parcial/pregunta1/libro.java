package pregunta1;
public class libro {
    private String titulo;
    private String autor;
    private double precio;
    private int anio;

    public libro(String titulo, String autor, double precio, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anio = anio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPrecio() { return precio; }
    public int getAno() { return anio; }
}
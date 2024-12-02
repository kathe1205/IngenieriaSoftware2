class Configuracion {
    private static Configuracion instance;
    private String url;
    private String usuario;
    private String password;

    private Configuracion() {
        this.url = "jdbc:mysql://localhost:3306/mibase";
        this.usuario = "admin";
        this.password = "12345";
    }

    public static Configuracion getInstance() {
        if (instance == null) {
            instance = new Configuracion();
        }
        return instance;
    }

    public void mostrarConfiguracion() {
        System.out.println("url: " + url);
        System.out.println("usuario: " + usuario);
        System.out.println("password: " + password);
    }
}


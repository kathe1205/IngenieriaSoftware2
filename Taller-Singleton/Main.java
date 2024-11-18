
public class Main {
    public static void main(String[] args) {
        Settings settings = Settings.getInstancia();

        System.out.println("Theme: " + settings.getConfiguracion("theme"));
        System.out.println("Language: " + settings.getConfiguracion("language"));

        settings.setConfiguracion("theme", "dark");
        settings.setConfiguracion("language", "es");

        System.out.println("Updated Theme: " + settings.getConfiguracion("theme"));
        System.out.println("Updated Language: " + settings.getConfiguracion("language"));
    }
}

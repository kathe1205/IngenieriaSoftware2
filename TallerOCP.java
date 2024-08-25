//Si queremos agregar un nuevo tipo de envío, tendríamos que modificar el método calcularCosto, lo que implica modificar el código existente y añadir nuevas condiciones a dicho codigo

//Se necesita crear una jerarquia de clases donde cada tipo de envio sea una subclase

abstract class Envio {
    public abstract double calcularCosto(double peso, double distancia);
}

class EnvioEstandar extends Envio {
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.5 + distancia * 0.1;
    }
}

class EnvioExpress extends Envio {
    public double calcularCosto(double peso, double distancia) {
        return peso * 1.0 + distancia * 0.2;
    }
}

class EnvioInternacional extends Envio {
    public double calcularCosto(double peso, double distancia) {
        return peso * 2.0 + distancia * 0.5; 
    }
}

public class Main {
    public static void main(String[] args) {
        Envio envioE = new EnvioEstandar();
        Envio envioeEx = new EnvioExpress();
        Envio envioI = new EnvioInternacional();

        double peso = 10.0; 
        double distancia = 50.0; 

        System.out.println("Costo envio estandar: $" + envioE.calcularCosto(peso, distancia));
        System.out.println("Costo envio express: $" + envioeEx.calcularCosto(peso, distancia));
        System.out.println("Costo envio internacional: $" + envioI.calcularCosto(peso, distancia));
    }
}

package pregunta1;
public class Orden{
    public double aplicarPorcentaje(double precio, double porcentaje){
        return precio * porcentaje;
    }

    public double calcularDescuento(double precio){
        return precio - aplicarPorcentaje(precio, porcentaje: 0.1);    
    }

    public double calcularImpuesto(double precio){
        return precio + aplicarPorcentaje(precio, porcentaje: 0,2);    
    }
}

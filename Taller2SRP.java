//La clase Comprobante viola el SRP al controlar el almacenamiento de datos, envio de correo, generación de reportes, y envío a la DIAN, cada una de las cuales debería ser responsabilidad de una clase por separado. 
// Estas tareas se componen de persistencia, comunicación, análisis, y cumplimiento regulatorio.

import java.util.ArrayList;
import java.util.List; 

// Clase principal Comprobante
class Comprobante {
    private int numero;
    private double valor;

    public Comprobante(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }
    public int getNumero() {
        return numero;
    }
    public double getValor() {
        return valor;
    }
    public void imprimirDetalle() {
        System.out.println("Comprobante #" + numero + ", Monto = $" + valor);
    }
}

// Clase Cliente
class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public void imprimirDetalle() {
        System.out.println("Cliente: " + nombre + ", Correo: " + email);
    }
}

// Clase COMPROBANTE simulando uso de base de datos
class COMPROBANTE {
    public void guardarFactura(Comprobante factura) {
        System.out.println("Guardando factura en la base de datos factura #" + factura.getNumero());
    }

    public void guardarCliente(Cliente cliente) {
        System.out.println("Guardando cliente en la base de datos cliente " + cliente.getNombre());
    }
}

// Clase CORREO simulando envio de correo
class CORREO {
    public void enviarEmailFactura(Cliente cliente, Comprobante factura) {
        System.out.println("Enviando correo a " + cliente.getEmail() + " de la factura #" + factura.getNumero());
    }
}

// Clase REPORTE
class REPORTE {
    public void generarReporteFacturas(List<Comprobante> facturas) {
        System.out.println("Generando reporte");
        for (Comprobante factura : facturas) {
            factura.imprimirDetalle();
        }
    }
}

// Clase DIAN simulando envio de factura a la DIAN
class DIAN {
    public void enviarFacturaDian(Comprobante factura) {
        System.out.println("Enviando factura #" + factura.getNumero() + " a la DIAN");
    }
}

// Clase Principal
public class Main {
    public static void main(String[] args) {
        // Se crea cliente y factura
        Cliente cliente = new Cliente("Laura Lopez", "Laaural@gmail.com");
        Comprobante factura = new Comprobante(56789, 897.098);

        //Mostrar informacion 
        cliente.imprimirDetalle();
        factura.imprimirDetalle();

        // Guardar información en simulando base de datos
        COMPROBANTE facturaRepo = new COMPROBANTE();
        facturaRepo.guardarCliente(cliente);
        facturaRepo.guardarFactura(factura);

        // Simular envio de correo al cliente
        CORREO emailService = new CORREO();
        emailService.enviarEmailFactura(cliente, factura);

        // Simular envio de factura a la DIAN
        DIAN dianService = new DIAN();
        dianService.enviarFacturaDian(factura);

        // Generar reporte de facturas
        List<Comprobante> facturas = new ArrayList<>();
        facturas.add(factura); 
        REPORTE reporteService = new REPORTE();
        reporteService.generarReporteFacturas(facturas);
    }
}

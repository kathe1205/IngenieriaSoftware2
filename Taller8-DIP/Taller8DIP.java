/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8dip;

/**
 *
 * @author kathe
 */
public class Taller8DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IServicioEmail servicioEmail = new EnviarEmailGmailImpl("dsffd", "dsffd", "dsffd", "dsffd");
       Sistema sistema = new Sistema(servicioEmail);
       sistema.enviarEmail();
    }
    
}

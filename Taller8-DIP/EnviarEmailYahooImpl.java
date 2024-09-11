/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

/**
 *
 * @author kathe
 */
public class EnviarEmailYahooImpl extends EmailYahoo implements IServicioEmail{
    
    public EnviarEmailYahooImpl(String to, String subject, String body, String archivo) {
        super(to, subject, body, archivo);
        
    }

    @Override
    public void enviarEmail() {
        System.out.println("ENVIANDO EMAIL CON YAHOO");
        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

/**
 *
 * @author kathe
 */
public class EnviarEmailGmailImpl extends EmailGmail implements IServicioEmail{
    
    public EnviarEmailGmailImpl(String to, String subject, String body, String image) {
        super(to, subject, body, image);
        
    }
    
    @Override
    public void enviarEmail() {
       System.out.println("ENVIANDO EMAIL CON GMAIL.");
    }
    
}

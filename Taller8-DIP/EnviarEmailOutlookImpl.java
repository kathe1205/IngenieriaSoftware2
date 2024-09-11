/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

/**
 *
 * @author kathe
 */
public class EnviarEmailOutlookImpl extends EmailOutlook implements IServicioEmail{
    
        public EnviarEmailOutlookImpl(String to, String subject, String body) {
        super( to, subject, body);
    }

    @Override
    public void enviarEmail() {
        
        System.out.println("ENVIANDO EMAIL CON OUTLOOK");
        }

    
    
}

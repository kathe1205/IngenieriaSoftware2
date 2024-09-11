/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

/**
 *
 * @author kathe
 */
public class Sistema {
    private IServicioEmail servicioEmail;
    
    public Sistema(IServicioEmail servicioEmail){
        this.servicioEmail = servicioEmail;
    }
    public void enviarEmail(){
        servicioEmail.enviarEmail();
    }
}

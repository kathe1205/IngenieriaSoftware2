package taller8dip;

public class EmailYahoo extends Email {

    private String archivo;
    
    public EmailYahoo(String to, String subject, String body, String archivo) {
        super(to, subject, body);
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }
    
    

}

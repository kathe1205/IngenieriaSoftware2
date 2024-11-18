
public class Cliente {
    public static void main(String[] args) {
        Impresora impresoraLaser = new AdaptadorImpresoraLaser(new ImpresoraLaser());
        Impresora impresoraInkJet = new AdaptadorImpresoraInkJet(new ImpresoraInkJet());

        impresoraLaser.imprimir();
        impresoraInkJet.imprimir();
    }
}

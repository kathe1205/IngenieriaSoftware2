
public class AdaptadorImpresoraLaser implements Impresora {
    private ImpresoraLaser impresoraLaser;

    public AdaptadorImpresoraLaser(ImpresoraLaser impresoraLaser) {
        this.impresoraLaser = impresoraLaser;
    }

    @Override
    public void imprimir() {
        impresoraLaser.imprimirConLaser();
    }
}

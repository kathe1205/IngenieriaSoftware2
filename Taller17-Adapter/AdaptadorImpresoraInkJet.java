
public class AdaptadorImpresoraInkJet implements Impresora {
    private ImpresoraInkJet impresoraInkJet;

    public AdaptadorImpresoraInkJet(ImpresoraInkJet impresoraInkJet) {
        this.impresoraInkJet = impresoraInkJet;
    }

    @Override
    public void imprimir() {
        impresoraInkJet.imprimirConTinta(); 
    }
}

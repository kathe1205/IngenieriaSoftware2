public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Hamburguesa.HamburguesaBuilder()
                .setTipoTomate("Tomate Cherry")
                .setTipoCarne("Carne Angus")
                .setTipoQueso("Queso Cheddar")
                .setTipoPan("Pan Integral")
                .build();

        System.out.println(hamburguesa);
    }
}
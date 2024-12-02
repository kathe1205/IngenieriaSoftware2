public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    private Hamburguesa(HamburguesaBuilder builder) {
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }

    public String getTipoTomate() {
        return tipoTomate;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    @Override
    public String toString() {
        return "Hamburguesa {" +
                "tipoTomate='" + tipoTomate + '\'' +
                ", tipoCarne='" + tipoCarne + '\'' +
                ", tipoQueso='" + tipoQueso + '\'' +
                ", tipoPan='" + tipoPan + '\'' +
                '}';
    }

    public static class HamburguesaBuilder {
        private String tipoTomate;
        private String tipoCarne;
        private String tipoQueso;
        private String tipoPan;

        public HamburguesaBuilder setTipoTomate(String tipoTomate) {
            this.tipoTomate = tipoTomate;
            return this;
        }

        public HamburguesaBuilder setTipoCarne(String tipoCarne) {
            this.tipoCarne = tipoCarne;
            return this;
        }

        public HamburguesaBuilder setTipoQueso(String tipoQueso) {
            this.tipoQueso = tipoQueso;
            return this;
        }

        public HamburguesaBuilder setTipoPan(String tipoPan) {
            this.tipoPan = tipoPan;
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
}
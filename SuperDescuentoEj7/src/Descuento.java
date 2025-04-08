public enum Descuento {
    ECODTO(0.10),
    VERDE5(0.05),
    BIO15(0.15);

    private final double descuento;

    Descuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}

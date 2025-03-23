class Revista extends Publicacion {
    private int numero;

    public Revista(String codISBN, String titulo, int anyoPublicacion, int numero) {
        super(codISBN, titulo, anyoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ISBN: " + codISBN + ", Título: " + titulo + ", Año: " + anyoPublicacion + ", Número: " + numero;
    }
}

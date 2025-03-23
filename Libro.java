class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String codISBN, String titulo, int anyoPublicacion) {
        super(codISBN, titulo, anyoPublicacion);
        this.prestado = false;
    }

    @Override
    public void presta() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devuelve() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "ISBN: " + codISBN + ", Título: " + titulo + ", Año: " + anyoPublicacion + " (" + (prestado ? "Prestado" : "No prestado") + ")";
    }
}

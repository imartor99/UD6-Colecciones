public abstract class Publicacion implements Comparable<Publicacion> {
    protected String codISBN;
    protected String titulo;
    protected int anyoPublicacion;

    public Publicacion(String codISBN, String titulo, int anyoPublicacion) {
        this.codISBN = codISBN;
        this.titulo = titulo;
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Publicacion otra) {
        //Se compara el atributo titulo de la publicación actual con el de otra publicación utilizando compareToIgnoreCase(), 
        //lo que permite ordenar las publicaciones alfabéticamente sin distinguir entre mayúsculas y minúsculas.
        return this.titulo.compareToIgnoreCase(otra.titulo); 
    }

    @Override
    public abstract String toString();
}

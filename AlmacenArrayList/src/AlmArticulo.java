import java.util.ArrayList;

public class AlmArticulo {
    private ArrayList<Articulo> articulos;

    // Constructor que inicializa el ArrayList
    public AlmArticulo() {
        this.articulos = new ArrayList<>();
    }

    public void almacena(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public void listar() {
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }

    public boolean eliminar(String codigo) {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo().equals(codigo)) {
                articulos.remove(articulo);
                return true;
            }
        }
        return false;
    }

    public Articulo buscarPorCodigo(String codigo) {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo().equals(codigo)) {
                return articulo;
            }
        }
        return null;
    }

    //Sobrecargamos el ToString de la clase Articulo
    @Override
    public String toString() {
        String resultado = "Listado de artículos:\n";
        for (Articulo articulo : articulos) {
            resultado += articulo.toString() + "\n";
        }
        return resultado;
    }

}
public class GestSimAlm {
    private AlmArticulo almacen;

    // Constructor que inicializa un almacén de artículos
    public GestSimAlm() {
        almacen = new AlmArticulo();
    }

    // Métodos

    // Agrega automáticamente 4 artículos de prueba al almacén.
    public void entradaAutomatizada() {
        almacen.almacena(new Articulo("A001", "Teclado"));
        almacen.almacena(new Articulo("A002", "Ratón"));
    }

    // Muestra todos los artículos de almacen
    public void lista() {
        almacen.listar();
    }

    // Agrega nuevo artículo con el código y la descripción que le demos.
    public void alta(String codigo, String descripcion) {
        almacen.almacena(new Articulo(codigo, descripcion));
    }

    // Elimina el artículo con el código que le demos.
    public void baja(String codigo) {
        if (almacen.eliminar(codigo)) {
            System.out.println("Artículo eliminado con éxito.");
        } else {
            System.out.println("No se encontró el artículo.");
        }
    }

    //Aumenta el stock cuando entra mercancia.
    public void entradaMercancia(String codigo, int cantidad) {
        Articulo articulo = almacen.buscarPorCodigo(codigo);
        if (articulo != null) {
            articulo.setStock(articulo.getStock() + cantidad);
        } else {
            System.out.println("No se encontró el artículo.");
        }
    }

    //Reduce stock cuando sale mercancia.
    public void salidaMercancia(String codigo, int cantidad) {
        Articulo articulo = almacen.buscarPorCodigo(codigo);
        if (articulo != null) {
            if (articulo.getStock() >= cantidad) {
                articulo.setStock(articulo.getStock() - cantidad);
            } else {
                System.out.println("No hay suficiente stock.");
            }
        } else {
            System.out.println("No se encontró el artículo.");
        }
    }
}

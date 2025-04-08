public class Compra {
    private String producto;
    private int cantidad;

    public Compra(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método que suma una cantidad a la existente
    public void sumarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

}
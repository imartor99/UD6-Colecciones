public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;


     // Constructor completo
     public Articulo(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.stock = 0;
    }

    // Getters
    public String getCodigo() {
        return codigo;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // ToString
    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Descripcion: " + descripcion + ", Precio Compra: " + precioCompra + ", Precio Venta: " + precioVenta + ", Stock: " + stock; 
    }
}

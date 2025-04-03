import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainSuper {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<String, Double> productos = new HashMap<>();

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        List<Compra> carrito = new ArrayList<>();

        while (true) {
            System.out.print("Producto: ");
            String producto = entrada.nextLine();
            if (producto.equalsIgnoreCase("fin")) {
                break;
            }

            if (productos.containsKey(producto)) {
                System.out.print("Cantidad: ");
                int cantidad = entrada.nextInt();
                entrada.nextLine(); // Eliminamos el salto de linea en el buffer
                carrito.add(new Compra(producto, cantidad));
            } else {
                System.out.println("Producto no encontrado");
            }

        }

        double total = 0;
        System.out.println("\n--------------------------------------");
        System.out.println("Producto   Precio   Cantidad   Subtotal");
        System.out.println("--------------------------------------");
        for (Compra compra : carrito) {
            double precio = productos.get(compra.getProducto());
            double subtotal = compra.getCantidad() * precio;
            total += subtotal;
            System.out.printf("%-10s %.2f     %5d       %.2f€\n", compra.getProducto(), precio, compra.getCantidad(), subtotal);
        }
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL: %.2f€\n", total);
        entrada.close();
    }

}

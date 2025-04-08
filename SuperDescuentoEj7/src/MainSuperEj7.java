import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainSuperEj7 {
    public static void main(String[] args) {
        // Defino el diccionario HashMap productos que almacenará los diferentes con sus
        // precios.
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> productos = new HashMap<>();
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        // Creo otro HashMap llamado carrito que almacenará los productos que se van a
        // comprar.
        Map<String, Compra> carrito = new HashMap<>();

        // Bucle con condiciones que controlen la entrada por pantalla.
        while (true) {
            System.out.print("Producto: ");
            String producto = scanner.nextLine().toLowerCase();
            if (producto.equals("fin")) {
                break;
            }

            if (productos.containsKey(producto)) {
                System.out.print("Cantidad: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();
                if (carrito.containsKey(producto)) {
                    Compra compraExistente = carrito.get(producto);
                    compraExistente.sumarCantidad(cantidad);
                } else {
                    carrito.put(producto, new Compra(producto, cantidad));
                }
            } else {
                System.out.println("Producto no disponible.");
            }
        }

        //Pido entrada de codigo de descuento
        System.out.print("\nIntroduce código de descuento (si tienes): ");
        String codigoIntroducido = scanner.nextLine().toUpperCase();
        double descuentoAplicado = 0;

        //Controlamos que el codigo introducido es correcto y aplicamos su correspondiente descuento.
        boolean codigoValido = false;
        for (Descuento codigo : Descuento.values()) {
            if (codigo.name().equals(codigoIntroducido)) {
                descuentoAplicado = codigo.getDescuento();
                codigoValido = true;
                System.out.printf("Código aplicado: %s (%.0f%% de descuento)\n", codigo, descuentoAplicado * 100);
                break;
            }
        }

        if (!codigoValido && !codigoIntroducido.isEmpty()) {
            System.out.println("Código de descuento no válido o no introducido.");
        }

        // Imprimo el contenido del carrito, descuento y totales de compra, y formateo la salida.
        double total = 0;
        System.out.println("\n--------------------------------------");
        System.out.println("Producto   Precio   Cantidad   Subtotal");
        System.out.println("--------------------------------------");
        for (Compra compra : carrito.values()) {
            double precio = productos.get(compra.getProducto());
            double subtotal = compra.getCantidad() * precio;
            total += subtotal;
            System.out.printf("%-10s %.2f     %5d       %.2f€\n", compra.getProducto(), precio, compra.getCantidad(),
                    subtotal);
        }
        System.out.println("--------------------------------------");

        if (descuentoAplicado > 0) {
            double descuento = total * descuentoAplicado;
            total -= descuento;
            System.out.printf("DESCUENTO APLICADO: -%.2f€\n", descuento);
        }
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL: %.2f€\n", total);
        scanner.close();
    }
}

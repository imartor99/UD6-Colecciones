import java.util.Scanner;

public class TestGestSimAlm {
    public static void main(String[] args) {
        GestSimAlm gestor = new GestSimAlm();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        // Menu interactivo de opciones
        do {
            System.out.println("\nMenú");
            System.out.println("0. Entrada automatizada");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Entrada de mercancía");
            System.out.println("5. Salida de mercancía");
            System.out.println("6. Salir");
            System.out.print("Introduce una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 0:
                    gestor.entradaAutomatizada();
                    break;
                case 1:
                    gestor.lista();
                    break;
                case 2:
                    System.out.print("Código: ");
                    String codigo = entrada.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = entrada.nextLine();
                    gestor.alta(codigo, descripcion);
                    break;
                case 3:
                    System.out.print("Código a eliminar: ");
                    codigo = entrada.nextLine();
                    gestor.baja(codigo);
                    break;
                case 4:
                    System.out.print("Código de la mercancía: ");
                    codigo = entrada.nextLine();
                    System.out.print("Cantidad a ingresar: ");
                    int cantidad = entrada.nextInt();
                    gestor.entradaMercancia(codigo, cantidad);
                    break;
                case 5:
                    System.out.print("Código de la mercancía: ");
                    codigo = entrada.nextLine();
                    System.out.print("Cantidad a retirar: ");
                    cantidad = entrada.nextInt();
                    gestor.salidaMercancia(codigo, cantidad);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);
        entrada.close();
    }

}

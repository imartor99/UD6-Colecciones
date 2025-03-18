import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> opciones;

    public Menu() {
        this.opciones = new ArrayList<>();
    }

    public void creaOpcion(String opcion) {
        opciones.add(opcion);
    }

    public void muestraMenu() {
        System.out.println("Menú de opciones:");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
    }

    public int capturaOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        while (true) {
            System.out.print("Selecciona una opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion >= 1 && opcion <= opciones.size()) {
                    return opcion;
                } else {
                    System.out.println("Opción no válida, intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida, introduce un número.");
            }
        }
    }
}

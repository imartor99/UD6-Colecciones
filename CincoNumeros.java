import java.util.HashSet;
import java.util.Scanner;

public class CincoNumeros {
    public static void main(String[] args) {

        // Definimos el HashSet
        HashSet<Integer> numeros = new HashSet<>();

        // Declaramos las variables necesarias
        int num;
        int suma;
        Scanner entrada = new Scanner(System.in);

        // Recogemos los 5 números introducidos por el usuario
        for (int i = 0; i <1 5; i++) {
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            numeros.add(num);
        }

        // Calculamos la suma de los numeros contenidos en el HashSet numeros con un bucle for-each
        suma = 0;
        for (Integer n : numeros) {
            suma += n;
        }
        
        //Mostramos resultados por pantalla
        System.out.println("La suma de los números es: " + suma);
    }
}

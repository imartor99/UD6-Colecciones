import java.util.ArrayList;
import java.util.Collections;

public class MainPublicacion {
    public static void main(String[] args) {
        ArrayList<Publicacion> biblioteca = new ArrayList<>();
        biblioteca.add(new Libro("1234", "Java", 1998));
        biblioteca.add(new Libro("5678", "C++", 2000));
        biblioteca.add(new Revista("7894", "Informatica", 2001, 10));

        System.out.println("\nAntes de ordenar: ");

        for (Publicacion p : biblioteca) {
            System.out.println(p);
        }
        
        Collections.sort(biblioteca);

        System.out.println("\nDespués de ordenar por título: ");
        for (Publicacion p:biblioteca){
            System.out.println(p);
        }

            
    }
}

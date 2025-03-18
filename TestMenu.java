public class TestMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.creaOpcion("Iniciar juego");
        menu.creaOpcion("Cargar partida");
        menu.creaOpcion("Configuración");
        menu.creaOpcion("Salir");
        
        menu.muestraMenu();
        int seleccion = menu.capturaOpcion();
        System.out.println("Has seleccionado la opción: " + seleccion);
    }
}

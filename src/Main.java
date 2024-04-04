
import com.tenis.producto.controller.ControladorJuego;
import com.tenis.producto.view.ViewJuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ViewJuego juego = new ViewJuego();
        ControladorJuego iniciar = new ControladorJuego();

        System.out.println("BIENVENIDO AL JUEGO DE TENIS!");
        System.out.println("MENU DE OPCIONES");
        System.out.println("Seleccione 1 para PLAY ò 0 para EXIT");

        while (true){
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    iniciar.iniciarJuego();
                    break;

                default:
                    System.out.println("Saliendo del juego...");

                    return;

            }
        }

    }
}

import com.tenis.producto.controller.ControladorJuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ControladorJuego iniciar = new ControladorJuego();

        System.out.println("BIENVENIDO AL JUEGO DE TENIS!");
        System.out.println("MENU DE OPCIONES");
        System.out.println("Seleccione 1 para PLAY ò 0 para EXIT");

        while (true){
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                iniciar.play();
            } else {
                System.out.println("Saliendo del juego...");

                return;
            }
        }


    }
}
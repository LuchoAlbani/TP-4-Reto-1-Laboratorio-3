package com.tenis.producto.view;

import com.tenis.producto.enums.Clima;
import com.tenis.producto.enums.Estadio;
import com.tenis.producto.model.Personaje;

import java.util.Scanner;

public class ViewJuego {
    Scanner scanner = new Scanner(System.in);
    Integer puntos = 0;       //Funcion incrementarPuntos()
    int puntoP2=0;          //Funcion incrementarPuntos()
    String estado = "Love";          //Funcion incrementarPuntos()


    Estadio estadio;
    Clima clima;

    Personaje personaje1 = new Personaje();


    public Personaje seleccionPersonaje() {
        System.out.println("Ingrese los datos de su personaje: ");

        System.out.printf("Nombre: ");
        String nombre = scanner.nextLine();
        personaje1.setNombre(nombre);

        System.out.printf("Edad: ");
        Float edad = scanner.nextFloat();
        scanner.nextLine(); // consume el '\n' que queda pendient. Limpia el buffer
        personaje1.setEdad(edad);

        System.out.printf("Nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        personaje1.setNacionalidad(nacionalidad);

        System.out.printf("Mano dominante: ");
        String manoDominante = scanner.nextLine();
        personaje1.setManoDominante(manoDominante);

        return personaje1;

    }


    public void seleccionarClima() {
        System.out.println("Seleccione el clima del campo de juego: ");
        System.out.println("1-Soleado");
        System.out.println("2-Nublado");
        System.out.println("3-LLuvioso");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste Soleado!");
                clima = Clima.SOLEADO;
                break;

            case 2:
                System.out.println("Seleccionaste Nublado!");
                clima = Clima.NUBLADO;
                break;

            case 3:
                System.out.println("Seleccionaste LLuvioso!");
                clima = Clima.LLUVIOSO;
                System.out.println("Se suspende por lluvia X_X...");
                System.exit(0);

                break;

            default:
                System.out.println("La opcion ingresada es incorrecta..., seleccionado clima soleado por defecto");
                clima = Clima.SOLEADO;
                break;

        }
    }

    public void seleccioneEstadio() {
        System.out.println("Seleccione el estadio donde desea jugar: ");
        System.out.println("1-Casa Rosada");
        System.out.println("2-Bombonera");
        System.out.println("3-Monumental");
        System.out.println("4-UTN");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste Casa Rosada como estadio!");
                estadio = Estadio.CASAROSADA;
                break;

            case 2:
                System.out.println("Seleccionaste Bombonera como estadio!");
                estadio = Estadio.BOMBONERA;
                break;

            case 3:
                System.out.println("Seleccionaste el Monumental como estadio!");
                estadio = Estadio.MONUMENTAL;
                break;

            case 4:
                System.out.println("Seleccionaste la UTN como estadio!");
                estadio = Estadio.UTN;
                break;

            default:
                System.out.println("La opcion ingresada es incorrecta..., seleccionado la Bombonera por defecto");
                estadio = Estadio.BOMBONERA;
                break;

        }

    }

    // Método para incrementar la puntuación
    public void incrementarPuntos() {

        System.out.println("  " + personaje1.getNombre() + " vs P2");

        System.out.println("  " + estado + " vs " + estado); // 0 - 0

        if (puntos == 0) { //15 - Love
            puntos = 15;
            System.out.println("  " + puntos + "  vs  " + estado);
            pausa();
        }if (puntos == 15) {  //30 - Love
            puntos = 30;
            System.out.println("  " + puntos + "  vs  " + estado);
            pausa();
        }if (puntos == 30) { // 30 - 15
             puntoP2 = 15;
            System.out.println("  " + puntos + "  vs  " + puntoP2);
            pausa();
        }if (puntos == 30 ) { // 30 - 30
             puntoP2 = 30;
            System.out.println("  " + puntos + "  vs  " + puntoP2);
            pausa();
        }if (puntos == 30) { // 40 - 30
            puntos = 40;
            System.out.println("  " + puntos + "  vs  " + puntoP2);
            pausa();
        }if (puntos == 40) { // Deuce - Deuce
            puntoP2 = 40;
            estado = "Deuce";
            System.out.println("  " + estado + "  vs  " + estado);
            pausa();
        }if (estado == "Deuce") { // Ventaja P1 - Deuce
            estado = "Ventaja P1";
            System.out.println("  " + estado + "  vs  " + puntoP2);
            pausa();
        }if (estado == "Ventaja P1") { // Ha ganado P1
            estado = "Ha ganado el P1";
            pausa();
            System.out.println("  " + estado + "  " +personaje1.getNombre()+"  FELICITACIONES!...");
        }

    }

    public void pausa(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
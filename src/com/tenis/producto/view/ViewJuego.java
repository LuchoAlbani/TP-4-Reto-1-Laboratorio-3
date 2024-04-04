package com.tenis.producto.view;

import com.tenis.producto.enums.Clima;
import com.tenis.producto.enums.Estadio;

import java.util.Scanner;

public class ViewJuego {
    Scanner scanner = new Scanner(System.in);

    Estadio estadio;
    Clima clima;

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

    public void seleccionarClima(){
        System.out.println("Seleccione el clima del campo de juego: ");
        System.out.println("1-Soleado");
        System.out.println("2-Nublado");
        System.out.println("3-LLuvioso");

        int opcion= scanner.nextInt();

        switch (opcion){
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
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Se suspende por lluvia X_X...");
                Integer retornar = 0;

                break;

            default:
                System.out.println("La opcion ingresada es incorrecta..., seleccionado clima soleado por defecto");
                 clima = Clima.SOLEADO;
                break;

        }
    }

    public void seleccionPersonaje(){




    }

}
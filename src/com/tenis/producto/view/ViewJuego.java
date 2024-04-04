package com.tenis.producto.view;

import com.tenis.producto.model.JuegoTenis;
import java.util.Scanner;

public class ViewJuego {
    Scanner scanner = new Scanner(System.in);

    public void seleccioneEstadio() {
        System.out.println("Seleccione el estadio donde desea jugar: ");
        System.out.println("1-Casa Rosada");
        System.out.println("2-Bombonera");
        System.out.println("3-Monumental");
        System.out.println("4-UTN");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.printf("Seleccionaste Casa Rosada como estadio!");
                this. = JuegoTenis.Estadio.CASAROSADA;
                break;

            case 2:
                System.out.printf("Seleccionaste Bombonera como estadio!");
                JuegoTenis.Estadio bombonera = JuegoTenis.Estadio.BOMBONERA;
                break;

            case 3:
                System.out.printf("Seleccionaste el Mudomental como estadio!");
                JuegoTenis.Estadio monumental = JuegoTenis.Estadio.MONUMENTAL;
                break;

            case 4:
                System.out.printf("Seleccionaste la UTN como estadio!");
                JuegoTenis.Estadio utn = JuegoTenis.Estadio.UTN;
                break;

            default:
                System.out.printf("La opcion ingresada es incorrecta..., seleccionado la Bombonera por defecto");
                JuegoTenis.Estadio bombonera1 = JuegoTenis.Estadio.BOMBONERA;
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
                System.out.printf("Seleccionaste Soleado!");
                JuegoTenis.Clima soleado = JuegoTenis.Clima.SOLEADO;
                break;

            case 2:
                System.out.printf("Seleccionaste Nublado!");
                JuegoTenis.Clima nublado = JuegoTenis.Clima.NUBLADO;
                break;

            case 3:
                System.out.printf("Seleccionaste LLuvioso!");
                JuegoTenis.Clima lluvioso = JuegoTenis.Clima.LLUVIOSO;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("Se suspende por lluvia X_X...");
                Integer retornar = 0;

                break;

            default:
                System.out.printf("La opcion ingresada es incorrecta..., seleccionado clima soleado por defecto");
                JuegoTenis.Clima soleado1 = JuegoTenis.Clima.SOLEADO;
                break;

        }


    }

}
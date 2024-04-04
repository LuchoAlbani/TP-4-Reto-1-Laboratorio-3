package com.tenis.producto.controller;

import com.tenis.producto.enums.Clima;
import com.tenis.producto.enums.Estadio;
import com.tenis.producto.model.JuegoTenis;
import com.tenis.producto.view.ViewJuego;

public class ControladorJuego {

    Estadio estadio;

    Clima clima;


    ViewJuego view = new ViewJuego();
    private JuegoTenis juego;

    public void iniciarJuego(){
        System.out.println("MENU DE JUEGO");
        view.seleccionarClima();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Cargando Clima..."+ clima);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        view.seleccioneEstadio();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Cargando Estadio..."+ estadio);



    }

}

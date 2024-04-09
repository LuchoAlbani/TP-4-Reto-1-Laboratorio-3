package com.tenis.producto.controller;


import com.tenis.producto.view.ViewJuego;

public class ControladorJuego {

    ViewJuego viewJuego = new ViewJuego();

    public void play(){

        viewJuego.seleccionPersonaje();
        viewJuego.seleccioneEstadio();
        viewJuego.seleccionarClima();
        viewJuego.incrementarPuntos();

    }




}

package com.tenis.producto.model;

import com.tenis.producto.enums.Clima;
import com.tenis.producto.enums.Estadio;

import java.util.Scanner;

public class JuegoTenis {

    Scanner scanner = new Scanner(System.in);
    private Personaje P1;

    private Personaje P2;

    private Estadio estadio;

    private Clima clima;


    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public JuegoTenis(Personaje p1, Personaje p2, Estadio estadio, Clima clima) {
        P1 = p1;
        P2 = p2;
        this.estadio = estadio;
        this.clima = clima;
    }

    public Personaje getP1() {
        return P1;
    }

    public void setP1(Personaje p1) {
        P1 = p1;
    }

    public Personaje getP2() {
        return P2;
    }

    public void setP2(Personaje p2) {
        P2 = p2;
    }







}

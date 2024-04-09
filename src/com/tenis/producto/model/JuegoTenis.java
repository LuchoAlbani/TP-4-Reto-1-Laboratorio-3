package com.tenis.producto.model;

import com.tenis.producto.enums.Clima;
import com.tenis.producto.enums.Estadio;

import java.util.Scanner;

public class JuegoTenis {
    private Personaje P1;

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

    public JuegoTenis(Personaje p1, Estadio estadio, Clima clima) {
        P1 = p1;
        this.estadio = estadio;
        this.clima = clima;
    }

    public Personaje getP1() {
        return P1;
    }

    public void setP1(Personaje p1) {
        P1 = p1;
    }

}

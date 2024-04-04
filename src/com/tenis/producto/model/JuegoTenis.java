package com.tenis.producto.model;

import java.util.Scanner;

public class JuegoTenis {

    Scanner scanner = new Scanner(System.in);
    private String P1;

    private String P2;

    private Enum estadio;

    private Enum clima;

    public JuegoTenis(String p1, String p2, Enum estadio, Enum clima) {
        P1 = p1;
        P2 = p2;
        this.estadio = estadio;
        this.clima = clima;
    }

    public String getP1() {
        return P1;
    }

    public void setP1(String p1) {
        P1 = p1;
    }

    public String getP2() {
        return P2;
    }

    public void setP2(String p2) {
        P2 = p2;
    }

    public Enum getEstadio() {
        return estadio;
    }

    public void setEstadio(Enum estadio) {
        this.estadio = estadio;
    }

    public Enum getClima() {
        return clima;
    }

    public void setClima(Enum clima) {
        this.clima = clima;
    }

    public enum Clima{
        SOLEADO,
        NUBLADO,
        LLUVIOSO

    }

    public enum Estadio{

        CASAROSADA,
        BOMBONERA,
        MONUMENTAL,
        UTN

    }


}

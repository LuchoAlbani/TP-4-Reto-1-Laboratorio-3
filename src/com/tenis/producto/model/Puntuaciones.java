package com.tenis.producto.model;

public class Puntuaciones {

    private String estado; //"Deuce" , "Ventaja"

    private Integer puntos;

    public Puntuaciones(){
        this.estado = "Deuce";
        this.puntos = 0;

    }

    //* - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
    // *
    // * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
    // *   15 - Love
    // *   30 - Love
    // *   30 - 15
    // *   30 - 30
    // *   40 - 30
    // *   Deuce
    // *   Ventaja P1
    // *   Ha ganado el P1

        // Método para incrementar la puntuación
        public void incrementarPuntos() {
            if (this.puntos == 0) {
                this.puntos = 15;
            } else if (this.puntos == 15) {

                this.puntos = 30;
            } else if (this.puntos == 30) {
                this.puntos = 40;
            } else if (this.puntos == 40 && this.estado.equals("Deuce")) {
                this.estado = "Ventaja";
            } else if (this.puntos == 40 && this.estado.equals("Ventaja")) {
                // El jugador ha ganado el juego
                this.puntos = 0;
                this.estado = "Normal";
            }
        }
    }

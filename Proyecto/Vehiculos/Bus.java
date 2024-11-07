package Vehiculos;

import Vehiculos.Caracteristicas.Antecedente;

public class Bus extends Vehiculo {
    private int numerodepasajeros;
    private int numerodepuertas;
    private int capacidaddelmaletero;
    private int numerodebolsasdeaire;
    private int numerodeejes;
    private int numerodesalidasdeemergencia;
    private boolean aireacondicionado;
    private boolean camaradereversa;
    private boolean abs;

    public Bus(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            int numerodepasajeros, int numerodepuertas, int capacidaddelmaletero, int numerodebolsasdeaire,
            int numerodeejes, int numerodesalidasdeemergencia, boolean aireacondicionado, boolean camaradereversa,
            boolean abs) {

        super(marca, antecedente, modelo, cambios, velocidadmaxima, cilindraje);
        this.numerodepasajeros = numerodepasajeros;
        this.numerodepuertas = numerodepuertas;
        this.capacidaddelmaletero = capacidaddelmaletero;
        this.numerodebolsasdeaire = numerodebolsasdeaire;
        this.numerodeejes = numerodeejes;
        this.numerodesalidasdeemergencia = numerodesalidasdeemergencia;
        this.aireacondicionado = aireacondicionado;
        this.camaradereversa = camaradereversa;
        this.abs = abs;
    }

    public int getNumerodepasajeros() {
        return numerodepasajeros;
    }

    public void setNumerodepasajeros(int numerodepasajeros) {
        this.numerodepasajeros = numerodepasajeros;
    }

    public int getNumerodepuertas() {
        return numerodepuertas;
    }

    public void setNumerodepuertas(int numerodepuertas) {
        this.numerodepuertas = numerodepuertas;
    }

    public int getCapacidaddelmaletero() {
        return capacidaddelmaletero;
    }

    public void setCapacidaddelmaletero(int capacidaddelmaletero) {
        this.capacidaddelmaletero = capacidaddelmaletero;
    }

    public int getNumerodebolsasdeaire() {
        return numerodebolsasdeaire;
    }

    public void setNumerodebolsasdeaire(int numerodebolsasdeaire) {
        this.numerodebolsasdeaire = numerodebolsasdeaire;
    }

    public int getNumerodeejes() {
        return numerodeejes;
    }

    public void setNumerodeejes(int numerodeejes) {
        this.numerodeejes = numerodeejes;
    }

    public int getNumerodesalidasdeemergencia() {
        return numerodesalidasdeemergencia;
    }

    public void setNumerodesalidasdeemergencia(int numerodesalidasdeemergencia) {
        this.numerodesalidasdeemergencia = numerodesalidasdeemergencia;
    }

    public boolean isAireacondicionado() {
        return aireacondicionado;
    }

    public void setAireacondicionado(boolean aireacondicionado) {
        this.aireacondicionado = aireacondicionado;
    }

    public boolean isCamaradereversa() {
        return camaradereversa;
    }

    public void setCamaradereversa(boolean camaradereversa) {
        this.camaradereversa = camaradereversa;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }
}

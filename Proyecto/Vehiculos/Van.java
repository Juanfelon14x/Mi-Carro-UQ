package Proyecto.Vehiculos;

import Proyecto.Vehiculos.Caracteristicas.Antecedente;

public class Van extends Proyecto.Vehiculo {
    public int numerodepasajeros;
    public int capacidaddelmaletero;
    public int numerodepuertas;
    public int numerodebolsasdeaire;
    public boolean aireacondicionado;
    public boolean camaradereversa;
    public boolean abs;
    public Van(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            int numerodepasajeros, int capacidaddelmaletero, int numerodepuertas, int numerodebolsasdeaire,
            boolean aireacondicionado, boolean camaradereversa, boolean abs) {
        super(marca, antecedente, modelo, cambios, velocidadmaxima, cilindraje);
        this.numerodepasajeros = numerodepasajeros;
        this.capacidaddelmaletero = capacidaddelmaletero;
        this.numerodepuertas = numerodepuertas;
        this.numerodebolsasdeaire = numerodebolsasdeaire;
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
    public int getCapacidaddelmaletero() {
        return capacidaddelmaletero;
    }
    public void setCapacidaddelmaletero(int capacidaddelmaletero) {
        this.capacidaddelmaletero = capacidaddelmaletero;
    }
    public int getNumerodepuertas() {
        return numerodepuertas;
    }
    public void setNumerodepuertas(int numerodepuertas) {
        this.numerodepuertas = numerodepuertas;
    }
    public int getNumerodebolsasdeaire() {
        return numerodebolsasdeaire;
    }
    public void setNumerodebolsasdeaire(int numerodebolsasdeaire) {
        this.numerodebolsasdeaire = numerodebolsasdeaire;
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

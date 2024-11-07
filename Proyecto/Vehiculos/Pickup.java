package Vehiculos;

import Vehiculos.Caracteristicas.Antecedente;

public class Pickup extends Vehiculo {
    private int numerodepasajeros;
    private int numerodepuertas;
    private int numerodebolsasdeaire;
    private int capacidadcajadecarga;
    private boolean aireacondicionado;
    private boolean camaradereversa;
    private boolean abs;
    private boolean cuatroporcuatro;

    public Pickup(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, int numerodepasajeros, int numerodepuertas, int numerodebolsasdeaire,
            int capacidadcajadecarga, boolean aireacondicionado, boolean camaradereversa, boolean abs,
            boolean cuatroporcuatro) {

        super(marca, antecedente, modelo, cambios, velocidadmaxima, cilindraje);
        this.numerodepasajeros = numerodepasajeros;
        this.numerodepuertas = numerodepuertas;
        this.numerodebolsasdeaire = numerodebolsasdeaire;
        this.capacidadcajadecarga = capacidadcajadecarga;
        this.aireacondicionado = aireacondicionado;
        this.camaradereversa = camaradereversa;
        this.abs = abs;
        this.cuatroporcuatro = cuatroporcuatro;
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

    public int getNumerodebolsasdeaire() {
        return numerodebolsasdeaire;
    }

    public void setNumerodebolsasdeaire(int numerodebolsasdeaire) {
        this.numerodebolsasdeaire = numerodebolsasdeaire;
    }

    public int getCapacidadcajadecarga() {
        return capacidadcajadecarga;
    }

    public void setCapacidadcajadecarga(int capacidadcajadecarga) {
        this.capacidadcajadecarga = capacidadcajadecarga;
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

    public boolean isCuatroporcuatro() {
        return cuatroporcuatro;
    }

    public void setCuatroporcuatro(boolean cuatroporcuatro) {
        this.cuatroporcuatro = cuatroporcuatro;
    }
}

package Proyecto.Vehiculos;

import Proyecto.Vehiculos.Caracteristicas.Antecedente;

public class Pickup {
    public String marca;
    public Antecedente antecedente;
    public int modelo;
    public int cambios;
    public int velocidadmaxima;
    public double cilindraje;
    public int numerodepasajeros;
    public int numerodepuertas;
    public int numerodebolsasdeaire;
    public int capacidadcajadecarga;
    public boolean aireacondicionado;
    public boolean camaradereversa;
    public boolean abs;
    public boolean cuatroporcuatro;
    
    public Pickup(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, int numerodepasajeros, int numerodepuertas, int numerodebolsasdeaire,
            int capacidadcajadecarga, boolean aireacondicionado, boolean camaradereversa, boolean abs,
            boolean cuatroporcuatro) {
        this.marca = marca;
        this.antecedente = antecedente;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
        this.numerodepasajeros = numerodepasajeros;
        this.numerodepuertas = numerodepuertas;
        this.numerodebolsasdeaire = numerodebolsasdeaire;
        this.capacidadcajadecarga = capacidadcajadecarga;
        this.aireacondicionado = aireacondicionado;
        this.camaradereversa = camaradereversa;
        this.abs = abs;
        this.cuatroporcuatro = cuatroporcuatro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Antecedente getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(Antecedente antecedente) {
        this.antecedente = antecedente;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
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

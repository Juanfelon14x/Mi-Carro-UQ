package Proyecto.Vehiculos;

import Proyecto.Vehiculos.Caracteristicas.Antecedente;

public class Camion extends Proyecto.Vehiculo {
    public int capacidaddecarga;
    public int numerodeejes;
    public boolean aireacondicionado;
    public boolean frenosdeaire;
    public boolean abs;
    public String tipodecamion;

    public Camion(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, int capacidaddecarga, int numerodeejes, boolean aireacondicionado, boolean frenosdeaire,
            boolean abs, String tipodecamion) {
                
        super(marca, antecedente, modelo, cambios, velocidadmaxima, cilindraje);
        this.capacidaddecarga = capacidaddecarga;
        this.numerodeejes = numerodeejes;
        this.aireacondicionado = aireacondicionado;
        this.frenosdeaire = frenosdeaire;
        this.abs = abs;
        this.tipodecamion = tipodecamion;
    }

    public int getCapacidaddecarga() {
        return capacidaddecarga;
    }

    public void setCapacidaddecarga(int capacidaddecarga) {
        this.capacidaddecarga = capacidaddecarga;
    }

    public int getNumerodeejes() {
        return numerodeejes;
    }

    public void setNumerodeejes(int numerodeejes) {
        this.numerodeejes = numerodeejes;
    }

    public boolean isAireacondicionado() {
        return aireacondicionado;
    }

    public void setAireacondicionado(boolean aireacondicionado) {
        this.aireacondicionado = aireacondicionado;
    }

    public boolean isFrenosdeaire() {
        return frenosdeaire;
    }

    public void setFrenosdeaire(boolean frenosdeaire) {
        this.frenosdeaire = frenosdeaire;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public String getTipodecamion() {
        return tipodecamion;
    }

    public void setTipodecamion(String tipodecamion) {
        this.tipodecamion = tipodecamion;
    }
}

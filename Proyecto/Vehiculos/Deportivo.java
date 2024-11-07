package Vehiculos;

import Vehiculos.Caracteristicas.Antecedente;

public class Deportivo extends Vehiculo {
    private int numerodepasajeros;
    private int numerodepuertas;
    private int numerodebolsasdeaire;
    private int numerodecaballosdefuerza;
    private double tiempoenquealcanzalos100kmh;
    private boolean aireacondicionado;
    private boolean camaradereversa;
    private boolean velocidaddecrucero;
    private boolean abs;
    private boolean sensoresdecolision;
    private boolean sensordetraficocruzado;
    private boolean asistentedepermanenciaenelcarril;

    public Deportivo(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, int numerodepasajeros, int numerodepuertas, int numerodebolsasdeaire,
            int numerodecaballosdefuerza, double tiempoenquealcanzalos100kmh, boolean aireacondicionado,
            boolean camaradereversa, boolean velocidaddecrucero, boolean abs, boolean sensoresdecolision,
            boolean sensordetraficocruzado, boolean asistentedepermanenciaenelcarril) {
        super(marca, antecedente, modelo, cambios, velocidadmaxima, cilindraje);
        this.numerodepasajeros = numerodepasajeros;
        this.numerodepuertas = numerodepuertas;
        this.numerodebolsasdeaire = numerodebolsasdeaire;
        this.numerodecaballosdefuerza = numerodecaballosdefuerza;
        this.tiempoenquealcanzalos100kmh = tiempoenquealcanzalos100kmh;
        this.aireacondicionado = aireacondicionado;
        this.camaradereversa = camaradereversa;
        this.velocidaddecrucero = velocidaddecrucero;
        this.abs = abs;
        this.sensoresdecolision = sensoresdecolision;
        this.sensordetraficocruzado = sensordetraficocruzado;
        this.asistentedepermanenciaenelcarril = asistentedepermanenciaenelcarril;
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

    public int getNumerodecaballosdefuerza() {
        return numerodecaballosdefuerza;
    }

    public void setNumerodecaballosdefuerza(int numerodecaballosdefuerza) {
        this.numerodecaballosdefuerza = numerodecaballosdefuerza;
    }

    public double getTiempoenquealcanzalos100kmh() {
        return tiempoenquealcanzalos100kmh;
    }

    public void setTiempoenquealcanzalos100kmh(double tiempoenquealcanzalos100kmh) {
        this.tiempoenquealcanzalos100kmh = tiempoenquealcanzalos100kmh;
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

    public boolean isVelocidaddecrucero() {
        return velocidaddecrucero;
    }

    public void setVelocidaddecrucero(boolean velocidaddecrucero) {
        this.velocidaddecrucero = velocidaddecrucero;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isSensoresdecolision() {
        return sensoresdecolision;
    }

    public void setSensoresdecolision(boolean sensoresdecolision) {
        this.sensoresdecolision = sensoresdecolision;
    }

    public boolean isSensordetraficocruzado() {
        return sensordetraficocruzado;
    }

    public void setSensordetraficocruzado(boolean sensordetraficocruzado) {
        this.sensordetraficocruzado = sensordetraficocruzado;
    }

    public boolean isAsistentedepermanenciaenelcarril() {
        return asistentedepermanenciaenelcarril;
    }

    public void setAsistentedepermanenciaenelcarril(boolean asistentedepermanenciaenelcarril) {
        this.asistentedepermanenciaenelcarril = asistentedepermanenciaenelcarril;
    }

}
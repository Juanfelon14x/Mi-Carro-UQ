package Vehiculos;

import Vehiculos.Caracteristicas.Antecedente;

public class Suv extends Vehiculo {
    private int numerodepasajeros;
    private int numerodepuertas;
    private int capacidaddelmaletero;
    private int numerodebolsasdeaire;
    private boolean aireacondicionado;
    private boolean camaradereversa;
    private boolean velocidaddecrucero;
    private boolean abs;
    private boolean sensoresdecolision;
    private boolean sensordetraficocruzado;
    private boolean asistentedepermanenciaenelcarril;
    private boolean cuatroporcuatro;

    public Suv(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            int numerodepasajeros, int numerodepuertas, int capacidaddelmaletero, int numerodebolsasdeaire,
            boolean aireacondicionado, boolean camaradereversa, boolean velocidaddecrucero, boolean abs,
            boolean sensoresdecolision, boolean sensordetraficocruzado, boolean asistentedepermanenciaenelcarril,
            boolean cuatroporcuatro) {

        super(marca, antecedente, modelo, cambios, velocidadmaxima, cilindraje);
        this.numerodepasajeros = numerodepasajeros;
        this.numerodepuertas = numerodepuertas;
        this.capacidaddelmaletero = capacidaddelmaletero;
        this.numerodebolsasdeaire = numerodebolsasdeaire;
        this.aireacondicionado = aireacondicionado;
        this.camaradereversa = camaradereversa;
        this.velocidaddecrucero = velocidaddecrucero;
        this.abs = abs;
        this.sensoresdecolision = sensoresdecolision;
        this.sensordetraficocruzado = sensordetraficocruzado;
        this.asistentedepermanenciaenelcarril = asistentedepermanenciaenelcarril;
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

    public boolean isCuatroporcuatro() {
        return cuatroporcuatro;
    }

    public void setCuatroporcuatro(boolean cuatroporcuatro) {
        this.cuatroporcuatro = cuatroporcuatro;
    }
}

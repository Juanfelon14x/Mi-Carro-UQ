package Proyecto.Vehiculos;

import Proyecto.Vehiculos.Caracteristicas.Antecedente;

public class Suv {
    public String marca;
    public Antecedente antecedente;
    public int modelo;
    public int cambios;
    public int velocidadmaxima;
    public double cilindraje;
    public int numerodepasajeros;
    public int numerodepuertas;
    public int capacidaddelmaletero;
    public int numerodebolsasdeaire;
    public boolean aireacondicionado;
    public boolean camaradereversa;
    public boolean velocidaddecrucero;
    public boolean abs;
    public boolean sensoresdecolision;
    public boolean sensordetraficocruzado;
    public boolean asistentedepermanenciaenelcarril;
    public boolean cuatroporcuatro;
    
    public Suv(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            int numerodepasajeros, int numerodepuertas, int capacidaddelmaletero, int numerodebolsasdeaire,
            boolean aireacondicionado, boolean camaradereversa, boolean velocidaddecrucero, boolean abs,
            boolean sensoresdecolision, boolean sensordetraficocruzado, boolean asistentedepermanenciaenelcarril,
            boolean cuatroporcuatro) {
        this.marca = marca;
        this.antecedente = antecedente;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
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
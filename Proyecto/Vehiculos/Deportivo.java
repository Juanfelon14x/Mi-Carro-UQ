package Proyecto.Vehiculos;

import Proyecto.Vehiculos.Caracteristicas.Antecedente;

public class Deportivo {
    public String marca;
    public Antecedente antecedente;
    public int modelo;
    public int cambios;
    public int velocidadmaxima;
    public double cilindraje;
    public int numerodepasajeros;
    public int numerodepuertas;
    public int numerodebolsasdeaire;
    public int numerodecaballosdefuerza;
    public double tiempoenquealcanzalos100kmh;
    public boolean aireacondicionado;
    public boolean camaradereversa;
    public boolean velocidaddecrucero;
    public boolean abs;
    public boolean sensoresdecolision;
    public boolean sensordetraficocruzado;
    public boolean asistentedepermanenciaenelcarril;

    public Deportivo(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, int numerodepasajeros, int numerodepuertas, int numerodebolsasdeaire,
            int numerodecaballosdefuerza, double tiempoenquealcanzalos100kmh, boolean aireacondicionado,
            boolean camaradereversa, boolean velocidaddecrucero, boolean abs, boolean sensoresdecolision,
            boolean sensordetraficocruzado, boolean asistentedepermanenciaenelcarril) {
        this.marca = marca;
        this.antecedente = antecedente;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
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

package Proyecto.Vehiculos;

import Proyecto.Vehiculos.Caracteristicas.Antecedente;

public class Moto {
    public String marca;
    public Antecedente antecedente;
    public int modelo;
    public int cambios;
    public int velocidadmaxima;
    public double cilindraje;
    
    public Moto(String marca, Antecedente antecedente, int modelo, int cambios, int velocidadmaxima,
            double cilindraje) {
        this.marca = marca;
        this.antecedente = antecedente;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
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
}

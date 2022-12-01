package br.puc.ua.sobrecarga.source;

public class Area {
    
    public double calcula(double lado){
        return lado*lado;
    }

    public double calcula(double base, double altura){
        return base*altura;
    }

    public double calcula(double baseMaior, double baseMenor, double altura){
        return (baseMaior + baseMenor)*altura/2;
    }
}

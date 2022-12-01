package br.puc.ua.intro_polimorfismo.source;

public class CalculaSubtracao implements IBaseCalculadora{

    @Override
    public double calcula(double a, double b) {
        return a-b;
    }
    
}

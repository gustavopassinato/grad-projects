package br.puc.ua.sobrescrita.source;

public class AreaRetangulo implements Calculador {

    @Override
    public double calculaArea(double base, double altura) {
        
        return base*altura;
    }
    
}

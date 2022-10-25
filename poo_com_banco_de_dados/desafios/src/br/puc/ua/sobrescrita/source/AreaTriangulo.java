package br.puc.ua.sobrescrita.source;

public class AreaTriangulo implements Calculador {

    @Override
    public double calculaArea(double base, double altura) {
        
        return base*altura/2.0;
    }
    
}

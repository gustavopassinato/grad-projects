package br.puc.ua.intro_polimorfismo.source;

public class CalculadoraDivisao implements IBaseCalculadora{

    @Override
    public double calcula(double a, double b) {
        if(b!=0){
            return a/b;
        }
        throw new RuntimeException("Erro ao dividir por 0");
    }
    
}

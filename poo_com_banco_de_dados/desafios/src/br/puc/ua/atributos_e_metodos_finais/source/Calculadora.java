package br.puc.ua.atributos_e_metodos_finais.source;

public class Calculadora {
    private final double MARKUP = 1.54;

    public final double calculaPrecoVenda(double preco, double compra){

        return preco*compra*MARKUP;
    }
}

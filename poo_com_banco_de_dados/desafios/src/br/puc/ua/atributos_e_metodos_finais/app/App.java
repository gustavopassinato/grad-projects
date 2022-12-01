package br.puc.ua.atributos_e_metodos_finais.app;

import br.puc.ua.atributos_e_metodos_finais.source.Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double valor1 = calculadora.calculaPrecoVenda(13.8, 15);
    
        double valor2 = calculadora.calculaPrecoVenda(9.8, 20);

        System.out.println("Primeiro valor: "+valor1);
        
        System.out.println("Segundo valor: "+valor2);

    }
}

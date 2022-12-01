package br.puc.ua.intro_polimorfismo.app;

import java.util.ArrayList;
import java.util.List;

import br.puc.ua.intro_polimorfismo.source.CalculaSoma;
import br.puc.ua.intro_polimorfismo.source.CalculaSubtracao;
import br.puc.ua.intro_polimorfismo.source.CalculadoraDivisao;
import br.puc.ua.intro_polimorfismo.source.CalculadoraProduto;
import br.puc.ua.intro_polimorfismo.source.IBaseCalculadora;

public class Controle {
    public static void main(String[] args) {
        IBaseCalculadora calculaSoma = new CalculaSoma();
        IBaseCalculadora calculaSubtracao = new CalculaSubtracao();
        IBaseCalculadora calculaMultiplicacao = new CalculadoraProduto();
        IBaseCalculadora calculaDivisao = new CalculadoraDivisao();

        double a = 10;
        double b = 9;

        System.out.println("Valores de teste: a = "+a+" b = "+b);

        System.out.println("Soma: "+calculaSoma.calcula(a, b));
        System.out.println("Subtracao: "+calculaSubtracao.calcula(a, b));
        System.out.println("Multiplicacao: "+calculaMultiplicacao.calcula(a, b));
        System.out.println("Divisão: "+ calculaDivisao.calcula(a, b));

    }
}

package br.puc.ua.sobrescrita.app;

import br.puc.ua.sobrescrita.source.AreaRetangulo;
import br.puc.ua.sobrescrita.source.AreaTriangulo;
import br.puc.ua.sobrescrita.source.Calculador;

public class App {
    public static void main(String[] args) {
        Calculador calculadorTriangulo = new AreaTriangulo();
        Calculador calculadorRetangulo = new AreaRetangulo();

        System.out.println("Área triângulo de base 3 e altura 5: "+ calculadorTriangulo.calculaArea(3, 5));
        System.out.println("Área retângulo de base 3 e altura 5: "+ calculadorRetangulo.calculaArea(3, 5));
    }
}

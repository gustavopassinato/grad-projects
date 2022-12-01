package br.puc.ua.sobrecarga.app;

import br.puc.ua.sobrecarga.source.Area;

public class App {
    
    public static void main(String[] args) {
        Area area = new Area();

        System.out.println("A área do quadrado de lado 5 é: "+ area.calcula(5));
        System.out.println("A área do retangulo de altura 6 de base 5 é: "+ area.calcula(5, 6));
        System.out.println("A área do trapézio de base maior 7, base menor 5 e altura 3 é: "+ area.calcula(7, 5, 3));

    }
}

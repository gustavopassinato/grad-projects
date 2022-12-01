package br.puc.ua.colecao_objetos.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.puc.ua.colecao_objetos.source.Filme;

public class Controle {
    
    public static void main(String[] args) {
        List<Filme> listaDeFilmes = new ArrayList<>();



        while(true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Ver lista de filmes");
            System.out.println("2- Inserir filme");
            System.out.println("3- Sair");
            
            int option = scanner.nextInt();
            scanner.close();
            scanner = new Scanner(System.in);
            if(option == 1){
                mostrarLista(listaDeFilmes);
            }else if(option == 2){
                System.out.println("Digite o nome do filme");
                Filme filme = new Filme();
                filme.setNome(scanner.next());
                scanner.close();
                scanner = new Scanner(System.in);
                System.out.println("Digite o ano de lancamento");
                filme.setAnoLancamento(scanner.nextInt());
                listaDeFilmes.add(filme);
            }else if(option == 3){
                break;
            }else{
                System.out.println("Opção inválida");
            }

        }
    }

    private static void mostrarLista(List<Filme> listaDeFilmes) {

        listaDeFilmes.forEach(filme -> {
            System.out.println("Nome do filme: "+filme.getNome());
            System.out.println("Ano de Lancamento: "+ filme.getAnoLancamento());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        });
    }

    
}

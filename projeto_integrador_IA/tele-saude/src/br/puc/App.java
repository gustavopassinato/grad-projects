package br.puc;

import java.util.Scanner;

public class App {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println(BannersEnum.PERGUNTA.format("Qual o seu nome?"));
        String userName = scan.nextLine();
        Util.clearConsole();
        System.out.println(BannersEnum.INICIO.format(userName));
        scan.nextLine();

        while(true){
            System.out.println(BannersEnum.PERGUNTA.format("Digite 1 para avaliação e 0 para sair"));
            int escolha = scan.nextInt();
            if(escolha == 1) avaliacao();
            if(escolha == 0) break;
            else{
                System.out.println("Escolha inválida!");
                Util.clearConsole();
            } 
        }
    }

    private static void avaliacao() {
        User user = cadastroDeUsuario();
        user.adicionaSintoma(
            SintomaEnum.CORIZA, 
            PrettyIO.printAvaliacaoSintoma(SintomaEnum.CORIZA, scan)
        );

        user.adicionaSintoma(
            SintomaEnum.DOR_CABECA, 
            PrettyIO.printAvaliacaoSintoma(SintomaEnum.DOR_CABECA, scan)
        );

        user.adicionaSintoma(
            SintomaEnum.DOR_CORPO, 
            PrettyIO.printAvaliacaoSintoma(SintomaEnum.DOR_CORPO, scan)
        );

        user.adicionaSintoma(
            SintomaEnum.FEBRE, 
            PrettyIO.printAvaliacaoSintoma(SintomaEnum.FEBRE, scan)
        );

        user.adicionaSintoma(
            SintomaEnum.PERDA_OLFATO, 
            PrettyIO.printAvaliacaoSintoma(SintomaEnum.PERDA_OLFATO, scan)
        );

        user.adicionaSintoma(
            SintomaEnum.PERDA_PALADAR, 
            PrettyIO.printAvaliacaoSintoma(SintomaEnum.PERDA_PALADAR, scan)
        );

        user.adicionaSintoma(
            SintomaEnum.TOSSE, 
            PrettyIO.printAvaliacaoSintoma(SintomaEnum.TOSSE, scan)
        );
    }

    private static User cadastroDeUsuario(){
        String nome = PrettyIO.print(BannersEnum.PERGUNTA, "Qual o seu nome?", scan);
        String sobrenome = PrettyIO.print(BannersEnum.PERGUNTA, "Qual o seu sobrenome?", scan);
        String dataNascimento = PrettyIO.print(BannersEnum.PERGUNTA, "Qual a sua data de nascimento?", scan);
        
        return new User(nome, sobrenome, dataNascimento);
    }
}

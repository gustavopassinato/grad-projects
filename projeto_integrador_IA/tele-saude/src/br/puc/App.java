package br.puc;

import java.util.Scanner;

public class App {

    private static Scanner scan = new Scanner(System.in);
    private static User user;

    public static void main(String[] args) throws Exception {
        System.out.println(BannersEnum.INICIO.format(null));
        scan.nextLine();

        while(true){
            int escolha = -1;
            try{
                escolha = Integer.parseInt(PrettyIO.print(BannersEnum.PERGUNTA, "Digite 1 para avaliação, 2 para apresentar resultados ou 0 para sair", scan));

            }catch(NumberFormatException exception){
                PrettyIO.print(BannersEnum.PERGUNTA, "Valor digitado é inválido, pressione enter para voltar ao menu!", scan);
            }
            
            if(escolha == 1) avaliacao();
            if(escolha == 2) apresentaResultados();
            if(escolha == 0) break;
            else{
                System.out.println("Escolha inválida!");
                Util.clearConsole();
            } 
        }
    }

    private static void avaliacao() {
        user = cadastroDeUsuario();
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

    private static void apresentaResultados(){
        if(user == null) PrettyIO.print(BannersEnum.PERGUNTA, "[ERRO] Nenhum usuário cadastrado ainda!", scan);
        else{
            PrettyIO.printUser(user, scan);
        }
    }
}

package br.puc;

import java.util.Scanner;

public class PrettyIO {
    public static String print(BannersEnum banner,String text, Scanner scan){
        Util.clearConsole();
        System.out.println(banner.format(text));
        return scan.nextLine();
    }

    public static Integer printAvaliacaoSintoma(SintomaEnum sintoma, Scanner scan){
        Util.clearConsole();
        System.out.println(BannersEnum.PERGUNTA.format("Em uma escala de 0 a 10, o qual a intensidade do seu sintoma de "+
            sintoma.sintomaFormatado()));
        return scan.nextInt();
    }
}

package br.puc;

import java.util.List;

public class GerenciadorSintomas {

    private static List<Sintoma> sintomasCadastrados;

    private static final int INTENSIDADE_PADRAO_INICIAL_DE_SINTOMA = 0;

    private static final String[] NOMES_SINTOMAS_CADASTRADOS = {"coriza"};

    private GerenciadorSintomas() {
    }

    public static List<Sintoma> getSintomasCadastrados() {
        for(String nome : NOMES_SINTOMAS_CADASTRADOS){
            sintomasCadastrados.add(new Sintoma(nome, INTENSIDADE_PADRAO_INICIAL_DE_SINTOMA));
        }

        return sintomasCadastrados;
    }

    public static List<Sintoma> getSintomasDiabetes(){
        List<Sintoma> sintomasDiabetes;
        if(sintomasCadastrados.isEmpty()){
            sintomasDiabetes =  getSintomasCadastrados();
        }else{
            sintomasDiabetes = sintomasCadastrados;
        }

        sintomasDiabetes.get(0

    }

}

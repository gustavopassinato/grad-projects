package br.puc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class User extends Object{

    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private LocalDate dataAvaliacao;
    private Map<SintomaEnum, Integer> sintomas;
    private String result;

    private Integer[] intensidadeDeSintomasParaCovid= {10,9,8,6,4,5,9};

    public User(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.dataAvaliacao = LocalDate.now();
        this.sintomas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }

    public Map<SintomaEnum, Integer> getSintomas() {
        return sintomas;
    }

    public void adicionaSintoma(SintomaEnum sintoma, Integer intensidade) {
        this.sintomas.put(sintoma, intensidade);
    }

    public String getSintomasFormat() {
       
        this.result = "+ ==> Resumo dos sintomas\n\n";
        this.sintomas.forEach((sintoma, intensidade)-> this.result += String.format("+   %s -> %s%n+%n", sintoma.sintomaFormatado(), intensidadeSintomaFormatada(intensidade)));
        
        return result;
    }

    private String intensidadeSintomaFormatada(Integer intensidade){
        String res= "[";
        for(int i = 1; i<= intensidade; i++){
            res+="#";
        }
        res+="]";
        return res;
    }

    public String getParecer() {
        Collection<Integer> it = this.sintomas.values();
        ArrayList<Integer> intensidades = new ArrayList<>(it);

        boolean res = true;
        for(int i = 0; i< intensidades.size();i++){
            if (intensidades.get(i)< intensidadeDeSintomasParaCovid[i]){
                res = false;
            }
        }

        return res ? "Positivo" : "Negativo";
    }

}

package br.puc;

import java.time.LocalDate;
import java.util.Map;

public class User extends Object{

    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private LocalDate dataAvaliacao;
    private Map<SintomaEnum, Integer> sintomas;

    public User(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.dataAvaliacao = LocalDate.now();
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

    public Object getSintomasFormat() {
       
        String result = "==> Resumo dos sintomas\n";
        this.sintomas.forEach((sintoma, intensidade)->extracted(result, sintoma, intensidade));
        
        return result;
    }

    private void extracted(String result, SintomaEnum sintoma, Integer intensidade) {
        result += String.format("+   %s -> %s\n+\n", sintoma.sintomaFormatado(), intensidadeSintomaFormatada(intensidade));
    }

    private String intensidadeSintomaFormatada(Integer intensidade){
        String result= "[";
        for(int i = 1; i<= intensidade; i++){
            result+="#";
        }
        result+="]";
        return result;
    }

    public Object getParecer() {
        return null;
    }

}

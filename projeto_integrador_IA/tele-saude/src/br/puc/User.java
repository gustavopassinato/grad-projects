package br.puc;

import java.time.LocalDate;
import java.util.Map;

public class User {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private LocalDate dataAvaliacao;
    private Map<SintomaEnum, Integer> sintomas;

    public User(String nome, String sobrenome, LocalDate dataNascimento) {
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

    public LocalDate getDataNascimento() {
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

}

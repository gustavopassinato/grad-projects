package br.puc.ua.classes_abstratas.source;

import java.util.List;

public class ColboradorPf extends ColaboradorBase {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private String titulacao;

    public ColboradorPf(Endereco endereco, String telefone, String email, List<String> disciplinasMinistradas,
            String nome, String cpf, String rg, int idade, String titulacao) {
        super(endereco, telefone, email, disciplinasMinistradas);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    public String getTitulacao() {
        return titulacao;
    }

}

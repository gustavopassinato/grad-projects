package br.puc;

import java.util.List;

public class Paciente {
    private String nome;
    private List<Sintoma> sintomas;
    private boolean houveColeta;


    public Paciente(String nome) {
        this.sintomas = GerenciadorSintomas.getSintomasCadastrados();
        this.nome = nome;
        this.houveColeta = false;
    }


    public String getNome() {
        return nome;
    }


    public List<Sintoma> getSintomas() {
        return sintomas;
    }


    public boolean houveColeta() {
        return houveColeta;
    }

    
}

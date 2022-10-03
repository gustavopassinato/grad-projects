package br.puc;

import java.util.List;

public abstract class Doenca {

    private String nome;
    private List<Sintoma> sintomas;

    protected Doenca(String nome, List<Sintoma> sintomas) {
        this.nome = nome;
        this.sintomas = sintomas;
    }

    public String getNome() {
        return nome;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

}

package br.puc.ua.classes_abstratas.source;

import java.util.List;

public abstract class ColaboradorBase {
    private Endereco endereco;
    private String telefone;
    private String email;
    private List<String> disciplinasMinistradas;

    protected ColaboradorBase(Endereco endereco, String telefone, String email, List<String> disciplinasMinistradas) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    

}

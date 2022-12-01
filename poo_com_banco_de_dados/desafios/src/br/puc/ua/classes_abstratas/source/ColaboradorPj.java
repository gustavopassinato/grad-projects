package br.puc.ua.classes_abstratas.source;

import java.util.List;

public class ColaboradorPj extends ColaboradorBase {

    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    private String cnpj;

    public ColaboradorPj(Endereco endereco, String telefone, String email, List<String> disciplinasMinistradas,
            String razaoSocial, String nomeFantasia, String inscricaoMunicipal, String inscricaoEstadual, String cnpj) {
        super(endereco, telefone, email, disciplinasMinistradas);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getcnpj() {
        return cnpj;
    }

    

}

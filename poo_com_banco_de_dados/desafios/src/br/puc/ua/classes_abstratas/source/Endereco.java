package br.puc.ua.classes_abstratas.source;

public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String logradouro, String numero, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    

}

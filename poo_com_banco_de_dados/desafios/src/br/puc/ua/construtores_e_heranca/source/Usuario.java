package br.puc.ua.construtores_e_heranca.source;

public class Usuario {

    private Long id;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String cpfOuCnpj;

    public Usuario(Long id, String nome, String telefone, String cpfOuCnpj) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpfOuCnpj = cpfOuCnpj;

        this.endereco = new Endereco();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

}
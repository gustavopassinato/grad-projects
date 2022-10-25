package br.puc.ua.construtores_e_heranca.source;

public class UsuarioFornecedor extends Usuario {

    private String nomeFantasia;
    private String website;

    public UsuarioFornecedor(Long id, String nome, String telefone, String cpfOuCnpj, String nomeFantasia,
            String website) {
        super(id, nome, telefone, cpfOuCnpj);
        this.nomeFantasia = nomeFantasia;
        this.website = website;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getWebsite() {
        return website;
    }

}

package br.puc.ua.construtores_e_heranca.source;

public class UsuarioAssociado extends Usuario {

    private String situacao;
    private Long numAssociado;

    public UsuarioAssociado(Long id, String nome, String telefone, String cpfOuCnpj, String situacao,
            Long numAssociado) {
        super(id, nome, telefone, cpfOuCnpj);
        this.situacao = situacao;
        this.numAssociado = numAssociado;
    }

    public String getSituacao() {
        return situacao;
    }

    public Long getNumAssociado() {
        return numAssociado;
    }
    

}

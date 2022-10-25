package br.puc.ua.construtores_e_heranca.source;

public class UsuarioColaborador extends Usuario {
    
    private String cargoOuFuncao;

    public UsuarioColaborador(Long id, String nome, String telefone, String cpfOuCnpj, String cargoOuFuncao) {
        super(id, nome, telefone, cpfOuCnpj);
        this.cargoOuFuncao = cargoOuFuncao;
    }

    public String getCargoOuFuncao() {
        return cargoOuFuncao;
    }

    
}

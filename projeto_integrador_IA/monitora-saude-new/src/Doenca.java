import java.util.List;

public abstract class Doenca {

    private String nome;
    private List<Sintoma> sintomas;

    protected Doenca(String nome) {
        this.nome = nome;

    }

    protected void setSintomas(List<Sintoma> sintomas){
        this.sintomas = sintomas;
    }

    public String getNome() {
        return nome;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

}

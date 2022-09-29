public class Sintoma {

    private String nome;
    private Integer intensidade;
    private Integer grauUrgencia;

    public Sintoma(String nome, Integer intensidade, Integer grauUrgencia) {
        this.nome = nome;
        this.intensidade = intensidade;
        this.grauUrgencia = grauUrgencia;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIntensidade() {
        return intensidade;
    }

    public Integer getGrauUrgencia() {
        return grauUrgencia;
    }

    public void atualizaSintoma(Integer intensidade){
        this.intensidade = intensidade;
    }
    
}

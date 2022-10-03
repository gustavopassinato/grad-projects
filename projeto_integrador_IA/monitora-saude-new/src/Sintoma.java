public class Sintoma {
    private String nome;
    private Integer intensidade;

    public Sintoma(String nome) {
        this.nome = nome;
    }

    public Sintoma(String nome, Integer intensidade) {
        this.nome = nome;
        this.intensidade = intensidade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIntensidade() {
        return intensidade;
    }
    
    public void atualizaIntensidade(Integer intensidade){
        this.intensidade = intensidade;
    }

    @Override
    public String toString() {
        
        return String.format("[%s ---> %d]", this.nome, this.intensidade);
    }
}
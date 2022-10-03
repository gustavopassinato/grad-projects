import java.util.ArrayList;
import java.util.List;

public class GerenciadorSintomaS {

    private List<Sintoma> sintomas;

    private static final String[] SINTOMAS_CADASTRADOS = { "CORIZA", "TOSSE", "DOR DE CABEÇA", "FALTA DE AR" };

    public GerenciadorSintomaS() {
        this.sintomas = new ArrayList<>();

        for (String sintoma : SINTOMAS_CADASTRADOS) {
            sintomas.add(new Sintoma(sintoma, 0));
        }

    }

    public String[] getSintomasCadastrados() {
        return SINTOMAS_CADASTRADOS;
    }

    public void atualizaIntensidadeSintoma(String nomeSintoma, Integer intensidade) {

        this.sintomas.forEach(sintoma -> {

            if (sintoma.getNome().equals(nomeSintoma)) {

                sintoma.atualizaIntensidade(intensidade);

            }
        });
    }

    public List<Sintoma> getSintomasColetados() {

        return this.sintomas;
    }

    public List<Sintoma> getPadraoSintomasDiabetes() {
        atualizaIntensidadeSintoma("", 1);

        return this.sintomas;

    }

    public List<Sintoma> getPadraoSintomasAvc(){
        atualizaIntensidadeSintoma("", 0);

        return this.sintomas;
    }

    public List<Sintoma> getPadraoSintomasCovid(){
        atualizaIntensidadeSintoma("", 10);
    
        return this.sintomas;
    }

}

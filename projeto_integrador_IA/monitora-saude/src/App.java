import java.util.ArrayList;
import java.util.List;


public class App {


    private List<Sintoma> sintomasReferencia;
    private List<Sintoma> sintomasColetados;

    public App() {

        this.sintomasReferencia = new ArrayList<>();
        this.sintomasColetados = new ArrayList<>();

        sintomasReferencia.add(new Sintoma("febre", 8, 1));
        sintomasReferencia.add(new Sintoma("tosse", 8, 2));
        sintomasReferencia.add(new Sintoma("cansaço", 8, 3));
        sintomasReferencia.add(new Sintoma("dor de garganta", 6, 4));
        sintomasReferencia.add(new Sintoma("diarreia", 6, 5));
        sintomasReferencia.add(new Sintoma("dificuldade para respirar", 4, 6));
        sintomasReferencia.add(new Sintoma("confusão", 4, 7));
        sintomasReferencia.add(new Sintoma("dores no peito", 4, 8));

        preparaColetSintomas();

    }

    public List<Sintoma> getListaSintomasParaColeta(){
        return this.sintomasColetados;
    }

    public void coletaSintomas(List<Sintoma> sintomasColetados){
        this.sintomasColetados = sintomasColetados;
    }

    private void preparaColetSintomas(){
        this.sintomasReferencia.forEach(sintoma ->{
            this.sintomasColetados.add(new Sintoma(sintoma.getNome(), 0, sintoma.getGrauUrgencia()));
        });
    }

    public String verificaContaminacao(){
        if(verificaColetaSintomas() || this.sintomasColetados.isEmpty()){
            throw new IllegalArgumentException("Ainda não foi coletado nenhum sintoma!");
        }
        Integer parametroReferencia = calculaParametro(this.sintomasReferencia);
        Integer parametroColetado = calculaParametro(this.sintomasColetados);
    
        return parametroColetado>=parametroReferencia ? "Potencialmente Positivo": "Potencialmente Negativo";
    }

    private Integer calculaParametro(List<Sintoma> listaSintomas) {

        Integer resultado = 0;
        for (Sintoma sintoma : listaSintomas){
            resultado += sintoma.getIntensidade()*sintoma.getGrauUrgencia();
        }

        return resultado;
    }

    private boolean verificaColetaSintomas(){
        boolean resultado = false;

        for(Sintoma sintoma : this.sintomasColetados){
            if (sintoma.getIntensidade() == 0) resultado = true;
        }
        return resultado;
    }

    
}

import java.util.Arrays;
import java.util.List;

public class AnalisadorSintomas {

    public static final double LIMIAR_PARA_MEDIA_DOS_SINTOMAS = 2;
    
    public static String analisa(List<Sintoma> sintomasColetados){
        if(limiteMinimoSintomas(sintomasColetados)){
            return "De acordo com as intensidades dos sintomas informadas, você provavelmente não tem nenhuma doença!";
        }

        String resultado;

        List<Sintoma> sintomasDiabestes = new GerenciadorSintomaS().getPadraoSintomasDiabetes();
        List<Sintoma> sintomasAvc = new GerenciadorSintomaS().getPadraoSintomasAvc();
        List<Sintoma> sintomasCovid = new GerenciadorSintomaS().getPadraoSintomasCovid();

        double[] diferencas = new double[3];
        diferencas[0] = calculaDiferenca(sintomasColetados, sintomasDiabestes);
        diferencas[1] = calculaDiferenca(sintomasColetados, sintomasCovid);
        diferencas[2] = calculaDiferenca(sintomasColetados, sintomasAvc);
        
        if(diferencas[0]<diferencas[1]){
            if(diferencas[0]<diferencas[2])
                return "Com base nos seus sintomas, você provavelmente está com sinais de Diabetes";
            else 
                return "Com base nos seus sintomas, você provavelmente está com sinais de AVC";
        }else if(diferencas[1]<diferencas[2]){
            return "Com base nos seus sintomas, você provavelmente está com sinais de Covid";
        }else {
            return "Com base nos seus sintomas, você provavelmente está com sinais de AVC";
        }
    }

    private static boolean limiteMinimoSintomas(List<Sintoma> sintomasColetados) {
        double media = 0;
        for(Sintoma sintoma : sintomasColetados){
            media += sintoma.getIntensidade();
        }
        media = media/sintomasColetados.size();

        if(media < LIMIAR_PARA_MEDIA_DOS_SINTOMAS){
            return true;
        }
        return false;
    }

    private static double calculaDiferenca(List<Sintoma> sintomasColetados, List<Sintoma> sintomasPadrao) {
        double coefComparacao = 0;
        for (int i = 0; i< sintomasColetados.size();i++) {
            coefComparacao += (sintomasColetados.get(i).getIntensidade()- sintomasPadrao.get(i).getIntensidade())^2;
        }

        return  Math.sqrt(coefComparacao);
    }
}

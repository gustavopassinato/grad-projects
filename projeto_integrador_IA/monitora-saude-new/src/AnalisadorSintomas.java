import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalisadorSintomas {

    public static final double LIMIAR_PARA_MEDIA_DOS_SINTOMAS = 2;

    public static String analisa(List<Sintoma> sintomasColetados) {
        if (limiteMinimoSintomas(sintomasColetados)) {
            return "De acordo com as intensidades dos sintomas informadas, você provavelmente não tem nenhuma doença!";
        }

        String resultado;

        List<List<Sintoma>> listaSintomasPadrao = new ArrayList<>();
        listaSintomasPadrao.add(new GerenciadorSintomaS().getPadraoSintomasDiabetes());
        listaSintomasPadrao.add(new GerenciadorSintomaS().getPadraoSintomasAvc());
        listaSintomasPadrao.add(new GerenciadorSintomaS().getPadraoSintomasCovid());

        RegistradorDistancia registrador = new RegistradorDistancia(sintomasColetados);

        return calculaDiferencas(registrador, listaSintomasPadrao);

    }

    private static String calculaDiferencas(RegistradorDistancia registrador, List<List<Sintoma>> listaSintomasPadrao) {

        for()

        return null;
    }

    private static boolean limiteMinimoSintomas(List<Sintoma> sintomasColetados) {
        double media = 0;
        for (Sintoma sintoma : sintomasColetados) {
            media += sintoma.getIntensidade();
        }
        media = media / sintomasColetados.size();

        if (media < LIMIAR_PARA_MEDIA_DOS_SINTOMAS) {
            return true;
        }
        return false;
    }

}

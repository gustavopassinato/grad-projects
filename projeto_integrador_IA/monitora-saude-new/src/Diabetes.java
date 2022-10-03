import java.util.ArrayList;
import java.util.List;

public class Diabetes extends Doenca {

    public Diabetes() {
        super("Diabetes tipo 2");
        List<Sintoma> sintomas = new ArrayList<>();
        sintomas.add(new Sintoma(SintomasCadastrados.CORIZA.toString(), 10));

        super.setSintomas(sintomas);
    }
    
}

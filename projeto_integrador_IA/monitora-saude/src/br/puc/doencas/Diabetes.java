package br.puc.doencas;

import java.util.List;

import br.puc.Doenca;
import br.puc.Sintoma;

public class Diabetes extends Doenca {

    public Diabetes() {
        super("diabetes", preparaSintomasReferencia());

        //TODO Auto-generated constructor stub
    }

    private List<Sintoma> preparaSintomasReferencia() {
        return null;
    }
    
}

import java.util.List;

public class Cadastrador {
    private static List<String> teste;


    private Cadastrador(){
        teste.add("teste 1");
    }

    public static List<String> retornaTeste(){
        Cadastrador cad = new Cadastrador();
        return cad.retornaTeste();
    }
}

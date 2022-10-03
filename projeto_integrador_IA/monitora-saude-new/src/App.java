import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in); 

    private static List<Sintoma> sintomasColetados = new ArrayList<>();

    private static GerenciadorSintomaS gerenciadorSintomas = new GerenciadorSintomaS();
    public static void main(String[] args) throws Exception {
        

        while(true){
            System.out.println("Digite 1 para realizar coleta de sintomas, 2 para visualizar resultado ou 0 para sair");
            int escolha = scanner.nextInt();
            
            if(escolha == 1){
                fazerColeta();
            }else if(escolha == 2){
                try {
                    exibirResultado();
                    
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            }else if (escolha == 0){
                break;
            }else {
                System.out.println("Escolha inválida");
            }
        }
    }

    private static void exibirResultado() {

        if(sintomasColetados.isEmpty()){
            throw new IllegalArgumentException("Os sintomas ainda não foram coletados!!");
        }

        sintomasColetados.forEach(sintoma -> System.out.println(sintoma.toString()));

        String resultado = AnalisadorSintomas.analisa(sintomasColetados);
        System.out.println(resultado);
    }

    private static void fazerColeta() {
        String[] sintomasCadastrados = gerenciadorSintomas.getSintomasCadastrados();

        for (String nomeSintoma: sintomasCadastrados){
            int intensidadeColetada = coletaIntensidade(nomeSintoma);
            gerenciadorSintomas.atualizaIntensidadeSintoma(nomeSintoma, intensidadeColetada);
        }

        sintomasColetados = gerenciadorSintomas.getSintomasColetados();

    }

    private static int coletaIntensidade(String nomeSintoma) {
        int intensidade;
        while(true){
            System.out.println("Em uma escala de 0 a 10 qual a intensidade do sintoma: "+ nomeSintoma+" em você?");
            intensidade = scanner.nextInt();

            if(intensidade>=0 && intensidade<=10){
                break;
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Resposta inválida, responda novamente!");
            System.out.println("");
            System.out.println("");
        }

        return intensidade;
    }
}

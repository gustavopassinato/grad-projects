import java.util.List;
import java.util.Scanner;

public class Exec {

    private static Scanner scaner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        List<Sintoma>listaSintomasColeta = app.getListaSintomasParaColeta();

        int escolha;

        while(true){
            escolha = -1;
            System.out.println("Digite 1 para realizar avaliação, 2 para ver resultados ou 0 para sair");
            String leitor = scaner.nextLine();
            escolha = leitor.isBlank() ? -1: Integer.parseInt(leitor);

            if (escolha == 1) {
                app.coletaSintomas(realizaAvaliacao(listaSintomasColeta));
            }else if(escolha == 2){
                try{
                    exibeResultado(app);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }else if (escolha == 0) {
                break;
            
            }else if (escolha == -1){
                continue;
            }else{
                System.out.println("Opção inválida!");
            }
        }
    }

    private static void exibeResultado(App app) {
        String resultado;
        
        resultado = app.verificaContaminacao();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(String.format("O resultado da análise é que o seu quadro é %s para contaminação com do COVID-19", resultado)); 
        
    }

    private static List<Sintoma> realizaAvaliacao(List<Sintoma> listaSintomasRef) {

        for(Sintoma sintoma : listaSintomasRef){
            sintoma.atualizaSintoma(coletaIntensidadeSintoma(sintoma.getNome()));
        }
        return listaSintomasRef;
    }

    private static Integer coletaIntensidadeSintoma(String sintoma) {
        Integer intensidade = 0;

        while(true){
            System.out.println("Em uma escala de 1 a 10, qual o nível apresentado por você no sintoma de "+ sintoma);
            intensidade = scaner.nextInt();

            if (intensidade<1 || intensidade>10){
                System.out.println("");
                System.out.println("");
                System.out.println("O valor digitado é inválido, pressione enter para digitar novamente!");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                scaner.nextLine();
            }else{
                break;
            }
        }
        return intensidade;
    }

}

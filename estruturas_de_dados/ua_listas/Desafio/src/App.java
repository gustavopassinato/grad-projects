import java.util.LinkedList;
import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App {

    private static Float resultado;
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        List<Float> list = new LinkedList<Float>();
        
        Object[] testes = {"Sim", "Não, apresentar resultado"};

        int choice = 0;
        int contador = 0;
        while(true){
            contador++;
            String nota = JOptionPane.showInputDialog(null, "Digite a "+contador +"º nota do aluno: ");
            list.add(Float.parseFloat(nota));

            choice = JOptionPane.showOptionDialog(null,
            "Deseja incluir outra nota? ",
            "Seleção de proximo passo",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            testes,
            testes[0]
            );

            if (choice == 1){
                break;
            }
        }
        float res= 0;
        for(Float nota : list){
            res+=nota;
        }
        if(list.size()==0){
          JOptionPane.showMessageDialog(null, "Erro, nenhuma nota cadastrada");  
        }else{

            res = res/list.size();
    
            String resposta = String.format("A média do aluno é: %f", res);
            JOptionPane.showMessageDialog(null, resposta);
        }

    }
}

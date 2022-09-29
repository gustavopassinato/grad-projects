import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static BigDecimal saldo = new BigDecimal("1000");

    private static boolean podePegarChequeEspecial = true;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar: ");
        String saque = scan.nextLine();
        BigDecimal saqueVal = new BigDecimal(saque);

        if (saqueVal.compareTo(saldo) > 0) {
            System.out.println("Saldo insuficiente!");
            if (podePegarChequeEspecial) {
                System.out.println("Digite 's' para solicitar cheque especial ou 'n' para sair: ");
                String resp = scan.nextLine();
                if (resp.equals("s")) {
                    System.out.println("Digite o valor do cheque especial desejado: ");
                    String chequeEsp = scan.nextLine();
                    BigDecimal chequeEspVal = new BigDecimal(chequeEsp);
                    saldo = chequeEspVal.add(saldo).subtract(saqueVal);

                    System.out.println("Após o saque de " + saqueVal + " seu novo saldo é de " + saldo);
                }
            }

        }else{
            saldo = saldo.subtract(saqueVal);
            System.out.println("Após o saque de " + saqueVal + " seu novo saldo é de " + saldo);
        }

    }
}

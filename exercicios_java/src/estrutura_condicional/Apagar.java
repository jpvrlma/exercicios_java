package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Apagar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double valorApagar;

        if (codigo == 1){
            valorApagar = quantidade * 4.00;
        } else if (codigo == 2) {
            valorApagar = quantidade * 4.50;
        } else if (codigo == 3) {
            valorApagar = quantidade * 5.00;
        } else if (codigo == 4) {
            valorApagar = quantidade * 2.00;
        }else {
            valorApagar = quantidade * 1.50;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,valorApagar);
        scanner.close();
    }
}

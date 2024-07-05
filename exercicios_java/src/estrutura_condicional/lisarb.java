package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class lisarb {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto;
        
        if (salario<= 2000){
            imposto = 0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.8;
        }
        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

    }
}
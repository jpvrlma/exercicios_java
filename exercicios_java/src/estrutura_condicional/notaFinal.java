package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class notaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double nota1,nota2,notaFinal;
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        notaFinal = nota1 + nota2;

        if (notaFinal<60.0){
            System.out.printf("RESULTADO = %.2f%nREPROVADO",notaFinal);
        }else {
            System.out.printf("RESULTADO = %.2f%nAPROVADO",notaFinal);
        }
        scanner.close();
    }
}

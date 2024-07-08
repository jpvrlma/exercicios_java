package estrutura_repetitiva;

import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String saudacao = "Muito Obrigado";
        int escolha = scanner.nextInt();
        int contAlcool = 0;
        int contGasol = 0;
        int contDiesel = 0;

        while (escolha != 4){
            if (escolha == 1){
               contAlcool +=1;
            } else if (escolha == 2) {
                contGasol += 1;
            }else if (escolha == 3){
                contDiesel += 1;
            }else {
                System.out.println("Digite um numero entre 1 e 4");
            }
            escolha = scanner.nextInt();
        }
        System.out.printf("%s%nAlcool: %d%nGasolina: %d%nDiesel: %d%n ",saudacao,contAlcool,contGasol,contDiesel);
        scanner.close();
    }
}

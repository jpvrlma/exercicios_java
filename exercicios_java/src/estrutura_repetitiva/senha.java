package estrutura_repetitiva;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = scanner.nextInt();

        while (senha != 2002){
            System.out.println("ACESSO NEGADO");
            senha = scanner.nextInt();
        }
        System.out.println("ACESSO PERMITIDO");
        scanner.close();
    }
}

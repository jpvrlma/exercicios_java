package estrutura_repetitiva;

import java.util.Scanner;

public class quadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }else {
                System.out.println("Quarto");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        scanner.close();
    }
}

package estrutura_sequencial;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class pecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigoP1 = scanner.nextInt();
        int numeroP1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codigoP2 = scanner.nextInt();
        int numeroP2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double soma = numeroP1 * valorPeca1 + numeroP2 * valorPeca2;

        System.out.printf("VALOR A PAGAR = R$ %.2f%n",soma);
        scanner.close();
    }
}

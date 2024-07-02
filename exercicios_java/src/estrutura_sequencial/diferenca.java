package estrutura_sequencial;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor A:");
        int a = scanner.nextInt();
        System.out.println("Valor B:");
        int b = scanner.nextInt();
        System.out.println("Valor C:");
        int c = scanner.nextInt();
        System.out.println("Valor D:");
        int d = scanner.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("DIFERENÇA = " + diferenca);
    }
}

package estrutura_sequencial;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Locale;
import java.util.Scanner;

public class raio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um valor.");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(raio,2);

        System.out.printf("Área = %.4f%n ",area);
        scanner.close();
    }
}

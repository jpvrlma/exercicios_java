package estrutura_sequencial;
// Crie um programa em Java para ler as medidas da largura e comprimento de um terreno retangular,
// bem como o valor do metro quadrado do terreno.
// O programa deve calcular e mostrar o valor da área do terreno e o valor do preço do terreno,
// ambos com duas casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class areaxpreco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Largura");
        double largura = scanner.nextDouble();
        System.out.println("Digite o comprimento");
        double comprimento = scanner.nextDouble();
        System.out.println("Digite o valor por metro quadrado");
        double metroQuadrado = scanner.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Área: %.2f%n",area);
        System.out.printf("Preco: %.2f",preco);

        scanner.close();
    }

}

package estrutura_sequencial;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais

import java.util.Locale;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número do Funcionário:");
        int numero = scanner.nextInt();
        System.out.println("Horas trabalhadas:");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.println("Valor por hora:");
        double valorPorhora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorhora;

        System.out.printf("NÚMERO = %d%nSALÁRIO = U$ %.2f%n",numero,salario);
        scanner.close();
    }
}

package estrutura_condicional;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }
        scanner.close();
    }
}

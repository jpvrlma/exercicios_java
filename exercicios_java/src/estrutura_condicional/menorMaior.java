package estrutura_condicional;

import java.util.Scanner;

public class menorMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a < b && a < c){
            System.out.println("MENOR = " + a);
        } else if (b < c) {
            System.out.println("MENOR = " + b);
        } else if (c < b) {
            System.out.println("MENOR = " + c);
        } else {
            System.out.println("NÚMEROS IGUAIS");
        }
    }
}

package estrutura_sequencial;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B

import java.util.Locale;
import java.util.Scanner;

public class tresAreas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a,b,c,pi;

        pi = 3.14159;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();


        double triangulo = a * c / 2;
        double circulo = Math.pow(c,2) * pi;
        double trapezio = (a + b) * c / 2;
        double quadrado = Math.pow(b,2);
        double retangulo = a * b;

        System.out.printf("TRIANGULO = %.3f%n",triangulo);
        System.out.printf("CIRCULO = %.3f%n",circulo);
        System.out.printf("TRAPEZIO = %.3f%n",trapezio);
        System.out.printf("QUADRADO = %.3f%n",quadrado);
        System.out.printf("RETANGULO = %.3f%n",retangulo);

    }
}

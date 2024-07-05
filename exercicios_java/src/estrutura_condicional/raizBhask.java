package estrutura_condicional;
//Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
// Se não for possível calcular as raízes, mostre a mensagem correspondente Impossivel calcular",
// caso haja uma divisão por 0 ou raiz de numero negativo.

import java.util.Locale;
import java.util.Scanner;

public class raizBhask {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a,b,c,delta;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        delta = Math.pow(b,2) - 4.0 * a * c;

        if (a == 0.0 || delta <0.0){
            System.out.println("Impossível calcular!");
        }else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n",r1);
            System.out.printf("R2 = %.5f%n",r2);
        }
        scanner.close();
    }
}

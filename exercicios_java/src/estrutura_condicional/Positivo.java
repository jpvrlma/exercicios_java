package estrutura_condicional;
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }
        scanner.close();
    }
}

package estrutura_condicional;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1,n2;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0 ){
            System.out.println("MÚLTIPLOS");
        }else {
            System.out.println("NÃO MÚLTIPLOS");
        }
        scanner.close();
    }
}

package estrutura_condicional;

import java.util.Scanner;

public class horasPagas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutos = scanner.nextInt();
        double conta = 50.0;
        if(minutos > 100){
            conta = conta + (minutos - 100) * 2;
        }
        System.out.println("CONTA A PAGAR: " + conta);
        scanner.close();
    }
}

package estrutura_sequencial;

import java.util.Locale;

public class printf {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";

        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.printf("Produtos: %n%s cujo preço é: R$ %.2f %n%s cujo preço é: R$ %.2f%n", produto1, preco1, produto2, preco2);
        System.out.println();
        System.out.printf("Registro: %d anos de idade, Código %d e sexo %s%n", idade, codigo, sexo);
        System.out.println();
        System.out.printf("Medida com oito casas decimais: %f %nArredondado(Três casas decimais): %.3f%n", medida, medida);
        System.out.println();
        Locale.setDefault(Locale.US);
        System.out.printf("Divisão decimal dos EUA: %.3f%n", medida);
    }
}

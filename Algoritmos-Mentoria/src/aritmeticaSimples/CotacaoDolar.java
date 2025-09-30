package aritmeticaSimples;

import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar hoje: R$ ");

        double cotacaoDolar = sc.nextDouble();

        System.out.print("Digite quantos dólares você quer converter para reais: ");

        double quantDolares = sc.nextDouble();

        double conversorReais = quantDolares * cotacaoDolar;

        System.out.printf("O valor de %.2f dólares convertidos para reais é igual a R$ %.2f%n reais", quantDolares, conversorReais);

        sc.close();
    }

}

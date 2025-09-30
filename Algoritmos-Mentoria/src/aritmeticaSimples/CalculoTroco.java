package aritmeticaSimples;

import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro produto: R$ ");
        double produto01 = sc.nextDouble();

        System.out.print("Digite o valor do segundo produto: R$ ");
        double produto02 = sc.nextDouble();

        System.out.print("Digite o valor do terceiro produto: R$ ");
        double produto03 = sc.nextDouble();

        System.out.print("Digite o valor do quarto produto: R$ ");
        double produto04 = sc.nextDouble();

        System.out.print("Digite o valor do quinto produto: R$ ");
        double produto05 = sc.nextDouble();

        double totalProdutos = produto01 + produto02 + produto03 + produto04 + produto05;

        System.out.printf("O valor total dos produtos é R$ %.2f%n", totalProdutos);
        System.out.print("Digite com quanto você irá pagar: R$ ");
        double valorPago = sc.nextDouble();

        double troco = valorPago - totalProdutos;

        System.out.printf("Seu troco é: R$ %.2f%n", troco);

        sc.close();
    }

}

package estruturasRepeticao;

import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {

        int maiorValor = 0;
        int menorValor = 0;
        int somaValores = 0;
        double mediaValores = 0;
        int porcentagemPositivos = 0;
        int porcentagemNegativos = 0;
        int valorDigitado = 0;
        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Operações(operações(Maior valor, Menor valor, Soma dos valores, Média, porcentagem de valores positivos, porcentagem dos negatis)");
        System.out.println("Digite a quantidade de valores a ser digitada, mas, menor que vinte: ");
        int quantidadeNumeros = sc.nextInt();

        while (quantidadeNumeros >= 20) {
            System.out.println("Digite a quantidade de valores a ser digitada, mas, menor que vinte  : ");
            quantidadeNumeros = sc.nextInt();
        }

        for (int i = 0; i < quantidadeNumeros; i++) {

            System.out.println("digite o valor: ");
            valorDigitado = sc.nextInt();
            somaValores += valorDigitado;

            if (valorDigitado > maiorValor) {
                maiorValor = valorDigitado;
            }

            if (valorDigitado > 0) {
                quantidadePositivos++;
            }

            if (valorDigitado < 0) {
                quantidadeNegativos++;
            }

            if ( i == 0 || valorDigitado < menorValor) { //||
                menorValor = valorDigitado;
            }

        }

        mediaValores = (double) somaValores / quantidadeNumeros;
        porcentagemPositivos = (quantidadePositivos * 100) / quantidadeNumeros;
        porcentagemNegativos = (quantidadeNegativos * 100) / quantidadeNumeros;

        System.out.println("O maior valor é: "+ maiorValor);
        System.out.println("O menor valor é: " + menorValor);

        System.out.println("A soma dos valores é: " + somaValores);
        System.out.printf("A média aritmética dos valores é: %.2f\n", mediaValores);

        System.out.println("A porcentagem de valores que são positivos é: " + porcentagemPositivos + "%");
        System.out.println("A porcentagem de valores que são positivos é: " + porcentagemNegativos + "%");

        sc.close();
    }
}
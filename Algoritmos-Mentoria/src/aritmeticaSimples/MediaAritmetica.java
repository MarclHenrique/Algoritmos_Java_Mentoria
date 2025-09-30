package aritmeticaSimples;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double media;
        double valor1, valor2, valor3, valor4;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        valor3 = sc.nextDouble();

        System.out.println("Digite o quarto valor: ");
        valor4 = sc.nextDouble();

        media = (valor1 + valor2 + valor3 + valor4) / 4;

        System.out.printf("A media dos valores é: %.1f%n", media);

        sc.close();
    }
}

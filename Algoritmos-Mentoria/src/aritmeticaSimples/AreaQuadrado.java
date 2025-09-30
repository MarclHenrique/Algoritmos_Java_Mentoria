package aritmeticaSimples;

import java.util.Locale;
import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double area;
        double lado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        lado = sc.nextDouble();

        area = lado * lado;

        System.out.println("A área do Quadrado é " + area);

        sc.close();

    }
}

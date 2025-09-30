package aritmeticaSimples;

import java.util.Scanner;

public class NotaNecessaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova (P1): ");
        double p1 = sc.nextDouble();

        double p2 = (15 - p1) / 2;

        System.out.printf("Para ser aprovado, o aluno precisa tirar %.2f na P2.%n", p2);

        sc.close();
    }
}


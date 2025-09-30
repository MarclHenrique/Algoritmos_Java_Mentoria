package estruturasRepeticao;

import java.util.Scanner;

public class TabuadaPositivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor positivo para tabuada: ");
        int numTabuada = sc.nextInt();

        while (numTabuada < 0) {
            System.out.println("Digite um valor positivo para tabuada: ");
            numTabuada = sc.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(numTabuada + " * " + i + " = " + numTabuada * i);

        }
    }
}
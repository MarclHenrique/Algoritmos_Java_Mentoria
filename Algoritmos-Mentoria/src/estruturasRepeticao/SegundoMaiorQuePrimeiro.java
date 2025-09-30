package estruturasRepeticao;

import java.util.Scanner;

public class SegundoMaiorQuePrimeiro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroUm = sc.nextInt();

        System.out.println("Digite um número maior que o primeiro inserido");
        int numeroDois = sc.nextInt();

        while (numeroDois <= numeroUm) {

            System.out.println("Digite um número maior que o primeiro inserido");
            numeroDois = sc.nextInt();
        }

    }
}

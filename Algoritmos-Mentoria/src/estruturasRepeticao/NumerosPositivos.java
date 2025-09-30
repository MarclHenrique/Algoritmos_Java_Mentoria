package estruturasRepeticao;

import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero positivo: ");
        int numero = sc.nextInt();

        while (numero <= 0){
            System.out.println("Digite um numero positivo");
            numero = sc.nextInt();
        }
    }
}

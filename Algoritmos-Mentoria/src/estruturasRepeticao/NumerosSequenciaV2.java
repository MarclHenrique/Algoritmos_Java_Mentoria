package estruturasRepeticao;

import java.util.Scanner;

public class NumerosSequenciaV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor positivo e menor que cem: ");
        int valor = sc.nextInt();

        if (valor < 0 || valor >= 100) {
            System.out.println("Erro");
            System.out.println("Digite um valor positivo e menor que cem: ");
            valor = sc.nextInt();
        }

        for(int i = 1; i <= valor; i++){



        }
    }
}

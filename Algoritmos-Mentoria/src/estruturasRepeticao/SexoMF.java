package estruturasRepeticao;

import java.util.Scanner;

public class SexoMF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu sexo(M/F): ");
        char sexo = sc.next().charAt(0);

        while ( sexo == 'm' || sexo == 'f' ){
            System.out.println("Digite seu sexo(M/F): ");
            sexo = sc.next().charAt(0);
        }
    }
}

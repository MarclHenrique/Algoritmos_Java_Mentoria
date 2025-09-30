package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class ProdutoVetor {

    public static void main(String[] args) {

        int [] array = new int[20];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero pra multiplicar: ");
        int num = sc.nextInt();

        for(int i = 0; i < array.length; i++){
            System.out.println("Digite um valor para armazenar no array na posição " + i + ":");
            array[i] = sc.nextInt();
            array[i] = array[i] * num;
        }

        System.out.println(Arrays.toString(array));

    }
}

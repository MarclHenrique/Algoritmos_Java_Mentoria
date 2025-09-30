package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class ProdutoVetorV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int [] arrayOrigem = new int[20];
        int [] arrayResultado = new int[20];

        for (int i = 0; i < arrayOrigem.length; i++) {
            System.out.println("Digite o valor na posição " + i + ":");
            arrayOrigem[i] = sc.nextInt();
            arrayResultado[i] = arrayOrigem[i];
        }

        System.out.println("Digite a constante multiplicativa para o array: ");
        int constanteMultiplicativa = sc.nextInt();

       for (int i = 0; i < arrayResultado.length; i++) {
           arrayResultado[i] *= constanteMultiplicativa;
       }

        System.out.println("Array Origem: " + Arrays.toString(arrayOrigem));
        System.out.println("Array Resultado: " + Arrays.toString(arrayResultado));

    }
}

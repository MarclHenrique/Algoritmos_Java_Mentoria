package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {

        int varTemporaria = 0;
        Scanner sc = new Scanner(System.in);

        int[] arrayValores = new int[20];

        for (int i = 0; i < arrayValores.length; i++) {
            System.out.println("Digite um valor: ");
            arrayValores[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayValores.length; i++) {

            for (int j = 0; j < arrayValores.length - 1; j++) {

                if (arrayValores[j] > arrayValores[j + 1]) {

                    varTemporaria = arrayValores[j];
                    arrayValores[j] = arrayValores[j + 1];
                    arrayValores[j + 1] = varTemporaria;
                }
            }
        }

        System.out.print(Arrays.toString(arrayValores));

    }
}

package vetor;

import java.util.Scanner;

public class ListandoMulheres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arrayNome = new String[20];
        int[] arrayIdade = new int[20];
        char[] arraySexo = new char[20];

        for (int i = 0; i < arrayNome.length; i++) {
            System.out.println("Digite seu nome: ");
            arrayNome[i] = sc.nextLine();
        }

        for (int j = 0; j < arrayIdade.length; j++) {
            System.out.println("Digite sua idade: ");
            arrayIdade[j] = sc.nextInt();

            if (arrayIdade[j] <= 0) {
                System.out.println("Digite sua idade: ");
                arrayIdade[j] = sc.nextInt();
            }
        }

        for (int k = 0; k < arraySexo.length; k++) {
            System.out.println("Digite seu sexo(F/M): ");
            arraySexo[k] = sc.next().charAt(0);

            if (arraySexo[k] != 'M' && arraySexo[k] != 'F') {
                System.out.println("Digite seu sexo(F/M): ");
                arraySexo[k] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < arraySexo.length; i++) {
            if (arraySexo[i] == 'F') {

                System.out.println("Nome: " + arrayNome[i]);
                System.out.println("Idade: " + arrayIdade[i]);
                System.out.println("Sexo: " + arraySexo[i]);
            }
        }
    }
}


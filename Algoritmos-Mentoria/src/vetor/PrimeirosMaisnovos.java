package vetor;

import java.util.Scanner;

public class PrimeirosMaisnovos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arrayNome = new String[3];
        int[] arrayIdade = new int[3];
        char[] arraySexo = new char[3];

        int tempIdade;
        String tempNome;
        char tempSexo;


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

        for (int m = 0; m < arrayIdade.length; m++) {

            for (int n = 0; n < arrayIdade.length - 1; n++) {

                if (arrayIdade[n] > arrayIdade[n + 1]) {

                    tempIdade = arrayIdade[n];
                    arrayIdade[n] = arrayIdade[n + 1];
                    arrayIdade[n + 1] = tempIdade;

                    tempNome = arrayNome[n];
                    arrayNome[n] = arrayNome[n + 1];
                    arrayNome[n + 1] = tempNome;

                    tempSexo = arraySexo[n];
                    arraySexo[n] = arraySexo[n + 1];
                    arraySexo[n + 1] = tempSexo;
                }
            }
        }

        for (int k = 0; k < arrayIdade.length; k++) {
            System.out.println("Nome: " + arrayNome[k]);
            System.out.println("Idade: " + arrayIdade[k]);
            System.out.println("Sexo: " + arraySexo[k]);
        }
    }
}

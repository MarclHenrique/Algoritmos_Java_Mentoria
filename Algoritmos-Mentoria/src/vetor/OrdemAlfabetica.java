package vetor;

import java.util.Scanner;

public class OrdemAlfabetica {

    public static void main(String[] args) {

        String varTemporaria = " ";

        Scanner sc = new Scanner(System.in);

        String[] arrayNomes = new String[5];

        for (int i = 0; i < arrayNomes.length; i++) {
            System.out.println("Digite o seu nome: ");
            arrayNomes[i] = sc.nextLine();
        }

        for (int i = 0; i < arrayNomes.length; i++) {

            for (int j = 0; j < arrayNomes.length - 1; j++) {

                if (arrayNomes[j].compareToIgnoreCase(arrayNomes[j + 1]) > 0) {

                    varTemporaria = arrayNomes[j];
                    arrayNomes[j] = arrayNomes[j + 1];
                    arrayNomes[j + 1] = varTemporaria;
                }
            }
        }

        System.out.println("Nomes em ordem Alfabetica: ");

        for (String var : arrayNomes) {
            System.out.println(var);
        }

    }
}

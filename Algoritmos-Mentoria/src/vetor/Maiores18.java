package vetor;

import java.util.Scanner;

public class Maiores18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arrayNome = new String[20];
        int[] arrayIdade = new int[20];
        char[] arraySexo = new char[20];

        int totalPessoas = arrayNome.length;
        int quantidadePessoasMaiores18 = 0;
        double porcentagemMaiores18 = 0;

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
            if (arrayIdade[m] >= 18) {

                quantidadePessoasMaiores18 ++;

                System.out.println("Nome: " + arrayNome[m]);
                System.out.println("Idade: " + arrayIdade[m]);
                System.out.println("Sexo: " + arraySexo[m]);

                System.out.println(" ");

            }

        }
        porcentagemMaiores18 = (quantidadePessoasMaiores18 * 100.0) / totalPessoas;

        System.out.println("Quantidade de pessoas listadas: " + quantidadePessoasMaiores18);
        System.out.println("A porcentagem de pessoas maiores de 18 anos é: " + porcentagemMaiores18);

    }
}

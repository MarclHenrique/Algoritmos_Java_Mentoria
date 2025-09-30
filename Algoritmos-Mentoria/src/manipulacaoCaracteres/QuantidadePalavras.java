package manipulacaoCaracteres;

import java.util.Scanner;

public class QuantidadePalavras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = " ";
        int quantidadePalavras = 0;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        for (int i = 0; i <= frase.length() - 1; i++) {

            if (i == 0 && frase.charAt(i) != ' ') {
                quantidadePalavras++;
            } else if (i > 0 && frase.charAt(i) != ' ' && frase.charAt(i - 1) == ' ') {
                quantidadePalavras++;
            }
        }

        System.out.println(frase);

        System.out.println("Quantidade de palavras: " + quantidadePalavras);
    }
}

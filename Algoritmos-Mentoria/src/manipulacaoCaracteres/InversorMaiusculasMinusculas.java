package manipulacaoCaracteres;

import java.util.Arrays;
import java.util.Scanner;

public class InversorMaiusculasMinusculas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = " ";
        int quantidadeMaiusculas = 0;
        int quantidadeMinusculas = 0;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        String[] palavras = frase.split(" ");
        String fraseTrocada = "";

        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];
            String palavraTrocada = "";

            for (int j = 0; j < palavra.length(); j++) {
                char c = palavra.charAt(j);

                if (Character.isUpperCase(c)) {
                    palavraTrocada += Character.toLowerCase(c);
                    quantidadeMaiusculas++;
                } else if (Character.isLowerCase(c)) {
                    palavraTrocada += Character.toUpperCase(c);
                    quantidadeMinusculas++;
                } else {
                    palavraTrocada += c;
                }
            }

            fraseTrocada += palavraTrocada + " ";
        }

        System.out.println("Frase Lida: " + frase);
        System.out.println("Quantidade de Maiusculas: " + quantidadeMaiusculas);
        System.out.println("Quantidade de minusculas: " + quantidadeMinusculas);
        System.out.println("Frase lida(Trocada): " + fraseTrocada);
    }
}

package manipulacaoCaracteres;

import java.util.Scanner;

public class FraseInvertida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = " ";

        String fraseInvertida = " ";
        int contador = 0;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        String[] palavras = frase.split(" ");

        /**
        *How to check if a char is upper/lowercase? Stackoverflow <b> javadoc </b>
        */

        for (String palavra : palavras) {
            if (palavra.length() > 0 && Character.toUpperCase(palavra.charAt(0)) == 'A') {
                contador++;
            }
        }
        System.out.println("Frase lida: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
        System.out.println("A quantidade de letras com que iniciam com A é: " + contador);
    }
}

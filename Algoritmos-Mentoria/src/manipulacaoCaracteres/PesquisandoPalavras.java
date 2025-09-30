package manipulacaoCaracteres;

import java.util.Scanner;

public class PesquisandoPalavras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite a palavra a ser pesquisada: ");
        String palavra = sc.nextLine();

        String fraseMin = frase.toLowerCase();
        String palavraMin = palavra.toLowerCase();

        String novaFrase = "";
        boolean encontrado = false;

        for (int i = 0; i <= fraseMin.length() - 1; i++) {
            if (i + palavraMin.length() <= fraseMin.length()) {

                /**
                 *JavaScript substring(): selecionando parte de uma string DevMedia <b> javadoc </b>
                 */
                String trecho = fraseMin.substring(i, i + palavraMin.length());

                if (trecho.equals(palavraMin)) {
                    novaFrase += palavraMin.toUpperCase();
                    encontrado = true;
                    i += palavraMin.length() - 1;
                }

                else {
                    novaFrase += fraseMin.charAt(i);
                }
            }

            else  {
                novaFrase += fraseMin.charAt(i);
            }
        }

        System.out.println("Frase original: " + frase);

        if (encontrado) {
            System.out.println("Frase transformada: " + novaFrase);
        } else {
            System.out.println("palavra não encontrada");
        }

    }
}

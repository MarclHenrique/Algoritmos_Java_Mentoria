package manipulacaoCaracteres;

import java.util.Scanner;

public class SubstituindoPalavra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite a palavra a ser pesquisada: ");
        String palavraPesquisada = sc.nextLine();

        System.out.println("Digite a palavra que você deseja botar no local da pesquisada: ");
        String palavraSubstituta = sc.nextLine();

        String fraseMin = frase.toLowerCase();
        String palavraMin = palavraPesquisada.toLowerCase();
        String palavraSubstitutaMaiuscula = palavraSubstituta.toUpperCase();

        String fraseDestacada = "";
        String fraseSubstituida = "";
        boolean encontrado = false;

        for (int i = 0; i <= fraseMin.length() - 1; i++) {
            if (i + palavraMin.length() <= fraseMin.length()) {

                String trecho = fraseMin.substring(i, i + palavraMin.length());

                if (trecho.equals(palavraMin)) {
                    fraseDestacada += palavraMin.toUpperCase();
                    fraseSubstituida += palavraSubstitutaMaiuscula;
                    encontrado = true;

                    i += palavraMin.length() - 1;
                } else {
                    fraseDestacada += fraseMin.charAt(i);
                    fraseSubstituida += fraseMin.charAt(i);
                }
            } else {
                fraseDestacada += fraseMin.charAt(i);
                fraseSubstituida += fraseMin.charAt(i);
            }
        }

        System.out.println("Frase original: " + frase);

        if (encontrado) {
            System.out.println("Frase Destacada: " + fraseDestacada);
            System.out.println("Frase Substituida: " + fraseSubstituida);
        } else {
            System.out.println("palavra não encontrada");
        }

    }
}

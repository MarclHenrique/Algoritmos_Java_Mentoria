package manipulacaoCaracteres;

import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fraseCriptografada = " ";

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite um número inteiro entre 1 e 10");
        int numero = sc.nextInt();

        if (numero > 10 || numero <= 0) {
            System.out.println("O número deve ser um inteiro entre 1 e 10");
            numero = sc.nextInt();
        }

        System.out.println("Frase Lida:" + frase);
        System.out.println("Chave da Criptografia: " + numero);

        for (int i = 0; i < frase.length() - 1; i++) {
            char c = frase.charAt(i);

            if (Character.isUpperCase(frase.charAt(i))) {

                int novaPosicao = (c - 'A' + numero) % 26;
                char novaLetra = (char) ('A' + novaPosicao);
                fraseCriptografada += novaLetra;

            } else if (Character.isLowerCase(frase.charAt(i))) {
                int novaPosicao = (c - 'a' + numero) % 26;
                char novaLetra = (char) ('a' + novaPosicao);
                fraseCriptografada += novaLetra;

            } else {
                fraseCriptografada += c;
            }
        }
        System.out.println("Frase Criptografada: " + fraseCriptografada);
    }
}

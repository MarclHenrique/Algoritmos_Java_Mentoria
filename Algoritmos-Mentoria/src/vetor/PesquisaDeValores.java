package vetor;

import java.util.Scanner;

public class PesquisaDeValores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = 0;
        boolean encontrado = false;

        System.out.println("Digite o valor que você quer para o vetor, levando em consideração que seja menor que 20: ");
        int tamanhoVetor = sc.nextInt();

        while (tamanhoVetor > 20) {
            System.out.println("Digite um valor menor que 20:");
            tamanhoVetor = sc.nextInt();
        }

        int[] array = new int[tamanhoVetor];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o valor " + i + ":");
            array[i] = sc.nextInt();
        }

        System.out.println("Digite o valor que você deseja procurar: ");
        valor = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                System.out.println("Valor encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado");
        }
    }
}

package estruturasSelecao;

import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        int maiorValor = valor1 > valor2 ? valor1 : valor2;

        System.out.println("O maior valor entre os números é: " + maiorValor);

        sc.close();
    }
}

package estruturasSelecao;

import java.util.Scanner;

public class MaiorValorV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        int maiorValor = 0;

        if (valor1 == valor2) {
            System.out.println("Ambos valores são iguais, logo não existe um maior");
        } else {
            System.out.println("O maior valor digitado foi: " + (valor1 > valor2 ? valor1 : valor2));
        }

        sc.close();
    }
}

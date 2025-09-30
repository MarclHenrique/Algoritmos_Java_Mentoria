package aritmeticaSimples;

import java.util.Locale;
import java.util.Scanner;

public class VolumeEsfera {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        double diametro;
        double raio;
        double volume;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do diâmetro: ");
        diametro = sc.nextDouble();

        raio = (diametro / 2);

        volume = (4d / 3d * 3.14159) * (raio * raio * raio);

        System.out.printf("O volume é: %.2f%n", volume);

        sc.close();
    }
}

package aritmeticaSimples;

import java.util.Scanner;

public class VelocidadeAutomovel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial do automóvel (m/s): ");
        int velocidadeInicial = sc.nextInt();

        System.out.println("Digite a aceleração do automóvel (m/s²): ");
        int aceleracao = sc.nextInt();

        System.out.println("Digite o tempo em segundos: ");
        int tempo = sc.nextInt();

        int velocidadeFinalSegundos = velocidadeInicial + (aceleracao * tempo);

        double conversaoVelocidadeKm = velocidadeFinalSegundos * 3.6;

        System.out.printf("A velocidade final do automóvel é: %.2f km/h%n", conversaoVelocidadeKm);

        sc.close();
    }
}



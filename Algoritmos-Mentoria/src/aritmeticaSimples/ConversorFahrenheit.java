package aritmeticaSimples;

import java.util.Scanner;

public class ConversorFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus celcius desejada para conversão em Fahrenheit: ");

        double temperaturaCelsius = sc.nextDouble();

        double conversorFahrenheit = (temperaturaCelsius * 9.0/5.0) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.2f°F%n", conversorFahrenheit);

        sc.close();

    }

}

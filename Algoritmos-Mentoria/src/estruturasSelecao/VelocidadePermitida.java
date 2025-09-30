package estruturasSelecao;

import java.util.Locale;
import java.util.Scanner;

public class VelocidadePermitida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.println("Digite a aceleração do seu veículo(m/s²): ");
        double aceleracao = sc.nextDouble();

        System.out.println("Digite a velocidade inicial(m/s): ");
        double velocidadeInicial = sc.nextDouble();

        System.out.println("Digite o tempo de percurso(t): ");
        double tempoPercurso = sc.nextDouble();

        double velocidadeFinal = velocidadeInicial + aceleracao * tempoPercurso;
        double velocidadeKmH = velocidadeFinal * 3.6;

        if (velocidadeKmH <= 40) {
            System.out.println("Veículo muito lento");
        }
        else if (velocidadeKmH > 40 && velocidadeKmH <= 60) {
            System.out.println("Velocidade permitida");
        }
        else if (velocidadeKmH > 60 && velocidadeKmH <= 80) {
            System.out.println("Velocidade de cruzeiro");
        }
        else if (velocidadeKmH > 80 && velocidadeKmH <= 120) {
            System.out.println("Veículo rápido");
        }
        else {
            System.out.println("Veículo muito rápido");
        }
    }
}

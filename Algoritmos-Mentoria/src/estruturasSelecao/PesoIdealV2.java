package estruturasSelecao;

import java.util.Locale;
import java.util.Scanner;

public class PesoIdealV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite seu sexo(M ou F): ");
        char sexo = Character.toUpperCase(sc.next().charAt(0));

        System.out.println("Digite seu peso(kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura(m): ");
        double altura = sc.nextDouble();

        double R = peso/(altura*altura);

        if(R < 19 && sexo == 'F' || R < 20 && sexo == 'M') {
            System.out.println("Abaixo do Peso");
        }
        else if(R >= 19 && R < 24 && sexo == 'F' ||  R >= 20 && R < 25 && sexo == 'M') {
            System.out.println("Peso Ideal");
        }
        else if(R >= 24 && sexo == 'F' ||  R >= 25 && sexo == 'M' ) {
            System.out.println("Acima do Peso");
        }

        sc.close();
    }
}

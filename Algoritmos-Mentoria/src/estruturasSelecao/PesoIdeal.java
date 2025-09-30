package estruturasSelecao;

import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite seu peso(kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura(m): ");
        double altura = sc.nextDouble();

        double R = peso/(altura*altura);

        if(R < 20){
            System.out.println("Abaixo do Peso");
        }
        else if(R >= 20 && R < 25){
            System.out.println("Peso Ideal");
        }
        else if(R >= 25){
            System.out.println("Acima do Peso");
        }

        sc.close();
    }
}

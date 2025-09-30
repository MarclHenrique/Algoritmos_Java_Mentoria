package estruturasRepeticao;

import java.util.Scanner;

class TabuadaPositivosV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input tabuada que iremos fazer
        System.out.println("Digite um número positivo para fazer a tabuada: ");
        int numTabuada = sc.nextInt();

        //validação para ser numero positivo
        while(numTabuada <= 0){
            System.out.println("Digite um valor positivo para tabuada: ");
            numTabuada = sc.nextInt();
        }

        //Input primeiro valor do range
        System.out.println("Digite um valor para o intervalo da tabuada do número " + numTabuada + " :");
        int numA = sc.nextInt();

        //Validação
        while(numA <= 0) {
            System.out.println("Digite um valor positivo para tabuada: ");
            numA = sc.nextInt();
        }

        //Input segundo valor do range
        System.out.println("Digite um segundo valor para o intervalo da tabuada do numero " + numTabuada  + ":que seja maior que o " + numA);
        int numB = sc.nextInt();

        //Validação
        while(numB <= numA || numB <= 0 ) {
            System.out.println("Digite um segundo valor para o intervalo da tabuada do número" + numTabuada  + "que seja maior que o " + numA);
            numB = sc.nextInt();
        }

        for(int i = numB; i >= numA; i--){
            System.out.println(numTabuada + " * " + i + " = " + numTabuada * i);
        }
    }
}

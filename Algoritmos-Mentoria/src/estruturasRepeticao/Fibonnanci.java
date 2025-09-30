package estruturasRepeticao;

public class Fibonnanci {
    public static void main(String[] args) {

        int valorAtual = 1;
        int valorAnterior = 0;
        int proximo = 0;

        for (int i = 1; i <= 29; i++) {

            proximo = valorAnterior + valorAtual; // 1 2 3 5 8
            valorAnterior = valorAtual;  // 1 1 2 3
            valorAtual = proximo; // 1 2 3 5

            if (i == 1) {
                System.out.println(i);
            }

            System.out.println(proximo);
        }
    }
}

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;

        int acimaDaMedia = 0;
        for (double n : notas) {
            if (n > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("\nMédia das notas: " + media);
        System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);

        sc.close();
    }
}

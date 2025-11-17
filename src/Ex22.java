import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temps = new double[7];
        double soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite a temperatura do dia %d: ", i + 1);
            temps[i] = sc.nextDouble();
            soma += temps[i];
        }

        double media = soma / 7;

        double maior = temps[0];
        double menor = temps[0];

        int abaixoDaMedia = 0;
        int acimaDaMedia = 0;

        for (double t : temps) {
            if (t > maior) maior = t;
            if (t < menor) menor = t;

            if (t < media) abaixoDaMedia++;
            if (t > media) acimaDaMedia++;
        }

        double percentualAcima = (acimaDaMedia * 100.0) / 7;

        System.out.println();
        System.out.printf("Média de temperatura da semana: %.2f\n", media);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Quantidade de temperaturas abaixo da média: " + abaixoDaMedia);
        System.out.printf("Percentual acima da média: %.2f%%\n", percentualAcima);

        sc.close();
    }
}

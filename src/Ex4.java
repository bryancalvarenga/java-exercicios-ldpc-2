import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = sc.nextDouble();

            if (num >= 350 && num <= 500) {
                soma += num;
                contador++;
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("\nA média dos números entre 350 e 500 é: " + media);
        } else {
            System.out.println("\nNenhum número está no intervalo entre 350 e 500.");
        }

        sc.close();
    }
}

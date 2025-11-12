import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;

        while (true) {
            System.out.print("Digite um número (0 para encerrar): ");
            numero = sc.nextInt();

            if (numero == 0) break;

            if (numero % 2 == 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("\nA média dos números pares é: %.2f%n", media);
        } else {
            System.out.println("\nNenhum número par foi digitado.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número fora do intervalo! Programa encerrado.");
        } else {
            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " X " + i + " = " + (numero * i));
            }
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("Média: " + media);

        sc.close();
    }
}

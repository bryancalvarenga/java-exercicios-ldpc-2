import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int totalMultiplosDe10 = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 10 == 0) {
                totalMultiplosDe10++;
            }
        }

        System.out.println("Quantidade de números múltiplos de 10: " + totalMultiplosDe10);

        sc.close();
    }
}

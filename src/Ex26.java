import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + totalPares);
        System.out.println("Quantidade de números ímpares: " + totalImpares);

        sc.close();
    }
}

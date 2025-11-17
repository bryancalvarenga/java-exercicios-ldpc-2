import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] produto = new int[10];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("v1[" + (i + 1) + "]: ");
            v1[i] = sc.nextInt();
        }

        System.out.println("\nDigite os 10 elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("v2[" + (i + 1) + "]: ");
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            produto[i] = v1[i] * v2[i];
        }

        System.out.println("\nVetor produto:");
        for (int i = 0; i < 10; i++) {
            System.out.println("produto[" + (i + 1) + "] = " + produto[i]);
        }

        sc.close();
    }
}
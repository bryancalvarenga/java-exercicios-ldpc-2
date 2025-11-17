import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();

            if (valores[i] < 0) {
                valores[i] = 0;
            }
        }

        System.out.println("\nVetor modificado:");
        for (int v : valores) {
            System.out.print(v + " ");
        }

        System.out.println();
        sc.close();
    }
}
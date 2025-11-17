import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nDigite o número que deseja buscar: ");
        int busca = sc.nextInt();

        int contagem = 0;

        for (int n : numeros) {
            if (n == busca) {
                contagem++;
            }
        }

        System.out.println("\nO número " + busca + " aparece " + contagem + " vez(es) no vetor.");

        sc.close();
    }
}

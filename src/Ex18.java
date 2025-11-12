import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int fatorial = 1;

        System.out.print("\nFatorial: ");
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }

        System.out.println(" = " + fatorial);

        sc.close();
    }
}

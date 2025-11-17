import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os pontos da primeira rodada: ");
        int p1 = sc.nextInt();

        System.out.print("Digite os pontos da segunda rodada: ");
        int p2 = sc.nextInt();

        int soma = p1 + p2;

        System.out.println("Pontos: ");

        for (int i = 0; i < soma; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}

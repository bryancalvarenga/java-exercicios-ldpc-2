import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiores = 0;
        int menores = 0;
        int iguais = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num > 10) {
                maiores++;
            } else if (num < 10) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Maiores que 10: " + maiores);
        System.out.println("Menores que 10: " + menores);
        System.out.println("Iguais a 10: " + iguais);

        sc.close();
    }
}

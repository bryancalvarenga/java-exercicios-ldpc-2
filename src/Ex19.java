import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;

        while (true) {
            System.out.print("Digite um número (0 para encerrar): ");
            int num = sc.nextInt();

            if (num == 0) break;

            if (num >= 0 && num <= 25) {
                intervalo1++;
            } else if (num >= 26 && num <= 50) {
                intervalo2++;
            } else if (num >= 51 && num <= 75) {
                intervalo3++;
            } else if (num >= 76 && num <= 100) {
                intervalo4++;
            } else {
                System.out.println("Número fora dos intervalos considerados!");
            }
        }

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("[0,25]  → " + intervalo1 + " número(s)");
        System.out.println("[26,50] → " + intervalo2 + " número(s)");
        System.out.println("[51,75] → " + intervalo3 + " número(s)");
        System.out.println("[76,100] → " + intervalo4 + " número(s)");

        sc.close();
    }
}

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int somaPares = 0;
        int somaTotal = 0;
        int totalNumeros = 0;

        while (true) {
            System.out.print("Digite um número positivo (0 para encerrar): ");
            int num = sc.nextInt();

            if (num == 0) break;

            if (num > 0) {
                totalNumeros++;
                somaTotal += num;

                if (num % 2 == 0) {
                    pares++;
                    somaPares += num;
                } else {
                    impares++;
                }
            } else {
                System.out.println("Número negativo ignorado!");
            }
        }

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        if (pares > 0) {
            double mediaPares = (double) somaPares / pares;
            System.out.printf("Média dos números pares: %.2f%n", mediaPares);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        if (totalNumeros > 0) {
            double mediaGeral = (double) somaTotal / totalNumeros;
            System.out.printf("Média geral dos números: %.2f%n", mediaGeral);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        sc.close();
    }
}

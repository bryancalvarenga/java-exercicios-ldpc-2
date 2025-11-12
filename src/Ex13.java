import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaSalarios = 0;
        double maiorSalario = 0;
        int somaDependentes = 0;
        int funcionarios = 0;
        int ateCem = 0;

        while (true) {
            System.out.print("Digite o salário do funcionário (valor negativo para encerrar): R$ ");
            double salario = sc.nextDouble();

            if (salario < 0) break;

            System.out.print("Digite o número de dependentes: ");
            int dependentes = sc.nextInt();

            funcionarios++;
            somaSalarios += salario;
            somaDependentes += dependentes;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 100) {
                ateCem++;
            }

            System.out.println();
        }

        if (funcionarios > 0) {
            double mediaSalarios = somaSalarios / funcionarios;
            double mediaDependentes = (double) somaDependentes / funcionarios;
            double percentualAteCem = ((double) ateCem / funcionarios) * 100;

            System.out.println("\n===== RESULTADOS =====");
            System.out.printf("a) Média salarial: R$ %.2f%n", mediaSalarios);
            System.out.printf("b) Média de dependentes: %.2f%n", mediaDependentes);
            System.out.printf("c) Maior salário: R$ %.2f%n", maiorSalario);
            System.out.printf("d) Percentual com salário até R$100,00: %.1f%%%n", percentualAteCem);
        } else {
            System.out.println("\nNenhum dado foi informado.");
        }

        sc.close();
    }
}

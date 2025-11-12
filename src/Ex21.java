import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 0;
        int mulheres = 0;
        int homensOlhosCastanhos = 0;
        int cabelosLoiros = 0;
        int acima60 = 0;
        int cabelosCastanhos = 0;
        int somaIdades = 0;

        System.out.println("""
                ===============================
                PESQUISA - PERFIL DOS ASSOCIADOS
                ===============================
                Para encerrar a pesquisa, digite uma idade negativa.
                """);

        while (true) {
            System.out.print("\nIdade: ");
            int idade = sc.nextInt();
            if (idade < 0) break;

            System.out.print("Gênero (M/F): ");
            char genero = sc.next().toUpperCase().charAt(0);

            System.out.print("Cor dos olhos (A - Azuis, V - Verdes, C - Castanhos): ");
            char olhos = sc.next().toUpperCase().charAt(0);

            System.out.print("Cor dos cabelos (L - Loiros, C - Castanhos, P - Pretos): ");
            char cabelos = sc.next().toUpperCase().charAt(0);

            totalPessoas++;
            somaIdades += idade;

            if (genero == 'F') mulheres++;
            if (genero == 'M' && olhos == 'C') homensOlhosCastanhos++;
            if (cabelos == 'L') cabelosLoiros++;
            if (idade > 60) acima60++;
            if (cabelos == 'C') cabelosCastanhos++;
        }

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Número total de participantes: " + totalPessoas);
        System.out.println("Número de mulheres: " + mulheres);
        System.out.println("Número de homens com olhos castanhos: " + homensOlhosCastanhos);
        System.out.println("Número de pessoas com cabelos loiros: " + cabelosLoiros);
        System.out.println("Número de pessoas com idade acima de 60 anos: " + acima60);

        if (totalPessoas > 0) {
            double mediaIdade = (double) somaIdades / totalPessoas;
            double porcentagemCastanhos = ((double) cabelosCastanhos / totalPessoas) * 100;

            System.out.printf("Média de idade dos participantes: %.2f anos%n", mediaIdade);
            System.out.printf("Porcentagem de pessoas com cabelos castanhos: %.1f%%%n", porcentagemCastanhos);
        } else {
            System.out.println("Nenhum participante registrado.");
        }

        sc.close();
    }
}

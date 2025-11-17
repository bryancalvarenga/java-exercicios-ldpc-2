import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jogarNovamente = "S";

        while (jogarNovamente.equalsIgnoreCase("S")) {

            int acertos = 0;
            int erros = 0;
            int pontos = 0;

            String[] perguntas = {
                    "O sol é uma estrela? (S/N): ",
                    "A água ferve a 100 graus? (S/N): ",
                    "Java é uma linguagem de programação? (S/N): ",
                    "2 + 2 = 4? (S/N): ",
                    "O Brasil fica na Europa? (S/N): "
            };

            String[] respostas = {"S", "S", "S", "S", "N"};

            for (int i = 0; i < 5; i++) {
                System.out.print(perguntas[i]);
                String r = sc.next().toUpperCase();

                int valorDaPergunta = (i + 1) * 50;

                if (r.equals(respostas[i])) {
                    acertos++;
                    pontos += valorDaPergunta;
                } else {
                    erros++;
                }
            }

            System.out.println("\n===== RESULTADO DA PARTIDA =====");
            System.out.println("Acertos: " + acertos);
            System.out.println("Erros: " + erros);
            System.out.println("Total de Pontos: " + pontos);

            System.out.print("\nDeseja jogar novamente? (S/N): ");
            jogarNovamente = sc.next().toUpperCase();

            System.out.println();
        }

        System.out.println("Jogo encerrado. Obrigado por jogar!");
        sc.close();
    }
}

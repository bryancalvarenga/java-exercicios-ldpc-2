import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int joseLigeiro = 0;
        int zezinhoMacaneta = 0;
        int fernandaHeimRolando = 0;
        int mariaRoubando = 0;
        int nulos = 0;
        int brancos = 0;

        int voto;

        System.out.println("""
                ===============================
                Eleição Presidencial
                ===============================
                1 - José Ligeiro
                2 - Zezinho Maçaneta
                3 - Fernanda Heim Rolando
                4 - Maria R. Oubando
                5 - Voto Nulo
                6 - Voto em Branco
                (Digite 0 para encerrar)
                ===============================
                """);

        while (true) {
            System.out.print("Informe seu voto: ");
            voto = sc.nextInt();

            if (voto == 0) break;

            switch (voto) {
                case 1 -> joseLigeiro++;
                case 2 -> zezinhoMacaneta++;
                case 3 -> fernandaHeimRolando++;
                case 4 -> mariaRoubando++;
                case 5 -> nulos++;
                case 6 -> brancos++;
                default -> System.out.println("Código inválido! Tente novamente.");
            }
        }

        System.out.println("\n===== RESULTADO FINAL =====");
        System.out.println("José Ligeiro: " + joseLigeiro + " voto(s)");
        System.out.println("Zezinho Maçaneta: " + zezinhoMacaneta + " voto(s)");
        System.out.println("Fernanda Heim Rolando: " + fernandaHeimRolando + " voto(s)");
        System.out.println("Maria R. Oubando: " + mariaRoubando + " voto(s)");
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);

        int totalVotos = joseLigeiro + zezinhoMacaneta + fernandaHeimRolando + mariaRoubando + nulos + brancos;
        System.out.println("Total de votos computados: " + totalVotos);

        sc.close();
    }
}

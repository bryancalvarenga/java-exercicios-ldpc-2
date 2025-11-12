import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12: ");
        int numero = sc.nextInt();

        String mes;

        switch (numero) {
            case 1 -> mes = "Janeiro";
            case 2 -> mes = "Fevereiro";
            case 3 -> mes = "Março";
            case 4 -> mes = "Abril";
            case 5 -> mes = "Maio";
            case 6 -> mes = "Junho";
            case 7 -> mes = "Julho";
            case 8 -> mes = "Agosto";
            case 9 -> mes = "Setembro";
            case 10 -> mes = "Outubro";
            case 11 -> mes = "Novembro";
            case 12 -> mes = "Dezembro";
            default -> mes = "Número inválido! Digite um valor entre 1 e 12.";
        }

        System.out.println("\n" + mes);

        sc.close();
    }
}

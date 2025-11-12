import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês (1 a 12): ");
        int mes = sc.nextInt();

        String nomeMes = "";
        boolean dataValida = true;

        switch (mes) {
            case 1 -> nomeMes = "Janeiro";
            case 2 -> {
                nomeMes = "Fevereiro";
                if (dia < 1 || dia > 29) dataValida = false;
            }
            case 3 -> nomeMes = "Março";
            case 4 -> {
                nomeMes = "Abril";
                if (dia < 1 || dia > 30) dataValida = false;
            }
            case 5 -> nomeMes = "Maio";
            case 6 -> {
                nomeMes = "Junho";
                if (dia < 1 || dia > 30) dataValida = false;
            }
            case 7 -> nomeMes = "Julho";
            case 8 -> nomeMes = "Agosto";
            case 9 -> {
                nomeMes = "Setembro";
                if (dia < 1 || dia > 30) dataValida = false;
            }
            case 10 -> nomeMes = "Outubro";
            case 11 -> {
                nomeMes = "Novembro";
                if (dia < 1 || dia > 30) dataValida = false;
            }
            case 12 -> nomeMes = "Dezembro";
            default -> {
                nomeMes = "Mês inválido";
                dataValida = false;
            }
        }

        if (dataValida && dia >= 1 && dia <= 31) {
            System.out.println("\nData válida: " + dia + " de " + nomeMes);
        } else {
            System.out.println("\nData inválida!");
        }

        sc.close();
    }
}

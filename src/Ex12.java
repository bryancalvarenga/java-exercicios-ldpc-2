import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia do seu nascimento: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês do seu nascimento (1 a 12): ");
        int mes = sc.nextInt();

        String signo = "";

        switch (mes) {
            case 1 -> signo = (dia >= 20) ? "Aquário" : "Capricórnio";
            case 2 -> signo = (dia >= 19) ? "Peixes" : "Aquário";
            case 3 -> signo = (dia >= 21) ? "Áries" : "Peixes";
            case 4 -> signo = (dia >= 20) ? "Touro" : "Áries";
            case 5 -> signo = (dia >= 21) ? "Gêmeos" : "Touro";
            case 6 -> signo = (dia >= 21) ? "Câncer" : "Gêmeos";
            case 7 -> signo = (dia >= 23) ? "Leão" : "Câncer";
            case 8 -> signo = (dia >= 23) ? "Virgem" : "Leão";
            case 9 -> signo = (dia >= 23) ? "Libra" : "Virgem";
            case 10 -> signo = (dia >= 23) ? "Escorpião" : "Libra";
            case 11 -> signo = (dia >= 22) ? "Sagitário" : "Escorpião";
            case 12 -> signo = (dia >= 22) ? "Capricórnio" : "Sagitário";
            default -> signo = "Mês inválido!";
        }

        System.out.println("\nSeu signo é: " + signo);

        sc.close();
    }
}

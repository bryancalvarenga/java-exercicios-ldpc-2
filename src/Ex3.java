import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o número de vezes que deseja exibir o nome: ");
        int vezes = sc.nextInt();

        for (int i = 1; i <= vezes; i++) {
            System.out.println(nome);
        }

        sc.close();
    }
}

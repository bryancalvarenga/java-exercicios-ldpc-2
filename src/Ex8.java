import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o índice de ruído (em decibéis): ");
        int ruido = sc.nextInt();

        System.out.println();

        if (ruido < 30) {
            System.out.println("Nível abaixo do esperado. Sem riscos.");
        } else if (ruido <= 59) {
            System.out.println("Nível de ruído aceitável. Nenhuma zona precisa de redirecionamento.");
        } else if (ruido == 60) {
            System.out.println("Atenção: aeronaves da 1ª zona devem redirecionar suas rotas.");
        } else if (ruido == 70) {
            System.out.println("Atenção: aeronaves da 1ª e 2ª zonas devem redirecionar suas rotas.");
        } else if (ruido >= 80) {
            System.out.println("Emergência: todas as zonas devem redirecionar suas rotas!");
        } else {
            System.out.println("Nível intermediário não previsto nas regras específicas, atenção ao controle.");
        }

        sc.close();
    }
}

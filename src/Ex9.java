import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros.add(sc.nextInt());
        }

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("\nLista em ordem decrescente: " + numeros);

        sc.close();
    }
}

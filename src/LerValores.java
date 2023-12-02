import java.util.Scanner;

public class LerValores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Veja os números anteriores ---");

        int n;

        do {
            System.out.println("Digite um número diferente de zero:");
            n = in.nextInt();
        } while (n == 0);

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }

    }
}

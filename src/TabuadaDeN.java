import java.util.Scanner;

public class TabuadaDeN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Tabuada ---");

        int n;

        do{
        System.out.println("Digite um número entre 1 e 10:");
        n = in.nextInt();
        }while (n > 10);

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " * " + n + " = " + (i * n));
        }

    }
}

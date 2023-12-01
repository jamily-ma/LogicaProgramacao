import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Soma de números ---");

        System.out.println("Digite o primeiro número:");
        int numeroA = in.nextInt();

        System.out.println("Digite o segundo número:");
        int numeroB = in.nextInt();

        int soma  = numeroA + numeroB;

        System.out.println("O resultado da soma é: " + soma);
    }
}
import java.util.Scanner;

public class NumeroImparOuPar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Descubra se o número é ímpar ou par ---");

        System.out.println("Digite um número:");
        int numero = in.nextInt();

        if (numero % 2 == 0){

            System.out.println("O número " + numero + " é par");

        } else {

            System.out.println("O número " + numero + " é ímpar");
        }
    }
}

import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Ordem crescente---");

        System.out.println("Digite um número:");
        int numeroA = in.nextInt();

        System.out.println("Digite um número:");
        int numeroB = in.nextInt();

        if (numeroA < numeroB){

            System.out.println("Ordem: " + numeroA +  ", " + numeroB);

        } else {

            System.out.println("Ordem: " + numeroB +  ", " + numeroA);

        }
    }
}

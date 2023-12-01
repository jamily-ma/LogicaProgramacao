import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Intervalo ---");

        System.out.println("Digite um número:");
        int numeroX = in.nextInt();

        System.out.println("Digite dois número para saber se o número " + numeroX + " está no intervalo:");
        int numeroA = in.nextInt();

        int numeroB;
        do {

            System.out.println("Digite o segundo número:");
            numeroB = in.nextInt();

        } while (numeroA > numeroB);

        if (numeroA < numeroX && numeroB > numeroX){

            System.out.println("O número: " + numeroX +  " está no intervalo entre: " + numeroA + " e " + numeroB);

        }else {

            System.out.println("O número: " + numeroX +  " não está no intervalo entre: " + numeroA + " e " + numeroB);
        }
    }
}

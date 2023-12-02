import java.util.Scanner;

public class Vet5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Informe os valores do primeiro vetor" );
            vet1[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Informe os valores do segundo vetor ");
            vet2[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++){
            vet3[i] = vet1[i] * vet2[i];
            System.out.println("A multiplicação é: " + vet3[i]);

        }
    }
}

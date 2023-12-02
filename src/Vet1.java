import java.util.Scanner;

public class Vet1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] vet3 = new int[10];

        for (int i = 0; i < 5; i++){
            System.out.println("Digite números para o primeiro vetor:");
            vet1[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Digite números para o segundo vetor:");
            vet2[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++){
            vet3[i] = vet1[i];

            vet3[i + 5] = vet2[i];
        }


        for (int i = 0 ; i < 10; i++){
            System.out.println(vet3[i]);

        }
    }
}

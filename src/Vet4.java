import java.util.Scanner;

public class Vet4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vet = new int[5];

        int maior = 0;
        int menor = 0;
        int igual = 0;

        for (int i =0; i < 5; i++){
            System.out.println("Preencha o vetor:");
            vet[i] = in.nextInt();

            if (vet[0] < vet[i]){

                maior += 1;

            } else if (vet[0] > vet[i]) {

                menor += 1;

            } else if (vet[0] == vet[i + 1]) {

                igual += 1;

            }
        }

        System.out.println("A quantidades de números maior que o primeiro: " + maior);
        System.out.println("A quantidades de números menor que o primeiro: " + menor);
        System.out.println("A quantidades de números igual ao primeiro: " + igual);
    }
}

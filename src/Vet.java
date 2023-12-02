import java.util.Scanner;

public class Vet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do Vetor:");
        int n = in.nextInt();

        int[] tam = new  int[n];

        for (int i = 0; i < n; i++){
            tam[i] = i * 2;
            System.out.println(tam[i]);
        }

    }
}

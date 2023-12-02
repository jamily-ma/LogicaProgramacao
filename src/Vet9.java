import java.util.Scanner;

public class Vet9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] f = new int[20];
        int[] g = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Preencha o primeiro vetor na posição: " + (i + 1));
            f[i] = in.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Preencha o segundo vetor na posição: " + (i + 1));
            g[i] = in.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("O produto das posições " + (i + 1) + " dos vetores: " + (f[i] * g[i]) );
        }
    }
}

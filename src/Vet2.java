import java.util.Scanner;

public class Vet2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vet = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe os valores:");
            vet[i] = in.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            if (vet[i] % 3 == 0){
                vet[i] *= 5;
            }
            System.out.println(vet[i]);
        }
    }
}

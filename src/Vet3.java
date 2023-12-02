import java.util.Scanner;

public class Vet3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] vet = new int[30];

        int acum = 0;
        double med;

        for (int i = 0; i < 30; i++){
            System.out.println("Insira os valores:");
            vet[i] = in.nextInt();

            acum += vet[i];
        }

        med = acum/30;

        System.out.println("A média é: " + med);

        for (int i = 0; i < 30; i++){
            if (vet[i] > med){
                System.out.println("Valores maior que a média: " + vet[i]);
            }
        }
    }
}

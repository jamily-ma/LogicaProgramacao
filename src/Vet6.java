import java.util.Scanner;

public class Vet6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vet = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Insira os valores:");
            vet[i] = in.nextInt();
        }

        System.out.println("Os valores inseridos foram: ");
        for (int i = 0; i < 5; i++){
            System.out.println(vet[i]);
        }

        System.out.println("Os valores inverso são: ");
        for (int i = 4; i >= 0; i--){
            System.out.println(vet[i]);
        }
    }
}

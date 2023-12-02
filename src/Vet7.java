import java.util.Scanner;

public class Vet7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vet = new int[10];
        int enc = 0;

        System.out.println("Insira os valores: ");
        for(int i = 0; i < 10; i++) {
            vet[i] = in.nextInt();
        }

        System.out.println("Insira um número para buscar no vetor");
        int num = in.nextInt();

        for (int i = 0; i < 10; i++){
            if (vet[i] == num){
                enc = 1;
                System.out.println("Número " + num + " na posição: " + i + 1);
            }
        }

        if (enc == 0){
            System.out.println("O número fornecido não existe no vetor!");
        }

    }
}

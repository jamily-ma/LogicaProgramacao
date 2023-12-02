import java.util.Scanner;

public class Vet8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vet = new int[12];
        int soma = 0;
        int y = 0;

        for(int i = 0; i < 12; i++) {
            System.out.println("Preencha o vetor na posição: " + (i + 1));
            vet[i] = in.nextInt();
        }

        System.out.println("Informe duas posições no vetor, onde o primeiro valor seja maior que o segundo: ");
        int x = in.nextInt();
        do {

            y = in.nextInt();

        }while (y > x);


        for (int i = x; x >= y; x--){

            soma += vet[x];
        }
        System.out.println(soma);

    }
}

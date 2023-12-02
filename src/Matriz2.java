import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matA = new int[5][5];
        int[][] matB = new int[5][5];
        int[][] matC = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Preencha a primeira matriz: linha " + (i + 1) + " Coluna " + (j + 1));
                matA[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Preencha a segunda matriz: linha " + (i + 1) + " Coluna " + (j + 1));
                matB[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0) {
                    matC[i][j] = (matA[i][j] - matB[i][j]);
                    System.out.println(matC[i][j]);
                } else {
                    matC[i][j] = (matA[i][j] * matB[i][j]);
                    System.out.println(matC[i][j]);
                }
            }
        }
    }
}

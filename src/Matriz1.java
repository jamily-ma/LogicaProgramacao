import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matA = new int[3][4];
        int[][] matB = new int[3][4];
        int[][] matC = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println("Preencha a primeira matriz: linha " + (i + 1) + " Coluna " + (j + 1));
                matA[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println("Preencha a segunda matriz: linha " + (i + 1) + " Coluna " + (j + 1));
                matB[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matC[i][j] = matB[i][j] + matA[i][j];
                System.out.println("A soma das matrizes: linha " + (i + 1) + " Coluna " + (j + 1) + ": " + matC[i][j]);
            }
        }
    }
}

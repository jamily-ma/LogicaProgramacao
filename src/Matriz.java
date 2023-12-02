import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] mat = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println("Preencha a matriz: linha " + (i + 1) + " Coluna " + (j + 1));
                mat[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if (i == j ) {
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}

import java.util.Scanner;

public class MaiorPreco {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("--- Maior preços ---");

        int i = 1;
        double preco;
        double maiorPreco = 0;
        double acumulador = 0;


        while (i <= 3) {

            System.out.println("Digite o valor dos produto:");
            preco = in.nextDouble();

            acumulador += preco;

            if (preco > maiorPreco){

                maiorPreco = preco;

            }

            i ++;
        }

        System.out.println("O maior preço foi: R$" + maiorPreco);
        System.out.println("A média dos preços: R$" + (acumulador/3));
        
    }
}

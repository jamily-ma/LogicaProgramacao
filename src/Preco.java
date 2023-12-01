import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Desconto ---");

        System.out.println("Digite a quantidade adquirida do produto:");
        int quantidade = in.nextInt();

        System.out.println("Digite o preço unitário do produto:");
        double preco = in.nextDouble();

        double total = quantidade * preco;
        double desconto, totalPagar;

        if (quantidade <= 5 ){

            desconto = total * 0.02;
            totalPagar = total - desconto;

            System.out.println("Total: R$" + total );
            System.out.println("Desconto: R$" + desconto );
            System.out.println("Total a pagar: R$" + totalPagar );

        } else if (quantidade > 5 && quantidade <= 10){

            total = quantidade * preco;
            desconto = total * 0.03;
            totalPagar = total - desconto;

            System.out.println("Total: R$" + total );
            System.out.println("Desconto: R$" + desconto );
            System.out.println("Total a pagar: R$" + totalPagar );

        }else {

            total = quantidade * preco;
            desconto = total * 0.05;
            totalPagar = total - desconto;

            System.out.println("Total: R$" + total );
            System.out.println("Desconto: R$" + desconto );
            System.out.println("Total a pagar: R$" + totalPagar );
        }
    }
}
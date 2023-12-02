import java.util.Scanner;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Divisão ---");

        double valorA, valorB, divisao;

        System.out.println("Digite o dividendo:");
        valorA = in.nextDouble();

        do {

            System.out.println("Digite o divisor:");
            valorB = in.nextDouble();

        } while(valorB == 0);

        divisao = valorA/valorB;

        System.out.println("O resultado da divisão:  " + divisao);
        }
    }


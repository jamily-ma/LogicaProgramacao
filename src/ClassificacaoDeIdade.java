import java.util.Scanner;

public class ClassificacaoDeIdade {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Classificação de idade ---");

        System.out.println("Digite sua idade:");
        int idade = in.nextInt();

        if (idade < 18 ){

            System.out.println("Menor de idade");

        } else if (idade >= 18 && idade <= 65){

            System.out.println("Maior de idade");

        }else {

            System.out.println("Pessoa idosa");
        }
    }
}

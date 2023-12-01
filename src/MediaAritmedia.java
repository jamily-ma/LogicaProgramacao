import java.util.Scanner;

public class MediaAritmedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int resp;

        do {
            System.out.println("--- Média dos alunos ---");

            System.out.println("Digite a primeira nota:");
            double nota1 = in.nextInt();

            System.out.println("Digite a segunda nota:");
            double nota2 = in.nextInt();

            System.out.println("Digite a terceira nota:");
            double nota3 = in.nextInt();

            System.out.println("Digite a quarta nota:");
            double nota4 = in.nextInt();

            double media = (nota1 + nota2 + nota3 + nota4)/4;

            if(media >= 7){

                System.out.println("Aluno APROVADO: " + media);

            } else if (media < 7 || media >= 4) {

                System.out.println("Aluno em RECUPERAÇÃO: " + media);

            }else {

                System.out.println("Aluno REPROVADO" + media);
            }

            System.out.println("Deseja continuar? Se sim responda (1), se não responda (0): ");
            resp = in.nextInt();

        }while (resp != 0);
    }
}

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Descubra o perímetro e a área do retângulo ---");

        System.out.println("Digite a base do retângulo:");
        double base = in.nextInt();

        System.out.println("Digite a altura do retângulo:");
        double altura = in.nextInt();

        double area = base * altura;
        double perimetro = (base + altura) * 2;

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}

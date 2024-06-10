
import java.util.Scanner;

public class EX14_Equacao {

    public static void Equa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a equação");
        System.out.print("\nDigite o valor de A: ");
        int a = sc.nextInt();
        boolean passe = true;
        int x = 0;
        int c = 0;
        int b = 0;
        double equacao = 0;

        if (a == 0) {
            System.out.print("Programa encerrado!");
            System.out.println("\nNão é equação de segundo grau");
        }
        passe = false;

        if (a != 0) {
            System.out.print("Digite o valor de B: ");
            b = sc.nextInt();
            System.out.print("Digite o valor de C: ");
            c = sc.nextInt();

            equacao = (a * (Math.pow(x, 2) + b * x) + c);
        }

        double delta = ((Math.pow(b, 2)) )- (4 * (a * c));
        if (delta == 0) {
            System.out.print("\nA equação não possui raizes reais.");
        } else if (delta < 0) {
            System.out.print("\nA equação possui apenas uma raiz real.");
        } else if (delta > 0) {
            System.out.print("\nA equação possui duas raizes reais.");
        }
        System.out.print("\nA equação é: " + equacao);
    }

    public static void main(String[] args) {
        Equa();
    }
}
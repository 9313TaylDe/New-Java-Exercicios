
import java.util.Scanner;

public class EX14_Equacao {

    public static void Equa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a equação");
        System.out.print("\nDigite o valor de A: ");
        int A = sc.nextInt();
        boolean passe = true;
        int x = 0;
        double equacao = 0;

        if (A == 0) {
            System.out.print("Programa encerrado!");
            System.out.println("\nNão é equação de segundo grau");
        }
        passe = false;

        if (A != 0) {
            System.out.print("Digite o valor de B: ");
            int B = sc.nextInt();
            System.out.print("Digite o valor de C: ");
            int C = sc.nextInt();

            equacao = (A * (Math.pow(x, 2) + B * x) + C);
        }
        System.out.print("\nA equação é: " + equacao);
    }

    public static void main(String[] args) {
        Equa();
    }
}
package exercicios2;

import java.util.Scanner;

public class EX01_PecaEnquanto {
    public static void Peca() {
        Scanner sc = new Scanner(System.in);

        boolean passe = false;
        while (!passe) {
            System.out.print("\nDigite um número: ");
            int num = sc.nextInt();

            if (num > 0 && num <= 10) {
                System.out.printf("\nNúmero válido: %d", num);
                break;
            } else {
                System.out.printf("\nNúmero inválido: %d", num);
            }
        }
        System.out.println("\nPROGRAMA ENCERRADO");
    }

    public static void main(String[] args) {
        Peca();
    }
}

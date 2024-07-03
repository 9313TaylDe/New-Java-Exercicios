package exercicios2;

import java.util.Scanner;

public class EX01_Numeros_Ate_Eu_Quiser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean passe = false;

        while (!passe) {
            System.out.print("\nDigite um número: ");
            int num = sc.nextInt();
            if (num > 0 && num <= 10) {
                System.out.printf("Número válido: %d", num);
                break;
            } else if (num > 10 || num < 0) {
                System.out.printf("\nNúmero inválido: %d", num);
            }
        }
    }
}

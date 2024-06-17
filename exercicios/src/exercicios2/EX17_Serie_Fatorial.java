package exercicios2;

import java.util.Scanner;

public class EX17_Serie_Fatorial {
    public static void Fatorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inicial: ");
        int inicio = sc.nextInt();
        int i = 0;

        System.out.print("Digite um número de fim: ");
        int fim = sc.nextInt();

        for (i = inicio; i < fim + 1; i++) {
            System.out.printf("\nFatorial: %d", inicio *= i);
        }
    }

    public static void main(String[] args) {
        Fatorial();
    }

}

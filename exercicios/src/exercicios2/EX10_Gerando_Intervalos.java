package exercicios2;

import java.util.Scanner;

public class EX10_Gerando_Intervalos {
    public static void Gerando() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de ínicio: ");
        int inicio = sc.nextInt();
        System.out.print("Digite um número de fim: ");
        int fim = sc.nextInt();
        int i = 0;
        int soma = 0;

        for (i = inicio + 1; i < fim; i++) {
            System.out.printf("\nIntervalo: %d", i);
        }
    }

    public static void main(String[] args) {
        Gerando();
    }
}

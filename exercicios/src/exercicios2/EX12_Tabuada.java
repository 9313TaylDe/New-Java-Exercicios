package exercicios2;

import java.util.Scanner;

public class EX12_Tabuada {
    public static void Tabuada() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Digite a operção\n1 - Multiplicação\n2 - Divisão\n3 - Soma\n4 - Subtração: ");
        int operacao = sc.nextInt();
        int multiplicacao = 0;
        int soma = 0;
        int divisao = 0;
        int subtração = 0;
        int i = 0;
        System.err.println("\n----------------------------------------------------\n");
        System.out.printf("  ----TABUADA DO NÚMERO %d----", numero);
        if (operacao == 1) {
            for (i = 1; i < 11; i++) {
                multiplicacao = numero * i;
                System.out.printf("\n%d * %d = %d", numero, i, multiplicacao);
            }
        } else if (operacao == 2) {
            for (i = 1; i < 11; i++) {
                divisao = numero / i;
                System.out.printf("\n%d / %d = %d", numero, i, divisao);
            }
        } else if (operacao == 3) {
            for (i = 1; i < 11; i++) {
                soma = numero + i;
                System.out.printf("\n%d + %d = %d", numero, i, soma);
            }
        } else if (operacao == 4) {
            for (i = 1; i < 11; i++) {
                subtração = numero - i;
                System.out.printf("\n%d - %d  = %d", numero, i, subtração);
            }
        }
    }

    public static void main(String[] args) {
        Tabuada();
    }

}

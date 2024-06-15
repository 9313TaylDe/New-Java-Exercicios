package exercicios2;

import java.util.Scanner;

public class EX11_Gerando_Soma_Intervalo {
    public static void Intervalo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um inicio: ");
        int inicio = sc.nextInt();
        System.out.print("Digite um final: ");
        int fim = sc.nextInt();
        int i = 0;
        int soma = 0;

        for (i = inicio + 1; i < fim; i++) {
            soma += i;
        }
        System.out.printf("\nA soma do intervalo entre %d %d %d = %d", inicio, fim, soma);
    }

    public static void main(String[] args) {
        Intervalo();
    }
}

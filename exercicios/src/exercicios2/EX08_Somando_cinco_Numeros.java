package exercicios2;

import java.util.Scanner;

public class EX08_Somando_cinco_Numeros {
    public static void CincoNumeros() {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int i = 0;
        int soma = 0;
        for (i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            soma = soma += num[i];
        }
        System.out.printf("\nA soma da %d ",soma);
    }

    public static void main(String[] args) {
        CincoNumeros();
    }

}

package exercicios2;

import java.util.Scanner;

public class EX28_Colecao_CDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor_total = 0;
        double valor_medio = 0;

        double[] qtd_cds = new double[5];
        for (int i = 0; i < qtd_cds.length; i++) {
            System.out.print("Valor do " + (i + 1) + " cd: ");
            qtd_cds[i] = sc.nextDouble();
            valor_total += qtd_cds[i];
            valor_medio = valor_total / qtd_cds.length;
        }
        System.out.print("   COLECIONADOR  ");
        System.out.printf("O valor total é %.2f", valor_total);
        System.out.printf("\nO valor média gasto por cada um é de %.2f", valor_medio);
    }
}

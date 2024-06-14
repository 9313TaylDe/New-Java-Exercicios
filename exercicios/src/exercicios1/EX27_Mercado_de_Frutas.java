package exercicios1;

import java.util.Scanner;

public class EX27_Mercado_de_Frutas {
    public static void Frutas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("------MERCADO DA NILDINHA-------");
        System.out.print("\nQuanto de kg de morango? ");
        double kg_de_morango = sc.nextDouble();
        System.out.print("Quanto de kg de maçã? ");
        double kg_de_maca = sc.nextDouble();
        double valor_maca = 1.80;
        double valor_morango = 2.50;
        double desconto;
        double valor_total = (valor_maca * kg_de_maca) + (valor_morango * kg_de_morango);
        double qtd_frutas = kg_de_maca + kg_de_morango;

        if (qtd_frutas >= 8 || valor_total > 25.00) {
            desconto = valor_total * 0.1;
            System.out.println();
            System.out.printf("Quantidade de kg de frutas: %.1fkg", (kg_de_maca + kg_de_morango));
            System.out.println("\n-------------------------------------------------------------------------");
            System.out.printf("Morango: R$%.2f\nMaçãs: R$%.2f", (valor_maca * kg_de_maca),
                    (valor_morango * kg_de_morango));
            System.out.printf("\nValor: R$%.2f  -- Valor do desconto: R$%.2f  -- Valor após o desconto: R$%.2f",
                    valor_total, desconto, (valor_total - desconto));
            System.out.println("\n-------------------------------------------------------------------------");
        } else if (qtd_frutas < 8 || valor_total < 25) {
            System.out.println();
            System.out.printf("Quantidade de kg de frutas: %.1fkg", (kg_de_maca + kg_de_morango));
            System.out.println("\n-------------------------------------------------------------------------");
            System.out.printf("Morango: R$%.2f\nMaçãs: R$%.2f", (valor_maca * kg_de_maca),
                    (valor_morango * kg_de_morango));
            System.out.printf("\nValor total: R$%.2f",
                    valor_total);
            System.out.println("\n-------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Frutas();
    }
}

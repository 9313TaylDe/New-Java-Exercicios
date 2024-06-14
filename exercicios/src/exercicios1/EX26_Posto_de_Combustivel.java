package exercicios1;

import java.util.Scanner;

public class EX26_Posto_de_Combustivel {
    public static void Posto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos litros de álcool você quer? ");
        double qtd_alcool = sc.nextDouble();

        System.out.print("Quanto de gasolina? ");
        double qtd_gasolina = sc.nextDouble();

        double valor_alcool = 1.90;
        double valor_gasolina = 2.50;
        double valor_total_gasolina = 0;
        double valor_total_alcool = 0;
        double desconto = 0;
        double desconto_Gasolina = 0;
        double desconto_alcool = 0;

        System.out.print("RECIBO DA SUA COMPRA");
        System.out.println("\n-----------------------------------------");
        if (qtd_alcool <= 20) {
            valor_total_alcool = qtd_alcool * valor_alcool;
            desconto = valor_total_alcool * 0.03;
            desconto_alcool = valor_total_alcool - desconto;
            System.out.printf("\nValor antes do desconto: R$%.2f", valor_total_alcool);
            System.out.printf("\nValor do álcool com o desconto: R$%.2f", desconto_alcool);

        } else if (qtd_alcool > 20) {
            valor_total_alcool = qtd_alcool * valor_alcool;
            desconto = valor_total_alcool * 0.05;
            desconto_alcool = valor_total_alcool - desconto;
            System.out.printf("\nValor antes do desconto: R$%.2f", valor_total_alcool);
            System.out.printf("\nValor do álcool com o desconto: R$%.2f", desconto_alcool);
        }

        if (qtd_gasolina <= 20) {
            valor_total_gasolina = qtd_gasolina * valor_gasolina;
            desconto = valor_total_gasolina * 0.04;
            desconto_Gasolina = valor_total_gasolina - desconto;
            System.out.printf("\nValor antes do desconto: R$%.2f", valor_total_gasolina);
            System.out.printf("\nValor da gasolina com desconto: R$%.2f", desconto_Gasolina);

        } else if (qtd_gasolina > 20) {
            valor_total_gasolina = qtd_gasolina * valor_gasolina;
            desconto = valor_total_gasolina * 0.06;
            desconto_Gasolina = valor_total_gasolina - desconto;
            System.out.printf("\nValor antes do desconto: R$%.2f", valor_total_gasolina);
            System.out.printf("\nValor da gasolina com desconto: R$%.2f", desconto_Gasolina);
        }
        System.out.println("\n-------------------------------------------------\n");
        System.out.printf("\nO valor total de tudo é R$%.2f", Math.abs(desconto_alcool) + (desconto_Gasolina));
    }

    public static void main(String[] args) {
        Posto();
    }

}

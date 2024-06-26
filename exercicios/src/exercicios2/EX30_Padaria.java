package exercicios2;

import java.util.Scanner;

public class EX30_Padaria {
    public static void main(String[] args) {
        double preco;
        double novo_preco = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Padaria - pão de ontem\n");
        System.out.print("Digite o valor: ");
        preco = sc.nextDouble();

        for(int i = 1;i < 51; i ++){
            System.out.printf("\n%d - %.2f", i ,(novo_preco += preco));
        }
    }

}

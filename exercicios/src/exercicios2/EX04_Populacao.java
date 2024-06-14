package exercicios2;

import java.util.Scanner;

public class EX04_Populacao {
    public static void Populacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número da população a: ");
        int cidade_a = sc.nextInt();
        double taxa_a = 0.03;
        System.out.print("Digite um número da população b: ");
        int cidade_b = sc.nextInt();
        double taxa_b = 0.015;
        double base = Math.log(1.5);
        double logA = Math.log(1 + taxa_a);
        double logB = Math.log(1 + taxa_b);
        double tempo = base / (logA - logB);

        System.out.printf("Anos necessário para que a cidade B, ultrapasse ou iguale a cidade A: %.1f", tempo);
    }

    public static void main(String[] args) {
        Populacao();
    }
}

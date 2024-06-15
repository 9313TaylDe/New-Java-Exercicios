package exercicios2;

import java.util.Scanner;

public class EX16_Fibonacci_Mario_500 {
    public static void Fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 0;

        for (i = 0; i < numero; i++) {
            System.out.printf("\nSequencia: %d", a);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\n--------------------------------");
        if (b < 500) {
            System.out.print("Sequência menor que 500");
        } else {
            System.out.print("Sequência maior que 500");
        }
    }

    public static void main(String[] args) {
        Fibonacci();
    }

}

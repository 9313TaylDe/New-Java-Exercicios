package exercicios2;

import java.util.Scanner;

public class EX15_Serie_Fibonacci {
    public static void Fibonacci() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 0;
        for (i = 0; i < num; i++) {
            System.out.printf("\nSequência: %d", a);
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Fibonacci();
    }

}

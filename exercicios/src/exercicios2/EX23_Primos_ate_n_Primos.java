package exercicios2;

import java.util.Scanner;

public class EX23_Primos_ate_n_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        boolean primo = true;
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo || !primo) {
            for (int i = 2; i < numero + 1; i++) {
                System.out.printf("\nO número é primo %d", i);
            }
        }
    }
}

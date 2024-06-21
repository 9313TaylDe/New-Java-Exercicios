package exercicios2;

import java.util.Scanner;

public class EX22_Primos_n_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
            System.out.print("PROGRAMA ENCERRADO!");
        } else {
            for (int i = 2; i < numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.printf("O número %d é primo", numero);
        } else {
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.printf("\nO número %d é divisivel por %d", numero, i);
                }
            }
        }
    }

}

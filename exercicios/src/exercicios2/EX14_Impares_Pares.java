package exercicios2;

import java.util.Scanner;

public class EX14_Impares_Pares {
    public static void ImparesPares() {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];
        int i = 0;
        int pares = 0;
        int impares = 0;
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Digite: ");
            numeros[i] = sc.nextInt();
        }
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else{
                impares++;
            }
        }
        System.out.println("\n----------------------------\n");
        System.out.println("Pares " + pares);
        System.out.println("Impares " + impares);
    }

    public static void main(String[] args) {
        ImparesPares();
    }
}

package exercicios2;

import java.util.Scanner;

public class EX07_Maior_de_Cinco {
    public static void Maior() {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[5];
        int i;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        for (i = 0; i < 5; i++) {
            System.out.print("Digite: ");
            numero[i] = sc.nextInt();
            // maior = numero[i];
            if (numero[i] > maior) {
                maior = numero[i];
            } else if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        System.out.printf("Maior %d", maior);
        System.out.printf("\nMenor %d", menor);
    }

    public static void main(String[] args) {
        Maior();
    }
}

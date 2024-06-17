package exercicios2;

import java.util.Scanner;

public class EX18_Maior_Menor_Soma {
    public static void MMES() {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[4];
        int i = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int inicio = numero[0];
        int soma = 0;
        int num = 0;
        for (i = inicio; i < 4; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero[i] = sc.nextInt();
            num = numero[i];

            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            soma += num;
        }
        System.out.println(menor);
        System.out.println(""+maior);
        System.out.println("\nSoma: %d", soma); 
    }

    public static void main(String[] args) {
        MMES();

    }

}

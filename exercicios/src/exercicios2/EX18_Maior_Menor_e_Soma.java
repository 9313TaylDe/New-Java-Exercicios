package exercicios2;

import java.util.Scanner;

public class EX18_Maior_Menor_e_Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int i = 0;
        int num = 0;
        int numeros[] = new int[5];
        int soma = 0;

        for(i = numeros[0]; i < numeros.length; i ++){
            System.out.printf("Digite o %dª número: ", i);
            numeros[i] = sc.nextInt();
            num = numeros[i];

            if(num > maior){
                maior = num;
            }if(num < menor){
                menor = num;
            }
            soma += num;
        }
        System.out.printf("Maior: %d", maior);
        System.out.printf("\nMenor: %d", menor);
        System.out.printf("\nSoma: %d", soma);
    }
}

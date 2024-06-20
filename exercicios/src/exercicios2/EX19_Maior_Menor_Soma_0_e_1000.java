package exercicios2;

import java.util.Scanner;

public class EX19_Maior_Menor_Soma_0_e_1000 {

public static void main(String[] args) {
    int numeros[] =  new int[5];
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int soma = 0;
    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;

    for(int i = 0; i < numeros.length; i ++){
        System.out.printf("Digite o %dº número: ", i);
        numeros[i] = sc.nextInt();
        num = numeros[i];

        if(num >= 0 && num <= 1000){
            if(num > maior){
                maior = num;
            }if (num < menor){
                menor = num;
            }
        }else if(num < 0 || num > 1000) {
            System.out.println("Digite um número maior que zero e menor que igal a 1000");break;
}
        soma+= num;
    }
    System.out.println("Maior: "+maior);
    System.out.println("\nMenor: "+menor);
    System.out.println("\nSoma: "+soma);
}
}

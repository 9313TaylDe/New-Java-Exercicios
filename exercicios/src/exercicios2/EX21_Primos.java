package exercicios2;

import java.util.Scanner;

public class EX21_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        boolean primo = true;

        if(numero <= 1){
            primo = false;
            System.out.print("PROGRAMA ENCERRADO!\n");
        }else {
            for(int i = 2; i < numero / 2; i ++){
                if(numero % i == 0){
                    primo = false;
                    break;
                }
            }
        }
        if(primo){
            System.out.printf("O número %d é primo", numero);
        }else {
            System.out.printf("O número %d não é primo", numero);
        }
    }

}

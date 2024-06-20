package exercicios2;

import java.util.Scanner;

public class EX21_Numero_Primo {
    public static void Primo(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inicial: ");
        int numi = sc.nextInt();
        System.out.print("Digite um número final: ");
        int numf = sc.nextInt();
        int primo = 0;
        for(int i = numi; i < numf; i ++){
            for(int j = 1; j <= i; j ++){
                if(i % j == 0){
                    primo++;
                }
            }if(primo == 2){
                System.out.printf("O número %d é primo", i);
            }
            primo = 0;
    
        }
    }
    public static void main(String[] args) {
        Primo();
    }
}

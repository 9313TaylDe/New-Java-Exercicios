package exercicios2;

import java.util.Scanner;

public class EX19_Fatorial_Enquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 0;
        int soma = 0;
        boolean passe = true;

        while (passe) {

            for (int i = fatorial; i < 16; i++) {

                System.out.print("Digite um número: ");
                fatorial = sc.nextInt();
            }
            if (fatorial > 0 && fatorial <= 16) {

            } else {
                System.out.println("Programa encerrado");
                break;
            }
        }
    }

}

package exercicios2;

import java.util.Scanner;

public class EX24_Media_Aritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double media = 0;
        boolean passe = false;
       String add = "sim";
        while (add != "nao") {
            System.out.print("Deseja adcionar? s ou n: ");
             add = sc.next();
                if(add.equalsIgnoreCase("sim")){
                    int i = 0;
                    for (i = 0; i < 5; i++) {
                        System.out.print("Digite um número: ");
                        notas[i] = sc.nextDouble();
                        double num = notas[i];
                        media += notas[i] /notas.length;
                    }
                }
                else if (add.equalsIgnoreCase("nao")) {
                            System.out.println("PROGRAMA ENCERRADO!");break;
                        }
                }
        System.out.printf("\nA média é %.1f ",media);
    }

}

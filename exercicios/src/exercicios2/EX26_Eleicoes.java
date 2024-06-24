package exercicios2;

import java.util.Scanner;

public class EX26_Eleicoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int votos[] = new int[20];
        int i = 0;
        String voto = "";
        int votados = 0;
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        boolean passe = true;
        while (passe) {
            System.out.print("Deseja votar? ");
            voto = sc.next();

            if (voto.equalsIgnoreCase("sim")) {
                for (i = 0; i < votos.length; i++) {
                    System.out.print("Digite 1 2 ou 3");
                    votos[i] = sc.nextInt();
                    votados = +votos[i];

                    if (votos[i] == 1) {
                        votos1++;
                    }

                    if (votos[i] == 2) {
                        votos2++;
                    }

                    if (votos[i] == 3) {
                        votos3++;
                    }
                    break;
                }
            } else if (voto.equalsIgnoreCase("nao")) {
                System.out.println("PROGRAMA ENCERRADO");

                System.out.printf("\nO total de votos foram %d", votados);
                break;
            }
        }

        System.out.printf("\nCandidato 1 obteve %d votos", votos1);
        System.out.printf("\nCandidato 2 obteve %d votos", votos2);
        System.out.printf("\nCandidato 3 obteve %d votos", votos3);
    }
}

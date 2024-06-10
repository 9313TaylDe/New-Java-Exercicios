import java.util.Scanner;

public class EX13_Media_o_Semestre {

    public static void Media() {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[4];
        double media = 0;
        int i = 0;
        for (i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", i);
            notas[i] = sc.nextDouble();
            media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        }

        if (media == 10) {
            System.out.print("Aprovado com distinção");
        } else if (media >= 7.0) {
            System.out.print("Aprovado");
        } else if (media < 70) {
            System.out.print("Reprovado");
        }
    }

    public static void main(String[] args) {
        Media();
    }

}

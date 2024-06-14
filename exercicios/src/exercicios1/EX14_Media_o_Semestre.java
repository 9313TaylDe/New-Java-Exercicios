package exercicios1;
import java.util.Scanner;

public class EX14_Media_o_Semestre {

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

        if (media >= 9 && media <= 10) {
            System.out.print("A");
            System.out.println("\nAprovado");
            } else if (media >= 7.5 && media < 9) {
                System.out.print("B");
                System.out.println("\nAprovado");
            } else if (media >= 6 && media < 7.5) {
                System.out.print("C");
                System.out.println("\nAprovado");
            } else if (media >= 4 && media < 7.5) {
                System.out.print("D");
                System.out.println("\nReprovado");
            } else if (media >= 0 && media < 4) {
                System.out.print("E");
                System.out.println("\nReprovado");
        }
    }

    public static void main(String[] args) {
        Media();
    }

}

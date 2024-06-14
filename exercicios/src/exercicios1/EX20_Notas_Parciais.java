package exercicios1;
import java.util.Scanner;

public class EX20_Notas_Parciais {
    public static void Notas() {
        Scanner sc = new Scanner(System.in);

        double notas[] = new double[3];
        double media = 0;
        int i = 0;

        for (i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %d nota: ", i);
            notas[i] = sc.nextInt();
            media = (notas[0] + notas[1] + notas[2])/3;
        }
        if(media == 10){
            System.out.printf("\nAprovado com distinção\nMédia de %.1f",media);
        }
        else if(media >= 7){
            System.out.printf("\nAprovado\nMédia de %.1f",media);
        }
        else if(media < 7){
            System.out.printf("Reprovado\nMédia de %.1f",media);
        }
    }
    public static void main(String[] args) {
        Notas();
    }
}

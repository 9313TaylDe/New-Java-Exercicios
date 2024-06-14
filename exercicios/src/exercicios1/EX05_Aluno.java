package exercicios1;
import java.util.Scanner;

public class EX05_Aluno {
    public static void Aluno() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media == 10.) {
            System.out.printf("Aprovado com distinção, pois a sua média foi %.1f", media);
        } else if (media >= 7) {
            System.out.print("Aprovado!");
        } else if (media < 7) {
            System.out.print("Reprovado!");
        }
    }

    public static void main(String[] args) {
        Aluno();
    }

}

package exercicios1;
import java.util.Scanner;

public class EX06_MaiorEntreTres {

    public static void Maior() {
        Scanner sc = new Scanner(System.in);
        int tentativas = 3;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < tentativas; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            int numeros = num;

            if (numeros > maior) {
                maior = numeros;
            }
        }
        System.out.printf("O  maior entre os três é %d", maior);
    }

    public static void main(String[] args) {
        Maior();
    }

}

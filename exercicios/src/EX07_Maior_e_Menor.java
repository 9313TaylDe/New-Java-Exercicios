import java.util.Scanner;

public class EX07_Maior_e_Menor {
    public static void MaioreMenor() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i < 4; i++) {
            System.out.printf("Digite o %dº número: ", num);
            num = sc.nextInt();
            int numero = num;

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.printf("Maior número: %d", maior);
        System.out.printf("\nMenor número: %d", menor);
    }

    public static void main(String[] args) {
        MaioreMenor();
    }
}

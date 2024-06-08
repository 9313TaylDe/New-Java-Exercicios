import java.util.Scanner;

public class EX01_MaiorNumero {

    public static void MaiorNumero() {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[2];

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
            int numero = num[i];

            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        System.out.printf("Maior número: %d", maior);
        System.out.printf("\nMenor número: %d", menor);

    }

    public static void main(String[] args) {
        MaiorNumero();
    }
}

import java.util.Scanner;

public class EX02_PositivoOuNegativo {

    public static void PositivoNegativo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.printf("O número %d é inteiro positivo!", num);
        } else if (num < 0) {
            System.out.printf("O número %d é inteiro negativo", num);
        } else if (num == 0) {
            System.out.printf("O número %d é neutro", num);
        }
    }

    public static void main(String[] args) {
        PositivoNegativo();
    }

}

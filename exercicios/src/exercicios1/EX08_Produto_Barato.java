package exercicios1;
import java.util.Scanner;

public class EX08_Produto_Barato {

    public static void Produto() {
        Scanner sc = new Scanner(System.in);
        double produto1 = 125.50;
        double produto2 = 5.54;
        double produto3 = 100;

        System.out.print("Digite quanto você têm na carteira: ");
        double qtd_dinheiro = sc.nextDouble();
        double compra = 0;

        if (produto1 <= produto2 && produto1 <= produto3) {
            compra = produto1;
            System.out.printf("Pela quantidade de %.2f, você pode comprar o primeiro produto", qtd_dinheiro);
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            compra = produto2;
            System.out.printf("Pela quantidade de %.2f, você pode comprar o segundo produto", qtd_dinheiro);
        } else if (produto3 <= produto1 && produto3 <= produto2) {
            compra = produto3;
            System.out.printf("Pela quantidade de %.2f, você pode comprar o terceiro produto", qtd_dinheiro);
        }
    }

    public static void main(String[] args) {
        Produto();
    }

}

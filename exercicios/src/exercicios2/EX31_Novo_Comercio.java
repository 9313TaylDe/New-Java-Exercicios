import java.util.Scanner;

public class EX31_Novo_Comercio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double novo_valor = 0;
        double total = 0;
        int opcao = 1;
        double[] valor = new double[30];
        double index = 0;
        int i = 0;
        double meuDinheiro = 100.00;
        while (opcao != 0) {
            System.out.print("Somar? ");
            opcao = sc.nextInt();
            if (opcao == 0) {
                System.out.printf("\nValor total: R$%.2f", total);
                System.out.printf("\nQuantidade de dinheiro: R$%.2f\nTroco: R$%.2f", meuDinheiro,
                        (meuDinheiro - total));
                System.out.println("\nPrograma encerrado");
                break;
            } else {
                for (i = 1; i < 6; i++) {
                    System.out.print("Digite o valor: ");
                    valor[i] = sc.nextDouble();

                    novo_valor += valor[i];
                    total = novo_valor;
                    index = valor[i];
                }
                for (i = 1; i < 6; i++) {

                    System.out.printf("\n%d - R$%.2f", i, valor[i]);
                }
               
                System.out.println("\nPROGRAMA ENCERRADO");
            }
        }
    }
}

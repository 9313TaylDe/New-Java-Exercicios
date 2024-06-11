import java.util.Scanner;

public class EX19_Caixa_Eletronico {

    public static void CaixaEletronico() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int saque = sc.nextInt();

        int cem_reais = (saque / 100) % 10;
        int um_real = (saque % 10);
        int dez_reais = (saque / 10) % 10;

        if (saque <= 0) {
            System.out.print("Valor inválido");
        } else if (saque >= 100 || saque <= 600) {
            if (saque >= 10 && saque < 100) {
                System.out.printf("Notas: %d x R$10,00\nNotas de %d x R$1,00", dez_reais, um_real);
            } else if (saque > 100 || saque <= 600) {
                System.out.printf("Notas: %d cédulas de R$100,00\nNotas %d cédulas de R$10,00\nNotas %d moedas R$1,00",
                        cem_reais, dez_reais, um_real);
            }
        }
    }

    public static void main(String[] args) {
        CaixaEletronico();
    }

}

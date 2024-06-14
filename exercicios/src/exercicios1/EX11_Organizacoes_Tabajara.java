package exercicios1;
import java.util.Scanner;

public class EX11_Organizacoes_Tabajara {

    public static void Reajuste_Salario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        if (salario <= 280) {
            System.out.println("\n---------------------------------------------\n");
            System.out.printf("Salário antes: R$%.2f", salario);
            System.out.print("\nO percentual é de 20%");
            System.out.printf("\nValor do reajuste de R$%.2f ", (salario * 0.20));
            System.out.printf("\nValor do salário com o reajuste: R$%.2f", salario + (salario * 0.20));
        } else if (salario > 280 && salario <= 700) {
            System.out.println("\n---------------------------------------------\n");
            System.out.printf("Salário antes: R$%.2f", salario);
            System.out.print("\nO percentual 15%");
            System.out.printf("\nValor do reajuste de R$%.2f", (salario * 0.15));
            System.out.printf("\nValor do salário com o reajuste: R$%.2f", salario + (salario * 0.15));
        } else if (salario > 700 && salario <= 1500) {
            System.out.println("\n---------------------------------------------\n");
            System.out.printf("Saláário antes: R$%.2f", salario);
            System.out.print("\nO percentual é de 10%");
            System.out.printf("\nValor do reajuste de R$%.2f", (salario * 0.1));
            System.out.printf("\nValor do salário com o reajuste: R$%.2f", salario + (salario * 0.1));
        } else if (salario > 1500) {
            System.out.println("\n---------------------------------------------\n");
            System.out.printf("Saláário antes: R$%.2f", salario);
            System.out.print("\nO percentual é de 5%");
            System.out.printf("\nValor do reajuste de R$%.2f", (salario * 0.05));
            System.out.printf("\nValor do salário com o reajuste: R$%.2f", salario + (salario * 0.05));
        }
    }

    public static void main(String[] args) {
        Reajuste_Salario();
    }
}

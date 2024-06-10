
import java.util.Scanner;

public class EX11_Folha_de_Pagamento {

    public static void Folha() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora trabalhada mês: ");
        int horas_por_mes = sc.nextInt();

        System.out.print("Digite a quantidade que recebe por hora: ");
        double salario = sc.nextDouble();
        double salario_bruto = salario * horas_por_mes;
        salario = salario_bruto;

        double imposto_de_renda = (salario * 5) / 100;
        double inss = (salario * 10) / 100;
        double fgts = (salario * 11) / 100;
        double total_descontos = inss + imposto_de_renda;
        double salario_liquido = salario_bruto - total_descontos;

        System.out.flush();
        System.out.flush();
        System.out.flush();

        if (salario <= 900) {
            System.out.print("Você está insento");
        } else if (salario > 900 && salario <= 1500) {
            System.out.printf("O seu salário bruto        | R$%.2f", salario_bruto);
            System.out.printf("\nImposto de renda(5%%):      | R$%.2f", imposto_de_renda);
            System.out.printf("\nInss(10%%):                 | R$%.2f", inss);
            System.out.printf("\nFGTS(11%%):                 |  R$%.2f", fgts);
            System.out.printf("\nTotal dos descontos:       | R$%.2f", total_descontos);
            System.out.printf("\nO seu salario é de         | R$%.2f", salario_liquido);
        } else if (salario > 1500 && salario <= 2500) {
            System.out.printf("O seu salário bruto        | R$%.2f", salario_bruto);
            System.out.printf("\nImposto de renda(5%%):      | R$%.2f", imposto_de_renda);
            System.out.printf("\nInss(10%%):                 | R$%.2f", inss);
            System.out.printf("\nFGTS(11%%):                 |  R$%.2f", fgts);
            System.out.printf("\nTotal dos descontos:       | R$%.2f", total_descontos);
            System.out.printf("\nO seu salario é de         | R$%.2f", salario_liquido);
        } else if (salario > 2500) {
            System.out.printf("O seu salário bruto        | R$%.2f", salario_bruto);
            System.out.printf("\nImposto de renda(5%%):      | R$%.2f", imposto_de_renda);
            System.out.printf("\nInss(10%%):                 |  R$%.2f", inss);
            System.out.printf("\nFGTS(11%%):                 | R$%.2f", fgts);
            System.out.printf("\nTotal dos descontos:       | R$%.2f", total_descontos);
            System.out.printf("\nO seu salario é de         | R$%.2f", salario_liquido);
        }

    }

    public static void main(String[] args) {
        Folha();

    }

}
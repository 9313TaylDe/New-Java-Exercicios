import java.util.Scanner;

public class EX16_Ano_Valido {
    public static void AnoValido() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data válida: DD/MMM/YYYY: ");
        int dia = sc.nextInt();
        System.out.print("Digite uma data válida: DD/MMM/YYYY: ");
        int mes = sc.nextInt();
        System.out.print("Digite uma data válida: DD/MMM/YYYY: ");
        int ano = sc.nextInt();

        if (dia <= 0 || mes <= 0 || ano <= 0 || dia > 31 || mes > 12 || ano <= 0) {
            System.out.println("Dia mês e ano inválidos");
        }else if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {
            System.out.printf("Data inválida\n%d/%d/%d", dia, mes, ano);
        }
    }

    public static void main(String[] args) {
        AnoValido();
    }
}

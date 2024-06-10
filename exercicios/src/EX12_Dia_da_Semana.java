import java.util.Scanner;

public class EX12_Dia_da_Semana {
    public static void Dias() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia: ");
        String dia = sc.next();

        if (dia.equalsIgnoreCase("segunda-feira") || dia.equalsIgnoreCase("segunda") ||
                dia.equalsIgnoreCase("segunda feira") || dia.equalsIgnoreCase("terça-feira") ||
                dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terça feira") ||
                dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("terca") ||
                dia.equalsIgnoreCase("quarta-feira") || dia.equalsIgnoreCase("quarta") ||
                dia.equalsIgnoreCase("quinta-feira") || dia.equalsIgnoreCase("quinta") ||
                dia.equalsIgnoreCase("segunda feira") ||
                dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sexta-feira") ||
                dia.equalsIgnoreCase("sexta feira") ||
                dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sabádo") ||
                dia.equalsIgnoreCase("domingo")) {
            System.out.println("\n----------------------\n");
            System.out.printf("%s é um dia válido", dia);
        } else {
            System.out.print("Dia inválido");
        }

    }

    public static void main(String[] args) {
        Dias();
    }

}

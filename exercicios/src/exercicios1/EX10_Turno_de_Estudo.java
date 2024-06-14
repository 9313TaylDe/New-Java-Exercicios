package exercicios1;
import java.util.Scanner;

public class EX10_Turno_de_Estudo {
    public static void Horario() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu horário de estudo: ");
        String horario = sc.nextLine();

        if (horario.equalsIgnoreCase("m")) {
            horario = "Matutino";
            System.out.println("Bom dia!");
        } else if (horario.equalsIgnoreCase("v")) {
            horario = "Vespertino";
            System.out.println("Boa tarde!");
        } else if (horario.equalsIgnoreCase("n")) {
            horario = "Noturno";
            System.out.println("Boa noite!");
        }

    }

    public static void main(String[] args) {
        Horario();
    }

}

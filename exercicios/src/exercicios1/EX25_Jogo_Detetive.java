package exercicios1;
import java.util.Scanner;

public class EX25_Jogo_Detetive {

    public static void Detetive() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Telefonou para a vitima: ");
        String telefonou = sc.nextLine();
        System.out.print("Era próximo da vitima: ");
        String era_proximo = sc.nextLine();
        System.out.print("Devia para a vitima: ");
        String devia_para_vitima = sc.nextLine();
        System.out.print("Já trabalhou com a vitima: ");
        String trabalhou_com_vitima = sc.nextLine();
        System.out.print("Morava perto da vitima: ");
        String morava_proximo = sc.nextLine();

        int cont = 0;

        if (telefonou.equalsIgnoreCase("sim")) {
            cont++;
        }else if(telefonou.equalsIgnoreCase("não") || telefonou.equalsIgnoreCase("nao")){
            cont--;
        }
        if (era_proximo.equalsIgnoreCase("sim")) {
            cont++;
        }else if(era_proximo.equalsIgnoreCase("não") || era_proximo.equalsIgnoreCase("nao")){
            cont--;
        }
        if (morava_proximo.equalsIgnoreCase("sim")) {
            cont++;
        }else if(morava_proximo.equalsIgnoreCase("não") || morava_proximo.equalsIgnoreCase("nao")){
            cont--;
        }
        if (devia_para_vitima.equalsIgnoreCase("sim")) {
            cont++;
        }else if(devia_para_vitima.equalsIgnoreCase("não") || devia_para_vitima.equalsIgnoreCase("nao")){
            cont--;
        }
        if (trabalhou_com_vitima.equalsIgnoreCase("sim")) {
            cont++;
        }else if(trabalhou_com_vitima.equalsIgnoreCase("não") || trabalhou_com_vitima.equalsIgnoreCase("nao")){
            cont--;
        }

        if (cont == 2) {
            System.out.printf("%s você é suspeito", nome);
        } else if (cont >= 3 && cont <= 4) {
            System.out.printf("%s você é cúmplice", nome);
        } else if (cont == 5) {
            System.out.printf("%s você é o assassino", nome);
        } else if (cont >= 0 && cont <= 1) {
            System.out.printf("%s você é inocente", nome);
        }
    }

    public static void main(String[] args) {
        Detetive();
    }

}

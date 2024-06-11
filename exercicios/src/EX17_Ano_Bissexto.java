import java.util.Scanner;

public class EX17_Ano_Bissexto {

    public static void Bissexto() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano <= 0) {
            System.out.print("Ano inválido");
        }
        else if(ano % 2 == 0 || ano % 400 == 0) {
            System.out.printf("Ano é bissexto: %d", ano);
        }else if(ano % 2 != 0 || ano %  400 != 0){
            System.out.printf("Ano não é bissexto: %d", ano);
        }
    }

    public static void main(String[] args) {
        Bissexto();
    }

}

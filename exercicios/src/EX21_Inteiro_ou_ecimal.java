import java.util.Scanner;

public class EX21_Inteiro_ou_ecimal {

    public static void InteiroDecimal(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numero = sc.nextLine();

        boolean isInteger = numero.matches("-?\\d+");
        boolean isDecimal = numero.matches("-?\\d*\\.\\d+");

        if(isInteger){
            System.out.printf("O número %s é inteiro", numero);
        }else if(isDecimal){
            System.out.printf("O número %s é decimal", numero);
        }else{
            System.out.println("NÚMERO INVÁLIDO");
        }
    }
    public static void main(String[] args) {
        InteiroDecimal();
    }
}

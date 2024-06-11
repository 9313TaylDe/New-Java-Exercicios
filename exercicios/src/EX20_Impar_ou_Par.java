import java.util.Scanner;

public class EX20_Impar_ou_Par {

    public static void ImparPar(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.printf("O número %d é par", num);
        }else if(num % 2 != 0){
            System.out.printf("O número %d é ímpar", num);
        }
    }
    public static void main(String[] args) {
        ImparPar();
    }
}

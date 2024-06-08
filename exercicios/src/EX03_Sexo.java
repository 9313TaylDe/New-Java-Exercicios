import java.util.Scanner;

public class EX03_Sexo {
    public static void Sexo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu sexo: F ou M: ");
        String sexo = sc.nextLine();

        if(sexo.equalsIgnoreCase("feminino")){
            System.out.printf("Você é do sexo é %s", sexo);
        }else if(sexo.equalsIgnoreCase("masculino")){
            System.out.printf("Você é do sexo é %s", sexo);
        }else if(!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")){
            System.out.println("Sexo inváido!");
        }
    }
    public static void main(String[] args) {
        Sexo();
    }

}

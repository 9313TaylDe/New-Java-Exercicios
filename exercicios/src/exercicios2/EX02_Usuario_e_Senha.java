package exercicios2;

import java.util.Scanner;

public class EX02_Usuario_e_Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean login = false;
        String user = "Tay";
        String password = "9313";

        while (!login) {
            System.out.print("Digite o seu usúario: ");
            String usuario =  sc.nextLine();
            System.out.print("Digite a sua chave de acesso: ");
            String senha = sc.nextLine();

            if(usuario.equalsIgnoreCase(user) && senha.equalsIgnoreCase(password)){
                Limpar();
                System.out.print("Login bem sucedido\nUsuário:  ***\nSenha: *** ");break;
            }if(usuario.equalsIgnoreCase(senha)){
                System.out.print("\nO usuário não pode ser iguais\n");
                Limpar();
            }
            else if(!usuario.equalsIgnoreCase(user) && !senha.equalsIgnoreCase(password)){
                System.out.println("\nUsuario e senha inválido\n");
                Limpar();
            }
            else if(!usuario.equalsIgnoreCase(user)){
                System.out.print("Usuário inválido");
                Limpar();
            }else if(!senha.equalsIgnoreCase(password)){
                System.out.print("Senha inválida");
                Limpar();
            }
        }
    }
    public static void Limpar(){
        System.out.flush();
        System.out.print("\n----------------------------------------------------\n");
    }
}

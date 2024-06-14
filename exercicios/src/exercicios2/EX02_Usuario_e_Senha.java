package exercicios2;

import java.util.Scanner;

public class EX02_Usuario_e_Senha {
    public static void User_Password() {
        Scanner sc = new Scanner(System.in);
        boolean usuarioAtivo = false;

        while (!usuarioAtivo) {
            System.out.print("\nUsuário: ");
            String usuario = sc.nextLine();
            System.out.print("\nSenha: ");
            String senha = sc.nextLine();
            String password = senha;
            String user = usuario;

            if (usuario.equals("taylor") && senha.equalsIgnoreCase("12345")) {
                System.out.print("Login bem sucedido");
                break;
            } else if (usuario.equalsIgnoreCase(senha) && senha.equalsIgnoreCase(senha)) {
                System.out.print("Usuário não pode ser o mesmo que senha!");
            } else if (!usuario.equalsIgnoreCase("taylor") && !senha.equalsIgnoreCase("12345")) {
                System.out.print("Usuário e senha inválidos");
            } else if (!usuario.equalsIgnoreCase("taylor")) {
                System.out.print("Usuário inválido");
            } else if (!senha.equalsIgnoreCase("12345")) {
                System.out.print("Senha inválida");
            }
        }
        System.out.print("\nPROGRAMA ENCERRADO");
    }

    public static void main(String[] args) {
        User_Password();
    }
}

package exercicios2;

import java.util.Scanner;

public class EX03_Informacoes {
    public static void Informacoes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o seu sexo: ");
        String sexo = sc.next();

        System.out.println("Digite o seu estado civil: ");
        String estado_civil = sc.next();

        System.out.println("\n----------------------------------------------------------------");
        System.out.printf("Quantidade de letras: %s", nome.length());
        System.out.printf("\nSeu estado civil é %s", estado_civil);
        if (idade > 0 && idade <= 150) {
            System.out.print("\nA idade está entre 0 e 150: ");
        } else {
            System.out.print("Idade não está entre o intervalo");
        }

        if (salario > 0) {
            System.out.printf("\nO seu salário está acima de 0: %.2f", salario);
        }
        if (sexo.equalsIgnoreCase("feminino") ||
                sexo.equalsIgnoreCase("masculino") ||
                sexo.equalsIgnoreCase("m")
                || sexo.equalsIgnoreCase("f")) {
            System.out.printf("\nSeu sexo é válido: %s", sexo);
        } else if (!sexo.equalsIgnoreCase("feminino") || !sexo.equalsIgnoreCase("masculino")) {
            System.out.printf("\nSexo inválido: %s", sexo);
        }
    }

    public static void main(String[] args) {
        Informacoes();
    }
}

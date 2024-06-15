package exercicios2;

import java.util.Scanner;

public class EX13_Numero_Elevado {
    public static void Numero() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite: ");
        double num2 = sc.nextDouble();
        System.out.printf("\nA potência é %.0f", Math.pow(num2, num1));
    }

    public static void main(String[] args) {
        Numero();
    }

}

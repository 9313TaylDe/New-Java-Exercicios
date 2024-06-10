import java.util.Scanner;

public class EX14_Formar_Triangulo {

    public static void Triangulo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        double ladoC = sc.nextDouble();

        if (ladoA + ladoB > ladoC || ladoA + ladoC > ladoB || ladoB + ladoC > ladoA) {
            System.out.println("Pode formar um triângulo");
            if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
                System.out.print("\nEquilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.print("\nIsósceles");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.print("\nEscaleno");
            }
        } else if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            System.out.print("Não pode formar um triângulo");
        }
    }

    public static void main(String[] args) {
        Triangulo();
    }

}

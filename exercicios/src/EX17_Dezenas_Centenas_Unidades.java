import java.util.Scanner;

public class EX17_Dezenas_Centenas_Unidades {
    public static void DCU() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int numero = sc.nextInt();

        int dezenas = (numero / 10) % 10;
        int unidades = numero % 10;
        int centenas = (numero / 100) % 10;
        int milhar = (numero / 1000) % 100;

        boolean ativado = true;
        if (numero <= 0) {
            System.out.println("Programa encerrado");
        }
        ativado = false;
        if (numero > 0) {
            System.out.printf("\nMilhar:   %d", milhar);
            System.out.printf("\nCentenas: %d", centenas);
            System.out.printf("\nDezenas:  %d", dezenas);
            System.out.printf("\nUnidades: %d", unidades);
        }
    }

    public static void main(String[] args) {
        DCU();
    }
}

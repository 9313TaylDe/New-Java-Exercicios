import java.util.Scanner;

public class EX04_VogalConsoante {

    public static void Vogal_Consoante() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a letra: ");
        String letra = sc.next();

        switch (letra) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.printf("Letra - %s - é uma vogal", letra);
                break;

            default:
                System.out.printf("Letra - %s - é uma consoante", letra);
                break;
        }

    }

    public static void main(String[] args) {
        Vogal_Consoante();

    }
}

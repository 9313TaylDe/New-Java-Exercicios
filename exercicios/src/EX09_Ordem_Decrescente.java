import java.util.Scanner;

public class EX09_Ordem_Decrescente {
    public static void Ordeando() {
        Scanner sc = new Scanner(System.in);
        int inicio = 10;
        for (int i = inicio; i >= 0; --i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ordeando();
    }

}

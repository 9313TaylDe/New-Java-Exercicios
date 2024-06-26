public class EX29_Loja_quase_dois {
    public static void main(String[] args) {
        double valor = 1.99;
        double novo_valor = 0;
        System.out.print("Lojão - Quase dois");
        for(int i = 1; i < 51; i ++){
            System.out.printf("\n%d - %.2f",i,(novo_valor += valor));
        }
    }

}

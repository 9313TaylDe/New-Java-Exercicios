package exercicios2;

public class EX09_Impares_ate_Cinquenta {
    public static void Impares(){
        int i = 0;
        for(i = 1; i < 151; i ++){
            if(i % 2 != 0){
                System.out.printf("\nÍmpares %d", i);
            }
        }
    }
    public static void main(String[] args) {
        Impares();
    }

}

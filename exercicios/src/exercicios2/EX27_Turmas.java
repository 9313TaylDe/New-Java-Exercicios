package exercicios2;

public class EX27_Turmas {
    public static void main(String[] args) {
        
    double[] turma1 = new double[29];
    double[] turma2 = new double[35];
    double[] turma3 = new double[40];
    double media1 =  0;
    double media2 = 0;
    double media3 = 0;
    
    for(int i = 28; turma1.length > 1; --i){
        media1 += turma1[i];
    }
    System.out.println(media1);
}
}
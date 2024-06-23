package exercicios2;

import java.util.Scanner;

public class EX25_Media_de_idades {
    public static void Idade(){
        Scanner sc = new Scanner(System.in);
        double[] idade = new double[5];
        String[] nome = new String[5];
        double media = 0;
        for(int i = 0; i < idade.length && i < nome.length; i ++){
            System.out.print("Digite o seu nome: ");
            nome[i] = sc.next();
            System.out.printf("Digite a sua idade de %s: ", nome[i]);
            idade[i] =sc.nextDouble();
            media += idade[i] / 5;
        }
        if(media > 0 || media <= 25){
            System.out.printf("A média %.1f está entre 0 e 25. ", media);
        }else if(media >= 26 || media <= 60){
            System.out.printf("A média %.1f estáentre 26 e 60",media);
        }
        System.out.printf("A média de idade será de %.1f", media);
    }
    public static void main(String[] args) {
        Idade();
    }
}

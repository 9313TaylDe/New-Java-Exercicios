package exercicios2;

import java.util.Scanner;

public class EX27_Eleicoes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int votos[] = new int[20];
        int i = 0; 
        String voto = "";
        int votados = 0;
        boolean passe = true;
        while(passe){
            System.out.print("Deseja votar? ");
            voto = sc.next();

            if(voto.equalsIgnoreCase("sim")){
            for(i = votos[0]; i < votos.length; i ++){
                System.out.print("Digite ");
                votos[i]=sc.nextInt();
                votados =+ votos[i];
                break;
            }
        }else if(voto.equalsIgnoreCase("nao")) {
            System.out.println("PROGRAMA ENCERRADO");
            
            System.out.printf("\nO total de votos foram %d",votados);
            break;
        }
        }
    }

}

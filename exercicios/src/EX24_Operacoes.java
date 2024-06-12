import java.util.Scanner;

public class EX24_Operacoes {
    public static void Operacoes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        System.out.print("Qual operação você quer fazer: +,-,/,*:  ");
        String operacao = sc.next();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int divisao = num1 / num2;
        int multiplicacao = num1 * num2;

        if (operacao.equals("+")) {
            if (soma % 2 == 0) {
                System.out.printf("\nO número %d  é par", soma);
                if (soma > 0) {
                    System.out.printf("\nO número %d é positivo", soma);
                } else if (soma < 0) {
                    System.out.printf("\nO número %d  é negativo", soma);
                }
            }
        } else if (operacao.equals("*")) {
            if (multiplicacao % 2 == 0) {
                System.out.printf("\nO número %d  é par", multiplicacao);
                if (multiplicacao > 0) {
                    System.out.printf("\nO numero %d é positivo", multiplicacao);
                } else if (multiplicacao < 0) {
                    System.out.printf("\nO número %d é negativo", multiplicacao);
                }

            }
        } else if (operacao.equals("-")) {
            if (subtracao % 2 == 0) {
                System.out.printf("\nO número %d  é par", subtracao);
                if (subtracao > 0) {
                    System.out.print("\nO resultado é positivo");
                }
                if (subtracao < 0) {
                    System.out.printf("\nO número %d é negativo", subtracao);
                }
            }
        } else if (operacao.equals("/")) {
            if (divisao % 2 == 0) {
                System.out.printf("\nO número %d  é par", divisao);
                if (divisao > 0) {
                    System.out.printf("\nO número %d é positivo", divisao);
                } else if (divisao < 0) {
                    System.out.printf("\nO número %d é negativo", divisao);
                }
            }
        }

        if (operacao.equals("+")) {

            if (soma % 2 != 0) {
                System.out.printf("\nO número %d  é ímpar", soma);
                if (soma < 0) {
                    System.out.printf("\nO número %d é negativo", soma);
                } else if (soma > 0) {
                    System.out.printf("\nO número %d é positivo", soma);
                }
            }
        } else if (operacao.equals("*")) {
            if (multiplicacao % 2 != 0) {
                System.out.printf("\nO número %d  é ímpar", multiplicacao);
                if (multiplicacao < 0) {
                    System.out.printf("\nO número %d é negativo", multiplicacao);
                } else if (multiplicacao > 0) {
                    System.out.printf("\nO número %d é positivo", multiplicacao);
                }
            }
        } else if (operacao.equals("-")) {
            if (subtracao % 2 != 0) {
                System.out.printf("\nO número %d  é ímpar", subtracao);
                if (subtracao < 0) {
                    System.out.printf("\nO número %d é negativo", subtracao);
                } else if (subtracao > 0) {
                    System.out.printf("\nO número %d é positivo", subtracao);
                }
            }
        } else if (operacao.equals("/")) {
            if (divisao % 2 != 0) {
                System.out.printf("\nO número %d  é ímpar", divisao);
                if (divisao > 0) {
                    System.out.printf("\nO número %d é positivo", divisao);
                } else if (divisao < 0) {
                    System.out.printf("\nO número %d é negativo", divisao);
                }
            }
        }
    }

    public static void main(String[] args) {
        Operacoes();
    }

}

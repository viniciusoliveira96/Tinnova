import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para descobrir seu respectivo Fatorial:");
        int fatorialDoNumero = sc.nextInt();
        int resultadoFatorial;

        //verifica se o numero inserido é menor que 0
        while (fatorialDoNumero < 0) {
            System.out.println("Insira um número maior ou igual a zero:");
            fatorialDoNumero = sc.nextInt();
        }

        resultadoFatorial = fatorial.calculaFatorial(fatorialDoNumero);

        if (fatorialDoNumero == 0) {
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        } else if (fatorialDoNumero == 1){
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        } else {
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        }

        sc.close();

    }

    public int calculaFatorial(int num){
        StringBuilder multiplicador = new StringBuilder();
        int resultadoFatorial = 1;

        for (int i = num; i > 1; i--) {
            resultadoFatorial *= i;
            multiplicador.append(i).append(" x ");
        }

        return resultadoFatorial;
    }
}

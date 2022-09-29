import java.util.Scanner;

public class SomaDosMultiplos {
    public static void main(String[] args) {
        SomaDosMultiplos somaDosMultiplos = new SomaDosMultiplos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para soma dos multiplos de 3 e 5:");
        int multiplosAteNumero = sc.nextInt();

        somaDosMultiplos.somaDosMultiplos(multiplosAteNumero);

    }
    public int somaDosMultiplos(int num){
        int soma = 0;
        for(int i = 1; i < num; i++){
            if(i%3 == 0){
                soma+=i;
            }
            if(i%5 == 0){
                soma+=i;
            }
        }
        System.out.println(soma);
        return soma;
    }
}

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        DecimalFormat formatador = new DecimalFormat("0.00");
        //Declando um objeto do tipo Voto = instanciando um objeto
        Voto votos = new Voto();
        votos.setTotalEleitores(1000);
        votos.setValidos(800);
        votos.setVotosBrancos(150);
        votos.setVotosNulos(50);

        System.out.println("Percentual de votos Válidos em relação ao total de Eleitores é: " + formatador.format(votos.votosValidosPorEleitores(votos))+"%");
        System.out.println("Percentual de votos Brancos em relação ao total de Eleitores é: " + formatador.format(votos.votosBrancosPorEleitores(votos))+"%");
        System.out.println("Percentual de votos Nulos em relação ao total de Eleitores é: " + formatador.format(votos.votosNulosPorEleitores(votos))+"%");


    }
}

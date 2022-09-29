public class Voto {
    private int totalEleitores;
    private int validos;
    private int votosBrancos;
    private int votosNulos;

    public Voto(int totalEleitores, int validos, int votosBrancos, int votosNulos){
        this.totalEleitores = totalEleitores;
        this.validos = validos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }
    public Voto(){

    }

    public int getTotalEleitores() {
        return totalEleitores;
    }

    public void setTotalEleitores(int totalEleitores) {
        this.totalEleitores = totalEleitores;
    }

    public int getValidos() {
        return validos;
    }

    public void setValidos(int validos) {
        this.validos = validos;
    }

    public int getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(int votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    //metodo para percentual dos votos validos em relação ao total de eleitores
    public float votosValidosPorEleitores(Voto votos){
        float percentualValidosPorEleitores;
        float votosValidos = votos.getValidos();
        float totalEleitores = votos.getTotalEleitores();

        percentualValidosPorEleitores = (votosValidos/totalEleitores)*100;
        return percentualValidosPorEleitores;
    }

    //metodo para percentual dos votos brancos em relação ao total de eleitores
    public float votosBrancosPorEleitores(Voto votos){
        float percentualBrancosPorEleitores;
        float votosBrancos = votos.getVotosBrancos();
        float totalEleitores = votos.getTotalEleitores();

        percentualBrancosPorEleitores = (votosBrancos/totalEleitores)*100;
        return percentualBrancosPorEleitores;
    }

    //metodo para percentual dos votos nulos em relação ao total de eleitores
    public float votosNulosPorEleitores(Voto votos){
        float percentualNulosPorEleitores;
        float votosNulos = votos.getVotosNulos();
        float totalEleitores = votos.getTotalEleitores();

        percentualNulosPorEleitores = (votosNulos/totalEleitores)*100;
        return percentualNulosPorEleitores;
    }
}

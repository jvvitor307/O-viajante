public class Caminho {
    private Cidade destino;
    private int Custo;
    public Cidade getDestino() {
        return destino;
    }
    public void setDestino(Cidade destino) {
        this.destino = destino;
    }
    public int getCusto() {
        return Custo;
    }
    public void setCusto(int custo) {
        this.Custo = custo;
    }
    public Caminho(Cidade destino, int custo) {
        this.destino = destino;
        this.Custo = custo;
    }
    
}

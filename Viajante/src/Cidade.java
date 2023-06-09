import java.util.ArrayList;
import java.util.List;
public  class Cidade{
    private String nome;
    private int poderCidade;
    private missao missaoCidade;
    private List<Caminho> estrada;
    
    public Cidade(String nome, int poderCidade, missao missaoCidade) {
        this.nome = nome;
        this.poderCidade = poderCidade;
        this.missaoCidade = missaoCidade;
        this.estrada = new ArrayList<>();
    }
    public void addEstrada(Cidade destino, int custo){
        Caminho caminho = new Caminho(destino, custo);
        estrada.add(caminho);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPoderCidade() {
        return poderCidade;
    }
    public void setPoderCidade(int poderCidade) {
        this.poderCidade = poderCidade;
    }
    public missao getMissaoCidade() {
        return missaoCidade;
    }
    public void setMissaoCidade(missao missaoCidade) {
        this.missaoCidade = missaoCidade;
    }

}
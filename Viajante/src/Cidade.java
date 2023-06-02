public  class Cidade{
    private String nome;
    private int poderCidade;

    
    public Cidade(String nome, int poderCidade) {
        this.nome = nome;
        this.poderCidade = poderCidade;
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

}
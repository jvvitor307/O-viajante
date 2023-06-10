public class Maxwell  {
    private int joiaDoPoder;
    private int moedaTransporte;
    private Cidade cidadeAtual;
    private int poderAtual;
    private boolean vivo;
    private boolean missaoAndamento;
    private missao missao;

    
    public Maxwell( Cidade cidadeAtual) {
        this.joiaDoPoder = 7;
        this.poderAtual = 0;
        this.moedaTransporte = 3;
        this.cidadeAtual = cidadeAtual;
        this.vivo = true;
        this.missaoAndamento = false;
    }
    public int getJoiaDoPoder() {
        return joiaDoPoder;
    }
    public void setJoiaDoPoder(int joiaDoPoder) {
        this.joiaDoPoder = joiaDoPoder;
    }
    public boolean getVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public int getMoedaTransporte() {
        return moedaTransporte;
    }
    public void setMoedaTransporte(int moedaTransporte) {
        this.moedaTransporte = moedaTransporte;
    }
    public Cidade getCidadeAtual() {
        return cidadeAtual;
    }
    public void setCidadeAtual(Cidade cidadeAtual) {
        this.cidadeAtual = cidadeAtual;
    }
    public int getPoderAtual() {
        return poderAtual;
    }
    public void setPoderAtual(int poderAtual) {
        this.poderAtual = poderAtual;
    }

    public void AtualizarLimiar(int cidadeAtual){
        this.poderAtual = this.poderAtual + this.cidadeAtual.getPoderCidade(); 
        if(this.poderAtual<0){
            this.joiaDoPoder =0;
        }
        else if(this.poderAtual> this.joiaDoPoder){
            this.vivo = false;

        }
        verificarVida();
    }
    private boolean verificarVida() {
        if(this.getVivo() == false){
            System.out.println("Você Morreu!"); 
        }return true;

    }
    public boolean getMissaoAndamento() {
        return missaoAndamento;
    }
    public void setMissaoAndamento(boolean missaoAndamento) {
        this.missaoAndamento = missaoAndamento;
    }
    public missao getMissao() {
        return missao;
    }
    public void setMissao(missao missao) {
        this.missao = missao;
    }

}

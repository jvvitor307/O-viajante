public class missao {
    private Cidade cidadeorigem;
    private String missao;
    private Cidade cidadeFinal;
    private boolean aceitarMissao;
    private boolean missaoConcluida;
    private int premioAceitar;
    private int premioMoedaTransporte;
    private int premioLimiar;
    
    public int getPremioAceitar() {
        return premioAceitar;
    }
    public int getPremioMoedaTransporte() {
        return premioMoedaTransporte;
    }
    public int getPremioLimiar() {
        return premioLimiar;
    }
    public Cidade getMissaodeverdade() {
        return cidadeFinal;
    }
    public void setMissaodeverdade(Cidade missaodeverdade) {
        this.cidadeFinal = missaodeverdade;
    }
    public Cidade getCidadeorigem() {
        return cidadeorigem;
    }
    public void setCidadeorigem(Cidade cidadeorigem) {
        this.cidadeorigem = cidadeorigem;
    }
    public String getMissao() {
        return missao;
    }
    public void setMissao(String missao) {
        this.missao = missao;
    }
    public boolean getAceitarMissao() {
        return aceitarMissao;
    }
    public void setAceitarMissao(boolean aceitarMissao) {
        this.aceitarMissao = aceitarMissao;
    }
    public boolean getMissaoConcluida() {
        return missaoConcluida;
    }
    public void setMissaoConcluida(boolean missaoConcluida) {
        this.missaoConcluida = missaoConcluida;
    }
    public missao(Cidade cidadeorigem, String missao, Cidade cidadeFinal, int premioAceitar, int premioMoedaTransporte,
            int premioLimiar) {
        this.cidadeorigem = cidadeorigem;
        this.missao = missao;
        this.cidadeFinal = cidadeFinal;
        this.premioAceitar = premioAceitar;
        this.premioMoedaTransporte = premioMoedaTransporte;
        this.premioLimiar = premioLimiar;
    }
    public void aceitarMissao(Maxwell maxx){
        this.setAceitarMissao(true);
        maxx.setMissao(maxx.getCidadeAtual().getMissaoCidade());
        maxx.setMoedaTransporte(maxx.getMoedaTransporte()+ premioAceitar);

    }
    public void concluirMissao(Maxwell maxx){
        maxx.setMoedaTransporte(maxx.getMoedaTransporte()+ premioMoedaTransporte);
        maxx.setJoiaDoPoder(maxx.getJoiaDoPoder() + premioLimiar);
        maxx.setMissao(null);
        
    }
    public void verificarmissao(Maxwell maxx){
        if(cidadeFinal == maxx.getCidadeAtual()){
            System.out.println("Você concluiu a missão!");
            System.out.println("Você ganhou " + maxx.getMissao().getPremioMoedaTransporte() + " moedas de transporte e " + maxx.getMissao().getPremioLimiar() + " de limiar de poder!");
            concluirMissao(maxx);
        }
    }
    public void abandonarmissao(Maxwell maxx){
        maxx.setMissao(null);
        setAceitarMissao(false);
    }
    
}

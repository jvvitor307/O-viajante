public class missao {
    private Cidade cidadeorigem;
    private String missao;
    private boolean aceitarMissao;
    private boolean missaoConcluida;
    private int premioAceitar;
    private int premioTerminarF;
    private int premioTerminarS;
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
    public boolean isAceitarMissao() {
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
    public missao(Cidade cidadeorigem, String missao, boolean aceitarMissao, boolean missaoConcluida) {
        this.cidadeorigem = cidadeorigem;
        this.missao = missao;
        this.aceitarMissao = aceitarMissao;
        this.missaoConcluida = missaoConcluida;
    }
    public void aceitarMissao(Maxwell maxx){
        this.aceitarMissao = true;
        maxx.setMoedaTransporte(maxx.getMoedaTransporte()+ premioAceitar);
    }
    public void concluirMissao(Maxwell maxx){
        maxx.setMoedaTransporte(maxx.getMoedaTransporte()+ premioTerminarF);
        maxx.getJoiaDoPoder(maxx.getJoiaDoPoder()+ premioTerminar);
    }
    
}

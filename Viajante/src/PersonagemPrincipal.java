public class PersonagemPrincipal extends Personagem {
    private int joiaDoPoder;
    private int moedaTransporte;

    
    public PersonagemPrincipal(String nome, int joiaDoPoder) {
        super(nome);
        this.joiaDoPoder = joiaDoPoder;
        this.moedaTransporte = 3;
    }
    public int getJoiaDoPoder() {
        return joiaDoPoder;
    }
    public void setJoiaDoPoder(int joiaDoPoder) {
        this.joiaDoPoder = joiaDoPoder;
    }
    public int getMoedaTransporte() {
        return moedaTransporte;
    }
    public void setMoedaTransporte(int moedaTransporte) {
        this.moedaTransporte = moedaTransporte;
    }
    
}

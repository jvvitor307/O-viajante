
public class Verificacoes {
    boolean contain = false;
    int escolhaint;
    public Verificacoes() {
    }
    public boolean contain(String g, String[] escolhas){
        for (String escolh : escolhas){
            if (escolh.equals(g)){
                contain = true;
                break;
            }
        }
        return contain;
    }

    public int verificaEscolhaInt(String escolha){
        try {
            escolhaint = Integer.parseInt(escolha);
        } catch (NumberFormatException e) {
            // A conversão falhou
        }
        return escolhaint;
    }

}

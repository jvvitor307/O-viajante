public class Verificacoes {
    boolean contain = false;
    Integer escolhaint;
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

    public Integer verificaEscolhaInt(String escolha){
        try {
            escolhaint = Integer.valueOf(escolha);
        } catch (NumberFormatException e) {
            // A conversão falhou
        }
        return escolhaint;
    }
    public void verificarlimiar(Maxwell maxx){
        if(maxx.getPoderAtual() > maxx.getJoiaDoPoder()){
            maxx.setVivo(false);
        }
    }


}

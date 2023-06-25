public class Display {
    
    String[] menu = {"V", "CM", "M", "AM", "SAIR"};
    String[] menuB = {"V", "CM", "SAIR"};
    String[] menuCCM = {"V", "CM", "M", "SAIR"};
    String[] menuCSM = {"V", "CM", "AM", "SAIR"};
    
    public Display(Maxwell max) {
    }
    public void displayPrincipal(Maxwell max) {
        System.out.println("Você está na cidade: " + max.getCidadeAtual().getNome());
        System.out.println("Moedas de Transporte Disponiveis: " + max.getMoedaTransporte());
        System.out.println("Poder atual: " + max.getPoderAtual());
        System.out.println("Limiar da joia: " + max.getJoiaDoPoder());
    }

    public void mostrarMenuB(){
        System.out.println("[ V ] --> Viajar");
        System.out.println("[ CM ] --> Conversar com mercador");
        System.out.println("[ SAIR ] --> Sair do jogo");
    }

    public void mostrarMenuCCM(){
        System.out.println("[ V ] --> Viajar");
        System.out.println("[ CM ] --> Conversar com mercador");
        System.out.println("[ M ] --> Missão");
        System.out.println("[ SAIR ] --> Sair do jogo");
    }

    public void mostrarMenuCSM(){
        System.out.println("[ V ] --> Viajar");
        System.out.println("[ CM ] --> Conversar com mercador");
        System.out.println("[ AM ] --> abandonar misssão atual");
        System.out.println("[ SAIR ] --> Sair do jogo");
    }

    public void mostrarMenu(){
        System.out.println("[ V ] --> Viajar");
        System.out.println("[ CM ] --> Conversar com mercador");
        System.out.println("[ M ] --> Missão");
        System.out.println("[ AM ] --> abandonar missão atual");
        System.out.println("[ SAIR ] --> Sair do jogo");
    }
    public String[] displayMenu(Maxwell max){
        if(max.getMissao()!=null){
            if(max.getCidadeAtual().getMissaoCidade()!=null){
                mostrarMenu();
                return menu;
            }
            else{
                mostrarMenuCSM();
                return menuCSM;
            }
        }
        else{
            if(max.getCidadeAtual().getMissaoCidade()!=null){
                mostrarMenuCCM();
                return menuCCM;
            }
            else{
                mostrarMenuB();
                return menuB;
            }
        }
    }   
    public void abandonarmissao(){

    }

}

import java.util.List;
import java.util.Scanner;

public class Display {

    Scanner input = new Scanner(System.in);
    String escolhaMi;

    String[] menu = {"V", "CM", "M", "AM", "SAIR"};
    String[] menuB = {"V", "CM", "SAIR"};
    String[] menuCCM = {"V", "CM", "M", "SAIR"};
    String[] menuCSM = {"V", "CM", "AM", "SAIR"};
    
    public Display(Maxwell max) {
    }
    public void displayPrincipal(Maxwell max) {
        System.out.println("\u001B[31m \u001B[31m");
        System.out.println("Você está na cidade: " + max.getCidadeAtual().getNome());
        System.out.println("\u001B[37m \u001B[37m");
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
    public void abandonarmissao( Maxwell max){
        System.out.println("Deseja abandonar Missão Atual? 1/SIM -- 2/NÃO");
        escolhaMi = input.nextLine();
        if(escolhaMi == "1"){
            max.getMissao().abandonarmissao(max);
        }

    }
    public void aceitarMissao( Maxwell max){
        System.out.println(max.getCidadeAtual().getMissaoCidade().getMissao());
        System.out.println("1- ACEITAR MISSÃO");
        System.out.println("2- RECUSAR MISSÃO");
        escolhaMi = input.nextLine();
        if(escolhaMi == "1"){
            max.getCidadeAtual().getMissaoCidade().aceitarMissao(max);
            System.out.println("Você aceitou a missão!");
        }
        else{
            System.out.println("Você recusou a missão!");
        }
    }

    public void cidadesDisponiveis(List<Caminho> estrada){
        System.out.println("Cidades Disponíveis: ");
        for(int i = 0; i < estrada.size(); i++){
            Caminho caminho = estrada.get(i);
            System.out.println((i+1)+ ". Cidade " + caminho.getDestino().getNome() + "(Custo: " + caminho.getCusto() + ")" + "(Poder: " + caminho.getDestino().getPoderCidade() + ")"  );
        }
        System.out.println("Escolha uma cidade: ");
    }

    public void mostraViagem(Maxwell max, Caminho estradaEscolhida){
        System.out.println("Viajando para a cidade " + max.getCidadeAtual().getNome());
        System.out.println("Custo da viagem: " + estradaEscolhida.getCusto());
        max.verificarPoderAtual(max);
        System.out.println();
    }

}

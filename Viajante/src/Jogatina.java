import java.util.List;
import java.util.Scanner;

public class Jogatina {
    public void jogarJogo(){
        ConstruirCidades cidade = new ConstruirCidades();
        Maxwell max = new Maxwell(cidade.Ubud);
        Map mapa = new Map();
        mapa.criarMap();

        while (true){
            System.out.println("Você está na cidade: " + max.getCidadeAtual());
            System.out.println("Moedas de Transporte Disponiveis: " + max.getMoedaTransporte());

            List<Caminho> estrada = max.getCidadeAtual().getEstrada();
            if(estrada.isEmpty()){
                System.out.println("Você ganhou o Jogo!");
                break;
            }
            System.out.println("Cidades Disponíveis: ");
            for(int i = 0; i < estrada.size(); i++){
                Caminho caminho = estrada.get(i);
                System.out.println((i+1)+ ". Cidade" + caminho.getDestino().getNome() + "(Custo: " + caminho.getCusto() + ")");

            }
            Scanner input = new Scanner(System.in);
            int escolha = input.nextInt();
            
            // Conversa com Mercador

              if (escolha < 1 || escolha > estrada.size()) {
                System.out.println("Escolha inválida");
                continue;
              //inserir conversa do mercador
            }
             Caminho estradaEscolhida = estrada.get(escolha - 1);

              // Verificar se o jogador possui dinheiro suficiente para viajar
            if (max.getMoedaTransporte() < estradaEscolhida.getCusto()) {
                System.out.println("Você não possui dinheiro suficiente para viajar para a cidade " + estradaEscolhida.getDestino().getNome());
                System.out.println("Fim de jogo!");
                break;
            }
            // Viajar para a cidade escolhida
            max.setCidadeAtual(estradaEscolhida.getDestino());
            max.setMoedaTransporte(max.getMoedaTransporte() - estradaEscolhida.getCusto());
            
            System.out.println("Viajando para a cidade " + max.getCidadeAtual().getNome());
            System.out.println("Custo da viagem: " + estradaEscolhida.getCusto());
            System.out.println();

            





        }
        System.out.println("Fim");


    }
}

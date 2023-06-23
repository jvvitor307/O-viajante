import java.util.List;
import java.util.Scanner;

public class Jogatina {
    public void jogarJogo(){
        Cidade Ubud = new Cidade("Ubud", 0, null);
        Cidade KingdomofLegmod = new Cidade("Kingdom of Legmod", 2, null);
        Cidade PrincipalityofNekikh = new Cidade("Principality of Nekikh", 1, null);
        Cidade PrincipalityofGritesthr = new Cidade("Principality of Gritesthr", 5, null);
        Cidade ProtectorateofDogrove= new Cidade("Protectorate of Dogrove", 3, null);
        Cidade KingdomofLastwatch = new Cidade("Kingdom of Lastwatch", -2, null);
        Cidade GrandDuchyofSmalia = new Cidade("Grand Duchy of Smalia", 1, null);
        Cidade KingdomofOldcalia = new Cidade("Kingdom of Oldcalia", 4, null);
        Cidade KingdomofKalb = new Cidade("Kingdom of Kalb", 2, null);
        Cidade AymarLeague = new Cidade("Aymar League", 1, null);
        Cidade Defalsia = new Cidade("Defalsia", -3, null);
        Cidade VuneseofEmpire = new Cidade("Vunese of Empire", 0, null);
        Cidade PrincipalityofKarhora = new Cidade("Principality of Karhora", -2, null);
        Cidade ChandirSultanate = new Cidade("Chandir Sultanate", 1, null);
        Cidade Bun = new Cidade("Bun", 5, null);
        Cidade PrincipalityofKasya = new Cidade("Principality of Kasya", -7, null);
        Cidade Nargumun = new Cidade("Nargumun", 0, null);

        missao um = new missao(KingdomofKalb, "Vá até a cidade de Grand Duchy of Smalia e receba as luvas do poder", GrandDuchyofSmalia, 4, 2, 2);

        missao dois = new missao(Defalsia, "Vá até a cidade de Principality of Kasya e receba as botas do poder", PrincipalityofKasya, 6, 3, 2);

        missao tres = new missao(VuneseofEmpire, "Vá até Ubud e recebe a Glória dos Retornados", Ubud, 1, 10, -4);
        KingdomofKalb.setMissaoCidade(um);
        Defalsia.setMissaoCidade(dois);
        VuneseofEmpire.setMissaoCidade(tres);

        // fronteiras Ubud
        Ubud.addEstrada(KingdomofLegmod, 1);
        Ubud.addEstrada(PrincipalityofNekikh, 1);

        // fronteiras Kingdom of legmod
        KingdomofLegmod.addEstrada(Ubud, 1);
        KingdomofLegmod.addEstrada(PrincipalityofNekikh, 1);
        KingdomofLegmod.addEstrada(PrincipalityofGritesthr, 1);
        KingdomofLegmod.addEstrada(ProtectorateofDogrove, 1);
        KingdomofLegmod.addEstrada(KingdomofOldcalia,1);

        // fronteiras Principality of nekikh
        PrincipalityofNekikh.addEstrada(Ubud, 1);
        PrincipalityofNekikh.addEstrada(KingdomofLegmod, 1);
        PrincipalityofNekikh.addEstrada(PrincipalityofGritesthr, 1);

        //fronteiras Principality of Gritesthr  
        PrincipalityofGritesthr.addEstrada(PrincipalityofNekikh, 1);
        PrincipalityofGritesthr.addEstrada(KingdomofLegmod, 1);
        PrincipalityofGritesthr.addEstrada(ProtectorateofDogrove, 1);
        PrincipalityofGritesthr.addEstrada(KingdomofLastwatch, 1);

        //fronteiras kingdom of lastwatch
        KingdomofLastwatch.addEstrada(PrincipalityofGritesthr, 1);
        KingdomofLastwatch.addEstrada(ProtectorateofDogrove, 1);
        KingdomofLastwatch.addEstrada(KingdomofOldcalia, 1);
        KingdomofLastwatch.addEstrada(GrandDuchyofSmalia, 1);

        //fronteiras protectorate of dogrove
        ProtectorateofDogrove.addEstrada(PrincipalityofGritesthr, 1);
        ProtectorateofDogrove.addEstrada(KingdomofLegmod, 1);
        ProtectorateofDogrove.addEstrada(KingdomofOldcalia, 1);
        ProtectorateofDogrove.addEstrada(KingdomofLastwatch, 1);

        //fronteiras grand duchy of smalia
        GrandDuchyofSmalia.addEstrada(KingdomofLastwatch, 1);
        GrandDuchyofSmalia.addEstrada(KingdomofOldcalia, 1);

        //fronteiras kingdom of oldcalia
        KingdomofOldcalia.addEstrada(KingdomofLegmod, 1);
        KingdomofOldcalia.addEstrada(ProtectorateofDogrove, 1);
        KingdomofOldcalia.addEstrada(KingdomofLastwatch, 1);
        KingdomofOldcalia.addEstrada(GrandDuchyofSmalia, 1);
        KingdomofOldcalia.addEstrada(Defalsia, 1);
        KingdomofOldcalia.addEstrada(AymarLeague, 1);
        KingdomofOldcalia.addEstrada(KingdomofKalb, 1);

        //fronteiras defalsia
        Defalsia.addEstrada(KingdomofOldcalia, 1);
        Defalsia.addEstrada(AymarLeague, 1);

        //fronteiras kingdom of kalb
        KingdomofKalb.addEstrada(KingdomofOldcalia, 1);
        KingdomofKalb.addEstrada(AymarLeague, 1);
        KingdomofKalb.addEstrada(VuneseofEmpire, 1);

        //fronteiras aymar league
        AymarLeague.addEstrada(Defalsia, 1);
        AymarLeague.addEstrada(KingdomofOldcalia, 1);
        AymarLeague.addEstrada(KingdomofKalb, 1);
        AymarLeague.addEstrada(VuneseofEmpire, 1);
        AymarLeague.addEstrada(ChandirSultanate, 1);
        AymarLeague.addEstrada(Bun, 1);
        AymarLeague.addEstrada(Nargumun, 1);
        AymarLeague.addEstrada(PrincipalityofKarhora, 1);

        //fronteiras principality of karhora
        PrincipalityofKarhora.addEstrada(AymarLeague, 1);
        PrincipalityofKarhora.addEstrada(Nargumun, 1);

        //fronteiras bun
        Bun.addEstrada(Nargumun, 1);
        Bun.addEstrada(AymarLeague, 1);
        Bun.addEstrada(ChandirSultanate, 1);

        //fronteiras vunese of empire
        VuneseofEmpire.addEstrada(KingdomofKalb, 1);
        VuneseofEmpire.addEstrada(AymarLeague, 1);
        VuneseofEmpire.addEstrada(ChandirSultanate, 1);

        //fronteiras chandir sultanate
        ChandirSultanate.addEstrada(Bun, 1);
        ChandirSultanate.addEstrada(AymarLeague, 1);
        ChandirSultanate.addEstrada(VuneseofEmpire, 1);
        ChandirSultanate.addEstrada(PrincipalityofKasya, 1);

        //fronteiras principality of kasya
        PrincipalityofKasya.addEstrada(ChandirSultanate, 1);

        Maxwell max = new Maxwell(Ubud);


        while (true){
            System.out.println("Você está na cidade: " + max.getCidadeAtual().getNome());
            System.out.println("Moedas de Transporte Disponiveis: " + max.getMoedaTransporte());
            System.out.println("Poder atual: " + max.getPoderAtual());
            System.out.println("Limiar da joia: " + max.getJoiaDoPoder());

            List<Caminho> estrada = max.getCidadeAtual().getEstrada();
            if(estrada.isEmpty()){
                if(max.getMoedaTransporte()>=10){
                    System.out.println("Parabens, você se tornou o Rei de Nargumun!");
                    break;
                }
                else if(max.getMoedaTransporte()>=4){
                    System.out.println("Você se tornou lorde de Nargumun!");
                    break;
                }
                else{
                    System.out.println("você se tornou um servo da coroa!");
                    break;
                }
                
            }
            System.out.println("Cidades Disponíveis: ");
            for(int i = 0; i < estrada.size(); i++){
                Caminho caminho = estrada.get(i);
                System.out.println((i+1)+ ". Cidade " + caminho.getDestino().getNome() + "(Custo: " + caminho.getCusto() + ")" + "(Poder: " + caminho.getDestino().getPoderCidade() + ")"  );

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
            max.AtualizarLimiar(max.getCidadeAtual());
            if(max.getVivo() == false){
                break;
            }

            System.out.println("Viajando para a cidade " + max.getCidadeAtual().getNome());
            System.out.println("Custo da viagem: " + estradaEscolhida.getCusto());
            max.verificarPoderAtual(max);
            System.out.println();

            // MISSÃO
            if(max.getMissao() != null){
               max.getMissao().verificarmissao(max); 
            }

            if(max.getMissao()!=null){
                if(max.getMissao().getAceitarMissao() == true){
                    System.out.println("Deseja abandonar Missão Atual? 1/SIM -- 2/NÃO");
                    escolha = input.nextInt();
                    if(escolha == 1){
                        max.getMissao().abandonarmissao(max);
                        if(max.getCidadeAtual().getMissaoCidade() != null){
                    System.out.println(max.getCidadeAtual().getMissaoCidade().getMissao());
                    System.out.println("1- ACEITAR MISSÃO");
                    System.out.println("2- RECUSAR MISSÃO");
                    escolha = input.nextInt();
                    if(escolha == 1){
                        max.getCidadeAtual().getMissaoCidade().aceitarMissao(max);
                    }
                    else{
                        continue;
                    }
                }

                    }

                    
                }
            }
            else{
                if(max.getCidadeAtual().getMissaoCidade() != null){
                System.out.println(max.getCidadeAtual().getMissaoCidade().getMissao());
                System.out.println("1- ACEITAR MISSÃO");
                System.out.println("2- RECUSAR MISSÃO");
                escolha = input.nextInt();
                if(escolha == 1){
                    max.getCidadeAtual().getMissaoCidade().aceitarMissao(max);
                }
                else{
                    continue;
                }
            }


            }

        }
        System.out.println("Fim");


    }
}

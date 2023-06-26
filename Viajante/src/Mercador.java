import java.util.Scanner;

public class Mercador {

        Scanner input = new Scanner(System.in);
        
    public void conversaMercador(Maxwell maxwell){
        System.out.println("Deseja trocar suas Moedas de Transporte por Limiar na Joia? S/ SIM - N/ NÃO");
        String opcao = input.nextLine();
        if(maxwell.getMoedaTransporte() >= 5){
            if(opcao.equals("S")){
                maxwell.setMoedaTransporte(maxwell.getMoedaTransporte() - 2);
                maxwell.setJoiaDoPoder(maxwell.getJoiaDoPoder() + 2);



            }
            else if(opcao.equals("N")){
                maxwell.setMoedaTransporte(maxwell.getMoedaTransporte() + 1);
                maxwell.setJoiaDoPoder(maxwell.getJoiaDoPoder() - 1);

            }
            else{
                System.out.println("Opção Invalida");
                System.out.println("Por conta do seu erro, você perdeu 1 moeda de Transporte!!");
                maxwell.setMoedaTransporte(maxwell.getMoedaTransporte() - 1 );
            }
        }
        else{
            if(opcao.equals("S")){
                maxwell.setMoedaTransporte(maxwell.getMoedaTransporte() - 1);
                maxwell.setJoiaDoPoder(maxwell.getJoiaDoPoder() + 2);



            }
            else if(opcao.equals("N")){
                maxwell.setMoedaTransporte(maxwell.getMoedaTransporte() + 2);
                maxwell.setJoiaDoPoder(maxwell.getJoiaDoPoder() - 8);

            }
            else{
                System.out.println("Opção Invalida!!");
                System.out.println("Por conta do seu erro, você perdeu 1 moeda de Transporte!!");
                maxwell.setMoedaTransporte(maxwell.getMoedaTransporte() - 1);
            }

        }
        

    }

    


    
}

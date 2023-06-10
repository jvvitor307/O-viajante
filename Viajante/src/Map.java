public class Map {
    public void criarMap(){
        ConstruirCidades cidades = new ConstruirCidades();

        // fronteiras Ubud
        cidades.Ubud.addEstrada(cidades.KingdomofLegmod, 1);
        cidades.Ubud.addEstrada(cidades.PrincipalityofNekikh, 1);

        // fronteiras Kingdom of legmod
        cidades.KingdomofLegmod.addEstrada(cidades.Ubud, 1);
        cidades.KingdomofLegmod.addEstrada(cidades.PrincipalityofNekikh, 1);
        cidades.KingdomofLegmod.addEstrada(cidades.PrincipalityofGritesthr, 1);
        cidades.KingdomofLegmod.addEstrada(cidades.ProtectorateofDogrove, 1);
        cidades.KingdomofLegmod.addEstrada(cidades.KingdomofOldcalia, 1);

        // fronteiras Principality of nekikh
        cidades.PrincipalityofNekikh.addEstrada(cidades.Ubud, 1);
        cidades.PrincipalityofNekikh.addEstrada(cidades.KingdomofLegmod, 1);
        cidades.PrincipalityofNekikh.addEstrada(cidades.PrincipalityofGritesthr, 1);

        //fronteiras Principality of Gritesthr  
        cidades.PrincipalityofGritesthr.addEstrada(cidades.PrincipalityofNekikh, 1);
        cidades.PrincipalityofGritesthr.addEstrada(cidades.KingdomofLegmod, 1);
        cidades.PrincipalityofGritesthr.addEstrada(cidades.ProtectorateofDogrove, 1);
        cidades.PrincipalityofGritesthr.addEstrada(cidades.KingdomofLastwatch, 1);

        //fronteiras kingdom of lastwatch
        cidades.KingdomofLastwatch.addEstrada(cidades.PrincipalityofGritesthr, 1);
        cidades.KingdomofLastwatch.addEstrada(cidades.ProtectorateofDogrove, 1);
        cidades.KingdomofLastwatch.addEstrada(cidades.KingdomofOldcalia, 1);
        cidades.KingdomofLastwatch.addEstrada(cidades.GrandDuchyofSmalia, 1);

        //fronteiras protectorate of dogrove
        cidades.ProtectorateofDogrove.addEstrada(cidades.PrincipalityofGritesthr, 1);
        cidades.ProtectorateofDogrove.addEstrada(cidades.KingdomofLegmod, 1);
        cidades.ProtectorateofDogrove.addEstrada(cidades.KingdomofOldcalia, 1);
        cidades.ProtectorateofDogrove.addEstrada(cidades.KingdomofLastwatch, 1);

        //fronteiras grand duchy of smalia
        cidades.GrandDuchyofSmalia.addEstrada(cidades.KingdomofLastwatch, 1);
        cidades.GrandDuchyofSmalia.addEstrada(cidades.KingdomofOldcalia, 1);

        //fronteiras kingdom of oldcalia
        cidades.KingdomofOldcalia.addEstrada(cidades.KingdomofLegmod, 1);
        cidades.KingdomofOldcalia.addEstrada(cidades.ProtectorateofDogrove, 1);
        cidades.KingdomofOldcalia.addEstrada(cidades.KingdomofLastwatch, 1);
        cidades.KingdomofOldcalia.addEstrada(cidades.GrandDuchyofSmalia, 1);
        cidades.KingdomofOldcalia.addEstrada(cidades.Defalsia, 1);
        cidades.KingdomofOldcalia.addEstrada(cidades.AymarLeague, 1);
        cidades.KingdomofOldcalia.addEstrada(cidades.KingdomofKalb, 1);

        //fronteiras defalsia
        cidades.Defalsia.addEstrada(cidades.KingdomofOldcalia, 1);
        cidades.Defalsia.addEstrada(cidades.AymarLeague, 1);

        //fronteiras kingdom of kalb
        cidades.KingdomofKalb.addEstrada(cidades.KingdomofOldcalia, 1);
        cidades.KingdomofKalb.addEstrada(cidades.AymarLeague, 1);
        cidades.KingdomofKalb.addEstrada(cidades.VuneseofEmpire, 1);

        //fronteiras aymar league
        cidades.AymarLeague.addEstrada(cidades.Defalsia, 1);
        cidades.AymarLeague.addEstrada(cidades.KingdomofOldcalia, 1);
        cidades.AymarLeague.addEstrada(cidades.KingdomofKalb, 1);
        cidades.AymarLeague.addEstrada(cidades.VuneseofEmpire, 1);
        cidades.AymarLeague.addEstrada(cidades.ChandirSultanate, 1);
        cidades.AymarLeague.addEstrada(cidades.Bun, 1);
        cidades.AymarLeague.addEstrada(cidades.Nargumun, 1);
        cidades.AymarLeague.addEstrada(cidades.PrincipalityofKarhora, 1);

        //fronteiras principality of karhora
        cidades.PrincipalityofKarhora.addEstrada(cidades.AymarLeague, 1);
        cidades.PrincipalityofKarhora.addEstrada(cidades.Nargumun, 1);

        //fronteiras bun
        cidades.Bun.addEstrada(cidades.Nargumun, 1);
        cidades.Bun.addEstrada(cidades.AymarLeague, 1);
        cidades.Bun.addEstrada(cidades.ChandirSultanate, 1);

        //fronteiras vunese of empire
        cidades.VuneseofEmpire.addEstrada(cidades.KingdomofKalb, 1);
        cidades.VuneseofEmpire.addEstrada(cidades.AymarLeague, 1);
        cidades.VuneseofEmpire.addEstrada(cidades.ChandirSultanate, 1);

        //fronteiras chandir sultanate
        cidades.ChandirSultanate.addEstrada(cidades.Bun, 1);
        cidades.ChandirSultanate.addEstrada(cidades.AymarLeague, 1);
        cidades.ChandirSultanate.addEstrada(cidades.VuneseofEmpire, 1);
        cidades.ChandirSultanate.addEstrada(cidades.PrincipalityofKasya, 1);

        //fronteiras principality of kasya
        cidades.PrincipalityofKasya.addEstrada(cidades.ChandirSultanate, 1);

    }
}
public class Main {
    public static void main(String[] args) {
        Cachorro xitius = new Cachorro("xitius", 10);
        Lontra lontra= new Lontra( "almada",20);
        Boi boi = new Boi("torneio",40);
        boi.emitirSom();
        boi.mostraInfo();
        xitius.emitirSom();
        xitius.mostraInfo();
        lontra.emitirSom();
        lontra.mostraInfo();


    }
}

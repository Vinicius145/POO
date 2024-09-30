public class Boi extends Mamifero{

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("muuuuuuuuuuu");

    }

    @Override
    public void mostraInfo() {
        System.out.println("Tem 4 pernas");

    }
}

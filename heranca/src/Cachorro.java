public class Cachorro extends Mamifero {


    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("auauauauauauauau");

    }

    @Override
    public void mostraInfo() {
        System.out.println("tem um rabo e quatro pernas");

    }
}

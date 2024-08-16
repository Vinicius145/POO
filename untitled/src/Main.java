public class Main {
    public static void main(String[] args) {
    Zumbi z1 = new Zumbi();
    Zumbi z2 = new Zumbi();
    z1.vida=100;
    z2.vida=300;
    z1.nome="vinicius";
    z2.nome="henrique";
    z1=z2;
    z1.vida=350;//manipulando a vida dos dois zumbis apos a comparacao z1=z2
        System.out.println(z1.nome+ "tem vida de: " + z1.Mostravida());
        System.out.println(z2.nome+ "tem vida de: " + z2.Mostravida());
    //restante irei pega rem aula

    }
}
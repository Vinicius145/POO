public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida=100;
        z2.vida=300;

        z1.nome="vinicius";
        z2.nome="henrique";

        z1=z2;//na hr que iguala acaba mostrando para o mesmo enderenco de memoria IRA CAIR NA PROVA
        //ALEM DISSO, Z1 PEGA O VALOR DE Z2, ANTES DE FAZER A MANIPULACAO
        z1.vida=350;//manipulando a vida dos dois zumbis apos a comparacao z1=z2

        boolean transfere= z1.transfereVida(z2; 190);//z1 esta tranferindo vida para o zumbi z2

        System.out.println(z1.nome+ "tem vida de: " + z1.Mostravida());

        System.out.println(z2.nome+ "tem vida de: " + z2.Mostravida());


    }
}
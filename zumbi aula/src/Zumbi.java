public class Zumbi {
    double vida;
    String nome;
    double Mostravida(){
        return this.vida;//returnando a class double vida
    }
    Boolean transfereVida(Zumbi zumbiAlvo,double quantia) {
        if (this.vida <= quantia) {
            return false;
        } else {

            this.vida -= quantia;

            zumbiAlvo.vida += quantia;

        }
    }
}
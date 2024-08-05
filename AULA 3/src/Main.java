import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int npa;
        System.out.println("Entre com o valor da NPA: ");
        npa = entrada.nextInt();
        if (npa < 60) {
            System.out.println("voce ira fazer np3");
            System.out.println("qual sua nota da NP3?");
            int np3;
            np3 = entrada.nextInt();
            int nfa = (np3 + npa) / 2;
            if (nfa >= 50) {
                System.out.println("voce passou, parabens");
            } else {
                System.out.println("voce reprovou, sinto muito");
            }else{
                System.out.println("voce passou");
            }
            entrada.close();
        }
    }
}

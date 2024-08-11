import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand  = new Random();
        int x = rand.nextInt(10)+1;
        System.out.println("tente advinhar o numero: ");
        int tent;
        Scanner entrada = new Scanner(System.in);
        tent = entrada.nextInt();
        for(int i = 0;  i< 10 ; i++){
            if (tent == x) {
                System.out.println("voce acertou parabens");
                break;
            } else if (tent> x) {
                System.out.println("voce esta chutando acima do numero correto!");
                tent = entrada.nextInt();
                continue;
            }
            else {
                System.out.println("voce esta chutando abaixo do numero correto!");
                tent = entrada.nextInt();
                continue;
            }

            }
        }
    }


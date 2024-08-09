import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAluno = entrada.nextInt();
        System.out.println("Coloque o numero de alunos");
        switch (numAluno){
            case 10://caso fosse um string teria que colocar uma ""no valor, sendo letra...
                System.out.println("Sala I-16");
                break;
            case 20:
                System.out.println("Sala I-16");

                break;
            case 30:
                    System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Sempre sera executado");
        }

    }
}
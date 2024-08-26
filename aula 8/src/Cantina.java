public class Cantina {
    Salgado salgados = new Salgado[5];
    String nome;

    void addSalgado (Salgado novoSalgado){
        for (int i=0 ; i < salgados.length; i++){//salgados.length é como se fosse o n de c++
            if (salgados[i]==null){//verifica se o array esta nulo(sem nada)
                salgados[i]=novoSalgado;
                break;//adiciona e sai do metodo
            }
        }
    }
    void mostraInfo(){
        System.out.println("A cantina: " + this.nome);
        for (Salgado salgado : salgados){
            if (salgado != null)//verifica se tem algo no salgado
                System.out.println(salgado.nome);//se eu nn colocar o .nome ira mostrar o endereco de memoria onde esta armazenado tal array
        }
    }
}

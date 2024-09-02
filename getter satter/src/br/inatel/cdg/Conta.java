public class Conta {




    //questsao de prova!!!!!!!!!!
    //int saldo; se nn colocar nada (public e private\) ele so sera possivel acessar se tiver dentro da PASTA, nesse caso so seria possivel acessar dentro da = br.inatel.cdg




    private int saldo;//somemnte esse metodo consegue acessar o saldo, ou seja so pode er acessado aqui
    // setar


    public int getSaldo(){//getter
        return saldo;//retornar o saldo
    }


    //public void setSaldo(int saldo){//setar tal saldo
       // return this.saldo=saldo;
    //}

    
    public void deposito(int quantia){
        this.saldo=quantia;
    }

}

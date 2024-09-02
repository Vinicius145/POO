public class Conta {
    private int numero;
    private float saldo;
    private float limite;

    public float getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    Cliente 
    public Conta(){
        Conta Cliente = new clientes[10];
        Conta.clientes[0].
        public void sacar(float quantia){
            if(quantia < this.saldo) {
                this.cliente -= quantia;
                System.out.println("Saque feito");
            }
            else{
                System.out.println("Nao tem saldo sufuciente");
            }
        }
        public void deposita(float quantia){
            this.saldo = quantia;
            System.out.println("deposito feito");
        }

    }




}

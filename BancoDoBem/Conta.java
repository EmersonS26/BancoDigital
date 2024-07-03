package BancoDoBem;

public abstract class Conta implements IConta{
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO  = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    @Override
    public void Sacar(double valor){
        saldo -= valor;
    }
    @Override
    public void Depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void Transferir(double valor, Conta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.println();

        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    public abstract void Sacar();

    public abstract void Depositar();

    public abstract void Transferir();
}

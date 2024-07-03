package BancoDoBem;

public  class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void Sacar() {

    }

    @Override
    public void Depositar() {

    }

    @Override
    public void Transferir() {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n*** Extrato Conta Poupança ***");
        imprimirInfosComuns();
    }
}

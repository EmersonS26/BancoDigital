package BancoDoBem;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
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

}

package BancoDoBem;

public class Main {
    public static void main(String [] args) {
        Cliente jorge = new Cliente();
        jorge.setNome("Jorge");

        Conta cc = new ContaCorrente(jorge);
        Conta poupanca = new ContaPoupanca(jorge);

        cc.setAgencia(2770);
        cc.setNumero(0123523);

        poupanca.setAgencia(2770);
        poupanca.setNumero(0123523);


        cc.Depositar(250);
        cc.Transferir(100,poupanca);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();




    }
}

package BancoDigital;

public class Main {

    public static void main(String[] args) {
        Cliente nomeCliente = new Cliente();
        nomeCliente.setNome("Jesus");
        Conta contaCorrente = new ContaCorrente(nomeCliente);
        Conta contaPoupanca = new ContaPoupanca(nomeCliente);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}



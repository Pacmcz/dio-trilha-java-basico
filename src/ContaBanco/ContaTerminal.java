package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int numeroAgencia;
        int numeroConta;
        double saldo = 237.00;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite o número da Agência: ");
        numeroAgencia = entrada.nextInt();

        System.out.println("Dgite o número da Conta: ");
        numeroConta = entrada.nextInt();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia +
                ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível");







    }


}

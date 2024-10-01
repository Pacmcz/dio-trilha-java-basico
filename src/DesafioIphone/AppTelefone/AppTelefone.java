package DesafioIphone.AppTelefone;

public class AppTelefone implements Telefone {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender número que estava ligando com sucesso");
    }

    @Override
    public void iniciarCorreioDeVoz() {

        System.out.println("Iniciando Correio de Voz");
    }
}

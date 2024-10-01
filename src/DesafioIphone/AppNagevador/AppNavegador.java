package DesafioIphone.AppNagevador;

public class AppNavegador implements NavegadorInternet{
    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exbindo a página " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo novo aba");
    }

    @Override
    public void atualizarPágina() {
        System.out.println("Atualizando a página atual");
    }
}

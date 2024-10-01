package DesafioIphone.Iphone;

import DesafioIphone.AppMusic.AppMusic;
import DesafioIphone.AppNagevador.AppNavegador;
import DesafioIphone.AppTelefone.AppTelefone;

public class Iphone {
    public static void main(String[] args) {


            AppTelefone telefone = new AppTelefone();
            AppMusic music = new AppMusic();
            AppNavegador navegador = new AppNavegador();


            telefone.ligar("XXXX-7777");
            telefone.atender();
            telefone.iniciarCorreioDeVoz();
        System.out.println("\n");

            music.selecionarMusica("Eminem - Lose yourself");
            music.pausar();
        System.out.println("\n");

            navegador.exibirPagina("10.0.0.1");
            navegador.atualizarPágina();
            navegador.adicionarNovaAba();

    }
}
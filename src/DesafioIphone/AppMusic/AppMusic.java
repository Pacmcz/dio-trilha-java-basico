package DesafioIphone.AppMusic;

public class AppMusic implements ReprodutorMusical {

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("\nTocando a música selecionada   →  " + musica);
        tocar();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música selecionada... tuts ♫ tuts ♫");
    }

    @Override
    public void pausar() {
        System.out.println("A música ► foi pausada pelo usuário");
    }
}

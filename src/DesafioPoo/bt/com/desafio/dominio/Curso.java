package DesafioPoo.bt.com.desafio.dominio;

public class Curso extends Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso -> \n" +
                " Título = " + getTitulo() + '\n' +
                " Descrição=" + getDescricao() + '\n' +
                " Carga Horária=" + cargaHoraria +
                "\n";
    }

}

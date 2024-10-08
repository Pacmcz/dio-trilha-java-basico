package DesafioPoo;

import DesafioPoo.bt.com.desafio.dominio.Bootcamp;
import DesafioPoo.bt.com.desafio.dominio.Curso;
import DesafioPoo.bt.com.desafio.dominio.Dev;
import DesafioPoo.bt.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2");
        curso2.setDescricao("Descrição Curso Java 2");
        curso2.setCargaHoraria(18);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);

        devDavi.progredir();
        devDavi.progredir();
        System.out.println("Conteúdos incritos Davi" + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Golias" + devDavi.getConteudosConcluidos());
        System.out.println("XP Davi" + devDavi.calcularTotalXp());

        Dev devGolias  = new Dev();
        devGolias.setNome("Golias");
        devGolias.inscreverBootcamp(bootcamp);

        devGolias.progredir();
        devGolias.progredir();
        devGolias.progredir();

        System.out.println("Conteúdos incritos Golias" + devGolias.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Golias" + devGolias.getConteudosConcluidos());
        System.out.println("XP Golias" + devGolias.calcularTotalXp() );



    }
}

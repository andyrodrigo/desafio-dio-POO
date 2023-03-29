import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Projeto Bootcamp \n");

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Conteudo conteudo1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Conteudo conteudo2 = new Mentoria();

        curso1.setTitulo("curso Java");
        curso1.setdescricao("descrição curso Java");
        curso1.setcargaHoraria(8);

        curso2.setTitulo("curso JavaScript");
        curso2.setdescricao("descrição curso JS");
        curso2.setcargaHoraria(4);

        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setdescricao("descrição mentoria de Java");
        mentoria1.setLocalDate(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAllan = new Dev();
        Dev devRogerio = new Dev();
        Dev devAndy = new Dev();

        devAllan.setNome("Allan");
        devRogerio.setNome("Rogério");
        devAndy.setNome("Anderson");

        devAllan.inscreverBootcamp(bootcamp);
        devRogerio.inscreverBootcamp(bootcamp);
        devAndy.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Allan: " + devAllan.getConteudosInscritos() + "\n");
        System.out.println("Conteúdos Inscritos Rogério: " + devRogerio.getConteudosInscritos() + "\n");
        System.out.println("Conteúdos Inscritos Andy: " + devAndy.getConteudosInscritos() + "\n");

        System.out.println("Conteúdos Concluídos Allan: " + devAllan.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos Concluídos Rogério: " + devRogerio.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos Concluídos Andy: " + devAndy.getConteudosConcluidos() + "\n");

        System.out.println("XP Allan: " + devAllan.calcularTotalXp() + "\n");
        System.out.println("XP Rogério: " + devRogerio.calcularTotalXp() + "\n");
        System.out.println("XP Andy: " + devAndy.calcularTotalXp() + "\n");

        System.out.println("-----------Progressao------------");

        devAllan.progredir();
        devRogerio.progredir();
        devRogerio.progredir();
        devAndy.progredir();
        devAndy.progredir();
        devAndy.progredir();

        System.out.println("-----------Resultado-------------");

        System.out.println("Conteúdos Inscritos Allan: " + devAllan.getConteudosInscritos() + "\n");
        System.out.println("Conteúdos Inscritos Rogério: " + devRogerio.getConteudosInscritos() + "\n");
        System.out.println("Conteúdos Inscritos Andy: " + devAndy.getConteudosInscritos() + "\n");

        System.out.println("Conteúdos Concluídos Allan: " + devAllan.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos Concluídos Rogério: " + devRogerio.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos Concluídos Andy: " + devAndy.getConteudosConcluidos() + "\n");

        System.out.println("XP Allan: " + devAllan.calcularTotalXp() + "\n");
        System.out.println("XP Rogério: " + devRogerio.calcularTotalXp() + "\n");
        System.out.println("XP Andy: " + devAndy.calcularTotalXp() + "\n");
    }
}

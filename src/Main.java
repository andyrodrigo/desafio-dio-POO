import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Mentoria:");

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java da DIO");
        curso1.setCarcaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Curso Kotlin da DIO");
        curso2.setCarcaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentroria de Java da DIO");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp de Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Pedro" + devPedro.getConteudosInscritos());

        devPedro.progredir();
        System.out.println("-----------------");
        System.out.println("Conteúdos inscritos de Pedro" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());


        System.out.println("-----------------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("João");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Paulo" + devPaulo.getConteudosInscritos());
        
        devPaulo.progredir();
        System.out.println("-----------------");
        System.out.println("Conteúdos inscritos de Paulo" + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Paulo" + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

    }
}

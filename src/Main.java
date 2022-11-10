import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setTitulo("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setTitulo("Descricao curso javaScript");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bottcamp java developer");
        bootcamp.setDescricao("descrição do bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev silas = new Dev();
        silas.setNome("Silas");
        Dev joao = new Dev();
        joao.setNome("João");
        System.out.println("Conteudos incritos de "+silas.getNome()+": "+silas.getConteudosInscritos() );
        System.out.println("Conteudos incritos de "+silas.getNome()+": "+silas.getConteudosInscritos() );
        System.out.println("XP de "+silas.getNome()+": "+silas.calcularXp() );
        System.out.println("XP de "+joao.getNome()+": "+joao.calcularXp() );

        silas.increverBootcamp(bootcamp);
        joao.increverBootcamp(bootcamp);
        System.out.println("Conteudos incritos de "+silas.getNome()+": "+silas.getConteudosInscritos() );
        System.out.println("Conteudos incritos de "+joao.getNome()+": "+joao.getConteudosInscritos() );
        System.out.println("XP de "+silas.getNome()+": "+silas.calcularXp() );
        System.out.println("XP de "+joao.getNome()+": "+joao.calcularXp() );
        silas.progredir();
        System.out.println("Conteudos incritos de "+silas.getNome()+": "+silas.getConteudosInscritos() );
        System.out.println("Conteudos incritos de "+joao.getNome()+": "+joao.getConteudosInscritos() );
        System.out.println("Conteudos concluidos de "+silas.getNome()+": "+silas.getConteudosConcluidos() );
        System.out.println("Conteudos concluidos de "+joao.getNome()+": "+joao.getConteudosConcluidos() );
        System.out.println("XP de "+silas.getNome()+": "+silas.calcularXp() );
        System.out.println("XP de "+joao.getNome()+": "+joao.calcularXp() );
    }
}
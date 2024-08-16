import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class Main {

  public static void main(String[] args) {
    Curso curso1 = new Curso();

    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(100);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso javascript");
    curso2.setDescricao("descricao curso javascript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descricao Bootcamp Java Develop");
    bootcamp.getConteudo().add(curso1);
    bootcamp.getConteudo().add(curso2);
    bootcamp.getConteudo().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");


    

    System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
  }
}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class Bootcamp {

  private String nome;
  private String descricao;
  private LocalDate dataInicial = LocalDate.now();
  private LocalDate dateFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDateFinal() {
    return dateFinal;
  }

  public void setDateFinal(LocalDate dateFinal) {
    this.dateFinal = dateFinal;
  }

  public LocalDate getDataInicial() {
    return dataInicial;
  }

  public void setDataInicial(LocalDate dataInicial) {
    this.dataInicial = dataInicial;
  }

  public Set<Dev> getDevsInscritos() {
    return devsInscritos;
  }

  public void setDevsInscritos(Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }

  public Set<Conteudo> getConteudos() {
    return conteudos;
  }

  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }
}

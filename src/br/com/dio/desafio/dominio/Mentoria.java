package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
  private String titulo;
  private String descricao;
  private LocalDate data;

    public String getTitulo(){
    return titulo;
  }

  public void setTitulo( String titulo){
    this.titulo = titulo;
  }
    public String getdescricao(){
    return descricao;
  }

  public void setdescricao( String descricao){
    this.descricao = descricao;
  }

  public LocalDate getData(){
    return data;
  }

  public void setLocalDate( LocalDate data){
    this.data = data;
  }

  public String toString() {
    return "Mentoria { " + "Titulo: " + titulo + ", descrição: " + descricao + ", Data: " + data + "}"; 
  }
}

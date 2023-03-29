package br.com.dio.desafio.dominio;

public class Curso {
  private String titulo;
  private String descricao;
  private int cargaHoraria;

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

    public int getCargaHoraria(){
    return cargaHoraria;
  }

  public void setcargaHoraria( int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
  }

  public String toString() {
    return "Curso { " + "Titulo: " + titulo + ", descrição: " + descricao + ", Carga Horária: " + cargaHoraria +" }" ; 
  }
}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

  private LocalDate data;

  public void setLocalDate( LocalDate data){
    this.data = data;
  }

  @Override
  public String toString() {
    return "Mentoria { " + "Titulo: " + getTitulo() + ", descrição: " + getdescricao() + ", Data: " + data + "}"; 
  }

  @Override
  public double calcularXp(){
    return XP_PADRAO + 20d;
  }
}

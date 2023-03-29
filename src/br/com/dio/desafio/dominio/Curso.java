package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

  private int cargaHoraria;

  public int getCargaHoraria(){
    return cargaHoraria;
  }

  public void setcargaHoraria( int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso { " + "Titulo: " + getTitulo() + ", descrição: " + getdescricao() + ", Carga Horária: " + cargaHoraria +" }" ; 
  }

    @Override
  public double calcularXp(){
    return XP_PADRAO * cargaHoraria;
  }
}

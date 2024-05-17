package br.com.cursojava.projetofinal.vo;

public class FuncionarioVO {

  private int matricula;
  private String nome;
  private double salario;
  private int cargoId;

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public int getCargoId() {
    return cargoId;
  }

  public void setCargoId(int cargoId) {
    this.cargoId = cargoId;
  }
}

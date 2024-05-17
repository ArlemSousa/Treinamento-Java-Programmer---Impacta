package br.com.cursojava.enumeracao;

public enum Estado {

  ESPIRITO_SANTO("Esp�rito Santo", "ES", "Vit�ria"),
  MINAS_GERAIS  ("Minas Gerais",   "MG", "Belo Horizonte"),
  RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
  SAO_PAULO     ("S�o Paulo",      "SP", "S�o Paulo");

  private String nome;
  private String sigla;
  private String capital;

  Estado(String nome, String sigla, String capital) {
    this.nome = nome;
    this.sigla = sigla;
    this.capital = capital;
  }

  public String getNome() {
    return nome;
  }

  public String getSigla() {
    return sigla;
  }

  public String getCapital() {
    return capital;
  }
}

package br.com.impacta.cursojava.equalshashcode;

public class Produto implements Comparable<Produto> {

  private int codigo;
  private String descricao;
  private double preco;

  public Produto(int codigo, String descricao,
      double preco) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
  }
  
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public boolean equals(Object obj) {
    
    if (!(obj instanceof Produto)) {
      return false;
    }
    
    Produto outro = (Produto) obj;
    return this.descricao.equals(outro.descricao);
  }

  public int compareTo(Produto outro) {
    
    if (this.descricao.compareTo(
        outro.descricao) > 0) {
      return 1;
    } else if (this.descricao.compareTo(
        outro.descricao) < 0) {
      return -1;
    } else {
      return 0;
    }
    
//    return this.codigo - outro.codigo;
  }
}

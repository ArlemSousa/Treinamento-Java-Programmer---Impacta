package br.com.cursojava.model;

public class Cliente implements Comparable<Cliente> {

  private String rg;
  private String nome;
  private String endereco;
  private String telefone;

  public Cliente() {
    // do nothing
  }

  public Cliente(String nome, String endereco,
      String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public Cliente(String rg, String nome,
      String endereco, String telefone) {
    this.rg = rg;
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public boolean equals(Object obj) {

    if (obj == null)
      return false;
    if (!(obj instanceof Cliente))
      return false;

    Cliente outro = (Cliente) obj;

    if (this.nome == null && outro.nome == null)
      return true;
    if (this.nome == null)
      return true;

    return this.nome.equals(outro.nome);
  }

  public int hashCode() {
    return (nome == null) ? 0 : nome.hashCode();
  }

  public int compareTo(Cliente outro) {
    return this.nome.compareTo(outro.nome);
  }
}

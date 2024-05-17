package br.com.cursojava.generics;

public class Start {

  public static void main(String[] args) {
    
    Casal<Cachorro> casal1 = new Casal<>();
    casal1.setMarido(new Cachorro("Rex",
        "Pastor Alemão"));
    casal1.setMulher(new Cachorro("July", "Boxer"));
    
    Casal<Gato> casal2 = new Casal<>();
    casal2.setMarido(new Gato("Nino", Cor.AMARELO));
    casal2.setMulher(new Gato("Susie", Cor.BRANCO));
    
    Casal<Pessoa> casal3 = new Casal<>();
    casal3.setMarido(new Pessoa("João", 26));
    casal3.setMulher(new Pessoa("Maria", 22));
    
    System.out.println("Casal de cachorros:");
    System.out.printf("Marido: %s - %s\n",
        casal1.getMarido().getNome(),
        casal1.getMarido().getRaca());
    System.out.printf("Mulher: %s - %s\n",
        casal1.getMulher().getNome(),
        casal1.getMulher().getRaca());
    System.out.println();

    System.out.println("Casal de gatos:");
    System.out.printf("Marido: %s - %s\n",
        casal2.getMarido().getNome(),
        casal2.getMarido().getCor().getNomeEn());
    System.out.printf("Mulher: %s - %s\n",
        casal2.getMulher().getNome(),
        casal2.getMulher().getCor().getNomeEn());
    System.out.println();
    
    System.out.println("Casal de pessoas:");
    System.out.printf("Marido: %s - %d anos\n",
        casal3.getMarido().getNome(),
        casal3.getMarido().getIdade());
    System.out.printf("Mulher: %s - %d anos\n",
        casal3.getMulher().getNome(),
        casal3.getMulher().getIdade());
  }
}

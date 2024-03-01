package model;

public class Garrafa {
  private String marca;
  private String cor;
  private String material;

  private Integer quantidade;
  private Integer tamanho;

  private Boolean aberta;
  private Boolean cheia;
  private Boolean fechada;
  private Boolean vazia;

  public Garrafa(String marca, String cor, String material, Integer quantidade, Integer tamanho, Boolean aberta,
      Boolean cheia, Boolean fechada, Boolean vazia) {
    this.marca = marca;
    this.cor = cor;
    this.material = material;
    this.quantidade = quantidade;
    this.tamanho = tamanho;
    this.aberta = aberta;
    this.cheia = cheia;
    this.fechada = fechada;
    this.vazia = vazia;
  }

  ////////////////////////////////////

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getMaterial() {
    return this.material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public Integer getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Integer getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(Integer tamanho) {
    this.tamanho = tamanho;
  }

  public Boolean isAberta() {
    return this.aberta;
  }

  public void setAberta(Boolean aberta) {
    this.aberta = aberta;
  }

  public Boolean isCheia() {
    return this.cheia;
  }

  public void setCheia(Boolean cheia) {
    this.cheia = cheia;
  }

  public Boolean isFechada() {
    return this.fechada;
  }

  public void setFechada(Boolean fechada) {
    this.fechada = fechada;
  }

  public Boolean isVazia() {
    return this.vazia;
  }

  public void setVazia(Boolean vazia) {
    this.vazia = vazia;
  }

  public void abrir() {
    this.aberta = true;
    System.out.println("Garrafa aberta!");
  }

  public void fechar() {
    this.fechada = false;
    System.out.println("Garrafa fechada!");
  }

  public void encherGarrafa() {
    if (this.quantidade < 650) {
      this.quantidade++;
      System.out.println("Quantidade: " + this.quantidade);
    } else {
      System.out.println("A garrafa já está cheia!");
    }
  }

  public void esvaziarGarrafa() {
    if (this.quantidade > 0) {
      this.quantidade--;
      System.out.println("Quantidade: " + this.quantidade);
    } else {
      System.out.println("A garrafa já está vazia!");
    }
  }

  @Override
  public String toString() {
    return "Garrafa [marca=" + marca + ", cor=" + cor + ", material=" + material + ", quantidade=" + quantidade
        + ", tamanho=" + tamanho + ", aberta=" + aberta + ", cheia=" + cheia + ", fechada=" + fechada + ", vazia="
        + vazia + "]";
  }

}

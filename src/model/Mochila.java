package model;

public class Mochila {
  private String cor;
  private String marca;
  private Integer tamanho;
  private Integer reparticoes;
  private String material;
  private Boolean abrir;

  public Mochila(String var1, String var2, Integer var3, Integer var4, String var5, Boolean var6) {
    this.cor = var1;
    this.marca = var2;
    this.tamanho = var3;
    this.reparticoes = var4;
    this.material = var5;
    this.abrir = var6;
  }

  public String getCor() {
    return this.cor;
  }

  public String getMarca() {
    return this.marca;
  }

  public Integer getTamanho() {
    return this.tamanho;
  }

  public Integer getReparticoes() {
    return this.reparticoes;
  }

  public String getMaterial() {
    return this.material;
  }

  public void setCor(String var1) {
    this.cor = var1;
  }

  public void setMarca(String var1) {
    this.marca = var1;
  }

  public void setTamanho(Integer var1) {
    this.tamanho = var1;
  }

  public void setReparticoes(Integer var1) {
    this.reparticoes = var1;
  }

  public void setMaterial(String var1) {
    this.material = var1;
  }

  public Boolean getAbrir() {
    return this.abrir;
  }

  public void setAbrir(Boolean var1) {
    this.abrir = var1;
  }

  public String toString() {
    return "\nMochila: Cor=" + this.cor + ", Marca=" + this.marca + ", Tamanho=" + this.tamanho
        + ", Reparti\u00e7\u00f5es=" + this.reparticoes + ", Material=" + this.material + ", Aberta=" + this.abrir;
  }

  public void abrirMochila() {
    if (this.abrir) {
      System.out.println("\nMochila j\u00e1 est\u00e1 aberta!");
    } else {
      System.out.println("\nAbrindo mochila...");
      System.out.println("Mochila aberta!");
      this.abrir = true;
    }

  }

  public void fecharMochila() {
    if (!this.abrir) {
      System.out.println("\nMochila j\u00e1 est\u00e1 fechada!");
    } else {
      System.out.println("\nFechando mochila...");
      System.out.println("Mochila fechada!");
      this.abrir = false;
    }

  }
}

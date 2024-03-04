package model;

public class Janela {

  private String cor;
  private Integer tamanho;
  private String tipo;
  private String material;
  private Boolean trancar;
  private Boolean destrancar;

  public Janela(String cor, Integer tamanho, String tipo, String material, Boolean trancar, Boolean destrancar) {
    this.cor = cor;
    this.tamanho = tamanho;
    this.tipo = tipo;
    this.material = material;
    this.trancar = trancar;
    this.destrancar = destrancar;
  }

  public String toString() {
    return "\nJanela{" +
        "cor='" + cor + '\'' +
        ", tamanho=" + tamanho +
        ", tipo='" + tipo + '\'' +
        ", material='" + material + '\'' +
        ", trancar=" + trancar +
        ", destrancar=" + destrancar +
        '}';
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Integer getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(Integer tamanho) {
    this.tamanho = tamanho;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getMaterial() {
    return this.material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public boolean getTrancar() {
    return this.trancar;
  }

  public void setTrancar(Boolean trancar) {
    this.trancar = trancar;
  }

  public Boolean getDestrancar() {
    return this.destrancar;
  }

  public void setDestrancar(Boolean destrancar) {
    this.destrancar = destrancar;
  }

  public void trancar() {
    this.trancar = true;
    this.destrancar = false;
    System.out.println("\nJanela trancada!");
  }

  public void destrancar() {
    this.destrancar = true;
    this.trancar = false;
    System.out.println("\nJanela destrancada!");
  }

  Boolean aberta = false;

  public void abrir() {
    if (this.trancar == true) {
      System.out.println("\nA Janela esta trancada, destranque depois abra!");
    } else if (aberta == true) {
      System.out.println("\nJanela ja esta aberta!");
    } else {
      System.out.println("\nJanela aberta!");
      aberta = true;
    }
  }

  public void fechar() {
    if (aberta == true) {
      System.out.println("\nJanela fechada!");
      aberta = false;
    } else {
      System.out.println("\nJanela ja esta fechada!");
    }
  }
}

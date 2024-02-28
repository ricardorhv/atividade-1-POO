package model;

public class Carro {
  private String cor;
  private Integer ano;
  private String marca;
  private boolean automatico;
  private Double comprimento;
  private String modelo;
  private boolean ligar;
  int vl;

  public Carro(String var1, Integer var2, String var3, boolean var4, Double var5, String var6, boolean var7) {
    this.cor = var1;
    this.ano = var2;
    this.marca = var3;
    this.automatico = var4;
    this.comprimento = var5;
    this.modelo = var6;
    this.ligar = var7;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String var1) {
    this.cor = var1;
  }

  public Integer getAno() {
    return this.ano;
  }

  public void setAno(Integer var1) {
    this.ano = var1;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String var1) {
    this.marca = var1;
  }

  public boolean getAutomatico() {
    return this.automatico;
  }

  public void setAutomatico(boolean var1) {
    this.automatico = var1;
  }

  public Double getComprimento() {
    return this.comprimento;
  }

  public void setComprimento(Double var1) {
    this.comprimento = var1;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String var1) {
    this.modelo = var1;
  }

  public boolean getLigar() {
    return this.ligar;
  }

  public void setLigar(boolean var1) {
    this.ligar = var1;
  }

  public String toString() {
    return "Carro{A cor \u00e9 ='" + this.cor + "', ano=" + this.ano + ", marca='" + this.marca + "', automatico="
        + this.automatico + ", comprimento=" + this.comprimento + ", modelo='" + this.modelo + "', ligar=" + this.ligar
        + "}\n";
  }

  public void ligarCarro() {
    if (this.ligar) {
      System.out.println("Carro j\u00e1 est\u00e1 ligado!\n");
    } else {
      System.out.println("Carro ligando...");
      System.out.println("Carro ligado!\n");
      this.ligar = true;
    }

  }

  public void desligarCarro() {
    if (!this.ligar) {
      System.out.println("Carro j\u00e1 est\u00e1 desligado!\n");
    } else {
      System.out.println("Carro desligado!\n");
      this.ligar = false;
    }

  }

  public void acelerarCarro() {
    byte var1 = 10;
    if (this.vl != 20) {
      this.vl += var1;
      System.out.println("\nAcelerando...");
      System.out.println("O carro est\u00e1 a " + this.vl + "km/h!");
    } else {
      System.out.println("\nCarro ja atingiu seu limite maximo!");
    }

  }

  public void frearCarro() {
    byte var1 = 10;
    if (this.vl == 0) {
      System.out.println("O carro j\u00e1 est\u00e1 parado!\nN\u00e3o \u00e9 necess\u00e1rio frear!");
    } else {
      this.vl -= var1;
      System.out.println("\nFreando...");
      System.out.println("O carro est\u00e1 a " + this.vl + "km/h!");
    }

  }

  public void buzinarCarro() {
    System.out.println("\nBuzinando...");
    System.out.println("BIIIIIIIIIIIIIIIIIII");
  }

  public void puxarFreioDeMao() {
    System.out.println("\nFreio de mao puxado!");
  }
}

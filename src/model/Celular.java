package model;

public class Celular {
  private String marca;
  private String cor;
  private String material;
  private Integer armazenamento;
  private Double tamanhoTela;
  private Boolean ligado;
  private Boolean carregando;

  ////////////////////////////////////

  public Celular(String marca, String cor, String material, Integer armazenamento, Double tamanhoTela, Boolean ligado,
      Boolean carregando) {
    this.marca = marca;
    this.cor = cor;
    this.material = material;
    this.armazenamento = armazenamento;
    this.tamanhoTela = tamanhoTela;
    this.ligado = ligado;
    this.carregando = carregando;
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

  public Integer getArmazenamento() {
    return this.armazenamento;
  }

  public void setArmazenamento(Integer armazenamento) {
    this.armazenamento = armazenamento;
  }

  public Double getTamanhoTela() {
    return this.tamanhoTela;
  }

  public void setTamanhoTela(Double tamanhoTela) {
    this.tamanhoTela = tamanhoTela;
  }

  public Boolean isLigado() {
    return this.ligado;
  }

  public void setLigado(Boolean ligado) {
    this.ligado = ligado;
  }

  public Boolean isCarregando() {
    return this.carregando;
  }

  public void setCarregando(Boolean carregando) {
    this.carregando = carregando;
  }

  //////////////////////////////////////

  public void ligar() {
    this.ligado = true;
    System.out.println("Celular ligado!");
  }

  public void desligar() {
    this.ligado = false;
    System.out.println("Celular desligado!");
  }

  public void carregar() {
    this.carregando = true;
    System.out.println("Celular sendo carregado...");
  }

  public void pararDeCarregar() {
    this.carregando = false;
    System.out.println("Celular parou de carregar!");
  }

}

package model;

public class Cortina {
  private String cor;
  private String fabricante;
  private String modelo;
  private String tipomaterial;
  private String ambiente;

  private Float tamanho;
  private Boolean blackout;

  public Cortina(String cor, Float tamanho, String fabricante, String modelo, String tipomaterial, Boolean blackout,
      String ambiente) {
    this.cor = cor;
    this.tamanho = tamanho;
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.tipomaterial = tipomaterial;
    this.blackout = blackout;
    this.ambiente = ambiente;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Float getTamanho() {
    return tamanho;
  }

  public void setTamanho(Float tamanho) {
    this.tamanho = tamanho;
  }

  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getTipomaterial() {
    return tipomaterial;
  }

  public void setTipomaterial(String tipomaterial) {
    this.tipomaterial = tipomaterial;
  }

  public Boolean getBlackout() {
    return blackout;
  }

  public void setBlackout(Boolean blackout) {
    this.blackout = blackout;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public String toString() {
    return "Cor: " + cor + "\n" + "Tamanho: " + tamanho + "\n" + "Fabricante: " + fabricante + "\n" + "Modelo: "
        + modelo + "\n" + "Tipo de material: " + tipomaterial + "\n" + "Blackout: " + blackout + "\n" + "Ambiente: "
        + ambiente;
  }
}

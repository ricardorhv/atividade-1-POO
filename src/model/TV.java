package model;

public class TV {
  private String modelo;
  private String marca;
  private String cor;
  private Boolean curvo;
  private Integer polegadas;
  private Boolean ligada;
  private Integer volume;
  private Integer canal;

  public TV(String modelo, String marca, String cor, Boolean curvo, Integer polegadas, Boolean ligada, Integer volume,
      Integer canal) {
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.curvo = curvo;
    this.polegadas = polegadas;
    this.ligada = ligada;
    this.volume = volume;
    this.volume = volume;
    this.canal = canal;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

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

  public Boolean isCurvo() {
    return this.curvo;
  }

  public void setCurvo(Boolean curvo) {
    this.curvo = curvo;
  }

  public Integer getPolegadas() {
    return this.polegadas;
  }

  public void setPolegadas(Integer polegadas) {
    this.polegadas = polegadas;
  }

  public boolean isLigada() {
    return this.ligada;
  }

  public int getVolume() {
    return this.volume;
  }

  public int getCanal() {
    return this.canal;
  }

  public void ligar() { // Ligar TV
    this.ligada = true;
    System.out.println("TV ligada!");
  }

  public void desligar() { // Desligar TV
    this.ligada = false;
    System.out.println("TV desligada!");
  }

  public void aumentarVolume() { // Aumentar volume
    if (this.volume < 100) {
      this.volume++;
      System.out.println("Volume: " + this.volume);
    } else {
      System.out.println("Volume já esta no maximo!");
    }
  }

  public void diminuirVolume() { // Diminuir volume
    if (this.volume > 0) {
      this.volume--;
      System.out.println("Volume: " + this.volume);
    } else {
      System.out.println("Volume mínimo atingido!");
    }
  }

  public void setVolume(int volume) { // Configurar volume
    if (volume >= 0 && volume <= 100) {
      this.volume = volume;
      System.out.println("Volume definido para: " + this.volume);
    } else {
      System.out.println("Erro! O valor deve estar entre 0 e 100.");
    }
  }

  public void subirCanal() { // Subir canal
    if (this.canal < 999) {
      this.canal++;
      System.out.println("Canal: " + this.canal);
    } else {
      System.out.println("Canal atingiu o limite!");
    }
  }

  public void descerCanal() { // Descer canal
    if (this.canal > 1) {
      this.canal--;
      System.out.println("Canal: " + this.canal);
    } else {
      System.out.println("Canal mínimo atingido!");
    }
  }

  public void setCanal(int canal) { // Configurar canal
    if (canal >= 1 && canal <= 999) {
      this.canal = canal;
      System.out.println("Canal definido para: " + this.canal);
    } else {
      System.out.println("Erro! O valor deve estar entre 1 e 999.");
    }
  }
}

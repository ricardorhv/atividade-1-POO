package model;

public class Notebook {
  private String modelo;
  private String marca;
  private String cor;
  private String processador;

  private float largura;
  private float comprimento;
  private float altura;
  private int quantidadeDeMemoriaRAM;

  private boolean ligado;
  private boolean carregando;
  private boolean conectadoNoWifi;
  private boolean aberto;

  public Notebook() {
  }

  public Notebook(String modelo, String marca, String cor, String processador, float largura, float comprimento,
      float altura, int quantidadeDeMemoriaRAM, boolean ligado, boolean carregando, boolean conectadoNoWifi,
      boolean aberto) {
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.processador = processador;
    this.largura = largura;
    this.comprimento = comprimento;
    this.altura = altura;
    this.quantidadeDeMemoriaRAM = quantidadeDeMemoriaRAM;
    this.ligado = ligado;
    this.carregando = carregando;
    this.conectadoNoWifi = conectadoNoWifi;
    this.aberto = aberto;
  }

  public boolean isLigado() {
    return ligado;
  }

  public void ligar() {
    System.out.println("Ligando notebook...");
    this.ligado = true;
  }

  public void desligar() {
    System.out.println("Desligando notebook...");
    this.ligado = false;
  }

  public boolean isCarregando() {
    return carregando;
  }

  public void carregarBateria() {
    System.out.println("Carregando...");
    this.carregando = true;
  }

  public void pararDeCarregar() {
    System.out.println("Carregador desconectado...");
    this.carregando = false;
  }

  public boolean isConectadoNoWifi() {
    return conectadoNoWifi;
  }

  public void conectarAoWifi() {
    System.out.println("Conectando ao wifi...");
    this.conectadoNoWifi = true;
  }

  public void desconectarDoWifi() {
    System.out.println("Desconectando do wifi...");
    this.conectadoNoWifi = false;
  }

  public boolean isAberto() {
    return aberto;
  }

  public void abrirNotebook() {
    System.out.println("Abrindo notebook...");
    this.aberto = true;
  }

  public void fecharNotebook() {
    System.out.println("Fechando notebook...");
    this.aberto = false;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public float getLargura() {
    return largura;
  }

  public void setLargura(float largura) {
    this.largura = largura;
  }

  public float getComprimento() {
    return comprimento;
  }

  public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public String getProcessador() {
    return processador;
  }

  public void setProcessador(String processador) {
    this.processador = processador;
  }

  public int getQuantidadeDeMemoriaRAM() {
    return quantidadeDeMemoriaRAM;
  }

  public void setQuantidadeDeMemoriaRAM(int quantidadeDeMemoriaRAM) {
    this.quantidadeDeMemoriaRAM = quantidadeDeMemoriaRAM;
  }

  @Override
  public String toString() {
    return "Notebook [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", processador=" + processador
        + ", largura=" + largura + ", comprimento=" + comprimento + ", altura=" + altura + ", quantidadeDeMemoriaRAM="
        + quantidadeDeMemoriaRAM + ", ligado=" + ligado + ", carregando=" + carregando + ", conectadoNoWifi="
        + conectadoNoWifi + ", aberto=" + aberto + "]";
  }

}

package model;

public class Impressora {
  private String cor;
  private String tipoDaImpressora;
  private String marca;
  private String modelo;

  private int quantidadeDePapel;

  private boolean imprimindo;
  private boolean possuiCarga;
  private boolean possuiPapel;
  private boolean ligada;

  public Impressora() {

  }

  public Impressora(String cor, String tipoDaImpressora, String marca, String modelo, int quantidadeDePapel,
      boolean imprimindo, boolean possuiCarga, boolean possuiPapel, boolean ligada) {
    this.cor = cor;
    this.tipoDaImpressora = tipoDaImpressora;
    this.marca = marca;
    this.modelo = modelo;
    this.quantidadeDePapel = quantidadeDePapel;
    this.imprimindo = imprimindo;
    this.possuiCarga = possuiCarga;
    this.possuiPapel = possuiPapel;
    this.ligada = ligada;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getTipoDaImpressora() {
    return tipoDaImpressora;
  }

  public void setTipoDaImpressora(String tipoDaImpressora) {
    this.tipoDaImpressora = tipoDaImpressora;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getQuantidadeDePapel() {
    return quantidadeDePapel;
  }

  public void setQuantidadeDePapel(int quantidadeDePapel) {
    this.quantidadeDePapel = quantidadeDePapel;
  }

  public boolean isPossuiCarga() {
    return possuiCarga;
  }

  public void setPossuiCarga(boolean possuiCarga) {
    this.possuiCarga = possuiCarga;
  }

  public boolean isPossuiPapel() {
    return possuiPapel;
  }

  public void setPossuiPapel(boolean possuiPapel) {
    this.possuiPapel = possuiPapel;
  }

  public void imprimir(int quantidadeDeImpressao) {
    this.quantidadeDePapel -= quantidadeDeImpressao;
    this.imprimindo = true;

    for (int i = 0; i < quantidadeDeImpressao; i++) {
      System.out.println("Imprimindo folha " + (i + 1));
    }

    this.imprimindo = false;
  }

  public void exportarDocumentoEmPDF() {
    System.out.println("Exportando documento em PDF...");
  }

  public void ligar() {
    this.ligada = true;
    System.out.println("Ligando impressora...");
  }

  public void desligar() {
    this.ligada = false;
    System.out.println("Desligando impressora...");
  }

  public void continuarImpressao() {
    this.imprimindo = true;
    System.out.println("Continuando a impressão...");
  }

  public void cancelarImpressao() {
    this.imprimindo = false;
    System.out.println("Cancelando a impressão...");
  }

  @Override
  public String toString() {
    return "Impressora [cor=" + cor + ", tipoDaImpressora=" + tipoDaImpressora + ", marca=" + marca + ", modelo="
        + modelo + ", quantidadeDePapel=" + quantidadeDePapel + ", imprimindo=" + imprimindo + ", possuiCarga="
        + possuiCarga + ", possuiPapel=" + possuiPapel + ", ligada=" + ligada + "]";
  }
}

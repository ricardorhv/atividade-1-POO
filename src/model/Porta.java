package model;

public class Porta {
  private char cor;
  private int tamanho;
  private char tipoPorta;
  private char tipoMaterial;
  private boolean nova;
  private char tipoFechadura;
  private boolean olhoMagico;
  private boolean trancada;

  // Construtor
  public Porta(char cor, int tamanho, char tipoPorta, char tipoMaterial, boolean nova, char tipoFechadura,
      boolean olhoMagico) {
    this.cor = cor;
    this.tamanho = tamanho;
    this.tipoPorta = tipoPorta;
    this.tipoMaterial = tipoMaterial;
    this.nova = nova;
    this.tipoFechadura = tipoFechadura;
    this.olhoMagico = olhoMagico;
    this.trancada = false;
  }

  // Métodos acessores
  public char getCor() {
    return cor;
  }

  public void setCor(char cor) {
    this.cor = cor;
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public char getTipoPorta() {
    return tipoPorta;
  }

  public void setTipoPorta(char tipoPorta) {
    this.tipoPorta = tipoPorta;
  }

  public char getTipoMaterial() {
    return tipoMaterial;
  }

  public void setTipoMaterial(char tipoMaterial) {
    this.tipoMaterial = tipoMaterial;
  }

  public boolean isNova() {
    return nova;
  }

  public void setNova(boolean nova) {
    this.nova = nova;
  }

  public char getTipoFechadura() {
    return tipoFechadura;
  }

  public void setTipoFechadura(char tipoFechadura) {
    this.tipoFechadura = tipoFechadura;
  }

  public boolean isOlhoMagico() {
    return olhoMagico;
  }

  public void setOlhoMagico(boolean olhoMagico) {
    this.olhoMagico = olhoMagico;
  }

  public boolean isTrancada() {
    return trancada;
  }

  // Métodos
  public void trancar() {
    if (!trancada) {
      trancada = true;
      System.out.println("A porta foi trancada.");
    } else {
      System.out.println("A porta já está trancada.");
    }
  }

  public void destrancar() {
    if (trancada) {
      trancada = false;
      System.out.println("A porta foi destrancada.");
    } else {
      System.out.println("A porta já está destrancada.");
    }
  }

  public void abrir() {
    if (!trancada) {
      System.out.println("A porta está aberta.");
    } else {
      System.out.println("Você não pode abrir a porta porque está trancada.");
    }
  }

  public void fechar() {
    System.out.println("A porta está fechada.");
  }

  @Override
  public String toString() {
    return "Porta [cor=" + cor + ", tamanho=" + tamanho + ", tipoPorta=" + tipoPorta + ", tipoMaterial=" + tipoMaterial
        + ", nova=" + nova + ", tipoFechadura=" + tipoFechadura + ", olhoMagico=" + olhoMagico + ", trancada="
        + trancada + "]";
  }

}
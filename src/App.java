import java.util.Scanner;

import model.Carro;
import model.Cortina;
import model.Garrafa;
import model.Impressora;
import model.Mochila;
import model.Notebook;
import model.TV;

public class App {
    public static void criarNotebook() {
        Notebook notebook = new Notebook();

        notebook.setMarca("Acer");
        notebook.setModelo("Aspire 5");
        notebook.setLargura(24.7f);
        notebook.setAltura(1.7f);
        notebook.setComprimento(36.3f);
        notebook.setCor("Prata");
        notebook.setProcessador("i7 8° Geração");
        notebook.setQuantidadeDeMemoriaRAM(32);

        notebook.abrirNotebook();
        notebook.ligar();
        notebook.conectarAoWifi();
        notebook.carregarBateria();

        System.out.println(notebook.toString());
    }

    public static void criarImpressora() {
        Impressora impressora = new Impressora();

        impressora.setCor("Preto");
        impressora.setMarca("HP");
        impressora.setTipoDaImpressora("Lazer");
        impressora.setModelo("1102w");
        impressora.setPossuiCarga(true);
        impressora.setQuantidadeDePapel(100);
        impressora.setPossuiPapel(true);

        impressora.ligar();
        impressora.imprimir(10);
        impressora.cancelarImpressao();
        impressora.continuarImpressao();
        impressora.exportarDocumentoEmPDF();
        impressora.desligar();

        System.out.println(impressora.toString());
    }

    public static void criarMochila() {
        Mochila mochila = new Mochila("Preta", "Copacol", 50, 8, "Pano", false);
        mochila.abrirMochila();
        mochila.abrirMochila();
        mochila.fecharMochila();
        mochila.fecharMochila();
        mochila.setCor("Rosa");
        System.out.println(mochila.toString());
    }

    public static void criarCarro() {
        Carro carro = new Carro("Preto", 2020, "Honda", true, 5.4, "Sedan", false);

        carro.ligarCarro();
        carro.ligarCarro();
        carro.desligarCarro();
        carro.desligarCarro();
        carro.setCor("Prata");
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.frearCarro();
        carro.buzinarCarro();
        carro.puxarFreioDeMao();

        System.out.println(carro.toString());
    }

    public static void criarTV() {
        TV minhaTv = new TV("FullHD NanoCell", "Samsung", "Preta", true, 55, true, 20, 2);

        System.out.println("-------------------");

        minhaTv.ligar();

        System.out.println("Marca: " + minhaTv.getMarca());
        System.out.println("Cor: " + minhaTv.getCor());
        System.out.println("Volume: " + minhaTv.getVolume());
        System.out.println("Canal: " + minhaTv.getCanal());
        System.out.println("Modelo: " + minhaTv.getModelo());

        if (minhaTv.isCurvo()) {
            System.out.println("A TV é curva!");
        } else {
            System.out.println("A TV não é curva.");
        }
        System.out.println("-------------------");
    }

    public static void criarGarrafa() {
        Garrafa minhaGarrafa = new Garrafa("Camelback", "Prata", "Plástico", 650, 30, true, false, false, false);

        System.out.println("-------------------");

        minhaGarrafa.abrir();

        System.out.println("Marca: " + minhaGarrafa.getMarca());
        System.out.println("Cor: " + minhaGarrafa.getCor());
        System.out.println("Material: " + minhaGarrafa.getMaterial());
        System.out.println("Quantidade: " + minhaGarrafa.getQuantidade());

        System.out.println("-------------------");
    }

    public static void criarCortina() {
        Cortina cortina = new Cortina("Azul", 1.5f, "RTC Decor", "Persiana", "aluminio", true, "sala");
        System.out.println(cortina.toString());

        cortina.setCor("Verde");

        System.out.println("\n" + cortina.toString());
    }

    public static void main(String[] args) throws Exception {
        int escolha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Porta");
        System.out.println("2 - Celular");
        System.out.println("3 - Mochila");
        System.out.println("4 - Carro");
        System.out.println("5 - Cortina");
        System.out.println("6 - TV");
        System.out.println("7 - Notebook");
        System.out.println("8 - Impressora");
        System.out.println("9 - Garrafa");
        System.out.println("10 - Janela");
        System.out.print("Escolha o número correspondente ao objeto que gostaria de visualizar: ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                criarMochila();
                break;
            case 4:
                criarCarro();
                break;
            case 5:
                criarCortina();
                break;
            case 6:
                criarTV();
                break;
            case 7:
                criarNotebook();
                break;
            case 8:
                criarImpressora();
                break;
            case 9:
                criarGarrafa();
                break;
            case 10:

                break;

            default:
                System.out.println("Digite uma opção válida!");
                break;
        }

        scanner.close();
    }
}

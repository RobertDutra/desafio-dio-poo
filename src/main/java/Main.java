import model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("981272467");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.test.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.selecionarMusica("Sorriso no rosto");
        iphone.tocar();
        iphone.pausar();
    }
}

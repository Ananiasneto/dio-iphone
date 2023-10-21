
import apps.internet.NavegadorInternet;
import apps.musica.ReprodutorMusical;
import apps.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // App internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        // App música
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();

        // App telefone
        iphone.fazerLigacao();
        iphone.atenderLigacao();
        iphone.iniciarCorreioVoz();

    }

}
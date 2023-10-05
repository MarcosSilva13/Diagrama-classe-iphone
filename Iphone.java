public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a musica: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(int indiceMusica) {
        System.out.println("Selecionando a musica: " + indiceMusica);
    }
}
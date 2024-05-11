public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    //Aparelho Telefonico
    @Override
    public void ligar(String numeroTelefonico){
        System.out.println("Ligando para: " + numeroTelefonico);

    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada...");

    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");

    }

    //

    //NavegadorInternet
    @Override
    public void exibirPagina(String url){
        System.out.println("Acessando a página: " + url);

    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba!");

    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando pagina!");

    }

    //

    //RepodutorMusical
    @Override
    public void tocar(){
        System.out.println("Tocando...");

    }

    @Override
    public void pausar(){
        System.out.println("Música pausada...");

    }

    @Override
    public void selecionarMusica(String nomeMusica){
        System.out.println("Tocando a melodia: " + nomeMusica);

    }

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.ligar("(11)99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Navegador de Internet
        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //RepodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Time - David Bowie");

    }
}

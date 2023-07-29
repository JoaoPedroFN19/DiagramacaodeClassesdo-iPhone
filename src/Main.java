public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone("iPhone 12");

        // Demonstrando as funcionalidades do iPhone
        System.out.println("Modelo: " + iphone.modelo);

        // Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        // Aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador na Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

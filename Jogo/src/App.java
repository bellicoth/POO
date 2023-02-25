public class App {
    public static void main(String[] args) throws Exception {
        var jogador = new Jogador("Thiago");
        jogador.receberDano(10);
        System.out.println(jogador);
        System.out.println(jogador.getHp());
    }
}

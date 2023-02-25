public class App {
    public static void main(String[] args) throws Exception {
        

        var produtoLivro = new ProdutoLivro("Turma da Monica", 50.0, "Mauricio de Souza");

        System.out.println(produtoLivro.getNome());
        System.out.println(produtoLivro.CalcularPreco());
        System.out.println(produtoLivro.getAutor());

        System.out.println("\n");
        var ProdutoEletronico = new ProdutoEletronico("Celular", 1000.0, "Nokia", "L10");

        System.out.println(ProdutoEletronico.getNome());
        System.out.println(ProdutoEletronico.CalcularPreco());
        System.out.println(ProdutoEletronico.getMarca());
        System.out.println(ProdutoEletronico.getModelo());

    }
}

public class ProdutoLivro extends Produto{

    private String autor;

    public ProdutoLivro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    

    
    
}

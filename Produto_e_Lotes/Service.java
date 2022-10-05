public class Service {
    private Repository repository;

    public Service() {
        this.repository = new Repository();
    }

    public void criarProduto(String nome, String fabricante, double preco) {
        Produto produto = new Produto(nome, fabricante, preco);
        this.repository.addProduto(produto);
    }

    public void criarLote(Produto produto, int qtd, String dataValidade) {
        Lote lote = new Lote(produto, qtd, dataValidade);
        this.repository.addLote(lote);
    }

    public String listarProdutos() {
        return this.repository.listarProdutos();
    }

    public String listarLotes() {
        return this.repository.listarLotes();
    }
}
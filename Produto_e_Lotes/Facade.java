public class Facade {
    private Service services;

    public Facade() {
        this.services = new Service();
    }

    public void criarProduto(String nome, String fabricante, double preco) {
        this.services.criarProduto(nome, fabricante, preco);
    }

    public void criarLote(Produto produto, int qtd, String dataValidade) {
        this.services.criarLote(produto, qtd, dataValidade);
    }

    public String listarProdutos() {
        return this.services.listarProdutos();
    }

    public String listarLotes() {
        return this.services.listarLotes();
    }

}
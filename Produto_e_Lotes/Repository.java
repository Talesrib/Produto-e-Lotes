import java.util.ArrayList;

public class Repository {
    private ArrayList<Produto> produtos;
    private ArrayList<Lote> lotes;

    public Repository() {
        this.produtos = new ArrayList<Produto>();
        this.lotes = new ArrayList<Lote>();
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }

    public String listarProdutos() {
        return this.produtos.toString();
    }

    public String listarLotes() {
        return this.lotes.toString();
    }
}
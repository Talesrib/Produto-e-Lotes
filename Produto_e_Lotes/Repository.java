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

    public ArrayList<Produto> listarProdutos() {
        return this.produtos;
    }

    public ArrayList<Lote> listarLotes() {
        return this.lotes;
    }
}
public class Lote {
    private int qtd;
    private String dataValidade;
    private Produto produto;

    public Lote(Produto produto, int qtd, String dataValidade) {
        this.produto = produto;
        this.qtd = qtd;
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return this.dataValidade + ", Produto: " + this.produto.getName() + "(" + this.qtd + ")";
    }
}

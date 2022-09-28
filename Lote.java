import java.util.Date;

public class Lote {
    private int qtd;
    private Date data;
    private Produto produto;

    public Lote(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
        this.data = new Date();
    }

    public Lote(Produto produto, int qtd, Date data) {
        this.produto = produto;
        this.qtd = qtd;
        this.data = data;
    }

    public String toString() {
        return this.produto.getName() + this.qtd + this.data;
    }
}

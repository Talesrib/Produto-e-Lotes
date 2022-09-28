
public class Produto {
  private String nome;
  private String fabricante;
  private double preco;

  public Produto(String nome, String fabricante, double preco) {
    this.nome = nome;
    this.fabricante = fabricante;
    this.preco = preco;
  }

  public String getName() {
    return this.nome;
  }
  
  public String toString() {
    return this.nome + this.fabricante + this.preco;
  }  
}
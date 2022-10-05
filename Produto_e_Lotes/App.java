public class App {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.criarProduto("Leite", "vaquinha", 3.99);
        facade.criarProduto("Guaraná", "Antartida", 4.67);
        Produto produto = new Produto("Leite", "vaquinha", 3.99);
        facade.criarLote(produto, 50, "12/12/2023");
        
        System.out.println(facade.listarLotes());
        System.out.println(facade.listarProdutos());
    }
}

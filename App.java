public class App {
    public static void main(String[] args) {
        Produto prod = new Produto("Ipod", "apple", 12000 );
        Lote lote = new Lote(prod, 10);
        System.out.println(prod.toString());
        System.out.println(lote.toString());
    }
}

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void mostrarProduto() {
        System.out.println(nome + " custa R$" + preco + " e possui " + estoque + " unidades.");
    }
}
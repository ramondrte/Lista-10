public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ramon", 20, "ramon@email.com");
        Produto prod = new Produto("Notebook", 3500.0, 5);
        Livro l = new Livro("Dom Casmurro", "Machado de Assis");
        ContaBancaria conta = new ContaBancaria("Ramon", 1000);
        Curso c = new Curso("Java Básico", 40);

        p.mostrarDados();
        prod.mostrarProduto();
        l.mostrarLivro();
        conta.mostrarSaldo();
        c.mostrarCurso();
    }
}
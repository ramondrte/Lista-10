public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarLivro() {
        System.out.println("\"" + titulo + "\" de " + autor);
    }
}
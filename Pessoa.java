public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Email: " + email);
    }
}
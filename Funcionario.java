public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibir() {
        System.out.println(nome + " ganha R$" + salario);
    }
}
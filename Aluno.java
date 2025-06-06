public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void apresentar() {
        System.out.println("Aluno: " + nome + ", Matrícula: " + matricula);
    }
}
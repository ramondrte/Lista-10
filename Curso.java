public class Curso {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + nome + ", Carga Horária: " + cargaHoraria + "h");
    }
}
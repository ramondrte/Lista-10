public class Animal {
    private String especie;
    private int idade;

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O " + especie + " emite um som.");
    }
}
public class Veiculo {
    private String modelo;
    private String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void exibir() {
        System.out.println("Modelo: " + modelo + ", Placa: " + placa);
    }
}
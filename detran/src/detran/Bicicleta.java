package detran;

public class Bicicleta extends Veiculo {
    public Bicicleta() {
        this("", 0, null);
    }

    public Bicicleta(String modelo, int anoFabricação, Motorista motorista) {
        super(modelo, anoFabricação, motorista);
    }

    @Override
    public String toString() {
        String info = "Passageiros: \n";
        for (Passageiros passageiro : this.passageiros) {
            info += passageiro.toString() + "\n";
        }
        return "\nBicicleta: " + modelo
                + " | Ano: "
                + anoFabricação + "\n"
                + motorista.toString() + "\n"
                + info;
    }
}

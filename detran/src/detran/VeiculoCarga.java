package detran;

public class VeiculoCarga extends Veiculo{
    protected double carga;

    public VeiculoCarga() {
        this("", 0, null, 0);
    }

    public VeiculoCarga(String modelo, int anoFabricação, Motorista motorista, double carga) {
        super(modelo, anoFabricação, motorista);
        this.carga = carga;
    }
    
    @Override
    public String toString() {
        String info = "Passageiros: \n";
        for (Passageiros passageiro : this.passageiros) {
        info += passageiro.toString() + "\n";
    }
        return "\nVeiculo de Carga: " + modelo 
        + " | Ano de Fabricação: " 
        + anoFabricação 
        + motorista.toString()
        + " | Carga: " + carga + "\n"
        + info;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
                  
}

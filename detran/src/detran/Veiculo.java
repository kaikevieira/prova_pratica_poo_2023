package detran;

import java.util.ArrayList;

public class Veiculo {
    private ArrayList<Passageiros> passageiros;
    protected String modelo;    
    protected int anoFabricação;
    protected Motorista motorista;

    public Veiculo(){
        this("", 0, null);
    }
    
    public Veiculo(String modelo, int anoFabricação, Motorista motorista) {
        this.modelo = modelo;
        this.anoFabricação = anoFabricação;
        this.motorista = motorista;
        this.passageiros = new ArrayList<>();
    }

    public void addPassageiro(Passageiros passageiro){
        this.passageiros.add(passageiro);
    }
    public ArrayList<Passageiros> getPassageiros() {
        return this.passageiros;
    }

    @Override
    public String toString() {
        String info = "Passageiros: \n";
        for (Passageiros passageiro : this.passageiros) {
        info += passageiro.toString() + "\n";
    }
        return "\nVeiculo: " + modelo 
        + "\nAno de Fabricação: " 
        + anoFabricação + "\n" 
        + motorista.toString() + "\n"
        + info;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricação() {
        return anoFabricação;
    }
    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }   
}
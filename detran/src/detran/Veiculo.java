package detran;

import java.util.ArrayList;

public class Veiculo {

    protected String modelo;    
    protected int anoFabricação;
    protected ArrayList<Passageiros> passageiros = new ArrayList<Passageiros>();
    protected Motorista motorista;

    Passageiros p1;
    
    public Veiculo(){
        this("", 0, null);
    }
    
    public Veiculo(String modelo, int anoFabricação, Motorista motorista) {
        this.modelo = modelo;
        this.anoFabricação = anoFabricação;
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        StringBuilder passageirosStr = new StringBuilder();
        for (Passageiros passageiros : passageiros){
            passageirosStr.append("\n- ").append(passageiros.toString());
        }
        return "\nVeiculo: " + modelo 
        + "\nanoFabricação: " 
        + anoFabricação  
        + "\npassageiros: " 
        + passageirosStr.toString() 
        + motorista.toString();
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
    public ArrayList<Passageiros> getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(ArrayList<Passageiros> passageiros) {
        this.passageiros = passageiros;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }   
}
package detran;

import java.util.ArrayList;

public class Acidente {

    ArrayList<Veiculo> veiculo;
    Passageiros passageiros;
    Rodovia rodovia;
    private int mes;
    private int qtdVitimas;

    public Acidente(){
        this(null, null, null, 0, 0);
    }
    
    public Acidente(ArrayList<Veiculo> veiculo, Passageiros passageiros, Rodovia rodovia, int mes, int qtdVitimas) {
        this.veiculo = veiculo;
        this.passageiros = passageiros;
        this.rodovia = rodovia;
        this.mes = mes;
        this.qtdVitimas = qtdVitimas;
    }
    public ArrayList<Veiculo> getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(ArrayList<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
    public Passageiros getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(Passageiros passageiros) {
        this.passageiros = passageiros;
    }
    public Rodovia getRodovia() {
        return rodovia;
    }
    public void setRodovia(Rodovia rodovia) {
        this.rodovia = rodovia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getQtdVitimas() {
        return qtdVitimas;
    }
    public void setQtdVitimas(int qtdVitimas) {
        this.qtdVitimas = qtdVitimas;
    }
}

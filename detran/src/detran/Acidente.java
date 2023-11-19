package detran;

import java.util.ArrayList;

public class Acidente {

    ArrayList<Veiculo> veiculo;
    Passageiros passageiros;
    Rodovia rodovia;
    private int mes;
    private int qtdVitimas;
    private int qtdFatal = 0;
    private int qtdFeridos = 0;

    public Acidente() {
        this(null, 0, 0);
    }

    public Acidente(Rodovia rodovia, int mes, int qtdVitimas) {
        this.veiculo = new ArrayList<>();
        this.rodovia = rodovia;
        this.mes = mes;
        this.qtdVitimas = qtdVitimas;
    }

    @Override
    public String toString() {

        String infoVeiculos = "Veiculos envolvidos: \n";
        for (Veiculo veiculo : this.veiculo) {
            infoVeiculos += veiculo.toString() + "\n";
        }
        return rodovia + "\nMes: " + mes
                + "\nVitimas Fatais: " + qtdFatal 
                + "\nVitimas Feridas: " + qtdFeridos
                + "\n" + infoVeiculos;
    }
    public int contagemFataisEFeridos() {
        for (Veiculo veiculo : veiculo) {
            for (Passageiros passageiro : veiculo.getPassageiros()) {
                if (passageiro.isFatal()) {
                    qtdFatal++;
                } else {
                    qtdFeridos++;
                }
            }
            if (veiculo.getMotorista().isFatal()) {
                qtdFatal++;
            } else {
                qtdFeridos++;
            }
        }
        return qtdFatal;
    }

    public int getQtdFeridos() {
        return qtdFeridos;
    }

    public void setQtdFeridos(int qtdFeridos) {
        this.qtdFeridos = qtdFeridos;
    }

    public void addVeiculos(Veiculo veiculo) {
        this.veiculo.add(veiculo);
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
        if (mes >= 0 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. Insira um número inteiro de 0 a 12.");
        }
    }

    public int getQtdVitimas() {
        return qtdVitimas;
    }

    public void setQtdVitimas(int qtdVitimas) {
        this.qtdVitimas = qtdVitimas;
    }

    public int getQtdFatal() {
        return qtdFatal;
    }

    public void setQtdFatal(int qtdFatal) {
        this.qtdFatal = qtdFatal;
    }
}

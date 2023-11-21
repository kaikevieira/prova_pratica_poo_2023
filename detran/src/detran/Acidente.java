package detran;

import java.util.ArrayList;

public class Acidente {
    private ArrayList<Veiculo> veiculos;
    private Rodovia rodovia;
    private int mes;
    private int qtdFatal = 0;
    private int qtdFeridos = 0;

    public Acidente() {
        this(null, 0);
    }

    public Acidente(Rodovia rodovia, int mes) {
        this.veiculos = new ArrayList<>();
        this.rodovia = rodovia;
        this.mes = mes;
    }

    public String toString() {
        StringBuilder infoVeiculos = new StringBuilder("\nVeiculos envolvidos:\n");
        for (Veiculo veiculo : this.veiculos) {
            infoVeiculos.append(veiculo.toString()).append("\n");
        }
        return rodovia + " | Mes: " + mes
                + " | Vitimas Fatais: " + qtdFatal
                + " | Vitimas Feridas: " + qtdFeridos
                + "\n" + infoVeiculos;
    }

    public int contagemFataisEFeridos() {
        for (Veiculo veiculo : veiculos) {
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

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
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

    public int getQtdFatal() {
        return qtdFatal;
    }

    public void setQtdFatal(int qtdFatal) {
        this.qtdFatal = qtdFatal;
    }
}

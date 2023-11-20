package detran;

import java.util.ArrayList;

public class Acidente {

    private ArrayList<Acidente> acidentes = new ArrayList<>();
    private ArrayList<Veiculo> veiculo;
    private ArrayList<Motorista> qtdEmbriagados = new ArrayList<>();
    private Passageiros passageiros;
    private Motorista motorista;
    private Rodovia rodovia;
    private int mes;
    private int qtdFatal = 0;
    private int qtdFeridos = 0;

    public Acidente() {
        this(null, 0);
    }

    public Acidente(Rodovia rodovia, int mes) {
        this.veiculo = new ArrayList<>();
        this.rodovia = rodovia;
        this.mes = mes;
        acidentes.add(this);
        

    }

    @Override
    public String toString() {

        String infoVeiculos = "\nVeiculos envolvidos: \n";
        for (Veiculo veiculo : this.veiculo) {
            infoVeiculos += veiculo.toString() + "\n";
        }
        return rodovia + " | Mes: " + mes
                + " | Vitimas Fatais: " + qtdFatal
                + " | Vitimas Feridas: " + qtdFeridos
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

    public String listaAcidenteEmbriagados() {
        StringBuilder lista = new StringBuilder();

        for (Acidente acidente : acidentes) {
            boolean embriagado = false;

            for (Veiculo veiculo : acidente.getVeiculo()) {
                if (veiculo.getMotorista().isEmbriagado()) {
                    embriagado = true;
                    break;
                }
            }

            if (embriagado) {
                lista.append(acidente.getRodovia().toString()).append(" | Mes: ")
                        .append(acidente.getMes()).append(" | Vitimas Fatais: ")
                        .append(acidente.getQtdFatal()).append(" | Vitimas Feridas: ")
                        .append(acidente.getQtdFeridos()).append("\n\nVeiculos envolvidos:\n");

                for (Veiculo veiculo : acidente.getVeiculo()) {
                    lista.append(veiculo.toString()).append("\n");
                }

                lista.append("\n");
            }
        }

        return lista.toString();
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

    public int getQtdFatal() {
        return qtdFatal;
    }

    public void setQtdFatal(int qtdFatal) {
        this.qtdFatal = qtdFatal;
    }

    public ArrayList<Motorista> getQtdEmbriagados() {
        return qtdEmbriagados;
    }

    public void setQtdEmbriagados(ArrayList<Motorista> qtdEmbriagados) {
        this.qtdEmbriagados = qtdEmbriagados;

    }

    public ArrayList<Acidente> getAcidentes() {
        return acidentes;
    }

    public void setAcidentes(ArrayList<Acidente> acidentes) {
        this.acidentes = acidentes;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}

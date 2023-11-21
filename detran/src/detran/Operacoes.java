package detran;

import java.util.ArrayList;
import java.util.List;

public class Operacoes {
    private static List<Rodovia> rodovias = new ArrayList<>();
    private static List<Acidente> acidentesRegistrados = new ArrayList<>();
    private static List<Veiculo> veiculos = new ArrayList<>();

    public static void adicionarRodovia(Rodovia rodovia) {
        rodovias.add(rodovia);
    }
    public static void adicionarVeiculo(Veiculo veiculo) { 
        veiculos.add(veiculo);
    }
    public static void registrarAcidente(Acidente acidente) {
        acidentesRegistrados.add(acidente);
        acidente.getRodovia().adicionarAcidente(acidente);
    }

    public static void acidentesEmbriagados() {
        StringBuilder acidentesEmbriagados = new StringBuilder("Acidentes com motoristas embriagados:\n");
        for (Acidente acidente : acidentesRegistrados) {
            boolean embriagadoNoAcidente = false;

            for (Veiculo veiculo : acidente.getVeiculos()) {
                if (veiculo.getMotorista().isEmbriagado()) {
                    embriagadoNoAcidente = true;
                    break;
                }
            }

            if (embriagadoNoAcidente) {
                acidentesEmbriagados.append(acidente.toString()).append("\n");
            }
        }
        System.out.println(acidentesEmbriagados.toString());
    }
    public static void acidentesPericulosidade() {
        int baixo = 0, medio = 0, alto = 0;
    
        for (Rodovia rodovia : rodovias) {
            String periculosidade = rodovia.getPericulosidade();
    
            switch (periculosidade) {
                case "BAIXA":
                    baixo++;
                    break;
                case "MÉDIA":
                    medio++;
                    break;
                case "ALTA":
                    alto++;
                    break;
                default:
                    break;
            }
        }
    
        System.out.println("Quantidade de acidentes por nível de periculosidade:");
        System.out.println("Baixa: " + baixo + " acidente(s)");
        System.out.println("Média: " + medio + " acidente(s)");
        System.out.println("Alta: " + alto + " acidente(s)");
    }
    public static void veiculosCargaAcidentados() {
        for (Acidente acidente : acidentesRegistrados) {
            for (Veiculo veiculo : acidente.getVeiculos()) {
                if (veiculo instanceof VeiculoCarga) {
                    StringBuilder result = new StringBuilder();
                    result.append(veiculo.toString());
                    result.append("\n");
                    System.out.println(result.toString());
                }
            }
        }
    }
}
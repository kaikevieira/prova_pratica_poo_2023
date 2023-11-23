package detran;

import java.util.ArrayList;


public class Operacoes {
    private static ArrayList<Rodovia> rodovias = new ArrayList<Rodovia>();
    private static ArrayList<Acidente> acidentesRegistrados = new ArrayList<Acidente>();
    private static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

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

        for (Acidente acidentesRegistrados : acidentesRegistrados) {

            switch (acidentesRegistrados.getRodovia().getPericulosidade()) {
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
        for (Acidente acidentesRegistrados : acidentesRegistrados) {
            for (Veiculo veiculo : acidentesRegistrados.getVeiculos()) {
                if (veiculo instanceof VeiculoCarga) {
                    StringBuilder result = new StringBuilder();
                    result.append(veiculo.toString());
                    result.append("\n");
                    System.out.println(result.toString());
                }
            }
        }
    }

    public static void contagemFataisPorRodovia() {
        int maxCount = 0;
        Rodovia rodoviaComMaisAcidentesFatais = null;

        for (Rodovia rodovia : rodovias) {
            int count = 0;
            for (Acidente acidente : rodovia.getAcidentes()) {
                if (acidente.contagemFataisEFeridos() > 0) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                rodoviaComMaisAcidentesFatais = rodovia;
            }
        }
        if (rodoviaComMaisAcidentesFatais != null) {
            System.out.println("Rodovia com mais acidentes fatais: " + rodoviaComMaisAcidentesFatais.toString() + " | "
                    + "Quantidade de Acidentes Fatais: " + maxCount);
        }
    }

    public static void contagemMaisAcidentesBicicletas() {
        int maxCount = 0;
        Rodovia rodoviaComMaisAcidentes = null;

        for (Rodovia rodovia : rodovias) {
            int count = 0;
            for (Acidente acidente : rodovia.getAcidentes()) {
                for (Veiculo veiculo : acidente.getVeiculos()) {
                    if (veiculo instanceof Bicicleta) {
                        count++;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
                rodoviaComMaisAcidentes = rodovia;
            }
        }

        if (rodoviaComMaisAcidentes != null) {
            System.out.println("Rodovia com mais acidentes com bicicletas: " + rodoviaComMaisAcidentes.toString());
        }
    }
    public static void contagemVeiculosNovos() {
        int count = 0;
        for(Acidente acidentesRegistrados : acidentesRegistrados) {
            for(Veiculo veiculo : acidentesRegistrados.getVeiculos()) {
                if(veiculo.getAnoFabricação() >= 2013) {
                    count ++;
                }
            }
        }System.out.println("Quantidade de acidentes de veiculos novos (A partir de 2013): " + count);
    }
    public static void rodoviaComAcidentesCarnaval() {
        System.out.println("Rodovias com acidentes no carnaval:");
        for(Rodovia rodovia : rodovias) {
            for(Acidente acidentesRegistrados : rodovia.getAcidentes()) {
                if(acidentesRegistrados.getMes() == 02) {
                    System.out.println(rodovia.toString());
                }
                break;
            }
        }
    }
}
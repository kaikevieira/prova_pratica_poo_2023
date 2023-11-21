package detran;

import java.util.ArrayList;
import java.util.List;

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
    public static void acidentesBicicleta() {
    	int count = 0;
        for (Acidente acidentesRegistrados : acidentesRegistrados) {
        	for (Veiculo veiculo : acidentesRegistrados.getVeiculos()) {
                if (veiculo instanceof Bicicleta) {
                	count++;
                }
            }     	
        }
        System.out.println("Quantidade de acidentes envolvendo bicicletas: " + count);
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
        for(Rodovia rodovia : rodovias) {
            int count = 0;
            for(Acidente acidente : rodovia.getAcidentes()) {
                if(acidente.contagemFataisEFeridos() > 0) {
                    count++;
                }
            }
            System.out.println(rodovia.toString() + " | " + "Quantidade de Acidentes Fatais: " + count);
        }
    }
}
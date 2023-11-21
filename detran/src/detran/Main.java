package detran;
public class Main {
    public static void main(String[] args) {
        Rodovia rodovia1 = new Rodovia("BR-101", "BAIXA");
        Rodovia rodovia2 = new Rodovia("SC-190", "BAIXA");
        Rodovia rodovia3 = new Rodovia("SC-198", "ALTA");
        Rodovia rodovia4 = new Rodovia("SC-480", "MÉDIA");
        Rodovia rodovia5 = new Rodovia("SC-489", "MÉDIA");
        Acidente acidente1 = new Acidente(rodovia1, 10);
        Acidente acidente2 = new Acidente(rodovia2, 12);
        Acidente acidente3 = new Acidente(rodovia3, 02);
        Acidente acidente4 = new Acidente(rodovia3, 02);
        Acidente acidente5 = new Acidente(rodovia4, 02);
        Veiculo veiculo1 = new Veiculo("Corsa", 2022, new Motorista("João", 35, "Masculino", true, 0.07));
        Bicicleta b1 = new Bicicleta("Caloi", 2022, new Motorista("Kaike", 48, "Masculino", true, 0.10));
        Bicicleta b2 = new Bicicleta("Caloi", 2022, new Motorista("Kaike", 48, "Masculino", true, 0.10));
        Bicicleta b3 = new Bicicleta("Caloi", 2022, new Motorista("Kaike", 48, "Masculino", true, 0.10));
        Passageiros passageiro1 = new Passageiros("Yunathan", 22, "Masculino", false);
        VeiculoCarga c1 = new VeiculoCarga("Cargo0", 2012, new Motorista("Kaike", 21, "Masculino", false, 0.08), 25000);
        VeiculoCarga c3 = new VeiculoCarga("Cargo2", 2012, new Motorista("Kaike", 21, "Masculino", false, 0.08), 25000);
        veiculo1.addPassageiro(passageiro1);
        acidente1.addVeiculo(veiculo1);
        acidente2.addVeiculo(veiculo1);
        acidente1.addVeiculo(c1);
        acidente2.addVeiculo(c3);
        acidente3.addVeiculo(b1);
        acidente4.addVeiculo(b2);
        acidente5.addVeiculo(b3);
        
        rodovia1.adicionarAcidente(acidente1);
        rodovia2.adicionarAcidente(acidente3);
        rodovia2.adicionarAcidente(acidente4);
        rodovia1.adicionarAcidente(acidente5);
        rodovia5.adicionarAcidente(acidente3);
        rodovia5.adicionarAcidente(acidente3);
        
        Operacoes.adicionarRodovia(rodovia5);
        Operacoes.adicionarRodovia(rodovia1);
        Operacoes.adicionarRodovia(rodovia2);
        Operacoes.adicionarVeiculo(veiculo1);
        Operacoes.registrarAcidente(acidente3);
        Operacoes.registrarAcidente(acidente4);
        Operacoes.registrarAcidente(acidente5);
        Operacoes.registrarAcidente(acidente5);
//        Operacoes.acidentesPericulosidade();
        Operacoes.contagemFataisPorRodovia();
    }
}

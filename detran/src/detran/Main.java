package detran;

public class Main {
    public static void main(String[] args) {
        Rodovia rodovia1 = new Rodovia("BR-101");
        Acidente acidente1 = new Acidente(rodovia1, 10);
        Veiculo veiculo1 = new Veiculo("Corsa", 2022, new Motorista("João", 35, "Masculino",true, 0.07));
        Passageiros passageiro1 = new Passageiros("Yunathan", 22, "Masculino", false);
        veiculo1.addPassageiro(passageiro1);
        acidente1.addVeiculos(veiculo1);
        acidente1.contagemFataisEFeridos();
        rodovia1.adicionarAcidente(acidente1);
        

        System.out.println(acidente1.toString());
        
        String acidentesEmbriagados = acidente1.listaAcidenteEmbriagados();
        System.out.println("Acidentes com motoristas embriagados:");
        System.out.println(acidentesEmbriagados);
    }
    
}

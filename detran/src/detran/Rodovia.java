package detran;

public class Rodovia {

    private String sigla;
    private String periculosidade;
    private Acidente acidente;

    public Rodovia() {
        this("");
    }
    public Rodovia(String sigla) {
        this.sigla = sigla;
    }
    
    @Override
    public String toString() {
        return "Rodovia: " + getSigla() + " | periculosidade: " + getPericulosidade()+ " | Quantidade de acidentes:  " + acidente.getAcidentes().size();
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    } 
    //5 ou menos = baixa / 6 a 15 = media / mais que 15 = alta
    public String getPericulosidade() {
        if (acidente.getAcidentes().size() <= 5) {
            periculosidade = "BAIXA"; 
        } else if (acidente.getAcidentes().size() > 5 && acidente.getAcidentes().size() <= 15) {
            periculosidade = "MÉDIA";
        } else { 
            periculosidade = "AlTA";
        }  
        return periculosidade;
    }
    public void setPericulosidade(String periculosidade) { 
        this.periculosidade = periculosidade;
    }
}
    


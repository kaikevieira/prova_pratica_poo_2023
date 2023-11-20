package detran;

import java.util.ArrayList;
import java.util.List;

public class Rodovia {
    private String sigla;
    private String periculosidade;
    private Acidente acidente;
    private List<Acidente> acidentes;

    public Rodovia() {
        this("");
    }

    public Rodovia(String sigla) {
        this.sigla = sigla;
        this.acidente = new Acidente(this, 0);
        this.acidentes = new ArrayList<>();
    }
        
    @Override
    public String toString() {
        return "Rodovia: " + sigla + " | periculosidade: " + periculosidade;
    }

    public void adicionarAcidente(Acidente acidente) {
        this.acidentes.add(acidente);
        this.periculosidade = getPericulosidade();
    }

    public int contarAcidentes() {
        return acidentes.size();
    }

    public String getSigla() {
        return sigla;
    }
    public String getPericulosidade() {
        int quantidadeAcidentes = acidentes.size();
        if (quantidadeAcidentes <= 5) {
            periculosidade = "BAIXA"; 
        } else if (quantidadeAcidentes > 5 && quantidadeAcidentes <= 15) {
            periculosidade = "MÉDIA";
        } else { 
            periculosidade = "ALTA";
        }  
        return periculosidade;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setPericulosidade(String periculosidade) {
        this.periculosidade = periculosidade;
    }

    public Acidente getAcidente() {
        return acidente;
    }

    public void setAcidente(Acidente acidente) {
        this.acidente = acidente;
    }

    public List<Acidente> getAcidentes() {
        return acidentes;
    }

    public void setAcidentes(List<Acidente> acidentes) {
        this.acidentes = acidentes;
    }
}
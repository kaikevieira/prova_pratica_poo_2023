package detran;

import java.util.ArrayList;
import java.util.List;

public class Rodovia {
    private String sigla;
    private String periculosidade;
    private Acidente acidente;
    private List<Acidente> acidentes;

    public Rodovia() {
        this("", "");
    }

    public Rodovia(String sigla, String periculosidade) {
        this.sigla = sigla;
        this.periculosidade = periculosidade;
        this.acidente = new Acidente(this, 0);
        this.acidentes = new ArrayList<>();
    }
        
    @Override
    public String toString() {
        return "Rodovia: " + sigla + " | periculosidade: " + periculosidade;
    }
    
    public void adicionarAcidente(Acidente acidente) {
        this.acidentes.add(acidente);
    }

    public int contarAcidentes() {
        return acidentes.size();
    }

    public String getSigla() {
        return sigla;
    }
    public String getPericulosidade() {
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
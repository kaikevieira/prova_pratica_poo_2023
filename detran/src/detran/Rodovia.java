package detran;

public class Rodovia {

    private String sigla;
    private String periculosidade;
    private int qtdAcidente;

    public Rodovia() {
        this("", 0);
    }
    public Rodovia(String sigla, int qtdAcidente) {
        this.sigla = sigla;
        this.qtdAcidente = qtdAcidente;
    }
    
    @Override
    public String toString() {
        return "Rodovia: " + getSigla() + ", periculosidade: " + getPericulosidade()+ ", Quantidade de acidentes:  " +getQtdAcidente();
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    } 
    //5 ou menos = baixa / 6 a 15 = media / mais que 15 = alta
    public String getPericulosidade() {
        if (qtdAcidente <= 5) {
            periculosidade = "BAIXA"; 
        } else if (qtdAcidente > 5 && qtdAcidente <= 15) {
            periculosidade = "MEDIA";
        } else { 
            periculosidade = "AlTA";
        }  
        return periculosidade;
    }
    public void setPericulosidade(String periculosidade) { 
        this.periculosidade = periculosidade;
    }
    public int getQtdAcidente() {
        return qtdAcidente;
    }
    public void setQtdAcidente(int qtdAcidente) {
        this.qtdAcidente = qtdAcidente;
    }
    
}

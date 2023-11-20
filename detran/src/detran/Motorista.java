package detran;

public class Motorista extends Pessoa{
    
    private double nivelAlcool;
    private boolean embriagado;

    
    public Motorista(double nivelAlcool) {
        this.nivelAlcool = nivelAlcool;
    }

    public Motorista(String nome, int idade, String sexo, boolean fatal,double nivelAlcool) {
        super(nome, idade, sexo, fatal);
        this.nivelAlcool = nivelAlcool;
    }

    
    @Override
    public String toString() {
        return "\nMotorista: " + getNome() + " | Nivel alcool: " + nivelAlcool + " | embriagado: " + isEmbriagado()
        + " | Fatal: " + isFatal();
    }

    public double getNivelAlcool() {
        return nivelAlcool;
    }

    public void setNivelAlcool(double nivelAlcool) {
        this.nivelAlcool = nivelAlcool;
    }

    public boolean isEmbriagado() {
        if (getNivelAlcool() > 0.06) {
          embriagado = true;
        } else {
            embriagado = false;
        }
        return embriagado;
    }

    public void setEmbriagado(boolean embriagado) {
        this.embriagado = embriagado;
    }

    
}

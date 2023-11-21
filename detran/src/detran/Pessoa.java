package detran;

public class Pessoa {
	
    private String nome;
    private int idade;
    private String sexo;
    private boolean fatal;

    public Pessoa(){
        this("", 0, "", false);
    }

    public Pessoa(String nome, int idade, String sexo, boolean fatal) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.fatal = fatal;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { 
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public boolean isFatal() {
        return fatal;
    }
    public void setFatal(boolean fatal) {
        this.fatal = fatal;
    }

    
}

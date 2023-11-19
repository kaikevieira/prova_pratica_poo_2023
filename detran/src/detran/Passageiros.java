package detran;

public class Passageiros extends Pessoa{

    Passageiros(){
        this("", 0, "", false);
    }

    Passageiros(String nome, int idade, String sexo, boolean fatal) {
        super(nome, idade, sexo, fatal);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Sexo: " + getSexo()
        + "\nFatal: " + isFatal();
    }


    
    
}

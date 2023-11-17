package detran;


public class Main {
    public static void main(String[] args) {
        Rodovia r = new Rodovia("sc-190", 10);

        System.out.println(r.toString());
        
        Motorista m = new Motorista("Joao", 19, "Masculino", 0.04);
        
        Veiculo v = new Veiculo("Siena", 2009, m);
        System.out.println(v.toString());
        

    }
    
    
}

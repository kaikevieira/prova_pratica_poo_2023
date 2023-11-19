package detran;

public class Main {
    public static void main(String[] args) {

        Rodovia r = new Rodovia("sc-190", 10);
        //System.out.println(r.toString());
        Motorista m1 = new Motorista("Joao", 19, "Masculino",true, 0.04);
        Motorista m2 = new Motorista("ANa Beatriz", 20, "Feminino",true, 0.07);
        Passageiros p1 = new Passageiros("Kaike", 19, "Masculino",false);
        Passageiros p2 = new Passageiros("Kaike", 19, "Masculino",false);
        Passageiros p3 = new Passageiros("Kaike", 19, "Masculino",true);
        Veiculo v1 = new Veiculo("Siena", 2009, m1);
        Veiculo v2 = new Veiculo("Ferrari", 2021, m2);
        v1.addPassageiro(p1);
        v1.addPassageiro(p2);
        v2.addPassageiro(p3);
        //System.out.println(v.toString());
        Acidente a1 = new Acidente(r, 2, 3);
        a1.addVeiculos(v1);
        a1.addVeiculos(v2);
        a1.contagemFataisEFeridos();
        System.out.println(a1.toString());

    }
}

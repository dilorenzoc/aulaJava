package aulateste;

public class AulaTeste {

    public static void main(String[] args) {
    Veiculo v1 = new Veiculo();
    v1.Fabricante = "GM";
    v1.Combustivel = "Alcool";
    v1.QdePortas = 4;
    v1.QdeCombutivel = 50; 
    v1.ligar();
    v1.status();
    }
    
}

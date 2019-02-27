
package aulateste;

public class Veiculo {
    
    String Fabricante;
    String Combustivel;
    int QdePortas;
    int QdeCombutivel;
    
    void status(){
       System.out.println("Fabricante: "+this.Fabricante);
       System.out.println("Tipo de combustível: "+this.Combustivel);
        System.out.println("Quantidade de portas: "+this.QdePortas);
        System.out.println("Quantidade de combustivel "+this.QdeCombutivel +" litros");
    }
    void ligar(){
        System.out.println("Carro ligado");
    }
    void desligar(){
        System.out.println("Carro desligado");
    }   
}

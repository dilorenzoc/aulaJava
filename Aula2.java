package aula2;
public class Aula2 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 30; 
        //c1.tampada = true;
        c1.ponta05();
        c1.status();
        c1.destampar();
        c1.rabiscar();
        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println(" ");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "Rosa";
        c2.carga = 100;
        c2.tampar();
        c2.ponta09();
        c2.status();
        c2.rabiscar();
    }
    
}

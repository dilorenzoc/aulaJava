package aula2;
public class Caneta {
    public String modelo;
    public String cor;
    //protected float ponta;
    private float ponta;
    protected int carga;
    private boolean tampada;
   
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Sua cor: " + this.cor);
        System.out.println("Está tampada: " + this.tampada);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
    }
    public void rabiscar(){
        if(this.tampada == true){
        System.out.println("ERRO: não posso rabiscar.");
        }
        else{
            System.out.println("Estou rabiscando.");
            this.carga = this.carga - 5;
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void ponta05 (){
        this.ponta = 0.5f;
    }
    public void ponta09 (){
        this.ponta = 0.9f;
    }
}

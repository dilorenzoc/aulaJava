package aula12;

public class peixe extends animal {
    private String corEscama;
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar (){
        System.out.println("Comendo substancias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Glub Glub");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
 }

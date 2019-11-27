public class Passagem{

    private String local;
    public  String destino;
    private int preco = 0;
    private int npassageiros;
    private String classe;

    public Passagem(String local, String destino, int npassageiros, String classe){
        
        this.local = local;
        this.destino = destino;
        this.npassageiros = npassageiros;
        this.classe = classe;
    }
    
    public String getLocal(){
        return this.local;
    }
    /*public String setLocal(String l){
        this.local = l; 
    }*/
    public String getDestino(){
        return this.destino;
    }
    /*public String setDestino(String d){
        this.destino = d; 
    }*/
    public int getNpassageiros(){
        return this.npassageiros;
    }
    /*public int setNpassageiros(int np){
        this.npassageiros = np; 
    }*/
    public String getClasse(){
        return this.classe;
    }
    public int getPreco(){
        return this.preco;
    }
    /*public String setclasse(String c){
        this.classe = c; 
    }*/
    /*public int setPreco(int p){
        this.preco = p;
    }*/
    public void custo(int p){
        this.preco += p;
    }
    
    
    public void status(){
        System.out.println(getDestino());
        System.out.println(getLocal());
        System.out.println(getClasse());
        System.out.println(getNpassageiros());
    }
      
} 

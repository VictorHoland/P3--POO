public class Conta{
    
    public String nome;
    private String senha;
    public int cpf;
    private Passagem passagem;
     
    public Conta(String nome, String senha, int cpf){
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.passagem = null;
    }
    
    public void setPassagem(Passagem passagem){
        this.passagem = passagem;
    }
    
    public String getNome(){
        return nome;
    }
    /*public String setNome(String n){
        this.nome = n;
    }*/
    public String getSenha(){
        return senha;
    }
    /*public String setSenha(String s){
        this.senha = s;
    }*/
    public int getCpf(){
        return cpf;
    }
    /*public int setCpf(int c){
        this.cpf = c;
    }*/
    public Passagem getPassagem()
    {
        return this.passagem;
    }
    public void status(){
        System.out.println(getNome());
        System.out.println(getCpf());
    }
}

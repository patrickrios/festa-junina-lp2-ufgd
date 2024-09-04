package entidade;

public class Salgado extends Produto{
    private String Massa;
    
    public enum Recheio{ Carne, Frango, Queijo, Catupiry, Requeijão, Outro};
    private Recheio Recheio;
    
    public enum Cozimento {ASSADO, FRITO};
    private Cozimento Cozimento;

    public Salgado(Integer Sequencial, String Nome, String Preço, int Quantidade, Recheio Recheio, String Massa, Cozimento cozimento) {
        super(Sequencial,Nome,Preço,Quantidade);
        this.Recheio = Recheio;
        this.Massa = Massa;
        this.Cozimento = cozimento;
    }
    
    public Salgado(String Nome, String Preço, int Quantidade, Recheio Recheio, String Massa, Cozimento cozimento) {
        super(Nome,Preço,Quantidade);
        this.Recheio = Recheio;
        this.Massa = Massa;
        this.Cozimento = cozimento;
    }
    
    public Salgado(Integer sequencial, String nome, Recheio recheio){
        super(sequencial, nome);
        this.Recheio = recheio;
    }
    
    @Override
    public String toString(){
        return "["+getSequencial()+"] "+getNome()+" de ("+Recheio.name()+") -- Salgado";
    }
    
    public String toStringFull(){
        return getNome()+" ("+Recheio.toString()+", "+Cozimento.toString()+") -- Salgado";
    }
    
    @Override
    public Salgado getVisão(){
        return new Salgado(getSequencial(), getNome(), Recheio);
    }

    public String getMassa() {
        return Massa;
    }

    public void setRecheio(Recheio recheio){
        this.Recheio = recheio;
    }
    public Recheio getRecheio() {
        return Recheio;
    }
    
    public void setCozimento(Cozimento cozimento){
        this.Cozimento = cozimento;
    }

    public Cozimento getCozimento() {
        return this.Cozimento;
    }

    
}

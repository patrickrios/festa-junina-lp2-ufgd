package entidade;

public class Doce extends Produto{
    private String Sabor;
    private Recheio Recheio;
    public enum Recheio {
        CHOCOLATE,
        MORANGO,
        COCO,
        CARAMELO,
        BAUNILHA,
        NENHUM
    };

    public Doce(Integer Sequencial, String Nome, String Preço, int Quantidade, String Sabor, Recheio Recheio) {
        super(Sequencial,Nome,Preço,Quantidade);
        this.Sabor = Sabor;
        this.Recheio = Recheio;
    }
    
    public Doce(String Nome, String Preço, int Quantidade, String Sabor, Recheio Recheio) {
        super(Nome,Preço,Quantidade);
        this.Sabor = Sabor;
        this.Recheio = Recheio;
    }
    
    public Doce(Integer sequencial, String nome, String sabor){
        super(sequencial, nome);
        this.Sabor = sabor;
    }
    
    @Override
    public String toString(){
        return "["+getSequencial()+"] "+getNome()+" "+saborVisão()+" -- Doce";
    }
    
    public String toStringFull(){
        return getNome() + " ("+getSabor()+", "+getRecheio().toString()+") -- Doce";
    }
    
    @Override
    public Doce getVisão(){
        return new Doce(getSequencial(), getNome(), Sabor);
    }
    
    public String saborVisão(){
        if(Sabor.isEmpty())
            return "";
        else
            return "("+Sabor+")";
    }

    public void setSabor(String sabor){
        this.Sabor = sabor;
    }
    public String getSabor() {
        return Sabor;
    }

    public Recheio getRecheio() {
        return Recheio;
    }
}
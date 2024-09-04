package entidade;

public class Bebida extends Produto{
    private int VolumeEmML;
    private String Sabor;
    private boolean Alcóolico;
    private boolean Gaseificada;

    public Bebida(
        Integer Sequencial, 
        String Nome,
        String Preço,
        int Quantidade,
        int VolumeEmML,
        String Sabor,
        boolean Alcóolico,
        boolean Gaseificada
    ){
        super(Sequencial, Nome, Preço, Quantidade);
        this.VolumeEmML = VolumeEmML;
        this.Sabor = Sabor;
        this.Alcóolico = Alcóolico;
        this.Gaseificada = Gaseificada;
    }
    
    public Bebida(
        String Nome,
        String Preço,
        int Quantidade,
        int VolumeEmML,
        String Sabor,
        boolean Alcóolico,
        boolean Gaseificada
    ){
        super(Nome, Preço, Quantidade);
        this.VolumeEmML = VolumeEmML;
        this.Sabor = Sabor;
        this.Alcóolico = Alcóolico;
        this.Gaseificada = Gaseificada;
    }
    
    public Bebida(Integer sequencial, String nome, String sabor){
        super(sequencial,nome);
        this.Sabor = sabor;
    }
    
    @Override
    public String toString(){
        return "["+getSequencial()+"] "+getNome()+" "+saborVisão()+" -- Bebida";
    }
    
    public String toStringFull(){
        return "["+getSequencial()+"] "+
            getNome()+
            " ("+getSabor()+
            ", "+getVolumeEmML()+
            " ml, "+comGas()+
            ", "+comAlcool()+
            ") -- Bebida";
    }
    
    @Override
    public Bebida getVisão(){
        return new Bebida(getSequencial(), getNome(), Sabor);
    }
    
    public String saborVisão(){
        if( Sabor.isEmpty() || Sabor.equals(""))
            return "";
        else
            return "("+Sabor+")";
    }

    public int getVolumeEmML() {
        return VolumeEmML;
    }

    public void setSabor(String sabor){
        this.Sabor = sabor;
    }
    
    public String getSabor() {
        return Sabor;
    }

    public boolean isAlcóolico() {
        return Alcóolico;
    }

    public boolean isGaseificada() {
        return Gaseificada;
    }
    
    private String comGas(){
        String com = Gaseificada ? "Com" : "Sem";
        return com + " gás";
    }
    
    private String comAlcool(){
        return Alcóolico ? "Alcóolica" : "Não alcóolica";
    }
}
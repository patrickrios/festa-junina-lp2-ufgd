package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Produto {
    private int Sequencial;
    private String Nome;
    private int Quantidade;
    private float Preço = 0.0f;

    public Produto(String Nome, String Preço, int Quantidade) {
        this.Nome = Nome;
        Preço = Preço.replace(",", ".");
        this.Preço = Float.parseFloat(Preço);
        this.Quantidade = Quantidade;
    }
    
    public Produto(Integer Sequencial,  String Nome, String Preço, int Quantidade) {
        this.Sequencial = Sequencial;
        this.Nome = Nome;
        Preço = Preço.replace(",", ".");
        this.Preço = Float.parseFloat(Preço);
        this.Quantidade = Quantidade;
    }
    
    public Produto(int Sequencial, String Nome){
        this.Sequencial = Sequencial;
        this.Nome = Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    public String getNome() {
        return Nome;
    }
    public float getPreço() {
        return Preço;
    }
    public int getQuantidade(){
        return Quantidade;
    }
    
    public String getIdentificadorSequencial(){
        return ""+Sequencial;
    }
    
    public int getSequencial(){
        return Sequencial;
    }
    
    public void setSequencial(int sequencial){
        this.Sequencial = sequencial;
    }
    
    @Override
    public String toString(){
        return "["+Sequencial+"] " +Nome;
    }
    
    public String toStringFull(){
        return "";
    }
    
    public static String inserirProduto(Produto produto){
        String sql = "INSERT INTO produto (Nome, Preço, Quantidade) VALUES (?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, produto.getNome());
            comando.setFloat(2, produto.getPreço());            
            comando.setInt(3, produto.getQuantidade());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na inserção do Salgado no BD";
        }
        //Trata salgado
        int sequencial = Produto.últimoSequencial();
        if( produto instanceof Salgado){
            Salgado produto_salgado = (Salgado)produto;
            sql = "INSERT INTO salgado(Massa,Recheio,Cozimento,SalgadoId) VALUES (?,?,?,?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, produto_salgado.getMassa());
                comando.setString(2, produto_salgado.getRecheio().name());
                comando.setString(3, produto_salgado.getCozimento().name());
                comando.setInt(4, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na inserção do Salgado no BD";
            }
        }else if( produto instanceof Bebida){
            Bebida produto_bebida = (Bebida)produto;
            sql = "INSERT INTO bebida(VolumeEmML, Sabor, Alcoolico, Gaseificada, BebidaId) VALUES(?,?,?,?,?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, produto_bebida.getVolumeEmML());
                comando.setString(2, produto_bebida.getSabor());
                comando.setBoolean(3, produto_bebida.isAlcóolico());                
                comando.setBoolean(4, produto_bebida.isGaseificada());
                comando.setInt(5, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na inserção do Salgado no BD";
            }
        }else if(produto instanceof Doce){
            Doce produto_doce = (Doce)produto;
            sql = "INSERT INTO doce(Sabor, Recheio, DoceId) VALUES(?,?,?)";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, produto_doce.getSabor());
                comando.setString(2, produto_doce.getRecheio().name());
                comando.setInt(3, sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na inserção do Salgado no BD";
            }
        }
        return null;
    }
    
    public static Produto buscarProduto(int sequencial) {
        String sql = "SELECT * FROM produto where Sequencial = ?";
        ResultSet lista_resultados = null;
        Produto produto = null;
        String nome = null;
        String preço = null;
        int quantidade = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareCall(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                nome = lista_resultados.getString("Nome");
                preço = lista_resultados.getString("Preço");
                quantidade = lista_resultados.getInt("Quantidade");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            produto = null;
        }
        if (nome == null){
            return null;
        }
        //Busca por salgado
        sql = "SELECT Recheio, Massa, Cozimento FROM salgado  WHERE SalgadoId = ?";
        lista_resultados = null;
         try{
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             comando.setInt(1, sequencial);
             lista_resultados = comando.executeQuery();
             while(lista_resultados.next()){
                 return new Salgado(
                    sequencial, 
                    nome,
                    preço,
                    quantidade, 
                    Salgado.Recheio.valueOf(lista_resultados.getString("Recheio")),
                    lista_resultados.getString("Massa"),
                    Salgado.Cozimento.valueOf(lista_resultados.getString("Cozimento"))
                );
             }
         }catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            produto = null;
        }
        //Busca por bebida
        sql = "SELECT VolumeEmML, Sabor, Alcoolico, Gaseificada FROM bebida  WHERE BebidaId = ?";
        lista_resultados = null;
         try{
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             comando.setInt(1, sequencial);
             lista_resultados = comando.executeQuery();
             while(lista_resultados.next()){
                 return new Bebida(
                    sequencial, 
                    nome, 
                    preço, 
                    quantidade, 
                    lista_resultados.getInt("VolumeEmML"), 
                    lista_resultados.getString("Sabor"), 
                    lista_resultados.getBoolean("Alcoolico"), 
                    lista_resultados.getBoolean("Gaseificada")
                 );
             }
         }catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            produto = null;
        }
         //Busca por Doce
        sql = "SELECT Sabor, Recheio FROM doce  WHERE DoceId = ?";
        lista_resultados = null;
         try{
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             comando.setInt(1, sequencial);
             lista_resultados = comando.executeQuery();
             while(lista_resultados.next()){
                 return new Doce(
                    sequencial, 
                    nome, 
                    preço, 
                    quantidade, 
                    lista_resultados.getString("Sabor"),
                    Doce.Recheio.valueOf(lista_resultados.getString("Recheio"))
                 );
             }
         }catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            produto = null;
        }
        return produto;
    }
    
    public static String alterarProduto(Produto produto){
        String sql = "UPDATE produto SET Nome = ?, Preço = ?, Quantidade = ? WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, produto.getNome());
            comando.setFloat(2, produto.getPreço());
            comando.setInt(3, produto.getQuantidade());
            comando.setInt(4, produto.getSequencial());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração do Produto";
        }
        if( produto instanceof Salgado){
            Salgado salgado = (Salgado)produto;
            sql = "UPDATE salgado SET Massa = ?, Recheio = ?, Cozimento = ? WHERE SalgadoId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, salgado.getMassa());
                comando.setString(2, salgado.getRecheio().name());
                comando.setString(3, salgado.getCozimento().name());
                comando.setInt(4, salgado.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na alteração do Salgado";
            }  
        }else if(produto instanceof Bebida){
            Bebida bebida = (Bebida)produto;
            sql = "UPDATE bebida SET VolumeEmML = ?, Sabor = ?, Alcoolico = ?, Gaseificada = ? WHERE BebidaId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1, bebida.getVolumeEmML());
                comando.setString(2, bebida.getSabor());
                comando.setBoolean(3, bebida.isAlcóolico());
                comando.setBoolean(4, bebida.isGaseificada());
                comando.setInt(5, bebida.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na alteração do Salgado";
            } 
        }else if( produto instanceof Doce){
            Doce doce = (Doce)produto;
            sql = "UPDATE doce SET Sabor = ?, Recheio = ? WHERE DoceId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, doce.getSabor());
                comando.setString(2, doce.getRecheio().name());
                comando.setInt(3, doce.getSequencial());
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na alteração do Salgado";
            } 
        }
        
        return null;
    }
    
    public static String removerProduto(Produto produto){
        int sequencial = produto.getSequencial();
        if( produto instanceof Salgado){
            String sql = "DELETE FROM salgado WHERE SalgadoId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1,sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na remoção do salgado no BD";
            }
        }else if( produto instanceof Bebida){
            String sql = "DELETE FROM bebida WHERE BebidaId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1,sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na remoção da bebida no BD";
            }
        }else if( produto instanceof Doce){
            String sql = "DELETE FROM doce WHERE DoceId = ?";
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1,sequencial);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException exceção_sql) {
                exceção_sql.printStackTrace();
                return "Erro na remoção do doce no BD";
            }
        }
        String sql = "DELETE FROM produto WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1,sequencial);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na remoção do produto no BD";
        }
        return null;
    }
    
    public static int últimoSequencial(){
        String sql = "SELECT MAX(Sequencial) from produto";
        ResultSet lista_resultados = null;
       
        int sequencial = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial = lista_resultados.getInt(1);
            }
            lista_resultados.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return sequencial;
    }
    
    public static Produto[] getVisões(){
        String sql = "SELECT Sequencial, Nome FROM produto";
        ResultSet lista_resultados = null;
        ArrayList<Produto> visões = new ArrayList();
            
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                int sequencial = lista_resultados.getInt("Sequencial");
                visões.add( buscarProduto(sequencial).getVisão());
                
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
           exceção_sql.printStackTrace();
        }
        return visões.toArray(new Produto[visões.size()]);
    }
    
    public Produto getVisão(){
        return new Produto(Sequencial, Nome);
    }
}
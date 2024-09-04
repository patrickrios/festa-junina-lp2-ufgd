package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Barraca {
    public enum Jogo { 
        Pescaria, 
        Tiro_Ao_Alvo, 
        Correio_Elegante, 
        Nenhum
    };
    private int sequencial;
    private Grupo grupo;
    private Jogo jogo;
    private Produto produto;
    
    public Barraca(int sequencial, Jogo jogo, Grupo grupo){
        this.sequencial = sequencial;
        this.jogo = jogo;
        this.grupo = grupo;
    }
    
    public Barraca(int sequencial, Jogo jogo, Grupo grupo, Produto produto){
        this.sequencial = sequencial;
        this.jogo = jogo;
        this.grupo = grupo;
        this.produto = produto;
    }
    
    public int getSequencial(){
        return this.sequencial;
    }

    public void setSequencial(int sequencial){
        this.sequencial = sequencial;
    }
    
    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public Jogo getJogo(){
        return this.jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public Produto getProduto(){
        return this.produto;
    }

    @Override
    public String toString() {
        if(this.jogo != null)
            return "["+this.sequencial+"] "+this.grupo.getNomeCurso()+" ["+formatarJogo(this.jogo)+", "+this.produto.getNome()+"]";
        return "["+this.sequencial+"] "+this.grupo.getNomeCurso()+"["+this.produto.getNome()+"]";
    }
    
    public String toStringFull(){
        return "Barraca ["+this.sequencial+"]: "+
            this.grupo.getNomeCurso()+
            " ("+formatarJogo(this.jogo)+", "
            +this.grupo.formatarParticipação()+")" + "\n    "+produto.toStringFull()+"\n";
    }
    
    public static String formatarJogo(Jogo jogo){
        return jogo.name().replace("_", " ");
    }
    
    public static String formatarEnum(String nome){
        return nome.replace(" ", "_");
    }
    
    public static String inserirBarraca(Barraca barraca){
        String sql = "INSERT INTO barraca (Jogo, Grupo, ProdutoId) VALUES (?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareCall(sql);
            comando.setString(1, barraca.getJogo().name());            
            comando.setString(2, barraca.getGrupo().getNomeCurso());
            comando.setInt(3, barraca.getProduto().getSequencial());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na inserção da Barraca no BD";
        }
    }
    
    public static Barraca buscarBarracaPorGrupo(String nomeGrupo) {
        String sql = "SELECT * FROM barraca WHERE Grupo = ?";
        ResultSet lista_resultados = null;
        Barraca barraca = null;
        try {
            PreparedStatement comando = BD.conexão.prepareCall(sql);
            comando.setString(1, nomeGrupo);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                barraca = new Barraca(
                    lista_resultados.getInt("Sequencial"),
                    Barraca.Jogo.valueOf(lista_resultados.getString("Jogo")), 
                    Grupo.buscarGrupo(lista_resultados.getString("Grupo")),
                    Produto.buscarProduto(lista_resultados.getInt("ProdutoId"))
                );
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            barraca = null;
        }
        return barraca;
    }
    
    public static Barraca buscarBarracaPorSequencial(int sequencial) {
        String sql = "SELECT * FROM barraca WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        Barraca barraca = null;
        try {
            PreparedStatement comando = BD.conexão.prepareCall(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                barraca = new Barraca(
                    lista_resultados.getInt("Sequencial"),
                    Barraca.Jogo.valueOf(lista_resultados.getString("Jogo")), 
                    Grupo.buscarGrupo(lista_resultados.getString("Grupo")),
                    Produto.buscarProduto(lista_resultados.getInt("ProdutoId"))
                );
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            barraca = null;
        }
        return barraca;
    }
    
    public static int últimoSequencial(){
        String sql = "SELECT MAX(Sequencial) FROM barraca";
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
    
    public static boolean existeBarraca(int sequencial){
        String sql = "SELECT COUNT(Sequencial) FROM barraca WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        boolean existe = false;
        try {
            PreparedStatement comando = BD.conexão.prepareCall(sql);          
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next())
                existe = true;
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return existe;
    }
    
    public static String alterarBarraca(Barraca barraca){
        String sql = "UPDATE barraca SET Jogo = ?, Grupo = ?, ProdutoId = ? WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, barraca.getJogo().name());
            comando.setString(2, barraca.getGrupo().getNomeCurso());            
            comando.setInt(3, barraca.getProduto().getSequencial());
            comando.setInt(4, barraca.getSequencial());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração da barraca";
        }
    }
    
    public static String removerBarraca(int sequencial){
        String sql = "DELETE FROM barraca WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1,sequencial);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na remoção da barraca no BD";
        }
    }
    
    public static ArrayList<Barraca> pesquisarBarracas(
        Jogo jogo, 
        char vai_participar, 
        Salgado.Recheio recheio_salgado,
        Salgado.Cozimento cozimento_salgado,
        char bebida_alcoolica,
        char bebida_gaseificada,
        Doce.Recheio recheio_doce
    ){
        String sql = "SELECT barraca.* FROM Barraca AS barraca";
        boolean whereAdded = false;

        if(vai_participar != 'X') {
            sql += " JOIN Grupos AS grupo ON barraca.Grupo = grupo.NomeCurso";
            whereAdded = true;
        }

        if(jogo != null) {
            sql = addCondition(sql, whereAdded);
            sql += " barraca.jogo = ?";
            whereAdded = true;
        }

        if(vai_participar != 'X') {
            sql = addCondition(sql, whereAdded);
            sql += " grupo.VaiParticiparQuadrilha = ?";
            whereAdded = true;
        }

        if(recheio_salgado != null) {
            sql = addCondition(sql, whereAdded);
            sql += " barraca.ProdutoId IN (SELECT SalgadoId FROM Salgado WHERE Recheio LIKE ?)";
            whereAdded = true;
        }

        if(cozimento_salgado != null) {
            sql = addCondition(sql, whereAdded);
            sql += " barraca.ProdutoId IN (SELECT SalgadoId FROM Salgado WHERE Cozimento LIKE ?)";
            whereAdded = true;
        }

        if(bebida_alcoolica != 'X') {
            sql = addCondition(sql, whereAdded);
            sql += " barraca.ProdutoId IN (SELECT BebidaId FROM Bebida WHERE Alcoolico LIKE ?)";
            whereAdded = true;
        }

        if(bebida_gaseificada != 'X') {
            sql = addCondition(sql, whereAdded);
            sql += " barraca.ProdutoId IN (SELECT BebidaId FROM Bebida WHERE Gaseificada LIKE ?)";
            whereAdded = true;
        }

        if(recheio_doce != null) {
            sql = addCondition(sql, whereAdded);
            sql += " barraca.ProdutoId IN (SELECT DoceId FROM Doce WHERE Recheio LIKE ?)";
        }

        ResultSet lista_resultados = null;
        ArrayList<Barraca> barracas_selecionadas = new ArrayList<>();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            int paramIndex = 1;
            if(jogo != null) {
                comando.setString(paramIndex++, jogo.name());
            }
            if(vai_participar != 'X') {
                comando.setInt(paramIndex++, getBooleanFromcharToInt(vai_participar));
            }
            if(recheio_salgado != null) {
                comando.setString(paramIndex++, recheio_salgado.toString());
            }
            if(cozimento_salgado != null) {
                comando.setString(paramIndex++, cozimento_salgado.toString());
            }
            if(bebida_alcoolica != 'X') {
                comando.setInt(paramIndex++, getBooleanFromcharToInt(bebida_alcoolica));
            }
            if(bebida_gaseificada != 'X') {
                comando.setInt(paramIndex++,getBooleanFromcharToInt(bebida_gaseificada));
            }
            if(recheio_doce != null) {
                comando.setString(paramIndex++, recheio_doce.toString());
            }

            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()){
                Barraca barraca = new Barraca(
                    lista_resultados.getInt("Sequencial"),
                    Barraca.Jogo.valueOf(lista_resultados.getString("Jogo")), 
                    Grupo.buscarGrupo(lista_resultados.getString("Grupo")),
                    Produto.buscarProduto(lista_resultados.getInt("ProdutoId"))
                );
                barracas_selecionadas.add(barraca);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return barracas_selecionadas;
    }

    private static String addCondition(String sql, boolean whereAdded) {
        if (whereAdded) {
            return sql + " AND";
        } else {
            return sql + " WHERE";
        }
    }
    
    public static int getBooleanFromcharToInt(char value){
        return value == 'T' ? 1 : 0;
    }
    
    public Barraca getVisão(){
        return new Barraca(sequencial, jogo, grupo, produto);
    }
    
    public static Barraca[] getVisões(){
        String sql = "SELECT Sequencial, Jogo, Grupo, ProdutoId FROM Barraca";
        ResultSet lista_resultados = null;
        ArrayList<Barraca> visões = new ArrayList();
            
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                int sequencial = lista_resultados.getInt("Sequencial");
                String jogo = lista_resultados.getString("Jogo");
                String nome_grupo = lista_resultados.getString("Grupo");
                Grupo grupo = Grupo.buscarGrupo(nome_grupo).getVisão();
                Produto produto = Produto.buscarProduto(lista_resultados.getInt("ProdutoId"));
                visões.add( new Barraca(sequencial, Jogo.valueOf(jogo), grupo, produto));     
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
           exceção_sql.printStackTrace();
        }
        return visões.toArray(new Barraca[visões.size()]);
    }
}

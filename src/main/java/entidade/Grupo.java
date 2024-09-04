package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Grupo {
    String NomeCurso;
    int TotalDeIntegrantes;
    boolean VaiParticiparQuadrilha;
    int NumeroItensVenda;

    public Grupo(String NomeCurso, int TotalDeIntegrantes, boolean VaiParticiparQuadrilha, int NumeroItensVenda) {
        this.NomeCurso = NomeCurso;
        this.TotalDeIntegrantes = TotalDeIntegrantes;
        this.VaiParticiparQuadrilha = VaiParticiparQuadrilha;
        this.NumeroItensVenda = NumeroItensVenda;
    }
    
    public Grupo(String NomeCurso, boolean VaiParticiparQuadrilha){
        this.NomeCurso = NomeCurso;
        this.VaiParticiparQuadrilha = VaiParticiparQuadrilha;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }
    
    public void setNomeCurso(String NomeCurso){
        this.NomeCurso = NomeCurso;
    }

    public int getNumeroItensVenda() {
        return NumeroItensVenda;
    }
    
    public int getTotalIntegrantes(){
        return TotalDeIntegrantes;
    }

    public int getTotalDeIntegrantes() {
        return TotalDeIntegrantes;
    }
    
    public int getParticipaçãoQuadrilhaInteiro(){
        return this.VaiParticiparQuadrilha ? 1 : 0;
    }
    
    public void setParticipaçãoQuadrilha(boolean vaiParticipar){
        this.VaiParticiparQuadrilha = vaiParticipar;
    }
    
    public boolean getParticipaçãoNaQuadrilha(){
        return this.VaiParticiparQuadrilha;
    }
    
    @Override
    public String toString() {
        return NomeCurso + " • ("+ obterTextoDeParticipação()+" participar da quadrilha)";
    }
    
    private String obterTextoDeParticipação(){
        return VaiParticiparQuadrilha ? "VAI" : "NÃO VAI";
    }
    
    public String formatarParticipação(){
        return obterTextoDeParticipação()+" participar da quadrilha";
    }
    
    public boolean mudarParticipaçãoQuadrilha(){
        VaiParticiparQuadrilha = !VaiParticiparQuadrilha;
        return VaiParticiparQuadrilha;
    }
    
    public static String inserirGrupo(Grupo grupo){
        String sql = "INSERT INTO grupos (NomeCurso, NumeroIntegrantes, VaiParticiparQuadrilha, NumeroDeItens) VALUES (?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareCall(sql);
            comando.setString(1, grupo.getNomeCurso());            
            comando.setInt(2, grupo.getTotalIntegrantes());
            comando.setInt(3, grupo.getParticipaçãoQuadrilhaInteiro());
            comando.setInt(4, grupo.getNumeroItensVenda());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na inserção do Salgado no BD";
        }
    }
    
    public static Grupo buscarGrupo(String nomeCurso) {
        String sql = "SELECT * FROM grupos where NomeCurso = ?";
        ResultSet lista_resultados = null;
        Grupo grupo = null;
        try {
            PreparedStatement comando = BD.conexão.prepareCall(sql);
            comando.setString(1, nomeCurso);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                boolean participação = true ? lista_resultados.getInt(3) == 1 : false;
                grupo = new Grupo(
                    lista_resultados.getString(1),
                    lista_resultados.getInt(2),
                    participação,
                    lista_resultados.getInt(4)
                );
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            grupo = null;
        }
        return grupo;
    }
    
    public static String alterarGrupo(Grupo grupo){
        String sql = "UPDATE grupos SET NomeCurso = ?, NumeroIntegrantes = ?, VaiParticiparQuadrilha = ?, NumeroDeItens = ? WHERE NomeCurso = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, grupo.getNomeCurso());
            comando.setInt(2, grupo.getTotalDeIntegrantes());
            comando.setInt(3, grupo.getParticipaçãoQuadrilhaInteiro());
            comando.setInt(4, grupo.getNumeroItensVenda());
            comando.setString(5, grupo.getNomeCurso());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração do Grupo";
        }
    }
    
    public static String removerGrupo(String nomeCurso){
        String sql = "DELETE FROM grupos WHERE NomeCurso = ?";
        try {
            removerBarracaDoGrupo(nomeCurso);
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1,nomeCurso);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na remoção do grupo no BD";
        }
    }
    
    public static void removerBarracaDoGrupo(String nomeCurso){
    String sql = "DELETE FROM barraca WHERE Grupo = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1,nomeCurso);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
    }
    
    public static Grupo[] getVisões(){
        String sql = "SELECT NomeCurso, VaiParticiparQuadrilha FROM Grupos";
        ResultSet lista_resultados = null;
        ArrayList<Grupo> visões = new ArrayList();
            
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                String nome = lista_resultados.getString("NomeCurso");
                Integer vaiParticiparInt = lista_resultados.getInt("VaiParticiparQuadrilha");
                boolean vaiParticiparBool = true ? vaiParticiparInt == 1 : false;
                visões.add( new Grupo(nome, vaiParticiparBool));
                
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
           exceção_sql.printStackTrace();
        }
        return visões.toArray(new Grupo[visões.size()]);
    }
    
    public Grupo getVisão(){
        return new Grupo(NomeCurso, VaiParticiparQuadrilha);
    }
    
}
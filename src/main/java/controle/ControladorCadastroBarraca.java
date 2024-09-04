package controle;

import entidade.Barraca;
import interfaces.JanelaCadastroBarraca;

public class ControladorCadastroBarraca {
    
    public ControladorCadastroBarraca(){
        new JanelaCadastroBarraca(this).setVisible(true);
    }
    
    public String inserirBarraca(Barraca barraca){
        Barraca barraca1 = Barraca.buscarBarracaPorGrupo(barraca.getGrupo().getNomeCurso());
        if(barraca1 == null)
            return Barraca.inserirBarraca(barraca);
        else
            return "Barraca já cadastrada";
    }
    
    public String alterarBarraca(Barraca barraca_informada){
        Barraca barraca_cadastrada = Barraca.buscarBarracaPorSequencial(barraca_informada.getSequencial());
        String nome_curso = barraca_informada.getGrupo().getNomeCurso();
        if( nome_curso.equals(barraca_cadastrada.getGrupo().getNomeCurso()) && 
            barraca_cadastrada.getSequencial() == barraca_informada.getSequencial())
            return Barraca.alterarBarraca(barraca_informada);
        return "Alteração não permitida";
    }
    
    public String removerBarraca(int sequencial){
        if( Barraca.existeBarraca(sequencial))
            return Barraca.removerBarraca(sequencial);
        else
            return "Sequencial não corresponde a nenhuma barraca cadastrada";
    }
    
}
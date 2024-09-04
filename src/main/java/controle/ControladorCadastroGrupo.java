package controle;

import entidade.Grupo;
import interfaces.JanelaCadastroGrupo;

public class ControladorCadastroGrupo {

    public ControladorCadastroGrupo() {
        new JanelaCadastroGrupo(this).setVisible(true);
    }
    
    public String inserirGrupo(Grupo grupo){
        Grupo grupo1 = Grupo.buscarGrupo(grupo.getNomeCurso());
        if(grupo1 == null)
            return Grupo.inserirGrupo(grupo);
        else
            return "Nome do  grupo já cadastrado";
    }
    
    public String alterarGrupo(Grupo grupo){
        Grupo grupo1 = Grupo.buscarGrupo(grupo.getNomeCurso());
        if( grupo1 != null)
            return Grupo.alterarGrupo(grupo);
        else
            return "Nome do grupo não cadastrado";
    }
    
    public String removerGrupo(String nomeCurso){
        Grupo grupo1 = Grupo.buscarGrupo(nomeCurso);
        if( grupo1 != null)
            return Grupo.removerGrupo(nomeCurso);
        else
            return "Nome do curso não cadastrado";
    }
    
}
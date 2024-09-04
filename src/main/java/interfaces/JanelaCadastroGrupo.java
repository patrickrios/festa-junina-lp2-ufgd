package interfaces;

import entidade.Grupo;
import controle.ControladorCadastroGrupo;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class JanelaCadastroGrupo extends javax.swing.JFrame {

    ControladorCadastroGrupo controlador;
    DefaultListModel modelo_lista_grupos;
    
    public JanelaCadastroGrupo(ControladorCadastroGrupo controlador) {
        this.controlador = controlador;
        initComponents();
        inicializarListaGrupos();
        limparCampos();
    }
    
    private void inicializarListaGrupos(){
        modelo_lista_grupos = (DefaultListModel)grupos_cadastradosList.getModel();
        Grupo[] visões = Grupo.getVisões();
        for( Grupo visão : visões){
            modelo_lista_grupos.addElement(visão);
        }
    }
    
    private void limparCampos(){
        nome_cursoTextField.setText("");
        total_integrantesTextField.setText("");
        numero_itens_vendaTextField.setText("");
        participação_quadrilhaCheckBox.setSelected(true);
        alterarEstadoParticipaçãoNaQuadrilha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupos_cadastradosLabel = new javax.swing.JLabel();
        nome_cursoLabel = new javax.swing.JLabel();
        nome_cursoTextField = new javax.swing.JTextField();
        vai_participar_quadrilhaLabel = new javax.swing.JLabel();
        participação_quadrilhaCheckBox = new javax.swing.JCheckBox();
        total_integrantesLabel = new javax.swing.JLabel();
        total_integrantesTextField = new javax.swing.JTextField();
        itens_vendaLabel = new javax.swing.JLabel();
        numero_itens_vendaTextField = new javax.swing.JTextField();
        grupos_cadastradosScrollPane = new javax.swing.JScrollPane();
        grupos_cadastradosList = new javax.swing.JList();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Grupos");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(700, 400));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        getContentPane().setLayout(layout);

        grupos_cadastradosLabel.setText("Grupos Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(grupos_cadastradosLabel, gridBagConstraints);

        nome_cursoLabel.setText("Nome do curso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nome_cursoLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 203;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(nome_cursoTextField, gridBagConstraints);

        vai_participar_quadrilhaLabel.setText("Vai participar da quadrilha?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(vai_participar_quadrilhaLabel, gridBagConstraints);

        participação_quadrilhaCheckBox.setSelected(true);
        participação_quadrilhaCheckBox.setText("Sim");
        participação_quadrilhaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarParticipaçãoNaQuadrilha(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(participação_quadrilhaCheckBox, gridBagConstraints);

        total_integrantesLabel.setText("Total de Integrantes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(total_integrantesLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 203;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(total_integrantesTextField, gridBagConstraints);

        itens_vendaLabel.setText("Numero de itens à venda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(itens_vendaLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 203;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(numero_itens_vendaTextField, gridBagConstraints);

        grupos_cadastradosList.setModel(new DefaultListModel());
        grupos_cadastradosList.setPreferredSize(new java.awt.Dimension(0, 200));
        grupos_cadastradosScrollPane.setViewportView(grupos_cadastradosList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(grupos_cadastradosScrollPane, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirGrupo(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarGrupo(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarGrupo(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerGrupo(evt);
            }
        });
        comandosPanel.add(removerButton);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });
        comandosPanel.add(limparButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(comandosPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mudarParticipaçãoNaQuadrilha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarParticipaçãoNaQuadrilha
        // TODO add your handling code here:
        alterarEstadoParticipaçãoNaQuadrilha();
    }//GEN-LAST:event_mudarParticipaçãoNaQuadrilha

    private void inserirGrupo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirGrupo
        // TODO add your handling code here:
        Grupo grupo = obterGrupoInformado();
        String mensagem_erro = null;
        if(grupo != null){
            mensagem_erro = controlador.inserirGrupo(grupo);
        }else{
            mensagem_erro = "Algum atributo do grupo não foi informado";
        }
        if( mensagem_erro == null){
            Grupo visão = grupo.getVisão();
            modelo_lista_grupos.addElement(visão);
        }else{
            informarErro(mensagem_erro);
        }
    }//GEN-LAST:event_inserirGrupo

    private void alterarGrupo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarGrupo
        Grupo grupo = obterGrupoInformado();
        String mensagem_erro = null;
        if( grupo != null)
            mensagem_erro = controlador.alterarGrupo(grupo);
        else
            mensagem_erro = "Algum atributo do grupo não foi informado";
        if( mensagem_erro == null){
            Grupo visão = getVisãoAlterada(grupo.getNomeCurso());
            if( visão != null){
                visão.setNomeCurso(grupo.getNomeCurso());
                visão.setParticipaçãoQuadrilha(grupo.getParticipaçãoNaQuadrilha());
                grupos_cadastradosList.updateUI();
            }
        }
        else
            informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarGrupo

    private void consultarGrupo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarGrupo
        Grupo visão = (Grupo)grupos_cadastradosList.getSelectedValue();
        Grupo grupo = null;
        String mensagem_erro = null;
        if(visão != null){
            grupo = Grupo.buscarGrupo(visão.getNomeCurso());
            if(grupo == null)
                mensagem_erro = "Grupo não cadastrado";
        }else{
            mensagem_erro = "Nenhum grupo selecionado";
        }
        if( mensagem_erro == null){
            String nomeCurso = grupo.getNomeCurso();
            if(nomeCurso == null){
                nomeCurso = "";
            }
            nome_cursoTextField.setText(nomeCurso);
            total_integrantesTextField.setText(grupo.getTotalDeIntegrantes()+"");
            participação_quadrilhaCheckBox.setSelected(grupo.getParticipaçãoNaQuadrilha());
            alterarEstadoParticipaçãoNaQuadrilha();
            numero_itens_vendaTextField.setText(grupo.getNumeroItensVenda()+"");
        }else{
            informarErro(mensagem_erro);
        } 
    }//GEN-LAST:event_consultarGrupo

    private void removerGrupo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerGrupo
        // TODO add your handling code here:
        Grupo visão = (Grupo)grupos_cadastradosList.getSelectedValue();
        String mensagem_erro = null;
        if(visão != null){
            mensagem_erro = controlador.removerGrupo(visão.getNomeCurso());
        }else{
            mensagem_erro = "Nenhum grupo selecionado";
        }
        //final
        if( mensagem_erro == null){
            modelo_lista_grupos.removeElement(visão);
        }
        else
            informarErro(mensagem_erro);
    }//GEN-LAST:event_removerGrupo

    private Grupo obterGrupoInformado(){
        String nomeCurso = nome_cursoTextField.getText();
        if(nomeCurso.isEmpty())
            return null;
        String totalIntegrantes = total_integrantesTextField.getText();
        if(totalIntegrantes.isEmpty())
            return null;
        String numeroItensVenda = numero_itens_vendaTextField.getText();
        if(numeroItensVenda.isEmpty())
            return null;
        return new Grupo(
            nomeCurso, 
            Integer.parseInt(totalIntegrantes), 
            participação_quadrilhaCheckBox.isSelected(), 
            Integer.parseInt(numeroItensVenda)
        );
    }
    
    private Grupo getVisãoAlterada(String nome){
        int length = modelo_lista_grupos.getSize();
        for( int i=0; i<length; i++){
            Grupo visão = (Grupo)modelo_lista_grupos.getElementAt(i);
            if(visão.getNomeCurso().equals(nome))
                return visão;
        }
        return null;
    }
    
    private void alterarEstadoParticipaçãoNaQuadrilha(){
        if( participação_quadrilhaCheckBox.isSelected() )
            participação_quadrilhaCheckBox.setText("Sim");
        else
            participação_quadrilhaCheckBox.setText("Não");
    }
    
    private void limparCampos(java.awt.event.ActionEvent evt) {
        limparCampos();
    }
   
    private void informarErro(String mensagem){
        JOptionPane.showMessageDialog(
            this, 
            mensagem, 
            "Erro", 
            JOptionPane.ERROR_MESSAGE
        );
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel grupos_cadastradosLabel;
    private javax.swing.JList grupos_cadastradosList;
    private javax.swing.JScrollPane grupos_cadastradosScrollPane;
    private javax.swing.JButton inserirButton;
    private javax.swing.JLabel itens_vendaLabel;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nome_cursoLabel;
    private javax.swing.JTextField nome_cursoTextField;
    private javax.swing.JTextField numero_itens_vendaTextField;
    private javax.swing.JCheckBox participação_quadrilhaCheckBox;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel total_integrantesLabel;
    private javax.swing.JTextField total_integrantesTextField;
    private javax.swing.JLabel vai_participar_quadrilhaLabel;
    // End of variables declaration//GEN-END:variables
}
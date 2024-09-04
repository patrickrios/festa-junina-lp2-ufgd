package interfaces;

import controle.ControladorCadastroBarraca;
import entidade.Barraca;
import entidade.Barraca.Jogo;
import entidade.Grupo;
import entidade.Produto;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class JanelaCadastroBarraca extends javax.swing.JFrame {
    
    ControladorCadastroBarraca controlador;
    DefaultListModel modelo_lista_barracas;    

    public JanelaCadastroBarraca(ControladorCadastroBarraca controlador) {
        this.controlador = controlador;
        initComponents();
        inicializarListaBarracas();
        inicializarListaGrupos();
        inicializarJogosCombobox();
        inicializarListaProdutos();
        limparCampos(null);
    }
    
    private void inicializarListaBarracas(){
        modelo_lista_barracas = (DefaultListModel)barracas_cadastradasList.getModel();
        Barraca[] visões = Barraca.getVisões();
        for( Barraca visão : visões){
            modelo_lista_barracas.addElement(visão);
        }
    }
    
    private void inicializarJogosCombobox(){
        for( Jogo jogo : Jogo.values())
            jogosComboBox.addItem(Barraca.formatarJogo(jogo));
    }
    
    private void inicializarListaGrupos(){
        for(Grupo grupo : Grupo.getVisões()){
            grupos_cadastradosComboBox.addItem(grupo);
        }
    }
    
    private void inicializarListaProdutos(){
        for(Produto produto: Produto.getVisões()){
            produtos_cadastradosComboBox.addItem(produto);
        }
        produtos_cadastradosComboBox.setSelectedIndex(-1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        barracasLabel = new javax.swing.JLabel();
        barracas_cadastradasScrollPane = new javax.swing.JScrollPane();
        barracas_cadastradasList = new javax.swing.JList();
        gruposLabel = new javax.swing.JLabel();
        grupos_cadastradosComboBox = new javax.swing.JComboBox();
        jogosLabel = new javax.swing.JLabel();
        jogosComboBox = new javax.swing.JComboBox();
        identificador_sequencialLabel = new javax.swing.JLabel();
        identificador_sequencialTextField = new javax.swing.JTextField();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        produtoLabel = new javax.swing.JLabel();
        produtos_cadastradosComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Barracas");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        barracasLabel.setText("Barracas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 25, 0, 0);
        getContentPane().add(barracasLabel, gridBagConstraints);

        barracas_cadastradasList.setModel(new DefaultListModel());
        barracas_cadastradasScrollPane.setViewportView(barracas_cadastradasList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 84;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(27, 12, 0, 12);
        getContentPane().add(barracas_cadastradasScrollPane, gridBagConstraints);

        gruposLabel.setText("Grupo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 25, 0, 0);
        getContentPane().add(gruposLabel, gridBagConstraints);

        grupos_cadastradosComboBox.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        getContentPane().add(grupos_cadastradosComboBox, gridBagConstraints);

        jogosLabel.setText("Jogo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 25, 0, 0);
        getContentPane().add(jogosLabel, gridBagConstraints);

        jogosComboBox.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        getContentPane().add(jogosComboBox, gridBagConstraints);

        identificador_sequencialLabel.setText("Identificador Sequencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(21, 25, 0, 0);
        getContentPane().add(identificador_sequencialLabel, gridBagConstraints);

        identificador_sequencialTextField.setEditable(false);
        identificador_sequencialTextField.setMinimumSize(new java.awt.Dimension(120, 22));
        identificador_sequencialTextField.setPreferredSize(new java.awt.Dimension(120, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        getContentPane().add(identificador_sequencialTextField, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirBarraca(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBarraca(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBarraca(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBarraca(evt);
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 11, 31, 6);
        getContentPane().add(comandosPanel, gridBagConstraints);

        produtoLabel.setText("Produto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(21, 25, 0, 0);
        getContentPane().add(produtoLabel, gridBagConstraints);

        produtos_cadastradosComboBox.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        getContentPane().add(produtos_cadastradosComboBox, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirBarraca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirBarraca
        Barraca barraca = obtémBarracaInformada();
        String mensagem_erro = null;
        if( barraca != null)
            mensagem_erro = controlador.inserirBarraca(barraca);
        else
            mensagem_erro = "Algum atributo da barraca não foi informado";
        if( mensagem_erro == null){
            int sequencial = Barraca.últimoSequencial();
            barraca.setSequencial(sequencial);
            modelo_lista_barracas.addElement(barraca.getVisão());
            barracas_cadastradasList.setSelectedIndex( modelo_lista_barracas.size() - 1);
            identificador_sequencialTextField.setText(""+sequencial);
        }else{
            informarErro(mensagem_erro);
        }
    }//GEN-LAST:event_inserirBarraca

    private Barraca obtémBarracaInformada(){
        String sequencial_str = identificador_sequencialTextField.getText();
        int sequencial = 0;
        if(!sequencial_str.isEmpty())
            sequencial = Integer.parseInt(sequencial_str);
        Grupo visão_grupo = (Grupo)grupos_cadastradosComboBox.getSelectedItem();
        if(visão_grupo == null)
            return null;
        String jogo = (String)jogosComboBox.getSelectedItem();
        if( jogo == null)
            return null;
        Produto produto = (Produto)produtos_cadastradosComboBox.getSelectedItem();
        if(produto == null)
            return null;
        return new Barraca(
            sequencial,  
            Jogo.valueOf(Barraca.formatarEnum(jogo)), 
            visão_grupo,
            produto
        );
    }
    
    private void consultarBarraca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBarraca
        Barraca barraca_selecionada = (Barraca)barracas_cadastradasList.getSelectedValue();
        if( barraca_selecionada != null){
            Barraca barraca = Barraca.buscarBarracaPorSequencial(barraca_selecionada.getSequencial());
            if(barraca != null){
                identificador_sequencialTextField.setText(""+barraca.getSequencial());
                grupos_cadastradosComboBox.setSelectedItem(getVisãoGrupoSelecionado(barraca));
                jogosComboBox.setSelectedItem(Barraca.formatarJogo(barraca.getJogo()));
                produtos_cadastradosComboBox.setSelectedItem(getVisãoProdutoSelecionado(barraca.getProduto()));
            }
        }
    }//GEN-LAST:event_consultarBarraca

    private Grupo getVisãoGrupoSelecionado(Barraca barraca){
        ComboBoxModel<Grupo> model = grupos_cadastradosComboBox.getModel();
        for(int i=0; i<model.getSize(); i++){
            Grupo g = model.getElementAt(i);
            if(g.getNomeCurso().equals(barraca.getGrupo().getNomeCurso()))
                return g;
        }
        return null;
    }
    
    private Produto getVisãoProdutoSelecionado(Produto produto){
        ComboBoxModel<Produto> model = produtos_cadastradosComboBox.getModel();
        for(int i=0; i<model.getSize(); i++){
            Produto p = model.getElementAt(i);
            if(p.getSequencial() == produto.getSequencial())
                return p;
        }
        return null;
    }
    
    private void alterarBarraca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBarraca
        Barraca barraca = obtémBarracaInformada();
        String mensagem_erro = null;
        if(barraca != null){
            mensagem_erro = controlador.alterarBarraca(barraca);
            Barraca visão = (Barraca)barracas_cadastradasList.getSelectedValue();
            visão.setGrupo(barraca.getGrupo());
            visão.setJogo(barraca.getJogo());
            visão.setProduto(barraca.getProduto());
            barracas_cadastradasList.updateUI();
        }
        else
            mensagem_erro = "algum atributo da barraca não foi informado";
        if (mensagem_erro != null)
            informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarBarraca

    private void removerBarraca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBarraca
        Barraca visão = (Barraca)barracas_cadastradasList.getSelectedValue();
        String mensagem_erro = null;
        if(visão != null){
            mensagem_erro = controlador.removerBarraca(visão.getSequencial());
        }else{
            mensagem_erro = "Nenhuma barraca selecionada";
        }
        if( mensagem_erro == null)
            modelo_lista_barracas.removeElement(visão);
        else
            informarErro(mensagem_erro);
    }//GEN-LAST:event_removerBarraca

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        identificador_sequencialTextField.setText("");
        grupos_cadastradosComboBox.setSelectedIndex(-1);
        jogosComboBox.setSelectedIndex(-1);
        produtos_cadastradosComboBox.setSelectedIndex(-1);
    }//GEN-LAST:event_limparCampos

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
    private javax.swing.JLabel barracasLabel;
    private javax.swing.JList barracas_cadastradasList;
    private javax.swing.JScrollPane barracas_cadastradasScrollPane;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel gruposLabel;
    private javax.swing.JComboBox grupos_cadastradosComboBox;
    private javax.swing.JLabel identificador_sequencialLabel;
    private javax.swing.JTextField identificador_sequencialTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JComboBox jogosComboBox;
    private javax.swing.JLabel jogosLabel;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel produtoLabel;
    private javax.swing.JComboBox produtos_cadastradosComboBox;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}

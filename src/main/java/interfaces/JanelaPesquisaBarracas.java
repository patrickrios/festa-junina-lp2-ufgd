package interfaces;

import entidade.Barraca;
import entidade.Doce;
import entidade.Salgado;
import java.util.ArrayList;

public class JanelaPesquisaBarracas extends javax.swing.JFrame {
    PainelFiltrosBarracaJogos filtros_barraca_jogosPanel;
    PainelFiltrosGrupo filtros_grupo_Panel;
    PainelFiltrosSubclassesProduto filtros_subclasses_produto;
    
    public JanelaPesquisaBarracas() {
        initComponents();
        filtros_barraca_jogosPanel = new PainelFiltrosBarracaJogos();
        filtros_grupo_Panel = new PainelFiltrosGrupo();
        filtros_subclasses_produto = new PainelFiltrosSubclassesProduto();
        filtros_barracaPanel.add(filtros_barraca_jogosPanel);
        filtros_grupoPanel.add(filtros_grupo_Panel);
        filtros_subclasses_produtoPanel.add(filtros_subclasses_produto);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        filtros_grupoPanel = new javax.swing.JPanel();
        filtros_barracaPanel = new javax.swing.JPanel();
        filtros_subclasses_produtoPanel = new javax.swing.JPanel();
        barracas_selecionadasPanel = new javax.swing.JPanel();
        barracas_selecionadasScrollPane = new javax.swing.JScrollPane();
        barracas_selecionadasTextArea = new javax.swing.JTextArea();
        comandosPanel = new javax.swing.JPanel();
        pesquisarButton = new javax.swing.JButton();
        limparFiltrosButton = new javax.swing.JButton();
        limparPesquisaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Barracas");
        setPreferredSize(new java.awt.Dimension(620, 720));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        filtros_grupoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de grupo"));
        filtros_grupoPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 8, 16);
        getContentPane().add(filtros_grupoPanel, gridBagConstraints);

        filtros_barracaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de barraca"));
        filtros_barracaPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 8, 16);
        getContentPane().add(filtros_barracaPanel, gridBagConstraints);

        filtros_subclasses_produtoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de produto"));
        filtros_subclasses_produtoPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 8, 16);
        getContentPane().add(filtros_subclasses_produtoPanel, gridBagConstraints);

        barracas_selecionadasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Barracas selecionadas"));
        barracas_selecionadasPanel.setToolTipText("Barracas Selecionadas");
        barracas_selecionadasPanel.setPreferredSize(new java.awt.Dimension(323, 220));

        barracas_selecionadasScrollPane.setPreferredSize(new java.awt.Dimension(214, 200));

        barracas_selecionadasTextArea.setColumns(20);
        barracas_selecionadasTextArea.setRows(5);
        barracas_selecionadasScrollPane.setViewportView(barracas_selecionadasTextArea);

        javax.swing.GroupLayout barracas_selecionadasPanelLayout = new javax.swing.GroupLayout(barracas_selecionadasPanel);
        barracas_selecionadasPanel.setLayout(barracas_selecionadasPanelLayout);
        barracas_selecionadasPanelLayout.setHorizontalGroup(
            barracas_selecionadasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barracas_selecionadasScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        barracas_selecionadasPanelLayout.setVerticalGroup(
            barracas_selecionadasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barracas_selecionadasScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 16, 16);
        getContentPane().add(barracas_selecionadasPanel, gridBagConstraints);

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBarracas(evt);
            }
        });
        comandosPanel.add(pesquisarButton);

        limparFiltrosButton.setText("Limpar filtros");
        limparFiltrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFiltros(evt);
            }
        });
        comandosPanel.add(limparFiltrosButton);

        limparPesquisaButton.setText("Limpar pesquisa");
        limparPesquisaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparPesquisa(evt);
            }
        });
        comandosPanel.add(limparPesquisaButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 6, 53, 6);
        getContentPane().add(comandosPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparFiltros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFiltros
        filtros_barraca_jogosPanel.limparFiltros();
        filtros_grupo_Panel.limparFiltros();
        filtros_subclasses_produto.limparCampos();
    }//GEN-LAST:event_limparFiltros

    private void limparPesquisa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparPesquisa
        barracas_selecionadasTextArea.setText("");
    }//GEN-LAST:event_limparPesquisa

    private void pesquisarBarracas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBarracas
        Barraca.Jogo jogo = filtros_barraca_jogosPanel.getJogo();
        char participacao = filtros_grupo_Panel.getParticipaçãoNaQuadrilha();
        Salgado.Recheio recheio_salgado = filtros_subclasses_produto.getRecheioSalgado();
        Salgado.Cozimento cozimento_salgado = filtros_subclasses_produto.getCozimentoSalgado();
        char bebida_alcoolica = filtros_subclasses_produto.getBebidaAlcoolica();
        char bebida_gaseificada = filtros_subclasses_produto.getBebidaGaseificada();
        Doce.Recheio recheio_doce = filtros_subclasses_produto.getRecheioDoce();
        
        ArrayList<Barraca> barracas = Barraca.pesquisarBarracas(
            jogo, 
            participacao,
            recheio_salgado,
            cozimento_salgado,
            bebida_alcoolica,
            bebida_gaseificada,
            recheio_doce
        );
        mostrarBarracasSelecionadas(barracas);
    }//GEN-LAST:event_pesquisarBarracas
 
    private void mostrarBarracasSelecionadas(ArrayList<Barraca> barracas){
        limparPesquisa(null);
        boolean primeira = true;
        for(Barraca barraca : barracas){
            if(primeira){
                barracas_selecionadasTextArea.append(barraca.toStringFull());
                primeira = false;
            }else{
                barracas_selecionadasTextArea.append("\n"+barraca.toStringFull());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barracas_selecionadasPanel;
    private javax.swing.JScrollPane barracas_selecionadasScrollPane;
    private javax.swing.JTextArea barracas_selecionadasTextArea;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JPanel filtros_barracaPanel;
    private javax.swing.JPanel filtros_grupoPanel;
    private javax.swing.JPanel filtros_subclasses_produtoPanel;
    private javax.swing.JButton limparFiltrosButton;
    private javax.swing.JButton limparPesquisaButton;
    private javax.swing.JButton pesquisarButton;
    // End of variables declaration//GEN-END:variables
}

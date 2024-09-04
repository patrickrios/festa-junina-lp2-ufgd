package interfaces;

import controle.ControladorCadastroProduto;
import entidade.Bebida;
import entidade.Doce;
import entidade.Produto;
import entidade.Salgado;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class JanelaCadastroProduto extends javax.swing.JFrame {

    ControladorCadastroProduto controlador;
    Produto[] produtos_cadastrados;
    PainelSalgado salgadoPainel;
    PainelBebida bebidaPainel;
    PainelDoce docePainel;

    public JanelaCadastroProduto( ControladorCadastroProduto controlador ) {
        this.controlador = controlador;
        this.produtos_cadastrados = Produto.getVisões();
        initComponents();
        limparCampos();
        this.salgadoPainel = new PainelSalgado();
        this.bebidaPainel  = new PainelBebida();
        this.docePainel    = new PainelDoce();
        especialização_produtoTabbedPane.addTab("Salgado", salgadoPainel);        
        especialização_produtoTabbedPane.addTab("Bebida", bebidaPainel);
        especialização_produtoTabbedPane.addTab("Doce", docePainel);
    }
    
    private void limparCampos(){
        nomeTextField.setText("");
        quantidadeTextField.setText("");
        preçoTextField.setText("");
        identificador_sequencialTextField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        produtos_cadastradosLabel = new javax.swing.JLabel();
        produtos_cadastradosComboBox = new javax.swing.JComboBox();
        identificador_sequencialLabel = new javax.swing.JLabel();
        identificador_sequencialTextField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        preçoLabel = new javax.swing.JLabel();
        preçoTextField = new javax.swing.JTextField();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeTextField = new javax.swing.JTextField();
        especialização_produtoTabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produtos");
        setPreferredSize(new java.awt.Dimension(620, 400));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 7, 0};
        layout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        getContentPane().setLayout(layout);

        produtos_cadastradosLabel.setText("Produtos Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(produtos_cadastradosLabel, gridBagConstraints);

        produtos_cadastradosComboBox.setMaximumRowCount(20);
        produtos_cadastradosComboBox.setModel(new DefaultComboBoxModel(produtos_cadastrados));
        produtos_cadastradosComboBox.setPreferredSize(new java.awt.Dimension(280, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(produtos_cadastradosComboBox, gridBagConstraints);

        identificador_sequencialLabel.setText("Identificador Sequencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(identificador_sequencialLabel, gridBagConstraints);

        identificador_sequencialTextField.setEditable(false);
        identificador_sequencialTextField.setPreferredSize(new java.awt.Dimension(50, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(identificador_sequencialTextField, gridBagConstraints);

        nomeLabel.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nomeLabel, gridBagConstraints);

        nomeTextField.setPreferredSize(new java.awt.Dimension(280, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(nomeTextField, gridBagConstraints);

        preçoLabel.setText("Preço");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(preçoLabel, gridBagConstraints);

        preçoTextField.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(preçoTextField, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirProduto(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProduto(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarProduto(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProduto(evt);
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
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(comandosPanel, gridBagConstraints);

        quantidadeLabel.setText("Quantidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(quantidadeLabel, gridBagConstraints);

        quantidadeTextField.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(quantidadeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(especialização_produtoTabbedPane, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        limparCampos();
        salgadoPainel.limparCampos();
        bebidaPainel.limparCampos();
        docePainel.limparCampos();
        Produto sel = (Produto)produtos_cadastradosComboBox.getSelectedItem();
    }//GEN-LAST:event_limparCampos

    private void inserirProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirProduto
        Produto produto = obterProdutoInformado();
        String mensagem_erro = null;
        if(produto != null){
            mensagem_erro = controlador.inserirProduto(produto);
        }else{
            mensagem_erro = "Algum atributo do produto não foi informado";
        }
        if( mensagem_erro == null){
            int sequencial = Produto.últimoSequencial();
            produto.setSequencial(sequencial);
            Produto visão = produto.getVisão();
            produtos_cadastrados = Produto.getVisões();
            produtos_cadastradosComboBox.addItem(visão);
            produtos_cadastradosComboBox.setSelectedItem(visão);
            identificador_sequencialTextField.setText(""+sequencial);
        }else{
            informarErro(mensagem_erro);
        }
    }//GEN-LAST:event_inserirProduto
     
    private void consultarProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarProduto
        Produto visão = (Produto)produtos_cadastradosComboBox.getSelectedItem();
        Produto produto = null;
        String mensagem_erro = null;
        if(visão != null){
            produto = Produto.buscarProduto(visão.getSequencial());
            if(produto == null)
                mensagem_erro = "Produto não cadastrado";
        }else{
            mensagem_erro = "Nenhum Produto selecionado";
        }
        if( mensagem_erro == null){
            identificador_sequencialTextField.setText(produto.getIdentificadorSequencial());
            nomeTextField.setText(produto.getNome());
            preçoTextField.setText(String.valueOf(produto.getPreço()));
            quantidadeTextField.setText(  String.valueOf(produto.getQuantidade()));
            if( produto instanceof Salgado salgado){
                especialização_produtoTabbedPane.setSelectedIndex(0);
                salgadoPainel.setMassa(salgado.getMassa());
                salgadoPainel.setCozimento(salgado.getCozimento().ordinal());
                salgadoPainel.setRecheio(salgado.getRecheio().ordinal());
            }else if(produto instanceof Bebida bebida){
                especialização_produtoTabbedPane.setSelectedIndex(1);
                bebidaPainel.setVolumeEmML(bebida.getVolumeEmML());
                bebidaPainel.setSabor(bebida.getSabor());
                bebidaPainel.setAlcoolico(bebida.isAlcóolico());
                bebidaPainel.setGaseificada(bebida.isGaseificada());
            }else if(produto instanceof Doce doce){
                especialização_produtoTabbedPane.setSelectedIndex(2);
                docePainel.setSabor(doce.getSabor());
                docePainel.setRecheio(doce.getRecheio().ordinal());
            }
        }else{
            informarErro(mensagem_erro);
        }  
    }//GEN-LAST:event_consultarProduto

    private void alterarProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarProduto
        Produto produto = obterProdutoInformado();
        int sequencial = Integer.parseInt( identificador_sequencialTextField.getText());
        String mensagem_erro = null;
        if( produto != null){
            produto.setSequencial(sequencial);
            mensagem_erro = controlador.alterarProduto(produto);
        }
        else
            mensagem_erro = "Algum atributo do produto não foi informado";
        if( mensagem_erro == null){
            Produto visão = (Produto)produtos_cadastradosComboBox.getSelectedItem();
            if( visão != null){
                Produto nova_visão = null;
                if(visão instanceof Salgado salgado){
                    salgado.setNome(produto.getNome());
                    salgado.setRecheio(((Salgado) produto).getRecheio());
                    nova_visão = salgado;
                }
                if(visão instanceof Bebida bebida){
                    bebida.setNome(produto.getNome());
                    bebida.setSabor(((Bebida) produto).getSabor());
                    nova_visão = bebida;
                }
                if(visão instanceof Doce doce){
                    doce.setNome(produto.getNome());
                    doce.setSabor(((Doce) produto).getSabor());
                    nova_visão = doce;
                }
                produtos_cadastradosComboBox.updateUI();
                produtos_cadastradosComboBox.setSelectedItem(nova_visão);
            }
        }
        else
            informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarProduto

    private void removerProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerProduto
        //inicial
        Produto visão = (Produto)produtos_cadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        if(visão != null){
            mensagem_erro = controlador.removerProduto(visão.getSequencial());
        }else{
            mensagem_erro = "Nenhum Salgado selecionado";
        }
        //final
        if( mensagem_erro == null){
            produtos_cadastradosComboBox.removeItem(visão);
            if( produtos_cadastrados.length >= 1)
                produtos_cadastradosComboBox.setSelectedIndex(0);
            else
                produtos_cadastradosComboBox.setSelectedIndex(-1);
        }
        else
            informarErro(mensagem_erro);
    }//GEN-LAST:event_removerProduto
  
    private  Produto obterProdutoInformado(){
        String nome = nomeTextField.getText();
        if(nome.isEmpty())
               return null;
        String quantidade = quantidadeTextField.getText();
        if(quantidade.isEmpty())
              return null;
        String preço = preçoTextField.getText();
        if(preço.isEmpty())
               return null;
        Produto produto = null;
        int indice_aba_selecionada = especialização_produtoTabbedPane.getSelectedIndex();
        switch (indice_aba_selecionada) {
            case 0 -> {
                String massa = salgadoPainel.getMassa();
                Salgado.Recheio recheio = salgadoPainel.getRecheio();
                Salgado.Cozimento cozimento = salgadoPainel.getCozimento();
                produto = new Salgado(
                    nome,
                    preço,
                    Integer.parseInt(quantidade),
                    recheio,
                    massa,
                    cozimento
                );
            }
            case 1 -> {
                int volumeEmML = bebidaPainel.getVolumeEmML();
                String saborBebida = bebidaPainel.getSabor();
                boolean isAlcoolico = bebidaPainel.isAlcoolico();
                boolean isGaseificada = bebidaPainel.isGaseificada();
                produto = new Bebida(
                    nome,
                    preço,
                    Integer.parseInt(quantidade),
                    volumeEmML,
                    saborBebida,
                    isAlcoolico,
                    isGaseificada
                );
            }
            case 2 -> {
                String sabor = docePainel.getSabor();
                Doce.Recheio recheioDoce = docePainel.getRecheio();
                produto = new Doce(
                    nome,
                    preço,
                    Integer.parseInt(quantidade),
                    sabor,
                    recheioDoce
                );
            }
        }
        return produto;
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
    private javax.swing.JTabbedPane especialização_produtoTabbedPane;
    private javax.swing.JLabel identificador_sequencialLabel;
    private javax.swing.JTextField identificador_sequencialTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel preçoLabel;
    private javax.swing.JTextField preçoTextField;
    private javax.swing.JComboBox produtos_cadastradosComboBox;
    private javax.swing.JLabel produtos_cadastradosLabel;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JTextField quantidadeTextField;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
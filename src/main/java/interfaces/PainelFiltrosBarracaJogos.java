package interfaces;

import entidade.Barraca;

public class PainelFiltrosBarracaJogos extends javax.swing.JPanel {

    public PainelFiltrosBarracaJogos() {
        initComponents();
        inicializarJogosCombobox();
    }
    
    private void inicializarJogosCombobox(){
        for( Barraca.Jogo jogo : Barraca.Jogo.values())
            jogosComboBox.addItem(Barraca.formatarJogo(jogo));
        jogosComboBox.setSelectedIndex(-1);
    }
    
    public Barraca.Jogo getJogo(){
        String jogo = (String)jogosComboBox.getSelectedItem();
        if(jogo != null)
            return Barraca.Jogo.valueOf(Barraca.formatarEnum(jogo));
        return null;
    }
    
    public void limparFiltros(){
        jogosComboBox.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jogosComboBox = new javax.swing.JComboBox();
        jogosLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jogosComboBox.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 16, 16);
        add(jogosComboBox, gridBagConstraints);

        jogosLabel.setText("Jogos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 16, 8);
        add(jogosLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jogosComboBox;
    private javax.swing.JLabel jogosLabel;
    // End of variables declaration//GEN-END:variables
}

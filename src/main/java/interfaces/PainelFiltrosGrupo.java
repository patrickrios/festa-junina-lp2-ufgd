package interfaces;

public class PainelFiltrosGrupo extends javax.swing.JPanel {

    public PainelFiltrosGrupo() {
        initComponents();
    }
    
    public char getParticipaçãoNaQuadrilha(){
        char vai_participar = 'X';
        if( opcoes_paticipacaoButtonGroup.getSelection() != null){
            switch(opcoes_paticipacaoButtonGroup.getSelection().getMnemonic()){
                case 0: vai_participar = 'T'; break;
                case 1: vai_participar = 'F';
            }
        }
        return vai_participar;
    }
    
    public void limparFiltros(){
        opcoes_paticipacaoButtonGroup.clearSelection();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        opcoes_paticipacaoButtonGroup = new javax.swing.ButtonGroup();
        vai_participarLabel = new javax.swing.JLabel();
        simRadioButton = new javax.swing.JRadioButton();
        naoRadioButton = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridBagLayout());

        vai_participarLabel.setText("Vai participar da quadrilha?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 16, 16);
        add(vai_participarLabel, gridBagConstraints);

        opcoes_paticipacaoButtonGroup.add(simRadioButton);
        simRadioButton.setText("Sim");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 16, 4);
        add(simRadioButton, gridBagConstraints);

        opcoes_paticipacaoButtonGroup.add(naoRadioButton);
        naoRadioButton.setMnemonic('\u0001');
        naoRadioButton.setText("Não");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 4, 16, 16);
        add(naoRadioButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton naoRadioButton;
    private javax.swing.ButtonGroup opcoes_paticipacaoButtonGroup;
    private javax.swing.JRadioButton simRadioButton;
    private javax.swing.JLabel vai_participarLabel;
    // End of variables declaration//GEN-END:variables
}

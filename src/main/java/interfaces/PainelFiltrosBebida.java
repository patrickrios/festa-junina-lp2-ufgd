package interfaces;

public class PainelFiltrosBebida extends javax.swing.JPanel {

    public PainelFiltrosBebida() {
        initComponents();
    }
    
    public void limparFiltros(){
        alcoolicoButtonGroup.clearSelection();
        gaseificadaButtonGroup.clearSelection();
    }
    
    public char getAlcoolico(){
        char alcoolico = 'X';
        if( alcoolicoButtonGroup.getSelection() != null){
            switch(alcoolicoButtonGroup.getSelection().getMnemonic()){
                case 0: alcoolico = 'T'; break;
                case 1: alcoolico = 'F';
            }
        }
        return alcoolico;
    }
    
    public char getGaseificada(){
        char gaseificada = 'X';
        if( gaseificadaButtonGroup.getSelection() != null){
            switch(gaseificadaButtonGroup.getSelection().getMnemonic()){
                case 0: gaseificada = 'T'; break;
                case 1: gaseificada = 'F';
            }
        }
        return gaseificada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        alcoolicoButtonGroup = new javax.swing.ButtonGroup();
        gaseificadaButtonGroup = new javax.swing.ButtonGroup();
        alcoolicoLabel = new javax.swing.JLabel();
        com_gasLabel = new javax.swing.JLabel();
        opções_alcoolico = new javax.swing.JPanel();
        sim_alcoolicoRadioButton = new javax.swing.JRadioButton();
        nao_alcoolicoRadioButton = new javax.swing.JRadioButton();
        opções_gaseificada = new javax.swing.JPanel();
        sim_gaseificadaRadioButton = new javax.swing.JRadioButton();
        nao_gaseificadaRadioButton = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridBagLayout());

        alcoolicoLabel.setText("Alcóolico?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 0, 0);
        add(alcoolicoLabel, gridBagConstraints);

        com_gasLabel.setText("Com gás?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 0, 0);
        add(com_gasLabel, gridBagConstraints);

        alcoolicoButtonGroup.add(sim_alcoolicoRadioButton);
        sim_alcoolicoRadioButton.setText("Sim");
        opções_alcoolico.add(sim_alcoolicoRadioButton);

        alcoolicoButtonGroup.add(nao_alcoolicoRadioButton);
        nao_alcoolicoRadioButton.setMnemonic(1);
        nao_alcoolicoRadioButton.setText("Não");
        opções_alcoolico.add(nao_alcoolicoRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 8, 0, 0);
        add(opções_alcoolico, gridBagConstraints);

        gaseificadaButtonGroup.add(sim_gaseificadaRadioButton);
        sim_gaseificadaRadioButton.setText("Sim");
        opções_gaseificada.add(sim_gaseificadaRadioButton);

        gaseificadaButtonGroup.add(nao_gaseificadaRadioButton);
        nao_gaseificadaRadioButton.setText("Não");
        opções_gaseificada.add(nao_gaseificadaRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        add(opções_gaseificada, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alcoolicoButtonGroup;
    private javax.swing.JLabel alcoolicoLabel;
    private javax.swing.JLabel com_gasLabel;
    private javax.swing.ButtonGroup gaseificadaButtonGroup;
    private javax.swing.JRadioButton nao_alcoolicoRadioButton;
    private javax.swing.JRadioButton nao_gaseificadaRadioButton;
    private javax.swing.JPanel opções_alcoolico;
    private javax.swing.JPanel opções_gaseificada;
    private javax.swing.JRadioButton sim_alcoolicoRadioButton;
    private javax.swing.JRadioButton sim_gaseificadaRadioButton;
    // End of variables declaration//GEN-END:variables
}

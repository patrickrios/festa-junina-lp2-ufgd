package interfaces;

public class PainelBebida extends javax.swing.JPanel {

    public PainelBebida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        volumeLabel = new javax.swing.JLabel();
        volumeTextField = new javax.swing.JTextField();
        saborLabel = new javax.swing.JLabel();
        saborTextField = new javax.swing.JTextField();
        alcoolicoLabel = new javax.swing.JLabel();
        alcoolicoCheckBox = new javax.swing.JCheckBox();
        com_gasLabel = new javax.swing.JLabel();
        com_gasCheckBox = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0};
        layout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0};
        setLayout(layout);

        volumeLabel.setText("Volume em ML:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(volumeLabel, gridBagConstraints);

        volumeTextField.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(volumeTextField, gridBagConstraints);

        saborLabel.setText("Sabor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(saborLabel, gridBagConstraints);

        saborTextField.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(saborTextField, gridBagConstraints);

        alcoolicoLabel.setText("Alcóolico?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(alcoolicoLabel, gridBagConstraints);

        alcoolicoCheckBox.setText("Não");
        alcoolicoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alcoolicoCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(alcoolicoCheckBox, gridBagConstraints);

        com_gasLabel.setText("Com gás?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(com_gasLabel, gridBagConstraints);

        com_gasCheckBox.setText("Não");
        com_gasCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_gasCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(com_gasCheckBox, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public void setVolumeEmML(int volume){
        volumeTextField.setText(String.valueOf(volume));
    }
    
    public int getVolumeEmML(){
        int volume;
        volume = Integer.parseInt(volumeTextField.getText());
        return volume;
    }
    
    public void setSabor(String sabor){
        saborTextField.setText(sabor);
    }
    
    public String getSabor(){
        return saborTextField.getText();
    }
    
    public void setAlcoolico(boolean isAlcoolico){
        alcoolicoCheckBox.setSelected(isAlcoolico);
    }
    
    public boolean isAlcoolico(){
        return alcoolicoCheckBox.isSelected();
    }
    
    public void setGaseificada(boolean isGaseificada){
        com_gasCheckBox.setSelected(isGaseificada);
    }
    
    public boolean isGaseificada(){
        return com_gasCheckBox.isSelected();
    }
    
    public void limparCampos(){
        volumeTextField.setText("");
        saborTextField.setText("");
        alcoolicoCheckBox.setSelected(false);
        com_gasCheckBox.setSelected(false);
    }
    
    private void alcoolicoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alcoolicoCheckBoxActionPerformed
        alcoolicoCheckBox.setText(
            alcoolicoCheckBox.isSelected() ? 
                "Sim"  : 
                "Não"
        );
    }//GEN-LAST:event_alcoolicoCheckBoxActionPerformed

    private void com_gasCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_gasCheckBoxActionPerformed
        com_gasCheckBox.setText(
            com_gasCheckBox.isSelected() ? 
                "Sim"  : 
                "Não"
        );
    }//GEN-LAST:event_com_gasCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alcoolicoCheckBox;
    private javax.swing.JLabel alcoolicoLabel;
    private javax.swing.JCheckBox com_gasCheckBox;
    private javax.swing.JLabel com_gasLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel saborLabel;
    private javax.swing.JTextField saborTextField;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JTextField volumeTextField;
    // End of variables declaration//GEN-END:variables
}

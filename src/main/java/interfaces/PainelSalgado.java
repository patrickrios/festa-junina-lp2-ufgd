package interfaces;

import entidade.Salgado;
import javax.swing.DefaultComboBoxModel;

public class PainelSalgado extends javax.swing.JPanel {

    public PainelSalgado() {
        initComponents();
        Salgado.Recheio [] recheios = Salgado.Recheio.values();
        DefaultComboBoxModel<Salgado.Recheio> model = new DefaultComboBoxModel<>(recheios);
        recheioComboBox.setModel(model);
        recheioComboBox.setSelectedItem(recheios[0]); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cozimentoButtonGroup = new javax.swing.ButtonGroup();
        massaLabel = new javax.swing.JLabel();
        massaTextField = new javax.swing.JTextField();
        recheioLabel = new javax.swing.JLabel();
        cozimentoLabel = new javax.swing.JLabel();
        recheioComboBox = new javax.swing.JComboBox();
        cozimentoPanel = new javax.swing.JPanel();
        assadoRadioButton = new javax.swing.JRadioButton();
        fritoRadioButton = new javax.swing.JRadioButton();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 7, 0, 7, 0};
        setLayout(layout);

        massaLabel.setText("Massa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(massaLabel, gridBagConstraints);

        massaTextField.setPreferredSize(new java.awt.Dimension(200, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(massaTextField, gridBagConstraints);

        recheioLabel.setText("Recheio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(recheioLabel, gridBagConstraints);

        cozimentoLabel.setText("Cozimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(cozimentoLabel, gridBagConstraints);

        recheioComboBox.setPreferredSize(new java.awt.Dimension(120, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(recheioComboBox, gridBagConstraints);

        cozimentoPanel.setPreferredSize(new java.awt.Dimension(151, 33));

        cozimentoButtonGroup.add(assadoRadioButton);
        assadoRadioButton.setSelected(true);
        assadoRadioButton.setText("Assado");
        cozimentoPanel.add(assadoRadioButton);

        cozimentoButtonGroup.add(fritoRadioButton);
        fritoRadioButton.setMnemonic(1);
        fritoRadioButton.setText("Frito");
        cozimentoPanel.add(fritoRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(cozimentoPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public String getMassa(){
        return massaTextField.getText();
    }
    
    public void setMassa(String massa){
        massaTextField.setText(massa);
    }
    
    public Salgado.Cozimento getCozimento(){
        Salgado.Cozimento c = null;
        if( cozimentoButtonGroup.getSelection() != null ){
            c = Salgado.Cozimento.values()[cozimentoButtonGroup.getSelection().getMnemonic()];
        }
        return c;
    }
    
    public void setCozimento(int indice_cozimento){
        switch(indice_cozimento){
            case 0 -> assadoRadioButton.setSelected(true);
            case 1 -> fritoRadioButton.setSelected(true);
        }
    }
    
    public Salgado.Recheio getRecheio(){
        Salgado.Recheio recheio = (Salgado.Recheio)recheioComboBox.getSelectedItem();;
        return recheio;
    }
    
    public void setRecheio( int indice_recheio){
        Salgado.Recheio [] recheios = Salgado.Recheio.values();
        recheioComboBox.setSelectedItem(recheios[indice_recheio]);
    }
   
    public void limparCampos(){
        massaTextField.setText("");
        recheioComboBox.setSelectedIndex(-1);
        cozimentoButtonGroup.clearSelection();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton assadoRadioButton;
    private javax.swing.ButtonGroup cozimentoButtonGroup;
    private javax.swing.JLabel cozimentoLabel;
    private javax.swing.JPanel cozimentoPanel;
    private javax.swing.JRadioButton fritoRadioButton;
    private javax.swing.JLabel massaLabel;
    private javax.swing.JTextField massaTextField;
    private javax.swing.JComboBox recheioComboBox;
    private javax.swing.JLabel recheioLabel;
    // End of variables declaration//GEN-END:variables
}

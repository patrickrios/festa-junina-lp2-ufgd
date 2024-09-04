package interfaces;

import entidade.Salgado;
import javax.swing.DefaultComboBoxModel;


public class PainelFiltrosSalgado extends javax.swing.JPanel {

    public PainelFiltrosSalgado() {
        initComponents();
        inicializaComboBoxRecheio();
        cozimentoButtonGroup.clearSelection();
    }

    private void inicializaComboBoxRecheio(){
        Salgado.Recheio [] recheios = Salgado.Recheio.values();
        DefaultComboBoxModel<Salgado.Recheio> model = new DefaultComboBoxModel<>(recheios);
        recheioComboBox.setModel(model);
        recheioComboBox.setSelectedItem(recheios[0]); 
        recheioComboBox.setSelectedIndex(-1);
    }
    
    public void limparFiltros(){
        recheioComboBox.setSelectedIndex(-1);
        cozimentoButtonGroup.clearSelection();
    }
    
    public Salgado.Recheio getRecheio(){
        return (Salgado.Recheio)recheioComboBox.getSelectedItem();
    }
    
    public Salgado.Cozimento getCozimento(){
        Salgado.Cozimento coz = null;
        if( cozimentoButtonGroup.getSelection() != null){
            switch(cozimentoButtonGroup.getSelection().getMnemonic()){
                case 0: coz = Salgado.Cozimento.ASSADO; break;
                case 1: coz = Salgado.Cozimento.FRITO;
            }
        }
        return coz;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cozimentoButtonGroup = new javax.swing.ButtonGroup();
        recheioComboBox = new javax.swing.JComboBox();
        recheioLabel = new javax.swing.JLabel();
        cozimentoLabel = new javax.swing.JLabel();
        cozimentoPanel = new javax.swing.JPanel();
        assadoRadioButton = new javax.swing.JRadioButton();
        fritoRadioButton = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridBagLayout());

        recheioComboBox.setPreferredSize(new java.awt.Dimension(120, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 5, 0, 0);
        add(recheioComboBox, gridBagConstraints);

        recheioLabel.setText("Recheio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 0, 0);
        add(recheioLabel, gridBagConstraints);

        cozimentoLabel.setText("Cozimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 0, 0);
        add(cozimentoLabel, gridBagConstraints);

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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        add(cozimentoPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton assadoRadioButton;
    private javax.swing.ButtonGroup cozimentoButtonGroup;
    private javax.swing.JLabel cozimentoLabel;
    private javax.swing.JPanel cozimentoPanel;
    private javax.swing.JRadioButton fritoRadioButton;
    private javax.swing.JComboBox recheioComboBox;
    private javax.swing.JLabel recheioLabel;
    // End of variables declaration//GEN-END:variables
}

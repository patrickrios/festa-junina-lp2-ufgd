package interfaces;

import entidade.Doce;
import javax.swing.DefaultComboBoxModel;

public class PainelFiltrosDoce extends javax.swing.JPanel {

    public PainelFiltrosDoce() {
        initComponents();
        inicializarRecheios();
    }
    
    private void inicializarRecheios(){
        Doce.Recheio[] recheios = Doce.Recheio.values();
        DefaultComboBoxModel<Doce.Recheio> model = new DefaultComboBoxModel<>(recheios);
        recheioComboBox.setModel(model);
        recheioComboBox.setSelectedIndex(-1);
    }

    public void limparCampos(){
        recheioComboBox.setSelectedIndex(-1);
    }
    
    public Doce.Recheio getRecheio(){
        return (Doce.Recheio)recheioComboBox.getSelectedItem();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recheioLabel = new javax.swing.JLabel();
        recheioComboBox = new javax.swing.JComboBox();

        recheioLabel.setText("Recheio");

        recheioComboBox.setPreferredSize(new java.awt.Dimension(120, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(recheioLabel)
                    .addGap(5, 5, 5)
                    .addComponent(recheioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(recheioLabel))
                        .addComponent(recheioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox recheioComboBox;
    private javax.swing.JLabel recheioLabel;
    // End of variables declaration//GEN-END:variables
}

package interfaces;

import entidade.Doce;
import entidade.Salgado;

public class PainelFiltrosSubclassesProduto extends javax.swing.JPanel {
    PainelFiltrosSalgado filtros_salgado;
    PainelFiltrosBebida filtros_bebida;
    PainelFiltrosDoce filtros_doce;
    
    public PainelFiltrosSubclassesProduto() {
        initComponents();
        filtros_salgado = new PainelFiltrosSalgado();
        filtros_bebida = new PainelFiltrosBebida();
        filtros_doce = new PainelFiltrosDoce();
        filtros_produtosTabbedPane.add("Salgado", filtros_salgado);        
        filtros_produtosTabbedPane.add("Bebida", filtros_bebida);        
        filtros_produtosTabbedPane.add("Doce", filtros_doce);
    }
    
    public void limparCampos(){
        filtros_bebida.limparFiltros();
        filtros_salgado.limparFiltros();
        filtros_doce.limparCampos();
    }
    
    public Salgado.Recheio getRecheioSalgado(){
        return filtros_salgado.getRecheio();
    }

    public Salgado.Cozimento getCozimentoSalgado(){
        return filtros_salgado.getCozimento();
    }
    
    public char getBebidaAlcoolica(){
        return filtros_bebida.getAlcoolico();
    }
    
    public char getBebidaGaseificada(){
        return filtros_bebida.getGaseificada();
    }
    
    public Doce.Recheio getRecheioDoce(){
        return filtros_doce.getRecheio();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtros_produtosTabbedPane = new javax.swing.JTabbedPane();

        setLayout(new java.awt.BorderLayout());
        add(filtros_produtosTabbedPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane filtros_produtosTabbedPane;
    // End of variables declaration//GEN-END:variables
}

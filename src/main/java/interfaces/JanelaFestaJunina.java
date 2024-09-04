package interfaces;

import controle.ControladorCadastroBarraca;
import controle.ControladorCadastroGrupo;
import controle.ControladorCadastroProduto;
import javax.swing.JOptionPane;
import persistência.BD;

public class JanelaFestaJunina extends javax.swing.JFrame {

    public JanelaFestaJunina() {
        BD.criaConexão();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        festa_juninaMenuBar = new javax.swing.JMenuBar();
        salgadoMenu = new javax.swing.JMenu();
        cadastrar_salgadoMenuItem = new javax.swing.JMenuItem();
        pesquisar_salgadosItemMenu = new javax.swing.JMenuItem();
        grupoMenu = new javax.swing.JMenu();
        cadastrar_grupoMenuItem = new javax.swing.JMenuItem();
        pesquisar_grupoItemMenu = new javax.swing.JMenuItem();
        barracaMenu = new javax.swing.JMenu();
        cadastrar_barracaMenuItem = new javax.swing.JMenuItem();
        pesquisar_barracaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FestaJunina");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                terminarSistema(evt);
            }
        });

        salgadoMenu.setText("Produto");

        cadastrar_salgadoMenuItem.setText("Cadastrar");
        cadastrar_salgadoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarSalgado(evt);
            }
        });
        salgadoMenu.add(cadastrar_salgadoMenuItem);

        pesquisar_salgadosItemMenu.setText("Pesquisar");
        pesquisar_salgadosItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarSalgados(evt);
            }
        });
        salgadoMenu.add(pesquisar_salgadosItemMenu);

        festa_juninaMenuBar.add(salgadoMenu);

        grupoMenu.setText("Grupo");

        cadastrar_grupoMenuItem.setText("Cadastrar");
        cadastrar_grupoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarGrupo(evt);
            }
        });
        grupoMenu.add(cadastrar_grupoMenuItem);

        pesquisar_grupoItemMenu.setText("Pesquisar");
        pesquisar_grupoItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarGrupos(evt);
            }
        });
        grupoMenu.add(pesquisar_grupoItemMenu);

        festa_juninaMenuBar.add(grupoMenu);

        barracaMenu.setText("Barraca");

        cadastrar_barracaMenuItem.setText("Cadastrar");
        cadastrar_barracaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBarraca(evt);
            }
        });
        barracaMenu.add(cadastrar_barracaMenuItem);

        pesquisar_barracaMenuItem.setText("Pesquisar");
        pesquisar_barracaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBarracas(evt);
            }
        });
        barracaMenu.add(pesquisar_barracaMenuItem);

        festa_juninaMenuBar.add(barracaMenu);

        setJMenuBar(festa_juninaMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarSalgado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarSalgado
        new ControladorCadastroProduto();
    }//GEN-LAST:event_cadastrarSalgado

    private void terminarSistema(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_terminarSistema
        BD.fechaConexão();
        System.exit(0);
    }//GEN-LAST:event_terminarSistema

    private void pesquisarSalgados(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarSalgados
        informarServiçoIndisponível();
    }//GEN-LAST:event_pesquisarSalgados

    private void cadastrarGrupo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarGrupo
        new ControladorCadastroGrupo();
    }//GEN-LAST:event_cadastrarGrupo

    private void pesquisarGrupos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarGrupos
        informarServiçoIndisponível();
    }//GEN-LAST:event_pesquisarGrupos

    private void cadastrarBarraca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBarraca
        // TODO add your handling code here:
        new ControladorCadastroBarraca();
    }//GEN-LAST:event_cadastrarBarraca

    private void pesquisarBarracas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBarracas
        new JanelaPesquisaBarracas();
    }//GEN-LAST:event_pesquisarBarracas

    private void informarServiçoIndisponível(){
        JOptionPane.showMessageDialog(this, "Serviço Indisponível", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaFestaJunina().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu barracaMenu;
    private javax.swing.JMenuItem cadastrar_barracaMenuItem;
    private javax.swing.JMenuItem cadastrar_grupoMenuItem;
    private javax.swing.JMenuItem cadastrar_salgadoMenuItem;
    private javax.swing.JMenuBar festa_juninaMenuBar;
    private javax.swing.JMenu grupoMenu;
    private javax.swing.JMenuItem pesquisar_barracaMenuItem;
    private javax.swing.JMenuItem pesquisar_grupoItemMenu;
    private javax.swing.JMenuItem pesquisar_salgadosItemMenu;
    private javax.swing.JMenu salgadoMenu;
    // End of variables declaration//GEN-END:variables
}
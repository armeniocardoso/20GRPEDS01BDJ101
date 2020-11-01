package br.edu.infnet.app;

import br.edu.infnet.dominio.Funcionario;
import br.edu.infnet.dominio.Horista;
import br.edu.infnet.infra.FuncionarioDAO;
import java.text.DecimalFormat;
import java.util.Collection;

public class FolhaPagamento extends javax.swing.JFrame {

    private final int HORISTA = 1;
    private final int MENSALISTA = 2;
    private final int VENDEDOR = 3;
    private FuncionarioDAO funcionarioDAO;
    private DecimalFormat formatador = new DecimalFormat("#,##0.00");

    public FolhaPagamento() {
        initComponents();
        funcionarioDAO = new FuncionarioDAO();
        this.listarFuncionarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstFuncionarios = new java.awt.List();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        lstCargos = new javax.swing.JComboBox<>();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JFormattedTextField();
        lblComissao = new javax.swing.JLabel();
        txtComissao = new javax.swing.JFormattedTextField();
        lblTotalVendas = new javax.swing.JLabel();
        txtTotalVendas = new javax.swing.JFormattedTextField();
        lblValorHora = new javax.swing.JLabel();
        txtValorHora = new javax.swing.JFormattedTextField();
        lblTotalHoras = new javax.swing.JLabel();
        txtTotalHoras = new javax.swing.JFormattedTextField();
        pnlBotoes = new java.awt.Panel();
        btnSalvar = new java.awt.Button();
        btnExcluir = new java.awt.Button();
        btnLimpar = new java.awt.Button();
        btnImprimir = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMatricula.setText("Matrícula:");

        txtMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        lblNome.setText("Nome:");

        lblCargo.setText("Cargo:");

        lstCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Horista", "Mensalista", "Vendedor" }));
        lstCargos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstCargosItemStateChanged(evt);
            }
        });

        lblSalario.setText("Salário:");

        txtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        lblComissao.setText("Comissão:");

        txtComissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        lblTotalVendas.setText("Total de Vendas:");

        txtTotalVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        lblValorHora.setText("Valor Hora:");

        txtValorHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        lblTotalHoras.setText("Total Horas:");

        txtTotalHoras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        btnSalvar.setLabel("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnSalvar);

        btnExcluir.setEnabled(false);
        btnExcluir.setLabel("Excluir");
        pnlBotoes.add(btnExcluir);

        btnLimpar.setLabel("Limpar");
        pnlBotoes.add(btnLimpar);

        btnImprimir.setLabel("Imprimir");
        pnlBotoes.add(btnImprimir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblCargo)
                    .addComponent(lblSalario)
                    .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalVendas)
                    .addComponent(lblComissao)
                    .addComponent(lblValorHora)
                    .addComponent(lblTotalHoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(lstCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lstFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatricula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(lstCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComissao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalVendas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorHora))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalHoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 459, 659);
    }// </editor-fold>//GEN-END:initComponents

    private void lstCargosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstCargosItemStateChanged

        int itemSelecionado = lstCargos.getSelectedIndex();
        switch (itemSelecionado) {

            case HORISTA:
                txtSalario.setEnabled(false);
                txtComissao.setEnabled(false);
                txtTotalVendas.setEnabled(false);
                txtValorHora.setEnabled(true);
                txtTotalHoras.setEnabled(true);
                break;
            case MENSALISTA:
                txtSalario.setEnabled(true);
                txtComissao.setEnabled(false);
                txtTotalVendas.setEnabled(false);
                txtValorHora.setEnabled(false);
                txtTotalHoras.setEnabled(false);
                break;
            case VENDEDOR:
                txtSalario.setEnabled(true);
                txtComissao.setEnabled(true);
                txtTotalVendas.setEnabled(true);
                txtValorHora.setEnabled(false);
                txtTotalHoras.setEnabled(false);
        }
    }//GEN-LAST:event_lstCargosItemStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Funcionario funcionario = null;
        int itemSelecionado = lstCargos.getSelectedIndex();
        switch (itemSelecionado) {

            case HORISTA:
                try {
                    int matricula = Integer.parseInt(txtMatricula.getText());

                    double valorHora = formatador.parse(txtValorHora.getText()).doubleValue();
                    int totalHoras = Integer.parseInt(txtTotalHoras.getText());
                    funcionario = new Horista(
                            matricula,
                            txtNome.getText(),
                            "Horista",
                            valorHora,
                            totalHoras);
                    funcionarioDAO.inserir(funcionario);
                } catch (Exception e) {
                    
                    e.printStackTrace();
                }
            break;
            case MENSALISTA:
                break;
            case VENDEDOR:
        }
        this.listarFuncionarios();
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FolhaPagamento().setVisible(true);
            }
        });
    }

    private void listarFuncionarios() {

        Collection<Funcionario> lista = funcionarioDAO.listar();
        if (lista != null && !lista.isEmpty()) {

            lstFuncionarios.removeAll();
            for (Funcionario funcionario : lista) {

                lstFuncionarios.add(funcionario.getMatricula()
                        + " - " + funcionario.getNome());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnExcluir;
    private java.awt.Button btnImprimir;
    private java.awt.Button btnLimpar;
    private java.awt.Button btnSalvar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblComissao;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTotalHoras;
    private javax.swing.JLabel lblTotalVendas;
    private javax.swing.JLabel lblValorHora;
    private javax.swing.JComboBox<String> lstCargos;
    private java.awt.List lstFuncionarios;
    private java.awt.Panel pnlBotoes;
    private javax.swing.JFormattedTextField txtComissao;
    private javax.swing.JFormattedTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtSalario;
    private javax.swing.JFormattedTextField txtTotalHoras;
    private javax.swing.JFormattedTextField txtTotalVendas;
    private javax.swing.JFormattedTextField txtValorHora;
    // End of variables declaration//GEN-END:variables
}

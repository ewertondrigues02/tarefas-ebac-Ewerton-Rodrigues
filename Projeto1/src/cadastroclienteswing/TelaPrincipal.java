/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastroclienteswing;

import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ewerton
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    private DefaultTableModel modelo = new DefaultTableModel();
    private IClienteDAO clienteDAO = new ClienteMapDAO();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemSair = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 150));
        setResizable(false);

        lblNome.setText("Nome: ");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF: ");

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "Endereço"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        jLabel1.setText("Telefone");

        jLabel2.setText("Endereço");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");

        MenuItemSair.setSelected(true);
        MenuItemSair.setText("Sair");
        MenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpar)
                                .addGap(34, 34, 34)
                                .addComponent(btnSalvar)
                                .addGap(30, 30, 30)
                                .addComponent(btnExcluir)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnAtualizar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnAtualizar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Deseja sair da Aplicação?","Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
        System.exit(0);}
    }//GEN-LAST:event_MenuItemSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       String nome = txtNome.getText();
       String cpf = txtCpf.getText();
       String tel = txtTel.getText();
       String end = txtEnd.getText();
       
       if(!isCamposValidos(nome, cpf, tel, end)){
           JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos ","Atenção", JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       
       Cliente cliente = new Cliente(nome,cpf, tel, end, cpf, cpf, cpf );
       Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
       
       if(isCadastrado){
           modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTel(), cliente.getEnd()});
           limparCampos();
       } else {
           JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
       }
      
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
       int linhaSelecionada = tabelaClientes.getSelectedRow();
       Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
       
       Cliente cliente = this.clienteDAO.consultar(cpf);
       
       txtNome.setText(cliente.getNome());
       txtCpf.setText(cliente.getCpf().toString());
       txtTel.setText(cliente.getTel().toString());
       txtEnd.setText(cliente.getEnd());
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tabelaClientes.getSelectedRow();
        
        if (linhaSelecionada >=0) {
            int result = JOptionPane.showConfirmDialog(this, "deseja realmente excluir este cliente?", "Cuidado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           
           if(result == JOptionPane.YES_OPTION){
           Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
           this.clienteDAO.excluir(cpf);
           modelo.removeRow(linhaSelecionada);
           
           JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
           limparCampos();
           }
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtCpf.setText("");
        txtTel.setText("");
        txtEnd.setText("");
       
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
       String nome = txtNome.getText();
       String cpf = txtCpf.getText();
       String tel = txtTel.getText();
       String end = txtEnd.getText();
       
       Cliente cliente = new Cliente(nome,cpf, tel, end, cpf, cpf, cpf );
       Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
       cliente.setNome(nome);
       cliente.setCpf(Long.parseLong(cpf));
       cliente.setTel(Long.parseLong(tel));
       cliente.setEnd(end);
       
       if(!isCamposValidos(nome, cpf, tel, end)){
           JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos ","Atenção", JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       
       if(isCadastrado){
           modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTel(), cliente.getEnd()});
           limparCampos();
       } else {
           JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem MenuItemSair;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos) {
       for(String campo : campos){
         if(campo == null || "".equals(campo)){
         return false;
         }
       }
        return true;
    }

    private void initCustomComponents() {
       modelo.addColumn("Nome");
       modelo.addColumn("CPF");
       modelo.addColumn("Telefone");
       modelo.addColumn("Endereço");
       
       tabelaClientes.setModel(modelo);
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtTel.setText("");
        txtEnd.setText("");
    }
}

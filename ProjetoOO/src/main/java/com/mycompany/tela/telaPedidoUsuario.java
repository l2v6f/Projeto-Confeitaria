/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tela;

import com.mycompany.classes.Endereco;
import com.mycompany.classes.ItensPedido;
import com.mycompany.classes.Pedido;
import com.mycompany.classes.Produto;
import com.mycompany.classes.Telefone;
import com.mycompany.classes.Usuario;
import com.mycompany.conexao.GenericDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class telaPedidoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form telaPedidoUsuario
     */
    Pedido pedido;
    Produto produto;
    ItensPedido itensPedido;

    private final GenericDAO<Endereco> enderecoDAO;
    private final GenericDAO<Telefone> telefoneDAO;
    private final GenericDAO<Usuario> usuarioDAO;
    private final GenericDAO<Pedido> pedidoDAO;
    private final GenericDAO<Produto> produtoDAO;
    private final GenericDAO<ItensPedido> itensPedidoDAO;

    public telaPedidoUsuario() {
        initComponents();

        enderecoDAO = new GenericDAO<>();
        telefoneDAO = new GenericDAO<>();
        usuarioDAO = new GenericDAO<>();
        pedidoDAO = new GenericDAO<>();
        produtoDAO = new GenericDAO<>();
        itensPedidoDAO = new GenericDAO<>();
        popularJcomboBoxUsuario();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CpUsuario = new javax.swing.JComboBox<>();
        DataEntrega = new javax.swing.JTextField();
        DataPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TipoProduto = new javax.swing.JComboBox<>();
        Quantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Massa = new javax.swing.JComboBox<>();
        Recheio = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Cobertura = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Tamanho = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Descricao = new javax.swing.JTextField();
        CpfPedido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(27, 187, 125));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Realizar Pedidos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");

        DataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataEntregaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setText("Data de Entrega:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("Data do Pedido: ");

        jButton1.setText("Realizar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a opção>", "Bolo", "CupCake", "Doce para festa" }));
        TipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Quantidade:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel7.setText("Massa:");

        Massa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a Massa>", "Baunilha", "Pao-de-lo", "Chocolate" }));

        Recheio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Recheio>", "Beijinho", "Chocolate meio amargo", "Chocolate ao leite", "Chocolate branco", "Doce de leite", "Sensacao", "Ninho" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel8.setText("Recheio:");

        Cobertura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a Cobertura>", "Chantilly", "Chantinho", "Marshmallow" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel9.setText("Cobertura:");

        Tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Tamanho>", "Grande", "Medio", "Pequeno" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel10.setText("Tamanho");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel11.setText("Descrição:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Cpf:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(CpUsuario, 0, 163, Short.MAX_VALUE)
                                .addComponent(Quantidade))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DataEntrega, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(91, 91, 91))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(DataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Recheio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(145, 145, 145)
                                        .addComponent(jLabel8)
                                        .addGap(147, 147, 147)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12)
                                        .addComponent(Cobertura, 0, 170, Short.MAX_VALUE)
                                        .addComponent(CpfPedido)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(TipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addComponent(Massa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfPedido)
                    .addComponent(TipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Massa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recheio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cobertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void DataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataEntregaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (DataEntrega.getText().equals("") || DataPedido.getText().equals("") || TipoProduto.getSelectedItem().equals("<Selecione a opção>") || Quantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos:Data Entrega e Data pedido são obrigatórios, verifique todos e tente novamente", "", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = null;
            long idPedido = 0;
            long idProduto = 0;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/confeitaria", "root", "cesar0511");
                Statement stm = con.createStatement();

                String SQL = "Select * from usuario where nome = '" + CpUsuario.getSelectedItem() + "' and cpf = '" + CpfPedido.getText() + "';";
                ResultSet rs = stm.executeQuery(SQL);

                if (rs.next()) {
                    do {
                        String SQL2 = "Insert into pedido(id_usuario,data_entrega,data_pedido) values(" + rs.getString("id") + ",'" + DataEntrega.getText() + "','" + DataPedido.getText() + "');";
                        PreparedStatement st = con.prepareStatement(SQL2, Statement.RETURN_GENERATED_KEYS);
                        st.executeUpdate();
                        ResultSet sr = st.getGeneratedKeys();
                        if (sr.next()) {
                            idPedido = sr.getLong(1);
                        }

                    } while (rs.next());
                    if (TipoProduto.getSelectedItem().equals("Bolo")) {
                        String SQLproduto = "Insert into produto(com_recheio,tem_massa,tem_cobertura,unidade) values(" + true + "," + true + "," + true + "," + Integer.parseInt(Quantidade.getText()) + ");";
                        PreparedStatement STM = con.prepareStatement(SQLproduto, Statement.RETURN_GENERATED_KEYS);
                        STM.executeUpdate();
                        ResultSet anrs = STM.getGeneratedKeys();
                        if (anrs.next()) {
                            idProduto = anrs.getLong(1);
                        }
                        String SqlItens = "Insert into itens_pedido(id_pedido,id_produto,massa,recheio,cobertura,tamanho,descricao) values(" + idPedido + "," + idProduto + ",'" + Massa.getSelectedItem().toString() + "','" + Recheio.getSelectedItem().toString() + "','" + Cobertura.getSelectedItem().toString() + "','" + Tamanho.getSelectedItem().toString() + "','" + Descricao.getText() + "');";
                        PreparedStatement st = con.prepareStatement(SqlItens, Statement.RETURN_GENERATED_KEYS);
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Pedido Realizado com sucesso!", "", JOptionPane.WARNING_MESSAGE);
                    }
                    if (TipoProduto.getSelectedItem().equals("CupCake")) {
                        String SQLproduto = "Insert into produto(com_recheio,tem_massa,tem_cobertura,unidade) values(" + false + "," + true + "," + true + "," + Integer.parseInt(Quantidade.getText()) + ");";
                        PreparedStatement STM = con.prepareStatement(SQLproduto, Statement.RETURN_GENERATED_KEYS);
                        STM.executeUpdate();
                        ResultSet anrs = STM.getGeneratedKeys();
                        if (anrs.next()) {
                            idProduto = anrs.getLong(1);
                        }
                        String SqlItens = "Insert into itens_pedido(id_pedido,id_produto,massa,cobertura,tamanho,descricao) values(" + idPedido + "," + idProduto + ",'" + Massa.getSelectedItem().toString() + "','" + Cobertura.getSelectedItem().toString() + "','" + Tamanho.getSelectedItem().toString() + "','" + Descricao.getText() + "');";
                        PreparedStatement st = con.prepareStatement(SqlItens, Statement.RETURN_GENERATED_KEYS);
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Pedido Realizado com sucesso!", "", JOptionPane.WARNING_MESSAGE);
                    }
                    if (TipoProduto.getSelectedItem().equals("Doce para festa")) {
                        String SQLproduto = "Insert into produto(com_recheio,tem_massa,tem_cobertura,unidade) values(" + false + "," + false + "," + false + "," + Integer.parseInt(Quantidade.getText()) + ");";
                        PreparedStatement STM = con.prepareStatement(SQLproduto, Statement.RETURN_GENERATED_KEYS);
                        STM.executeUpdate();
                        ResultSet anrs = STM.getGeneratedKeys();
                        if (anrs.next()) {
                            idProduto = anrs.getLong(1);
                        }
                        String SqlItens = "Insert into itens_pedido(id_pedido,id_produto,descricao) values(" + idPedido + "," + idProduto + ",'" + Descricao.getText() + "');";
                        PreparedStatement st = con.prepareStatement(SqlItens, Statement.RETURN_GENERATED_KEYS);
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Pedido Realizado com sucesso!", "", JOptionPane.WARNING_MESSAGE);
                    }

//                    if (resposta) {
//
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Não foi possivel registrar o produto!", "", JOptionPane.WARNING_MESSAGE);
//                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível localizar o registro, por favor verifique se o cpf foi passado como cadastrado", "", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro na conexão, com o banco de dados!", "", JOptionPane.WARNING_MESSAGE);
            } finally {
                try {
                    con.close();
                } catch (SQLException onConClose) {
                    JOptionPane.showMessageDialog(null, "Erro na conexão, com o banco de dados!", "", JOptionPane.WARNING_MESSAGE);
                }
            }

//            if (resposta) {
//                JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(null, "Não foi possivel finalizado cadastro!", "", JOptionPane.WARNING_MESSAGE);
//            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoProdutoActionPerformed
        if (TipoProduto.getSelectedItem().equals("Bolo")) {
            Massa.setEnabled(true);
            Recheio.setEnabled(true);
            Cobertura.setEnabled(true);
            Tamanho.setEnabled(true);
        }
        if (TipoProduto.getSelectedItem().equals("CupCake")) {
            Massa.setEnabled(true);
            Recheio.setEnabled(true);
            Cobertura.setEnabled(true);
            Tamanho.setEnabled(false);
        }
        if (TipoProduto.getSelectedItem().equals("Doce para festa")) {
            Massa.setEnabled(false);
            Recheio.setEnabled(false);
            Cobertura.setEnabled(false);
            Tamanho.setEnabled(false);
        }
    }//GEN-LAST:event_TipoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(telaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new telaPedidoUsuario().setVisible(true);
            }
        });
    }

    private void popularJcomboBoxUsuario() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/confeitaria", "root", "cesar0511");
            Statement stm = con.createStatement();
            String SQL = "Select * from usuario;";

            ResultSet rs = stm.executeQuery(SQL);
            while (rs.next()) {
                CpUsuario.addItem(rs.getObject("nome"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão, com o banco de dados!", "", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException onConClose) {
                JOptionPane.showMessageDialog(null, "Erro na conexão, com o banco de dados!", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cobertura;
    private javax.swing.JComboBox<Object> CpUsuario;
    private javax.swing.JTextField CpfPedido;
    private javax.swing.JTextField DataEntrega;
    private javax.swing.JTextField DataPedido;
    private javax.swing.JTextField Descricao;
    private javax.swing.JComboBox<String> Massa;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JComboBox<String> Recheio;
    private javax.swing.JComboBox<String> Tamanho;
    private javax.swing.JComboBox<String> TipoProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

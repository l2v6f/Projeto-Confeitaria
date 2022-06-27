/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tela;

import com.mycompany.classes.Endereco;
import com.mycompany.classes.Telefone;
import com.mycompany.classes.Usuario;
import com.mycompany.conexao.GenericDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class telaCadastroUsuario extends javax.swing.JFrame {

    Telefone telefone;
    Endereco endereco;
    Usuario usuario;

    private final GenericDAO<Endereco> enderecoDAO;
    private final GenericDAO<Telefone> telefoneDAO;
    private final GenericDAO<Usuario> usuarioDAO;

    public telaCadastroUsuario() {
        initComponents();

        enderecoDAO = new GenericDAO<>();
        telefoneDAO = new GenericDAO<>();
        usuarioDAO = new GenericDAO<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logradouro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Quadra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Lote = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Estado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Cep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Bairro = new javax.swing.JTextField();
        SalvarEndereco = new javax.swing.JButton();
        LimparEndereco = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        DDD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Numero = new javax.swing.JTextField();
        Tipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        LimparTelefone = new javax.swing.JButton();
        SalvarTelefone = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Cpf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Rg = new javax.swing.JTextField();
        LimparUsuario = new javax.swing.JButton();
        SalvarUsuario = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CepUsuario = new javax.swing.JTextField();
        TelefoneUsuario = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setText("Logradouro:");
        jLabel1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setText("Quadra:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("Lote:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setText("Cidade:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Estado:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel7.setText("Cep:");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel8.setText("Bairro:");
        jLabel8.setToolTipText("");

        SalvarEndereco.setText("Salvar Endereço");
        SalvarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarEnderecoActionPerformed(evt);
            }
        });

        LimparEndereco.setText("Limpar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LimparEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(SalvarEndereco))
                    .addComponent(Logradouro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quadra, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lote, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cidade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cep, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bairro, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quadra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Lote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SalvarEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(LimparEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Endereço", jPanel1);

        jLabel9.setText("DDD ");

        DDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DDDActionPerformed(evt);
            }
        });

        jLabel10.setText("Numero");

        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o tipo>", "Comercial", "Residencial", "Celular" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo");

        LimparTelefone.setText("Limpar");

        SalvarTelefone.setText("Salvar Telefone");
        SalvarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DDD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tipo, 0, 199, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LimparTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SalvarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DDD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimparTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalvarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Telefone", jPanel2);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel12.setText("Nome:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel13.setText("Email:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel14.setText("Senha:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel15.setText("Cpf:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel16.setText("Rg:");

        LimparUsuario.setText("Limpar");

        SalvarUsuario.setText("Salvar Usuario");
        SalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarUsuarioActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel17.setText("Cep:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel18.setText("Telefone:");

        TelefoneUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelefoneUsuario)
                    .addComponent(CepUsuario)
                    .addComponent(Cpf)
                    .addComponent(Rg)
                    .addComponent(Email)
                    .addComponent(Nome)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LimparUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(SalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(Senha))
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(CepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimparUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuario", jPanel3);

        jPanel4.setBackground(new java.awt.Color(27, 187, 125));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void DDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DDDActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void SalvarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarEnderecoActionPerformed
        if (Logradouro.getText().equals("") || Quadra.getText().equals("") || Cidade.getText().equals("") || Estado.getText().equals("") || Bairro.getText().equals("") || Cep.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos: Logradouro,Quadra,Cidade,Estado,Cep e Bairro são obrigatórios, verifique todos e tente novamente", "", JOptionPane.WARNING_MESSAGE);
        } else {

            endereco = new Endereco();
            endereco.setLogradouro(Logradouro.getText());
            endereco.setQuadra(Quadra.getText());
            endereco.setCidade(Cidade.getText());
            endereco.setEstado(Estado.getText());
            endereco.setBairro(Bairro.getText());
            endereco.setCep(Cep.getText());
            endereco.setLote(Lote.getText());

            boolean resposta = enderecoDAO.saveOrUpdate(endereco);

            if (resposta) {
                JOptionPane.showMessageDialog(null, "Cadastro de endereço realizado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
                this.jTabbedPane1.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel realizar o cadastro!", "", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_SalvarEnderecoActionPerformed

    private void SalvarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarTelefoneActionPerformed
        if (DDD.getText().equals("") || Numero.getText().equals("") || Tipo.getSelectedItem().equals("<Selecione o tipo>")) {
            JOptionPane.showMessageDialog(null, "Os campos: DDD,Telefone e Tipo são obrigatórios, verifique todos e tente novamente", "", JOptionPane.WARNING_MESSAGE);
        } else {

            telefone = new Telefone();
            telefone.setDdd(DDD.getText());
            telefone.setNumero(Numero.getText());
            if (Tipo.getSelectedItem().equals("Comercial")) {
                telefone.setTipo("COM");
            }
            if (Tipo.getSelectedItem().equals("Residencial")) {
                telefone.setTipo("RES");
            }
            if (Tipo.getSelectedItem().equals("Celular")) {
                telefone.setTipo("CEL");
            }
            boolean resposta = telefoneDAO.saveOrUpdate(telefone);

            if (resposta) {
                JOptionPane.showMessageDialog(null, "Cadastro de telefone realizado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
                this.jTabbedPane1.setSelectedIndex(2);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel realizar o cadastro!", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SalvarTelefoneActionPerformed

    private void SalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarUsuarioActionPerformed
        if (Nome.getText().equals("") || Email.getText().equals("") || Cpf.getText().equals("") || Senha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos: Nome,Email,Cpf e Senha são obrigatórios, verifique todos e tente novamente", "", JOptionPane.WARNING_MESSAGE);
        } else {
            usuario = new Usuario();
            usuario.setNome(Nome.getText());
            usuario.setEmail(Email.getText());
            usuario.setCpf(Cpf.getText());
            usuario.setRg(Rg.getText());
            usuario.setSenha(Senha.getText());
            usuario.setTipo("CLIE");
            boolean resposta = usuarioDAO.saveOrUpdate(usuario);
            Connection con = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/confeitaria", "root", "cesar0511");
                Statement stm = con.createStatement();
                Statement st = con.createStatement();
                Statement Stm = con.createStatement();
                Statement St = con.createStatement();               
                String SQL = "Select * from endereco where cep = '" + CepUsuario.getText() + "';";
                String NewSql = "Select * from telefone where numero = '" + TelefoneUsuario.getText() + "';";

                ResultSet rs = stm.executeQuery(SQL);                
                while (rs.next()) {
                    String SQL2 = "Update usuario set id_endereco = " + rs.getString("id") + " where cpf = '" + Cpf.getText() + "' ;";
                    st.executeUpdate(SQL2);
                }
                ResultSet sr = Stm.executeQuery(NewSql);
                while (sr.next()) {
                    String NewSql2 = "Update usuario set id_telefone = " + sr.getString("id") + " where cpf = '" + Cpf.getText() + "' ;";
                    St.executeUpdate(NewSql2);
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
            //
            //endereco = enderecoDAO.findByCep(CepUsuario.getText());

            if (resposta) {
                JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
                new telaLoginUsuario().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel finalizado cadastro!", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SalvarUsuarioActionPerformed

    private void TelefoneUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefoneUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroUsuario().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JTextField Cep;
    private javax.swing.JTextField CepUsuario;
    private javax.swing.JTextField Cidade;
    private javax.swing.JTextField Cpf;
    private javax.swing.JTextField DDD;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Estado;
    private javax.swing.JButton LimparEndereco;
    private javax.swing.JButton LimparTelefone;
    private javax.swing.JButton LimparUsuario;
    private javax.swing.JTextField Logradouro;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Numero;
    private javax.swing.JTextField Quadra;
    private javax.swing.JTextField Rg;
    private javax.swing.JButton SalvarEndereco;
    private javax.swing.JButton SalvarTelefone;
    private javax.swing.JButton SalvarUsuario;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField TelefoneUsuario;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.programador.poo.ejercicio_29;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio29 extends javax.swing.JFrame {

    ImageIcon user;
    ImageIcon walter;
    ImageIcon jesse;
    ImageIcon gus;
    ImageIcon saul;
    Icon iconoUser;
    Icon iconoWalter;
    Icon iconoJesse;
    Icon iconoGus;
    Icon iconoSaul;

    /**
     * Creates new form Ejercicio29
     */
    public Ejercicio29() {
        initComponents();
        this.user = new ImageIcon("src/main/java/com/programador/poo/assets/user.png");
        this.walter = new ImageIcon("src/main/java/com/programador/poo/assets/walter.jpg");
        this.jesse = new ImageIcon("src/main/java/com/programador/poo/assets/jesse.jpg");
        this.gus = new ImageIcon("src/main/java/com/programador/poo/assets/gus.jpg");
        this.saul = new ImageIcon("src/main/java/com/programador/poo/assets/saul.jpg");
        this.iconoUser = new ImageIcon(user.getImage().getScaledInstance(this.jImageUser.getWidth(), this.jImageUser.getHeight(), Image.SCALE_DEFAULT));
        this.iconoWalter = new ImageIcon(walter.getImage().getScaledInstance(this.jImageUser.getWidth(), this.jImageUser.getHeight(), Image.SCALE_DEFAULT));
        this.iconoJesse = new ImageIcon(jesse.getImage().getScaledInstance(this.jImageUser.getWidth(), this.jImageUser.getHeight(), Image.SCALE_DEFAULT));
        this.iconoGus = new ImageIcon(gus.getImage().getScaledInstance(this.jImageUser.getWidth(), this.jImageUser.getHeight(), Image.SCALE_DEFAULT));
        this.iconoSaul = new ImageIcon(saul.getImage().getScaledInstance(this.jImageUser.getWidth(), this.jImageUser.getHeight(), Image.SCALE_DEFAULT));
        this.jImageUser.setIcon(iconoUser);
        this.jImageUser.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jImageUser = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jCRecovery = new javax.swing.JCheckBox();
        jBConfirm = new javax.swing.JButton();
        jCUserName = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jImageUser.setText("jLabel1");
        jImageUser.setPreferredSize(new java.awt.Dimension(50, 50));

        jLPassword.setText("Password");

        jCRecovery.setText("Recuperar contraseña");
        jCRecovery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRecoveryActionPerformed(evt);
            }
        });

        jBConfirm.setText("Enviar");
        jBConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmActionPerformed(evt);
            }
        });

        jCUserName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione usuario", "Walter", "Jesse", "Gus", "Saul" }));
        jCUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCUserNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPassword)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCRecovery, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jBConfirm))
                    .addComponent(jImageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jImageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCRecovery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBConfirm)
                .addGap(21, 21, 21))
        );

        jCRecovery.getAccessibleContext().setAccessibleName("Recuperar contraseña");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCRecoveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRecoveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCRecoveryActionPerformed

    private void jBConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmActionPerformed
        if (this.jCRecovery.isSelected()) {
            ResetPassword form = new ResetPassword();
            form.setVisible(true);
            this.setVisible(false);
        } else {
            switch (this.jCUserName.getSelectedItem().toString()) {
                case "Seleccione usuario":
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    break;
                case "Walter":

                    if (String.valueOf(this.jPassword.getPassword()).equals("123456")) {
                        JOptionPane.showMessageDialog(null, "Ingreso satifactorio", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña es inválida", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Jesse":
                    if (String.valueOf(this.jPassword.getPassword()).equals("123456")) {
                        JOptionPane.showMessageDialog(null, "Ingreso satifactorio", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña es inválida", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Gus":
                    if (String.valueOf(this.jPassword.getPassword()).equals("123456")) {
                        JOptionPane.showMessageDialog(null, "Ingreso satifactorio", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña es inválida", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Saul":
                    if (String.valueOf(this.jPassword.getPassword()).equals("123456")) {
                        JOptionPane.showMessageDialog(null, "Ingreso satifactorio", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña es inválida", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

            }
        }

    }//GEN-LAST:event_jBConfirmActionPerformed

    private void jCUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCUserNameActionPerformed
        switch (this.jCUserName.getSelectedItem().toString()) {
            case "Seleccione usuario":
                this.jImageUser.setIcon(this.iconoUser);
                break;
            case "Walter":
                this.jImageUser.setIcon(this.iconoWalter);
                break;
            case "Jesse":
                this.jImageUser.setIcon(this.iconoJesse);
                break;
            case "Gus":
                this.jImageUser.setIcon(this.iconoGus);
                break;
            case "Saul":
                this.jImageUser.setIcon(this.iconoSaul);
                break;
        }
        this.jImageUser.repaint();
    }//GEN-LAST:event_jCUserNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void inicializarEjercicio29() {
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
            java.util.logging.Logger.getLogger(Ejercicio29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio29().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirm;
    private javax.swing.JCheckBox jCRecovery;
    private javax.swing.JComboBox<String> jCUserName;
    private javax.swing.JLabel jImageUser;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}

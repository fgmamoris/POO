/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.programador.poo.ejercicio_25;
/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio25 extends javax.swing.JFrame {

    public float firstNumber;
    public float secondNumber;
    public String operator;

    /**
     * Creates new form Ejercicio24
     */
    public Ejercicio25() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelCentral = new javax.swing.JPanel();
        jButtonNumber4 = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonPercentage = new javax.swing.JButton();
        jButtonMultiplication = new javax.swing.JButton();
        jButtonNumber9 = new javax.swing.JButton();
        jButtonNumer8 = new javax.swing.JButton();
        jButtonNumber7 = new javax.swing.JButton();
        jButtonNumber5 = new javax.swing.JButton();
        jButtonNumber6 = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonNumber2 = new javax.swing.JButton();
        jButtonNumber1 = new javax.swing.JButton();
        jButtonNumber3 = new javax.swing.JButton();
        jButtonNumber0 = new javax.swing.JButton();
        jButtonDecimal = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jResult = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        jPanelCentral.setName("Calculator"); // NOI18N
        jPanelCentral.setPreferredSize(new java.awt.Dimension(380, 280));
        jPanelCentral.setRequestFocusEnabled(false);

        jButtonNumber4.setText("4");
        jButtonNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber4ActionPerformed(evt);
            }
        });

        jButtonReset.setText("AC");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonDivision.setText("/");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jButtonPercentage.setText("%");
        jButtonPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPercentageActionPerformed(evt);
            }
        });

        jButtonMultiplication.setText("*");
        jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicationActionPerformed(evt);
            }
        });

        jButtonNumber9.setText("9");
        jButtonNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber9ActionPerformed(evt);
            }
        });

        jButtonNumer8.setText("8");
        jButtonNumer8.setActionCommand("");
        jButtonNumer8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumer8ActionPerformed(evt);
            }
        });

        jButtonNumber7.setText("7");
        jButtonNumber7.setActionCommand("");
        jButtonNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber7ActionPerformed(evt);
            }
        });

        jButtonNumber5.setText("5");
        jButtonNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber5ActionPerformed(evt);
            }
        });

        jButtonNumber6.setText("6");
        jButtonNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber6ActionPerformed(evt);
            }
        });

        jButtonMinus.setText("-");
        jButtonMinus.setToolTipText("");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonNumber2.setText("2");
        jButtonNumber2.setToolTipText("");
        jButtonNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber2ActionPerformed(evt);
            }
        });

        jButtonNumber1.setText("1");
        jButtonNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber1ActionPerformed(evt);
            }
        });

        jButtonNumber3.setText("3");
        jButtonNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber3ActionPerformed(evt);
            }
        });

        jButtonNumber0.setText("0");
        jButtonNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber0ActionPerformed(evt);
            }
        });

        jButtonDecimal.setText(",");
        jButtonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDecimalActionPerformed(evt);
            }
        });

        jButtonEquals.setText("=");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jResult.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jResult.setName(""); // NOI18N

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addComponent(jResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCentralLayout.createSequentialGroup()
                                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                                        .addComponent(jButtonNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(jButtonNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonNumber0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCentralLayout.createSequentialGroup()
                                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCentralLayout.createSequentialGroup()
                                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCentralLayout.createSequentialGroup()
                                                .addComponent(jButtonNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonNumer8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                                        .addComponent(jButtonNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jResult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumer8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber3ActionPerformed
        this.jResult.setText(this.jResult.getText() + "3");
    }//GEN-LAST:event_jButtonNumber3ActionPerformed

    private void jButtonNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber1ActionPerformed
        this.jResult.setText(this.jResult.getText() + "1");
    }//GEN-LAST:event_jButtonNumber1ActionPerformed

    private void jButtonNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber2ActionPerformed
        this.jResult.setText(this.jResult.getText() + "2");
    }//GEN-LAST:event_jButtonNumber2ActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        if (this.jResult.getText().isEmpty()) {
            this.jResult.setText("Error");
        } else {
            this.firstNumber = Float.parseFloat(this.jResult.getText().replace(",", "."));
            this.operator = "+";
            this.jResult.setText("");
        }
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        if (this.jResult.getText().isEmpty()) {
            this.jResult.setText("Error");
        } else {
            this.firstNumber = Float.parseFloat(this.jResult.getText().replace(",", "."));
            this.operator = "-";
            this.jResult.setText("");
        }
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber6ActionPerformed
        this.jResult.setText(this.jResult.getText() + "6");
    }//GEN-LAST:event_jButtonNumber6ActionPerformed

    private void jButtonNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber5ActionPerformed
        this.jResult.setText(this.jResult.getText() + "5");
    }//GEN-LAST:event_jButtonNumber5ActionPerformed

    private void jButtonNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber7ActionPerformed
        this.jResult.setText(this.jResult.getText() + "7");
    }//GEN-LAST:event_jButtonNumber7ActionPerformed

    private void jButtonNumer8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumer8ActionPerformed
        this.jResult.setText(this.jResult.getText() + "8");
    }//GEN-LAST:event_jButtonNumer8ActionPerformed

    private void jButtonNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber9ActionPerformed
        this.jResult.setText(this.jResult.getText() + "9");
    }//GEN-LAST:event_jButtonNumber9ActionPerformed

    private void jButtonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicationActionPerformed
        if (this.jResult.getText().isEmpty()) {
            this.jResult.setText("Error");
        } else {
            this.firstNumber = Float.parseFloat(this.jResult.getText().replace(",", "."));
            this.operator = "*";
            this.jResult.setText("");
        }
    }//GEN-LAST:event_jButtonMultiplicationActionPerformed

    private void jButtonPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPercentageActionPerformed
        if (this.jResult.getText().isEmpty()) {
            this.jResult.setText("Error");
        } else {
            this.firstNumber = Float.parseFloat(this.jResult.getText().replace(",", "."));
            this.operator = "%";
            this.jResult.setText("");
        }

    }//GEN-LAST:event_jButtonPercentageActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        if (this.jResult.getText().isEmpty()) {
            this.jResult.setText("Error");
        } else {
            this.firstNumber = Float.parseFloat(this.jResult.getText().replace(",", "."));
            this.operator = "/";
            this.jResult.setText("");
        }
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        this.jResult.setText("");
        this.firstNumber = 0;
        this.secondNumber = 0;
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber4ActionPerformed
        this.jResult.setText(this.jResult.getText() + "4");
    }//GEN-LAST:event_jButtonNumber4ActionPerformed

    private void jButtonNumber0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber0ActionPerformed
        this.jResult.setText(this.jResult.getText() + "0");
    }//GEN-LAST:event_jButtonNumber0ActionPerformed

    private void jButtonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDecimalActionPerformed
        this.jResult.setText(this.jResult.getText() + ",");
    }//GEN-LAST:event_jButtonDecimalActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed

        this.secondNumber = Float.parseFloat(this.jResult.getText().replace(",", "."));
        switch (this.operator) {
            case "+":
                this.jResult.setText(Float.toString(this.firstNumber + this.secondNumber).replace(",", "."));
                break;
            case "-":
                this.jResult.setText(Float.toString(this.firstNumber - this.secondNumber).replace(",", "."));
                break;
            case "*":
                this.jResult.setText(Float.toString(this.firstNumber * this.secondNumber).replace(",", "."));
                break;
            case "/":
                this.jResult.setText(Float.toString(this.firstNumber / this.secondNumber).replace(",", "."));
                break;
            case "%":
                this.jResult.setText(Float.toString((this.firstNumber * this.secondNumber) / 100).replace(",", "."));
                break;
            default:
                this.jResult.setText("");
        }
    }//GEN-LAST:event_jButtonEqualsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void inicializarEjercicio25() {
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
            java.util.logging.Logger.getLogger(Ejercicio25.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio25.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio25.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio25.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDecimal;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMultiplication;
    private javax.swing.JButton jButtonNumber0;
    private javax.swing.JButton jButtonNumber1;
    private javax.swing.JButton jButtonNumber2;
    private javax.swing.JButton jButtonNumber3;
    private javax.swing.JButton jButtonNumber4;
    private javax.swing.JButton jButtonNumber5;
    private javax.swing.JButton jButtonNumber6;
    private javax.swing.JButton jButtonNumber7;
    private javax.swing.JButton jButtonNumber9;
    private javax.swing.JButton jButtonNumer8;
    private javax.swing.JButton jButtonPercentage;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JLabel jResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

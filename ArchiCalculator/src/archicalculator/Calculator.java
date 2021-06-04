package archicalculator;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ResultTextField = new javax.swing.JTextField();
        button7 = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        buttonDecimal = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        ResultTextField.setEditable(false);
        ResultTextField.setBackground(new java.awt.Color(102, 102, 102));
        ResultTextField.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        ResultTextField.setForeground(new java.awt.Color(255, 102, 0));
        ResultTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultTextFieldActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(204, 204, 204));
        button7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button7.setText("7");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(204, 204, 204));
        divideButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        divideButton.setText("÷");
        divideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divideButtonMouseClicked(evt);
            }
        });

        button8.setBackground(new java.awt.Color(204, 204, 204));
        button8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button8.setText("8");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
        });

        button9.setBackground(new java.awt.Color(204, 204, 204));
        button9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button9.setText("9");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
            }
        });

        button4.setBackground(new java.awt.Color(204, 204, 204));
        button4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button4.setText("4");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(204, 204, 204));
        multiplyButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        multiplyButton.setText("X");
        multiplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyButtonMouseClicked(evt);
            }
        });

        button5.setBackground(new java.awt.Color(204, 204, 204));
        button5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button5.setText("5");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });

        button6.setBackground(new java.awt.Color(204, 204, 204));
        button6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button6.setText("6");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });

        button1.setBackground(new java.awt.Color(204, 204, 204));
        button1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button1.setText("1");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(204, 204, 204));
        minusButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        minusButton.setText("-");
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
        });
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(204, 204, 204));
        button2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button2.setText("2");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        button3.setBackground(new java.awt.Color(204, 204, 204));
        button3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button3.setText("3");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        buttonDecimal.setBackground(new java.awt.Color(204, 204, 204));
        buttonDecimal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        buttonDecimal.setText(".");
        buttonDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDecimalMouseClicked(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(204, 204, 204));
        plusButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        plusButton.setText("+");
        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusButtonMouseClicked(evt);
            }
        });

        button0.setBackground(new java.awt.Color(204, 204, 204));
        button0.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button0.setText("0");
        button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button0MouseClicked(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(204, 204, 204));
        equalsButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalsButtonMouseClicked(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 204, 204));
        clearButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        clearButton.setText("C");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ResultTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ResultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button7)
                    .addComponent(divideButton)
                    .addComponent(button8)
                    .addComponent(button9))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4)
                    .addComponent(multiplyButton)
                    .addComponent(button5)
                    .addComponent(button6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(minusButton)
                    .addComponent(button2)
                    .addComponent(button3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDecimal)
                    .addComponent(plusButton)
                    .addComponent(button0)
                    .addComponent(equalsButton))
                .addGap(29, 29, 29)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResultTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultTextFieldActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minusButtonActionPerformed

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
        String var = ResultTextField.getText();
        var = var + "7";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button7MouseClicked

    private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
        String var = ResultTextField.getText();
        var = var + "8";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button8MouseClicked

    private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
        String var = ResultTextField.getText();
        var = var + "9";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button9MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        String var = ResultTextField.getText();
        var = var + "4";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        String var = ResultTextField.getText();
        var = var + "5";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button5MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        String var = ResultTextField.getText();
        var = var + "6";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button6MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        String var = ResultTextField.getText();
        var = var + "2";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        String var = ResultTextField.getText();
        var = var + "3";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button3MouseClicked

    private void button0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseClicked
        String var = ResultTextField.getText();
        var = var + "0";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button0MouseClicked

    String globalVar = "";
    String operation = "";
    private void plusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseClicked
        globalVar = ResultTextField.getText();
        operation = "+";
        ResultTextField.setText("");
    }//GEN-LAST:event_plusButtonMouseClicked

    private void equalsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsButtonMouseClicked
        String newVar = ResultTextField.getText();
        if (null != operation) switch (operation) {
            case "+":{
                double result = Double.parseDouble(globalVar) + Double.parseDouble(newVar);
                ResultTextField.setText("" + result);
                    break;
                }
            case "-":{
                double result = Double.parseDouble(globalVar) - Double.parseDouble(newVar);
                ResultTextField.setText("" + result);
                    break;
                }
            case "*":{
                double result = Double.parseDouble(globalVar) * Double.parseDouble(newVar);
                ResultTextField.setText("" + result);
                    break;
                }
            case "/":{
                double result = Double.parseDouble(globalVar) / Double.parseDouble(newVar);
                ResultTextField.setText("" + result);
                    break;
                }
            default:
                break;
        }
    }//GEN-LAST:event_equalsButtonMouseClicked

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        globalVar = ResultTextField.getText();
        operation = "-";
        ResultTextField.setText("");
    }//GEN-LAST:event_minusButtonMouseClicked

    private void multiplyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyButtonMouseClicked
        globalVar = ResultTextField.getText();
        operation = "*";
        ResultTextField.setText("");
    }//GEN-LAST:event_multiplyButtonMouseClicked

    private void divideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideButtonMouseClicked
        globalVar = ResultTextField.getText();
        operation = "/";
        ResultTextField.setText("");
    }//GEN-LAST:event_divideButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        ResultTextField.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

    }//GEN-LAST:event_button1ActionPerformed

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        String var = ResultTextField.getText();
        var = var + "1";
        ResultTextField.setText(var);
    }//GEN-LAST:event_button1MouseClicked

    private void buttonDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDecimalMouseClicked
        String var = ResultTextField.getText();
        var = var + ".";
        ResultTextField.setText(var);
    }//GEN-LAST:event_buttonDecimalMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ResultTextField;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonDecimal;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton plusButton;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author 2ndyrGroupA
 */
public class MainUi extends javax.swing.JFrame {

    /**
     * Creates new form MainUi
     */
    public MainUi() {
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

        retrieveData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        retrieveData1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        setForeground(new java.awt.Color(102, 102, 102));

        retrieveData.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        retrieveData.setText("SHOW DATA");
        retrieveData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retrieveDataMouseClicked(evt);
            }
        });
        retrieveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveDataActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 48)); // NOI18N
        jLabel2.setText("EMPLOYEE");

        retrieveData1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        retrieveData1.setText("ADD EMPLOYEE");
        retrieveData1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retrieveData1MouseClicked(evt);
            }
        });
        retrieveData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveData1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(retrieveData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retrieveData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(retrieveData1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(retrieveData, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retrieveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retrieveDataActionPerformed

    private void retrieveDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrieveDataMouseClicked
        DataUi data = new DataUi();
        data.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retrieveDataMouseClicked

    private void retrieveData1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrieveData1MouseClicked
        EmployeeUi add = new EmployeeUi();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retrieveData1MouseClicked

    private void retrieveData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retrieveData1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUi().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton retrieveData;
    private javax.swing.JButton retrieveData1;
    // End of variables declaration//GEN-END:variables
}
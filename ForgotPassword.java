
import javax.swing.*;
import project.*;
import java.sql.*;


public class ForgotPassword extends javax.swing.JFrame {

    
    public ForgotPassword() {
        initComponents();
    }

    String email;
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFanswer = new javax.swing.JTextField();
        JTFsecurityQuestion = new javax.swing.JTextField();
        JBtnSearchby = new javax.swing.JButton();
        JTFemail3 = new javax.swing.JTextField();
        JTFNewPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JBexit2 = new javax.swing.JButton();
        JBtnSave = new javax.swing.JButton();
        JBtnLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JCBpassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("                          Forgot Password?");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 229, 410, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Answer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Security Question");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        JTFanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFanswerActionPerformed(evt);
            }
        });
        getContentPane().add(JTFanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 220, -1));

        JTFsecurityQuestion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JTFsecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFsecurityQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(JTFsecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 220, -1));

        JBtnSearchby.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        JBtnSearchby.setText("Search by email");
        JBtnSearchby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSearchbyActionPerformed(evt);
            }
        });
        getContentPane().add(JBtnSearchby, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 130, 30));

        JTFemail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFemail3ActionPerformed(evt);
            }
        });
        getContentPane().add(JTFemail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 220, -1));
        getContentPane().add(JTFNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 220, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexit2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 20, 20));

        JBtnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBtnSave.setText("Save password");
        JBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        JBtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBtnLogin.setText("Log in");
        JBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.jpeg"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        JCBpassword.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        JCBpassword.setText("Show password");
        JCBpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(JCBpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 530, 350));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexit2ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to exit the app?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);
    }//GEN-LAST:event_JBexit2ActionPerformed

    private void JTFanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFanswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFanswerActionPerformed

    private void JTFsecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFsecurityQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFsecurityQuestionActionPerformed

    private void JBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnLoginActionPerformed
        setVisible(false);
        new Authentication().setVisible(true);
   
    }//GEN-LAST:event_JBtnLoginActionPerformed

    private void JBtnSearchbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSearchbyActionPerformed
        // TODO add your handling code here:
        int check =0;
        email = JTFemail3.getText();
        
        if (email.equals("")) {
            check = 1;
            JOptionPane.showMessageDialog(null, "Enter the email to search user");
        }
        else
        {
            ResultSet rs = Select.getData(" select * from users where email = '"+email+"' ");
            try {
                if(rs.next())
                {
                    check =1;
                    JTFsecurityQuestion.setEditable(false);
                    JTFemail3.setEditable(false);
                    
                    JTFsecurityQuestion.setText(rs.getString(5));
                }
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
            }
        
        }
        if(check == 0)
            JOptionPane.showMessageDialog(null, "no user for this email found !");       
        
    }//GEN-LAST:event_JBtnSearchbyActionPerformed

    private void JTFemail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFemail3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFemail3ActionPerformed

    private void JBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSaveActionPerformed
        // TODO add your handling code here:
        int check =0;
        String securityQuestions = JTFsecurityQuestion.getText();
        String answer = JTFanswer.getText();
        String newPassword = JTFNewPassword.getText();
        
        if(answer.equals("")||newPassword.equals("")){
            check =1;
            JOptionPane.showMessageDialog(null, "enter the missing fields");
        }
        else {
         ResultSet rs = Select.getData("select * from users where email = '"+email+"' and securityQuestions = '"+securityQuestions+"' and answer = '"+answer+"'");
         
            
            try {
                if(rs.next())
                {
                    check =1;
                    InsertUpdateDelete.setData("update users set password = '"+newPassword+"' where email = '"+email+"'", "Password Reset Succesfully!!!");
                    
                    setVisible(false);
                    new ForgotPassword().setVisible(true);
                }
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
         if(check == 0){
            JOptionPane.showMessageDialog(null, "wrong answer!");       
        }
    }//GEN-LAST:event_JBtnSaveActionPerformed

    private void JCBpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBpasswordActionPerformed
        // TODO add your handling code here:
        if(JCBpassword.isSelected()){
            JTFNewPassword.setEchoChar((char)0);
        }
        else
        {
            JTFNewPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_JCBpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBexit2;
    private javax.swing.JButton JBtnLogin;
    private javax.swing.JButton JBtnSave;
    private javax.swing.JButton JBtnSearchby;
    private javax.swing.JCheckBox JCBpassword;
    private javax.swing.JPasswordField JTFNewPassword;
    private javax.swing.JTextField JTFanswer;
    private javax.swing.JTextField JTFemail3;
    private javax.swing.JTextField JTFsecurityQuestion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

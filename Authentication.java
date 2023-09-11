
import javax.swing.*;
import project.InsertUpdateDelete;
import project.Select;
import java.sql.*;

public class Authentication extends javax.swing.JFrame {

   
    public Authentication() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SignUp = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        JBtnForgotPassword2 = new javax.swing.JButton();
        JBtnLogin = new javax.swing.JButton();
        JBexit2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JTFpassword = new javax.swing.JPasswordField();
        JTFemail2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        JCBShowPassword = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        JBtnShowPassword = new javax.swing.JButton();
        JBtnsignup = new javax.swing.JButton();
        JBtnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JTFaddress = new javax.swing.JTextField();
        JTFname = new javax.swing.JTextField();
        JTFcellNo = new javax.swing.JTextField();
        JTFemail = new javax.swing.JTextField();
        JTFanswer = new javax.swing.JTextField();
        JTFpassword1 = new javax.swing.JPasswordField();
        JCBsecurityQuestions = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        JCBShowPassword1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 786));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUp.setBackground(new java.awt.Color(204, 204, 204));
        SignUp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBtnForgotPassword2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBtnForgotPassword2.setText("Forgot Password?");
        JBtnForgotPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnForgotPassword2ActionPerformed(evt);
            }
        });
        jPanel3.add(JBtnForgotPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, 30));

        JBtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBtnLogin.setText("Log in");
        JBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(JBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        JBexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexit2ActionPerformed(evt);
            }
        });
        jPanel3.add(JBexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registered User: LOGIN HERE");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 550, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Password :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Email:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 100, 20));

        JTFpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFpasswordActionPerformed(evt);
            }
        });
        jPanel3.add(JTFpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 230, -1));
        jPanel3.add(JTFemail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 230, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.jpeg"))); // NOI18N
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        JCBShowPassword.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        JCBShowPassword.setText("Show Password");
        JCBShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBShowPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(JCBShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        SignUp.addTab("Login", jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBtnShowPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBtnShowPassword.setText("Login");
        JBtnShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, 30));

        JBtnsignup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBtnsignup.setText("Sign up");
        JBtnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 30));

        JBtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Unregistered User: SIGNUP HERE");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 540, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Address :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Full Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Cell No.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 100, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 100, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Password :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Security Questions :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Answer:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, 20));
        jPanel1.add(JTFaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 250, -1));
        jPanel1.add(JTFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 250, -1));

        JTFcellNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcellNoActionPerformed(evt);
            }
        });
        jPanel1.add(JTFcellNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 250, -1));
        jPanel1.add(JTFemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 250, -1));

        JTFanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFanswerActionPerformed(evt);
            }
        });
        jPanel1.add(JTFanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 250, -1));

        JTFpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFpassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(JTFpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 250, -1));

        JCBsecurityQuestions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Which primary school did you attend?", "What is the name of you lastborn?", "What is your favorite food?", "Which music do you listen to?" }));
        jPanel1.add(JCBsecurityQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 250, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.jpeg"))); // NOI18N
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        JCBShowPassword1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        JCBShowPassword1.setText("Show password");
        JCBShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBShowPassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(JCBShowPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        SignUp.addTab("Signup", jPanel1);

        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 600, 450));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-34, -24, 1400, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnShowPasswordActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Authentication().setVisible(true);
    }//GEN-LAST:event_JBtnShowPasswordActionPerformed

    private void JBtnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnsignupActionPerformed
        String fullName = JTFname.getText();
        String cellNo = JTFcellNo.getText();
        String email = JTFemail.getText();
        String password = JTFpassword1.getText();
        String securityQuestions =(String) JCBsecurityQuestions.getSelectedItem();
        String answer = JTFanswer.getText();
        String address = JTFaddress.getText();
        if(fullName.equals("") || cellNo.equals(" ") || email.equals(" ")|| password.equals("") || answer.equals("")|| address.equals(""))
            JOptionPane.showMessageDialog(null, "Please fill in the missing fields");
        else{
            String Query;
            
            Query=("insert into users values('"+fullName+"','"+cellNo+"','"+email+"','"+password+"','"+securityQuestions+"','"+answer+"','"+address+"','false')");
            InsertUpdateDelete.setData(Query, "Registered Successfully");
            setVisible(false);
            new Authentication().setVisible(true);
        }
    }//GEN-LAST:event_JBtnsignupActionPerformed

    private void JBtnForgotPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnForgotPassword2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_JBtnForgotPassword2ActionPerformed

    private void JBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnLoginActionPerformed
  
        int check =0;
        
        String email = JTFemail2.getText();
        String password = JTFpassword.getText();
        
        if(email.equals("") || password.equals(" ") )
        {
            check =1;
           JOptionPane.showMessageDialog(null, "Please fill in the missing fields");
        }
        else if(email.equals("tfokomala@ump.ac.za") && password.equals("Admin123"))
        {
        check =1;
            setVisible(false);
            new AdminHome().setVisible(true);
        }
        else
        {
            ResultSet rs = Select.getData("select * from users where email = '"+email+"' and password = '"+password+"' ");
            
            try {
                if(rs.next())
                {
                    check =1;
                    if(rs.getString(8).equals("true"))
                    {
                        setVisible(false);
                        new UserHome().setVisible(true);
                    }
                    else
                       JOptionPane.showMessageDialog(null, "Pending Admin's Approval...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, email);
            }
        }
        
        if(check == 0)
            JOptionPane.showMessageDialog(null, "user for these details does not exist !");
    }//GEN-LAST:event_JBtnLoginActionPerformed

    private void JBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnExitActionPerformed
       int a = JOptionPane.showConfirmDialog(null, "Do you want to exit the app?","Select",JOptionPane.YES_NO_OPTION);
       if(a==0)
           System.exit(0);
    }//GEN-LAST:event_JBtnExitActionPerformed

    private void JBexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexit2ActionPerformed
       int a = JOptionPane.showConfirmDialog(null, "Do you want to exit the app?","Select",JOptionPane.YES_NO_OPTION);
       if(a==0)
           System.exit(0);
    }//GEN-LAST:event_JBexit2ActionPerformed

    private void JTFpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFpassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFpassword1ActionPerformed

    private void JTFcellNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcellNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcellNoActionPerformed

    private void JTFanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFanswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFanswerActionPerformed

    private void JTFpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFpasswordActionPerformed

    private void JCBShowPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBShowPassword1ActionPerformed
        // TODO add your handling code here:
        if(JCBShowPassword1.isSelected()){
            JTFpassword1.setEchoChar((char)0);
        }
        else
        {
            JTFpassword1.setEchoChar('*');
        }
    }//GEN-LAST:event_JCBShowPassword1ActionPerformed

    private void JCBShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBShowPasswordActionPerformed
        // TODO add your handling code here:
        if(JCBShowPassword.isSelected()){
            JTFpassword.setEchoChar((char)0);
        }
        else
        {
            JTFpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_JCBShowPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBexit2;
    private javax.swing.JButton JBtnExit;
    private javax.swing.JButton JBtnForgotPassword2;
    private javax.swing.JButton JBtnLogin;
    private javax.swing.JButton JBtnShowPassword;
    private javax.swing.JButton JBtnsignup;
    private javax.swing.JCheckBox JCBShowPassword;
    private javax.swing.JCheckBox JCBShowPassword1;
    private javax.swing.JComboBox<String> JCBsecurityQuestions;
    private javax.swing.JTextField JTFaddress;
    private javax.swing.JTextField JTFanswer;
    private javax.swing.JTextField JTFcellNo;
    private javax.swing.JTextField JTFemail;
    private javax.swing.JTextField JTFemail2;
    private javax.swing.JTextField JTFname;
    private javax.swing.JPasswordField JTFpassword;
    private javax.swing.JPasswordField JTFpassword1;
    private javax.swing.JTabbedPane SignUp;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

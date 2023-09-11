
import javax.swing.*;
import project.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class AdminHome extends javax.swing.JFrame {

    public AdminHome() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBclear = new javax.swing.JButton();
        JBexit2 = new javax.swing.JButton();
        JBlogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JTFsearchBy = new javax.swing.JTextField();
        jBsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Administration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 25, 203, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.jpeg"))); // NOI18N
        jBclear.setText("Clear");
        jBclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclearActionPerformed(evt);
            }
        });
        jPanel1.add(jBclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 220, -1, -1));

        JBexit2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBexit2.setText("Exit");
        JBexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexit2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 80, -1));

        JBlogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_1.png"))); // NOI18N
        JBlogout.setText("Logout");
        JBlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(JBlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Cell No.", "Email", "Security Question", "Address", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 1290, -1));

        JTFsearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFsearchByActionPerformed(evt);
            }
        });
        jPanel1.add(JTFsearchBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 190, 30));

        jBsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsearchActionPerformed(evt);
            }
        });
        jPanel1.add(jBsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Search by Name or Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 150, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.jpeg"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexit2ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to exit the app?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);
    }//GEN-LAST:event_JBexit2ActionPerformed

    private void JTFsearchByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFsearchByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFsearchByActionPerformed

    private void jBsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsearchActionPerformed
        // TODO add your handling code here:
        String searchByEmailOrName = JTFsearchBy.getText();
        ResultSet rs = Select.getData("select * from users where fullName like '%"+searchByEmailOrName+"%' or email like '%"+searchByEmailOrName+"%' ");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        try {
            
            while (rs.next()) {                
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(7),rs.getString(8)});
            }
            rs.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jBsearchActionPerformed

    private void jBclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclearActionPerformed
        // TODO add your handling code here:
        
//        int a = JOptionPane.showConfirmDialog(null, "This will refresh the data in the table are you sure?","Select",JOptionPane.YES_NO_OPTION);
//        if(a==0){
        setVisible(false);
        new AdminHome().setVisible(true);
//        }
    }//GEN-LAST:event_jBclearActionPerformed

    private void JBlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to log out?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Authentication().setVisible(true);
        }
    }//GEN-LAST:event_JBlogoutActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Select.getData("select * from users");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        try {
            
            while (rs.next()) {                
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(7),rs.getString(8)});
            }
            rs.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String fullName = model.getValueAt(index, 0).toString();
        String status = model.getValueAt(index, 5).toString();
        
        if (status.equals("true")) 
             status ="false";
        
        else
            status ="true";
       
        
        try {
            int a = JOptionPane.showConfirmDialog(null,"Do you want to set the status of "+fullName+"","Select",JOptionPane.YES_NO_OPTION);
            
            if (a ==0) {
                InsertUpdateDelete.setData("update users set status = '"+status+"' where fullName = '"+fullName+"'", "New status has been set");
                setVisible(false);
                new AdminHome().setVisible(true);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

   
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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBexit2;
    private javax.swing.JButton JBlogout;
    private javax.swing.JTextField JTFsearchBy;
    private javax.swing.JButton jBclear;
    private javax.swing.JButton jBsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

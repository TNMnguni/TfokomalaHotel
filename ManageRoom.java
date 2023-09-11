import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.*;


public class ManageRoom extends javax.swing.JFrame {

    
    public ManageRoom() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTFroomNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCBroomType = new javax.swing.JComboBox<>();
        jCBbedType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBaddRoom = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JBexit2 = new javax.swing.JButton();
        jTFprice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(50, 145));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1266, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage_room_1.jpg"))); // NOI18N
        jLabel1.setText("Manage Rooms");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, 270, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 648, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Room Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 173, -1));
        jPanel1.add(jTFroomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 480, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Room Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 173, -1));

        jCBroomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select>", "A/C", "No A/C" }));
        jCBroomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBroomTypeActionPerformed(evt);
            }
        });
        jPanel1.add(jCBroomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 480, -1));

        jCBbedType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select>", "Single", "Double", "Triple", " " }));
        jPanel1.add(jCBbedType, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 480, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Bed");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 173, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 173, -1));

        jBaddRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBaddRoom.setText("Add Room");
        jBaddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddRoomActionPerformed(evt);
            }
        });
        jPanel1.add(jBaddRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.jpeg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, -1));

        JBexit2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexit2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 18, 18));

        jTFprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFpriceActionPerformed(evt);
            }
        });
        jPanel1.add(jTFprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 480, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexit2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_JBexit2ActionPerformed

    private void jTFpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFpriceActionPerformed

    private void jCBroomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBroomTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBroomTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBaddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddRoomActionPerformed
        // TODO add your handling code here:
        String roomNumber = jTFroomNo.getText();
        String roomType =(String)jCBroomType.getSelectedItem();
        String bed =(String)jCBbedType.getSelectedItem();
        String price = jTFprice.getText();
        
        String Query = "insert into room values ('"+roomNumber+"','"+roomType+"','"+bed+"','"+price+"','Not Booked')";
        
        InsertUpdateDelete.setData(Query,"Succefully update");
        
        setVisible(false);
        new ManageRoom().setVisible(true);
    }//GEN-LAST:event_jBaddRoomActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Select.getData("select * from room");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    
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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBexit2;
    private javax.swing.JButton jBaddRoom;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBbedType;
    private javax.swing.JComboBox<String> jCBroomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFprice;
    private javax.swing.JTextField jTFroomNo;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

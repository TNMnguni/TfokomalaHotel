
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.protocol.Resultset;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.*;

public class Check_Outs extends javax.swing.JFrame {

    /**
     * Creates new form Check_Outs
     */
    public Check_Outs() {
        initComponents();
        jTFfullName.setEditable(false);
        jTFcheckInDate.setEditable(false);
        jTFcheckOutDate.setEditable(false);
        jTFcontactNo.setEditable(false);
        jTFpricePerDay.setEditable(false);
        jTFNoDaysStay.setEditable(false);
        jTFtotalAmountDue.setEditable(false);
        jTFemail.setEditable(false);
    }

    int Id = 0;
    String Query;
    String RoomType;
    String Bed;
    String RoomNo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JBexit3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFpricePerDay = new javax.swing.JTextField();
        jTFcontactNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFcheckInDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFroomNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTFcheckOutDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFfullName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTFNoDaysStay = new javax.swing.JTextField();
        jTFemail = new javax.swing.JTextField();
        jTFtotalAmountDue = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        JBexit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 145));
        setMinimumSize(new java.awt.Dimension(1270, 600));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check_out_1.jpeg"))); // NOI18N
        jLabel2.setText("Customer Check-Outs Details");

        JBexit3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBexit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBexit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexit3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Customer Full Name");

        jTFpricePerDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFcontactNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Customer Contact No.");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Room Number");

        jTFcheckInDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Check-in Date");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Check Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Check Out Date");

        jTFcheckOutDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Price Per Day");

        jTFfullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Total Amount Due");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Email");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("No. of Days Stay");

        jTFNoDaysStay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTFtotalAmountDue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Contact No", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check-in Date", "Room No", "Bed", "Room Type", "Price Per Day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.jpeg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFpricePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFfullName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTFroomNo))
                                    .addComponent(jTFNoDaysStay, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFcheckInDate)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFcheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFtotalAmountDue, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(60, 60, 60)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFcontactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addGap(10, 10, 10)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBexit3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBexit3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFroomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jButton4)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel7))
                            .addComponent(jLabel11))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTFcheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFfullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFcheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFtotalAmountDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFpricePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFNoDaysStay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(jTFcontactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)
                        .addGap(10, 10, 10)
                        .addComponent(jTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 600));

        JBexit2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexit2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexit2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_JBexit2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String FullName = jTFfullName.getText();
        String ContactNo = jTFcontactNo.getText();
        String Email = jTFemail.getText();
        
        String CheckOut =jTFcheckOutDate.getText();
        String NoOfDaysStay =jTFNoDaysStay.getText();
        String TotalAmountDue = jTFtotalAmountDue.getText();
        RoomNo = jTFroomNo.getText();
        Query = "update customer set NoOFDaysStay = '"+NoOfDaysStay+"', TotalAmount = '"+TotalAmountDue+"', CheckOutDate = '"+CheckOut+"' where Id ='"+Id+"'";
        InsertUpdateDelete.setData(Query, "");
        Query="update room set status = 'Not Booked' where roomNumber = '"+RoomNo+"' ";
        InsertUpdateDelete.setData(Query, "");
        
        //pdf
        String path = "C:\\Tfokomala Hotel Bills";
        com.itextpdf.text.Document Bill = new com.itextpdf.text.Document();
        
        try {
            
            PdfWriter.getInstance(Bill, new FileOutputStream(path+""+Id+".pdf"));
            Bill.open();
            
            Paragraph Line = new Paragraph("****************************************************************************************************************");
            Bill.add(Line);
            Paragraph Line1 = new Paragraph("                                         Tfokomala Hotel & Conference Centre\n");
            Bill.add(Line1);
            Paragraph Line2 = new Paragraph("****************************************************************************************************************");
            Bill.add(Line2);
            
            Paragraph Line3 = new Paragraph("\tBill ID: "+Id+" \nCustomer Details: \nFull Name: "+FullName+" \nContact No: "+ContactNo+" \nEmail: "+Email+"");
            Bill.add(Line3);
            Paragraph Line4 = new Paragraph("----------------------------------------------------------------------------------------------------------------------------------");
            Bill.add(Line4);
            Paragraph Line5 = new Paragraph("\tRoom Details: \nRoom No: "+RoomNo+" \nRoom Type: "+RoomType+" \nBed: "+Bed+" \nPrice Each day: "+jTFpricePerDay.getText()+"");
            Bill.add(Line5);
            Bill.add(Line4);
            //table
            PdfPTable mytable = new PdfPTable(4);
            mytable.addCell("Check-In Date: "+jTFcheckInDate.getText());
            mytable.addCell("Check-Out Date: "+CheckOut);
            mytable.addCell("No of Days Stay:  "+NoOfDaysStay);
            mytable.addCell("Total Amount Due: R"+TotalAmountDue);
            Bill.add(mytable);
            
            Bill.add(Line4);
            Paragraph Line6 = new Paragraph("                                              Thank You! For Choosing Us \n                                         We Hope To See You Soon Again");
            Bill.add(Line6);
           
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        Bill.close();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to print this bill","Select",JOptionPane.YES_NO_OPTION);
        
        if (a == 0) {
            try {
                if ((new File("C:\\Tfokomala Hotel Bills"+Id+".pdf")).exists()) {
                    Process myP =Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler C:\\Tfokomala Hotel Bills"+Id+".pdf");
                   }else
                    System.out.println("File Not Found");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        setVisible(false);
        new Check_Outs().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBexit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexit3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_JBexit3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String RoomNo = jTFroomNo.getText();

        try {
            ResultSet rs = Select.getData("select * from customer where RoomNo = '" + RoomNo + "'and CheckOutDate is NULL");

            if (rs.next()) {
                jTFroomNo.setEditable(false);
                Id = rs.getInt(1);
                jTFfullName.setText(rs.getString(2));
                jTFcheckInDate.setText(rs.getString(9));
                jTFcontactNo.setText(rs.getString(3));
                jTFpricePerDay.setText(rs.getString(13));

                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
                Calendar myCal = Calendar.getInstance();
                jTFcheckOutDate.setText(myFormat.format(myCal.getTime()));

                String DateBeforeStr = rs.getString(9);
                java.util.Date dateBefore = myFormat.parse(DateBeforeStr);
                String DateAfterStr = myFormat.format(myCal.getTime());
                java.util.Date dateAfter = myFormat.parse(DateAfterStr);
                
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int noOfDaysStay =(int)(difference/(1000*60*60*24));
                
                if (noOfDaysStay == 0) 
                    noOfDaysStay =1;
                jTFNoDaysStay.setText(String.valueOf(noOfDaysStay));
                
                
                float price = Float.parseFloat(jTFpricePerDay.getText());
                
                jTFtotalAmountDue.setText(String.valueOf(noOfDaysStay*price));
                
                jTFemail.setText(rs.getString(6));
                Bed = rs.getString(11);
                RoomType = rs.getString(12);

            }else
                JOptionPane.showMessageDialog(null, "Room Number is not Booked or does not exist");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Check_Outs().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Select.getData("select * from customer where CheckOutDate is NULL");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Check_Outs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Outs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Outs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Outs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_Outs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBexit2;
    private javax.swing.JButton JBexit3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNoDaysStay;
    private javax.swing.JTextField jTFcheckInDate;
    private javax.swing.JTextField jTFcheckOutDate;
    private javax.swing.JTextField jTFcontactNo;
    private javax.swing.JTextField jTFemail;
    private javax.swing.JTextField jTFfullName;
    private javax.swing.JTextField jTFpricePerDay;
    private javax.swing.JTextField jTFroomNo;
    private javax.swing.JTextField jTFtotalAmountDue;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

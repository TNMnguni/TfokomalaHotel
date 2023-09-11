
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import project.*;


public class Check_Ins extends javax.swing.JFrame {

    /**
     * Creates new form Check_Ins
     */
    public Check_Ins() {
        initComponents();
        jTFCheckInDate.setEditable(false);
        jTFprice.setEditable(false);
        
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar myCalender = Calendar.getInstance();
        jTFCheckInDate.setText(myFormat.format(myCalender.getTime()));
       
    }
    String bed;
    String RoomType;
    String RoomNumber;
    String Price;

    public void roomDetails(){
        jCBroomNo.removeAllItems();
        jTFprice.setText("");
        bed=(String)jCBbed.getSelectedItem();
        RoomType= (String)jCBroomType.getSelectedItem();
        
        try {
            ResultSet rs = Select.getData("select * from room where bed = '"+bed+"' and  roomType = '"+RoomType+"' and status = 'Not Booked'");
            
            while (rs.next()) {                
                jCBroomNo.addItem(rs.getString(1));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JBexit2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTFcName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFcContactsNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFnationality = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFcEmail = new javax.swing.JTextField();
        jCBgender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTFidProof = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFaddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFCheckInDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCBbed = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jCBroomType = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jCBroomNo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTFprice = new javax.swing.JTextField();
        jBalloteRoom = new javax.swing.JButton();
        jBaddRoom1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 145));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1266, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check_in_1.jpeg"))); // NOI18N
        jLabel1.setText("Customer Check-In Details");

        JBexit2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        JBexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexit2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer Full Name");

        jTFcName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTFcName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer Contact No.");

        jTFcContactsNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTFcContactsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcContactsNumberActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nationality");

        jTFnationality.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTFnationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFnationalityActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jTFcEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTFcEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcEmailActionPerformed(evt);
            }
        });

        jCBgender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCBgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select>", "Male", "Female", "Others", " " }));
        jCBgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBgenderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Proof of Identity");

        jTFidProof.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");

        jTFaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTFaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFaddressActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Check-in Date ");

        jTFCheckInDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Bed");

        jCBbed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCBbed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select>", "Single", "Double", "Triple", " " }));
        jCBbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBbedActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Room Type");

        jCBroomType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCBroomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select>", "A/C", "No A/C" }));
        jCBroomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBroomTypeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Room Number");

        jCBroomNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCBroomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBroomNoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Price");

        jTFprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTFprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFpriceActionPerformed(evt);
            }
        });

        jBalloteRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBalloteRoom.setText("Allote Room");
        jBalloteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalloteRoomActionPerformed(evt);
            }
        });

        jBaddRoom1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBaddRoom1.setText("Clear");
        jBaddRoom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddRoom1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBexit2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFcEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBgender, javax.swing.GroupLayout.Alignment.LEADING, 0, 350, Short.MAX_VALUE)
                                .addComponent(jTFnationality, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFcContactsNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFcName, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFidProof, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jButton1)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBalloteRoom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                        .addComponent(jBaddRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBbed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBroomType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBroomNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFprice))))
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBexit2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFcName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFidProof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFcContactsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBroomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBroomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFcEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBalloteRoom)
                                    .addComponent(jBaddRoom1))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexit2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_JBexit2ActionPerformed

    private void jTFcNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcNameActionPerformed

    private void jTFcContactsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcContactsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcContactsNumberActionPerformed

    private void jTFnationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFnationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFnationalityActionPerformed

    private void jTFcEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcEmailActionPerformed

    private void jTFpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFpriceActionPerformed

    private void jBalloteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalloteRoomActionPerformed
        // TODO add your handling code here:
        int Id =1;
        String FullName = jTFcName.getText();
        String ContactNo = jTFcContactsNumber.getText();
        String Nationality = jTFnationality.getText();
        String Gender =(String)jCBgender.getSelectedItem();
        String Email = jTFcEmail.getText();
        String ID_Proof = jTFidProof.getText();
        String Address = jTFaddress.getText();
        String CheckInDate = jTFCheckInDate.getText();
        String Bed =(String)jCBbed.getSelectedItem();
        String RoomType =(String)jCBroomType.getSelectedItem();
        String RoomNo =(String)jCBroomNo.getSelectedItem();
        String Price = jTFprice.getText();
        String Query = "select max(Id) from customer";
        
        try {
            
            ResultSet rs = Select.getData(Query);
            
            while (rs.next()) {                
                Id = rs.getInt(1);
                Id = Id + 1;
                
                if (!Price.equals("") && !FullName.trim().isEmpty() && !ContactNo.trim().isEmpty() && !Nationality.trim().isEmpty() && !Gender.equals("<select>") && !Email.trim().isEmpty() && !ID_Proof.trim().isEmpty() && !Address.trim().isEmpty()) {
                    
                    Query="update room set status = 'Booked' where roomNumber = '"+RoomNo+"'";
                    InsertUpdateDelete.setData(Query, "");
                    Query = "insert into customer(Id,FullName,ContactNo,Nationality,Gender,Email,ID_Proof,Address,CheckInDate,RoomNo,Bed,RoomType,PricePerDay) values("+Id+",'"+FullName+"','"+ContactNo+"','"+Nationality+"','"+Gender+"','"+Email+"','"+ID_Proof+"','"+Address+"','"+CheckInDate+"','"+RoomNo+"','"+Bed+"','"+RoomType+"','"+Price+"')";
                    InsertUpdateDelete.setData(Query, "Customer checked in successfully!");
                    setVisible(false);
                    new Check_Ins().setVisible(true);
                }
                else
                   JOptionPane.showMessageDialog(null, "Enter all the missing data!");
          }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jBalloteRoomActionPerformed

    private void jBaddRoom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddRoom1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Check_Ins().setVisible(true);
    }//GEN-LAST:event_jBaddRoom1ActionPerformed

    private void jCBgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBgenderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCBgenderActionPerformed

    private void jCBbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBbedActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_jCBbedActionPerformed

    private void jCBroomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBroomTypeActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_jCBroomTypeActionPerformed

    private void jCBroomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBroomNoActionPerformed
        // TODO add your handling code here:
        RoomNumber =(String)jCBroomNo.getSelectedItem();
        
        try {
            ResultSet rs = Select.getData("select * from room where roomNumber = '"+RoomNumber+"'");
            while (rs.next()) {                
                jTFprice.setText(rs.getString(4));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jCBroomNoActionPerformed

    private void jTFaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFaddressActionPerformed

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
            java.util.logging.Logger.getLogger(Check_Ins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Ins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Ins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Ins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_Ins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBexit2;
    private javax.swing.JButton jBaddRoom1;
    private javax.swing.JButton jBalloteRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBbed;
    private javax.swing.JComboBox<String> jCBgender;
    private javax.swing.JComboBox<String> jCBroomNo;
    private javax.swing.JComboBox<String> jCBroomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCheckInDate;
    private javax.swing.JTextField jTFaddress;
    private javax.swing.JTextField jTFcContactsNumber;
    private javax.swing.JTextField jTFcEmail;
    private javax.swing.JTextField jTFcName;
    private javax.swing.JTextField jTFidProof;
    private javax.swing.JTextField jTFnationality;
    private javax.swing.JTextField jTFprice;
    // End of variables declaration//GEN-END:variables
}

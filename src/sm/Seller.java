
package sm;

import sm.Products;
import sm.Login;
import sm.Admin;
import java.sql.Statement;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import supermarket.JFrameCategory;



/**
 *
 * @author Chamee
 */
public class Seller extends javax.swing.JFrame {

    
    public Seller() {
        initComponents();
       SelectSeller();
    }
  Connection Con = null;
  Statement St = null;
  ResultSet Rs = null;
  PreparedStatement add;
  public void SelectSeller()
  {
      try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from sellertbl");
           SellerTable.setModel(DbUtils.resultSetToTableModel(Rs));
          
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
   
  }
  

  

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plSeller = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        SelName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SelId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SelPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SelGender = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chngepass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        plSeller.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("SELLERS LIST");

        SelName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SelName.setForeground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("SELLERID");

        SelId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SelId.setForeground(new java.awt.Color(0, 153, 153));
        SelId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelIdMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("NAME");

        SelPass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SelPass.setForeground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("PASSWORD");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("GENDER");

        SelGender.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SelGender.setForeground(new java.awt.Color(0, 153, 153));
        SelGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        SelGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelGenderActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 153, 153));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.setBorder(null);
        AddBtn.setBorderPainted(false);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(0, 153, 153));
        EditBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Update");
        EditBtn.setBorder(null);
        EditBtn.setBorderPainted(false);
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(0, 153, 153));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Clear");
        ClearBtn.setBorder(null);
        ClearBtn.setBorderPainted(false);
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        Deletebtn.setBackground(new java.awt.Color(0, 153, 153));
        Deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        Deletebtn.setText("Delete");
        Deletebtn.setBorder(null);
        Deletebtn.setBorderPainted(false);
        Deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletebtnMouseClicked(evt);
            }
        });

        SellerTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        SellerTable.setRowHeight(25);
        SellerTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        SellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellerTable);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Manage SELLERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SelName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SelId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(14, 14, 14)
                                        .addComponent(SelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(321, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(277, 277, 277)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(SelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(SelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel10)
                    .addContainerGap(490, Short.MAX_VALUE)))
        );

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("LOGOUT");
        jLabel13.setToolTipText("");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PRODUCTS");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CATEGORIES");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        chngepass.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        chngepass.setForeground(new java.awt.Color(255, 255, 255));
        chngepass.setText("UPDATE PASSWORD");
        chngepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chngepassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout plSellerLayout = new javax.swing.GroupLayout(plSeller);
        plSeller.setLayout(plSellerLayout);
        plSellerLayout.setHorizontalGroup(
            plSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSellerLayout.createSequentialGroup()
                .addGroup(plSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plSellerLayout.createSequentialGroup()
                        .addGroup(plSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plSellerLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel11))
                            .addGroup(plSellerLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel14))
                            .addGroup(plSellerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chngepass))
                            .addGroup(plSellerLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(plSellerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        plSellerLayout.setVerticalGroup(
            plSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSellerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plSellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(plSellerLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(393, 393, 393)
                        .addComponent(chngepass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(plSellerLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plSeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SelGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelGenderActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
     
        //TODO add your handling code here:
       if(SelId.getText().isEmpty()|| SelName.getText().isEmpty()||SelPass.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            

            PreparedStatement add = Con.prepareStatement("insert into SELLERTBL values(?,?,?,?)");
            
            add.setInt(1,Integer.valueOf(SelId.getText()));
            add.setString(2,SelName.getText());
            add.setString(3,SelPass.getText());
            add.setString(4,SelGender.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Seller Added Successfully");
             Con.close();
             SelectSeller();
             } catch (Exception e) {
                 e.printStackTrace();
        }
     {
     } }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void SellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerTableMouseClicked
        DefaultTableModel model= (DefaultTableModel)SellerTable.getModel();
        int Myindex =  SellerTable.getSelectedRow();
        SelId.setText(model.getValueAt(Myindex,0).toString());
        SelName.setText(model.getValueAt(Myindex,1).toString());
        SelPass.setText(model.getValueAt(Myindex,2).toString());
    }//GEN-LAST:event_SellerTableMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        SelId.setText("");
        SelName.setText("");
        SelPass.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletebtnMouseClicked
       if(SelId.getText().isEmpty()) 
       {
        JOptionPane.showMessageDialog(this,"Enter The Seller To Be Deleted");
       }
       else
       {
           try {
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
               String SId = SelId.getText();
               String Query = "Delete From sellertbl where SelId="+SId;
               Statement Add= Con.createStatement();
               Add.executeUpdate(Query);
               SelectSeller();
               JOptionPane.showMessageDialog(this,"Seller Deleted Successfully.");
           } catch (Exception e)
           {
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_DeletebtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(SelId.getText().isEmpty()||SelName.getText().isEmpty()||SelPass.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(this,"Missing Infromation");
        }
        else
        {
            try 
            {
                 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
                 String Query ="Update sellertbl Set SelName='"+SelName.getText()+"'"+",SelPass='"+SelPass.getText()+"'"+",SelGender='"+SelGender.getSelectedItem().toString()+"'"+"where SelId="+SelId.getText();
                 Statement ADD = Con.createStatement();
                 ADD.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this,"Seller Updated");
                 SelectSeller();
               
            } catch (SQLException e) 
            {
                e.printStackTrace();
            }
        
        }
            
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void SelIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SelIdMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
             new Login().setVisible(true);
             this .dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void chngepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chngepassMouseClicked

        new Admin().setVisible(true);
        this .dispose();
    }//GEN-LAST:event_chngepassMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
         new JFrameCategory().setVisible(true);
        this .dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
        
        
    }//GEN-LAST:event_AddBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> SelGender;
    private javax.swing.JTextField SelId;
    private javax.swing.JTextField SelName;
    private javax.swing.JTextField SelPass;
    private javax.swing.JTable SellerTable;
    private javax.swing.JLabel chngepass;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel plSeller;
    // End of variables declaration//GEN-END:variables
}

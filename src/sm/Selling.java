/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sm;



import sm.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;

  

public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectSeller();
        GetCat();
    }

  Connection Con = null;
  Statement St = null;
  ResultSet Rs = null;
  PreparedStatement add; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CatCb = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        BillTxt = new java.awt.TextArea();
        Grdtotbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setForeground(new java.awt.Color(255, 102, 0));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("PRODUCTS LIST");

        ProdName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdName.setForeground(new java.awt.Color(255, 102, 0));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("NAME");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("QUANTITY");

        ProdQty.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(255, 102, 0));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Filter");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        CatCb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatCb.setForeground(new java.awt.Color(0, 153, 153));
        CatCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatCbMouseClicked(evt);
            }
        });
        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 153, 153));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add To Bill");
        AddBtn.setBorder(null);
        AddBtn.setBorderPainted(false);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(0, 153, 153));
        EditBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Print Bill");
        EditBtn.setBorder(null);
        EditBtn.setBorderPainted(false);
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
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

        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn.setText("Refresh");
        DeleteBtn.setBorder(null);
        DeleteBtn.setBorderPainted(false);
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        ProductTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("BILLING AND RECIEPT PRINTING");

        BillTxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BillTxt.setForeground(new java.awt.Color(51, 51, 51));

        Grdtotbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Grdtotbl.setForeground(new java.awt.Color(255, 0, 0));
        Grdtotbl.setText("Rs");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(152, 152, 152))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Grdtotbl, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Grdtotbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("LOGOUT");
        jLabel20.setToolTipText("");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void SelectSeller()
  {
      try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from producttbl");
           ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
          
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
   
  }
int Prid,newQty;
public void update(){
try 
            {
                 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
                 String Query ="Update producttbl Set ProdQty="+newQty+" "+" where ProdId="+Prid;
                 Statement ADD = Con.createStatement();
                 ADD.executeUpdate(Query);
                 //JOptionPane.showMessageDialog(this,"Product Updated");
                 SelectSeller();
               
            } catch (SQLException e) 
            {
                e.printStackTrace();
            }
}
        
        
        
    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        
    }//GEN-LAST:event_CatCbActionPerformed
int i = 0;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
    if(ProdQty.getText().isEmpty()||ProdName.getText().isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Missing Information");
    }
    else if(AvailQty <  Integer.valueOf(ProdQty.getText()))
    {
    JOptionPane.showMessageDialog(this, "Not Enough In Stock");
    }
    else
    {
    i++;
    ProdTot = Uprice * Double.valueOf(ProdQty.getText());
    GrdTotal = GrdTotal+ProdTot;
    if(i ==1)
    {
    
    BillTxt.setText(BillTxt.getText()+"                     ************NEW CHAI STORE************                         \n"+"NUM       PRODUCT      PRICE       QUANTITY   TOTAL\n"  +i+"               "+ProdName.getText()+"            "+Uprice+"              "+ProdQty.getText()+"             "+ProdTot+"\n");
    }
     else  
    {
    BillTxt.setText( BillTxt.getText()+i+"               "+ProdName.getText()+"            "+Uprice+"              "+ProdQty.getText()+"             "+ProdTot+"\n");
    }
    Grdtotbl.setText("Rs "+GrdTotal);
    update();
    }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        try {
           //BillTxt.print();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_EditBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
       // BillId.setText("");
        ProdName.setText("");
        ProdQty.setText("");
       
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
       SelectSeller();
    }//GEN-LAST:event_DeleteBtnMouseClicked
private void GetCat()
   {
    try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           St = Con.createStatement();
           String query = "Select * from category";
           Rs = St.executeQuery(query);
           while (Rs.next()) 
        {            
         String   Mycat = Rs.getString("CatName");
         CatCb.addItem(Mycat);
        }
          
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
   }
    
double Uprice,ProdTot=0.0,GrdTotal=0.0;
int AvailQty;

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model= (DefaultTableModel)ProductTable.getModel();
        int Myindex =  ProductTable.getSelectedRow();
        Prid =Integer.valueOf(model.getValueAt(Myindex,0).toString());
        AvailQty =  Integer.valueOf(model.getValueAt(Myindex,2).toString());
        newQty = AvailQty - Integer.valueOf(ProdQty.getText());
        ProdName.setText(model.getValueAt(Myindex,1).toString());
        Uprice = Double.valueOf(model.getValueAt(Myindex,3).toString());
        ProdTot = Uprice * Integer.valueOf(ProdQty.getText());
       // ProdQty.setText(model.getValueAt(Myindex,2).toString());
      //  ProdPrice.setText(model.getValueAt(Myindex,3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        new Login().setVisible(true);
        this .dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
       
        
    }//GEN-LAST:event_EditBtnActionPerformed

    private void CatCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatCbMouseClicked
       try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from category where CatName='"+CatCb.getSelectedItem().toString()+"'");
           ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
          
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
    }//GEN-LAST:event_CatCbMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from category where CatName='"+CatCb.getSelectedItem().toString()+"'");
           ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
          
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private java.awt.TextArea BillTxt;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel Grdtotbl;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

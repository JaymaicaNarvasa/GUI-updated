package ApplicationPage;

import config.Session;
import config.dbConnector;
import javax.swing.*;

public class StaffApplication extends javax.swing.JFrame {

    public StaffApplication() {
        initComponents();

    }
    public String action;
    public String tenureValue;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        id1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        tenurebox = new javax.swing.JComboBox<>();
        monthbox = new javax.swing.JComboBox<>();
        yearbox = new javax.swing.JComboBox<>();
        loanamt = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();
        interest = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, 20));

        id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("ID");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 30, 20));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 40, 30));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 40, 30));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 50, 30));

        tenurebox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tenurebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Year" }));
        tenurebox.setBorder(null);
        tenurebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenureboxActionPerformed(evt);
            }
        });
        jPanel1.add(tenurebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 90, 20));

        monthbox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthbox.setBorder(null);
        jPanel1.add(monthbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 50, 20));

        yearbox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        yearbox.setBorder(null);
        jPanel1.add(yearbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 50, 20));

        loanamt.setBackground(new java.awt.Color(204, 204, 204));
        loanamt.setEditable(true);
        loanamt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loanamt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5000.00", "15000.00", "10000.00", "20000.00", "30000.00", "35000.00", "40000.00", "50000.00", "70000.00", "80000.00", "90000.00", "100000.00", "500000.00" }));
        loanamt.setBorder(null);
        loanamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanamtActionPerformed(evt);
            }
        });
        jPanel1.add(loanamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 20));

        status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Rejected" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 100, -1));

        type.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Home", "Personal", "Medical", "Education" }));
        type.setBorder(null);
        type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeMouseClicked(evt);
            }
        });
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 20));

        label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("LABEL");
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMouseClicked(evt);
            }
        });
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 120, 30));

        interest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        interest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(interest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 40, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("%");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 190, 20, 20));

        amt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 310, 180, 20));

        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditApplication.png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new ApplicationDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void tenureboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenureboxActionPerformed
        if(tenurebox.getSelectedItem().equals("Select")){
            yearbox.setEnabled(false);
            monthbox.setEnabled(false);
        }else if(tenurebox.getSelectedItem().equals("Month")){
            yearbox.setEnabled(false);
            monthbox.setEnabled(true);
        }else if(tenurebox.getSelectedItem().equals("Select")){
            JOptionPane.showMessageDialog(this, "Select First");
        }else{
            monthbox.setEnabled(false);
            yearbox.setEnabled(true);
        }
    }//GEN-LAST:event_tenureboxActionPerformed

    private void loanamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loanamtActionPerformed

    private void labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseClicked
        dbConnector dbc = new dbConnector();
        tenureValue = tenurebox.equals("Month") ? monthbox.getSelectedItem().toString() : yearbox.getSelectedItem().toString();
            int userId = Session.getInstance().getId();
            
            int loanStatusId = 1; 
            if (status.getSelectedItem().toString().equals("Pending")) {
                loanStatusId = 1;
            } else if (status.getSelectedItem().toString().equals("Approved")) {
                loanStatusId = 2;
            } else if (status.getSelectedItem().toString().equals("Rejected")) {
                loanStatusId = 3;
            }
            
            int typeId = 1;
            if(type.getSelectedItem().toString().equals("Pending")){
                typeId = 1;
            }else if(type.getSelectedItem().toString().equals("Approved")){
                typeId = 2;
            }else if (type.getSelectedItem().toString().equals("Rejected")){
                typeId = 3;
            }
            
        if(action.equals("ADD")){
            
          int result = dbc.insertData( "INSERT INTO tbl_application(user_id, amount, amt_to_pay, tenure_unit, tenure_value, loan_status_id , loan_type_id , interest_rate) " +
                                       "VALUES ('" + userId + "', '" + loanamt.getSelectedItem().toString() + "', '" + amt.getText() + "', "
                                               + "'" + tenurebox.getSelectedItem() + "', '" + tenureValue + "', '" + loanStatusId + "', '" + typeId + "', '" + interest.getText() + "')");
          if(result == 1){
              JOptionPane.showMessageDialog(null, "SUCCESSFULLY SAVE");
              new ApplicationDashboard().setVisible(true);
              this.dispose();
          }else {
              System.out.println("Saving DATA FAILED!");
          }
       
        
       }else if(action.equals("UPDATE")){
           dbc.updateData("UPDATE tbl_application SET amount = '" + loanamt.getSelectedItem().toString() + "', amt_to_pay = '" + amt.getText() + "' ,"
                   + "tenure_unit = '" + tenurebox.getSelectedItem() + "' , tenure_value = '" + tenureValue + "' , loan_status_id = '" + loanStatusId + "' , "
                           + "loan_type_id = '" + typeId + "', interest_rate = '" + interest.getText() + "' WHERE loan_id = '" + id1.getText() + "' ");
           new ApplicationDashboard().setVisible(true);
           this.dispose();
       }else {
           JOptionPane.showMessageDialog(null, "NO Action SELECTED!");
          this.dispose();
       }
    }//GEN-LAST:event_labelMouseClicked

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if(type.getSelectedItem().equals("Home")){
            interest.setText("5");
        }else if (type.getSelectedItem().equals("Personal")){
            interest.setText("6");
        }else if (type.getSelectedItem().equals("Medical")){
            interest.setText("4");
        }else if (type.getSelectedItem().equals ("Education")){
            interest.setText("4.5");
        }else{
            interest.setText("0.0");
        }
        
        double loanAmount = Double.parseDouble(loanamt.getSelectedItem().toString());
        double interestRate = Double.parseDouble(interest.getText()) / 100; 
        double amountToPay = loanAmount + (loanAmount * interestRate);
        amt.setText(String.valueOf(amountToPay));
        
    }//GEN-LAST:event_typeActionPerformed

    private void typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_typeMouseClicked

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
            java.util.logging.Logger.getLogger(StaffApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel amt;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    public javax.swing.JLabel id1;
    public javax.swing.JLabel interest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel label;
    public javax.swing.JComboBox<String> loanamt;
    private javax.swing.JLabel minimize;
    public javax.swing.JComboBox<String> monthbox;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JComboBox<String> tenurebox;
    public javax.swing.JComboBox<String> type;
    public javax.swing.JComboBox<String> yearbox;
    // End of variables declaration//GEN-END:variables

   
}

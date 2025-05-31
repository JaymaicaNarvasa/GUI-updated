package ApplicationPage;

import AdminPage.*;
import Reports.*;
import config.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class ApplicationDashboard extends javax.swing.JFrame {

    public ApplicationDashboard() {
        initComponents();
        application_tbl.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        

        
        displayData();
    }
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT a.user_id AS 'User ID', a.amount AS 'Amount', a.amt_to_pay As 'To Pay', a.tenure_value , a.tenure_unit , "
                    + "a.interest_rate , s.status_name AS 'Status', l.loan_name, a.application_date "
                    + "FROM tbl_application a "
                    + "INNER JOIN tbl_user u ON a.user_id = u.u_id "
                    + "INNER JOIN tbl_loan l ON a.loan_type_id = l.loan_type_id "
                    + "INNER JOIN tbl_status s ON a.loan_status_id = s.loan_status_id "
                    + "WHERE a.loan_status_id != 4");

            application_tbl.setModel(DbUtils.resultSetToTableModel(rs));
            application_tbl.getColumnModel().getColumn(3).setMinWidth(0);
            application_tbl.getColumnModel().getColumn(3).setMaxWidth(0);
            application_tbl.getColumnModel().getColumn(3).setWidth(0);
            application_tbl.getColumnModel().getColumn(4).setMinWidth(0);
            application_tbl.getColumnModel().getColumn(4).setMaxWidth(0);
            application_tbl.getColumnModel().getColumn(4).setWidth(0);
            application_tbl.getColumnModel().getColumn(5).setMinWidth(0);
            application_tbl.getColumnModel().getColumn(5).setMaxWidth(0);
            application_tbl.getColumnModel().getColumn(5).setWidth(0);
            application_tbl.getColumnModel().getColumn(7).setMinWidth(0);
            application_tbl.getColumnModel().getColumn(7).setMaxWidth(0);
            application_tbl.getColumnModel().getColumn(7).setWidth(0);
            application_tbl.getColumnModel().getColumn(8).setMinWidth(0);
            application_tbl.getColumnModel().getColumn(8).setMaxWidth(0);
            application_tbl.getColumnModel().getColumn(8).setWidth(0);
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luyoCp3 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        application_tbl = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        edit = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        printer = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        luyoCp3.setBackground(new java.awt.Color(0, 0, 0));
        luyoCp3.setPreferredSize(new java.awt.Dimension(350, 625));
        luyoCp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        luyoCp3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 40, 30));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        luyoCp3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 40, 20));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        luyoCp3.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 40, 30));

        application_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        application_tbl.setGridColor(new java.awt.Color(255, 255, 255));
        application_tbl.setSelectionBackground(new java.awt.Color(255, 204, 153));
        application_tbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(application_tbl);

        luyoCp3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 270, 370));

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        luyoCp3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 230, 10));

        edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        luyoCp3.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, 30));

        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        luyoCp3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 40, 30));

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        luyoCp3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 30));

        printer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/print.png"))); // NOI18N
        printer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printerMouseClicked(evt);
            }
        });
        luyoCp3.add(printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationDashboard.png"))); // NOI18N
        cellphone.setPreferredSize(new java.awt.Dimension(350, 625));
        luyoCp3.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(luyoCp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(luyoCp3, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        try {
        dbConnector dbc = new dbConnector();
        String sql = "SELECT role_id FROM tbl_user WHERE u_id = ?";
        PreparedStatement pstmt = dbc.connect.prepareStatement(sql);
        pstmt.setInt(1, Session.getInstance().getId());
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int roleId = rs.getInt("role_id");

            if (roleId == 1) {
                new adminDashboard().setVisible(true);
            } else if (roleId == 2) {
                new staffDashboard().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "UNKNOWN ROLE!");
            }

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "User not found!");
        }

        rs.close();
        pstmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    }

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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowindex = application_tbl.getSelectedRow();
        
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please SELECt data from Table");
        }else{
            TableModel model = application_tbl.getModel();
            StaffApplication eu = new StaffApplication();
            eu.id1.setText(""+model.getValueAt(rowindex, 0));
            eu.loanamt.setSelectedItem(model.getValueAt(rowindex, 1));
            eu.amt.setText(""+model.getValueAt(rowindex, 2));
            eu.tenurebox.setSelectedItem(model.getValueAt(rowindex, 3));
            eu.interest.setText(""+model.getValueAt(rowindex, 5));
            eu.type.setSelectedItem(model.getValueAt(rowindex, 7));
            eu.status.setSelectedItem(model.getValueAt(rowindex, 5));
            double loanAmount = Double.parseDouble(eu.loanamt.getSelectedItem().toString());
            double interestRate = Double.parseDouble(eu.interest.getText()) / 100; 
            double amountToPay = loanAmount + (loanAmount * interestRate);
            eu.amt.setText(String.valueOf(amountToPay));
            eu.action = "UPDATE";
            eu.label.setText("UPDATE");
            eu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_editMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       StaffApplication ep = new StaffApplication();
       ep.action = "ADD";
       ep.label.setText("SAVE");
       ep.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = application_tbl.getSelectedRow();
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please SELECT data from Table");
        } else {
            TableModel model = application_tbl.getModel();
            Object value = model.getValueAt(rowIndex, 0); 
            String id = value.toString();
            String status = model.getValueAt(rowIndex, 6).toString(); 

        if (status.equalsIgnoreCase("Approved")) {
            JOptionPane.showMessageDialog(null, "Cannot delete an Approved loan application!");
            return;
        }

        int a = JOptionPane.showConfirmDialog(null, "Are you sure to 'delete' ID: " + id + "?");
        if (a == JOptionPane.YES_OPTION) {
            dbConnector dbc = new dbConnector();
            int uId = Integer.parseInt(id);
            int actingUserId = Session.getInstance().getId();
        if (actingUserId != 0) { 
            String action = "Soft deleted Application ID: " + id;
            dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
        } else {
            System.out.println("WARNING: No valid logged-in user for logging activity!");
        }
        
        dbc.updateData("UPDATE tbl_application SET loan_status_id = 4 WHERE loan_id = '" + uId + "'");

        displayData();
        
        JOptionPane.showMessageDialog(null, "Record marked as 'Deleted' successfully!");
    }
}


//        int rowIndex = application_tbl.getSelectedRow();
//        if(rowIndex < 0){
//            JOptionPane.showMessageDialog(null, "Please SELEC data from Table");
//        }else{
//            TableModel model = application_tbl.getModel();
//            Object value = model.getValueAt(rowIndex, 0);
//            String id = value.toString();
//            int a = JOptionPane.showConfirmDialog(null, "Are you sure to DELETE ID: " + id);
//            if(a == JOptionPane.YES_OPTION){
//                dbConnector dbc = new dbConnector();
//                int uId = Integer.parseInt(id);
//                dbc.deleteData(uId, "tbl_application", "loan_id");
//                int actingUserId = Session.getInstance().getId();
//                String action = "Deleted Loan Application with Loan ID: " + id;
//                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
//                displayData();
//            }
//        }
    }//GEN-LAST:event_deleteMouseClicked

    private void printerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseClicked
        int rowindex = application_tbl.getSelectedRow();

    if (rowindex < 0) {
        JOptionPane.showMessageDialog(null, "Please SELECT data from the table.");
        return;
    }

    try {
        TableModel model = application_tbl.getModel();
        int userId = Integer.parseInt(model.getValueAt(rowindex, 0).toString());
        double amount = Double.parseDouble(model.getValueAt(rowindex, 1).toString());
        double interest = Double.parseDouble(model.getValueAt(rowindex, 5).toString()); 
        String tenureUnit = model.getValueAt(rowindex, 4).toString(); 
        String date = model.getValueAt(rowindex, 8).toString(); 

        double amountToPay = amount + (amount * (interest / 100));

        dbConnector dbc = new dbConnector();
        String sql = "SELECT u_fname, u_lname, u_address FROM tbl_user WHERE u_id = ?";
        PreparedStatement pst = dbc.getConnection().prepareStatement(sql);
        pst.setInt(1, userId);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String fName = rs.getString("u_fname");
            String lName = rs.getString("u_lname");
            String address = rs.getString("u_address");
            Print eu = new Print();
            eu.fname.setText(fName); 
            eu.lname.setText(lName); 
            eu.address.setText(address);
            eu.amount.setText(String.valueOf(amount));
            eu.totalToPay.setText(String.format("%.2f", amountToPay));
            eu.date.setText(date);
            eu.date1.setText(date);
            String installmentText = "";

            if (tenureUnit.equalsIgnoreCase("Month")) {
                installmentText = "Monthly installments of ₱" + amountToPay +
                                  " beginning on " + date +
                                  " and continuing every month until the entire balance is paid in full.";
            } else if (tenureUnit.equalsIgnoreCase("Year")) {
                installmentText = "Yearly installments of ₱" + amountToPay +
                                  " beginning on " + date +
                                  " and continuing every year until the entire balance is paid in full.";
            } else {
                installmentText = "Installment plan not specified.";
            }
            eu.tenure.setText(""+installmentText);
            JPanel myPrint = new JPanel();
            PanelPrinter pt = new PanelPrinter(eu.page);
            pt.printPanel();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "User data not found.");
        }

        rs.close();
        pst.close();

    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }

    }//GEN-LAST:event_printerMouseClicked

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
            java.util.logging.Logger.getLogger(ApplicationDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JTable application_tbl;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel luyoCp3;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel printer;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}

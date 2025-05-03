package Reports;

import ApplicationPage.CustomerApplication;
import UsersPage.*;
import config.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class ActivityDashboard extends javax.swing.JFrame {

    public ActivityDashboard() {
        initComponents();
        
        displayData();
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT a.user_id AS 'User ID', a.amount AS 'Amount', a.amt_to_pay As 'To Pay', a.tenure_value , a.tenure_unit , "
                    + "a.interest_rate , s.status_name AS 'Status', l.loan_name "
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
        edit = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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

        edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        luyoCp3.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, 30));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        luyoCp3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 30));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        luyoCp3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 60, 30));

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
        new CustomerDashboard().setVisible(true);
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

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowindex = application_tbl.getSelectedRow();

        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please SELECt data from Table");
        }else{
            TableModel model = application_tbl.getModel();
            CustomerApplication eu = new CustomerApplication();
            eu.id1.setText(""+model.getValueAt(rowindex, 0));
            eu.loanamt.setSelectedItem(model.getValueAt(rowindex, 1));
            eu.amt.setText(""+model.getValueAt(rowindex, 2));
            eu.tenurebox.setSelectedItem(model.getValueAt(rowindex, 3));
            eu.interest.setText(""+model.getValueAt(rowindex, 5));
            eu.type.setSelectedItem(model.getValueAt(rowindex, 7));
            eu.status.setSelectedItem(model.getValueAt(rowindex, 5));
            eu.action = "UPDATE";
            eu.label.setText("UPDATE");
            eu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_editMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        
    int rowIndex = application_tbl.getSelectedRow();
    
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please SELECT an application to cancel.");
    } else {
        TableModel model = application_tbl.getModel();
        String loanId = model.getValueAt(rowIndex, 0).toString(); 
        
        dbConnector dbc = new dbConnector();
        
        try {
            String checkStatusQuery = "SELECT loan_status_id FROM tbl_application WHERE loan_id = '" + loanId + "'";
            ResultSet rs = dbc.getData(checkStatusQuery);
            
            if (rs.next()) {
                int statusId = rs.getInt("loan_status_id");
                
                if (statusId == 1) { 
                    
                    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to CANCEL this application?");
                    if (confirm == JOptionPane.YES_OPTION) {
                        int cancelledStatusId = 5; 
                        String updateQuery = "UPDATE tbl_application SET loan_status_id = '" + cancelledStatusId + "' WHERE loan_id = '" + loanId + "'";
                        dbc.updateData(updateQuery);

                        JOptionPane.showMessageDialog(null, "Application CANCELLED Successfully!");

                        int actingUserId = Session.getInstance().getId();
                        String action = "Cancelled Application ID: " + loanId;
                        dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");

                        displayData(); 
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot cancel. Application is already processed.");
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
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
    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(ActivityDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivityDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivityDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivityDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivityDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable application_tbl;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel luyoCp3;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}

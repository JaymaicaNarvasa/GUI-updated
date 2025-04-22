package UsersPage;

import ApplicationPage.application;
import ProfilePage.CustomerProfile;
import config.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class CustomerDashboard extends javax.swing.JFrame {

    public CustomerDashboard() {
        initComponents();
        displayAmount();
        displayData();
    }
    public void displayData() {
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT l.loan_name, a.amt_to_pay, a.date, s.status_name " +
                "FROM tbl_activity a " +
                "INNER JOIN tbl_loan l ON a.loan_id = l.loan_id " +
                "INNER JOIN tbl_status s ON a.loan_status_id = s.loan_status_id");

            customer_tbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException ex) {
         System.out.println("Errors: " + ex.getMessage());
        }
    }
        
    
    public void displayAmount(){
       Session ses = Session.getInstance();
       int userId = ses.getId();
       
       String sql = "SELECT ap.amount , s.status_name "
               + "FROM tbl_application ap "
               + "INNER JOIN tbl_status s "
               + "ON ap.loan_status_id = s.loan_status_id"
               + "WHERE user_id = ? AND status_name = 'Disbursed' ";
       try{
           dbConnector dbc = new dbConnector();
           PreparedStatement pst = dbc.getConnection().prepareStatement(sql);
           pst.setInt(1, userId);
           
           ResultSet rs = pst.executeQuery();
           
           if(rs.next()){
               double amount = rs.getDouble("amount");
               money.setText(String.valueOf(amount));
           }else{
               JOptionPane.showMessageDialog(null, "NO active disbursed loan.");
           }
           rs.close();
           pst.close();
       }catch(SQLException ex){
           System.out.println("ERROR fecthing loan: "+ ex.getMessage());
       }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        apply = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        profilesettings = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        topay = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customer_tbl = new javax.swing.JTable();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apply.setToolTipText("");
        apply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyMouseClicked(evt);
            }
        });
        jPanel1.add(apply, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, 110));

        money.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(money, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, 20));

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

        profilesettings.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profilesettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilesettingsMouseClicked(evt);
            }
        });
        jPanel1.add(profilesettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 40, 30));

        header.setBackground(new java.awt.Color(255, 255, 255));

        topay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        topay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topay.setText("To Pay");

        date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");

        type.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("Loan type");

        status.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("Status");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(type)
                .addGap(18, 18, 18)
                .addComponent(topay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, 40));

        customer_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        customer_tbl.setSelectionBackground(new java.awt.Color(255, 204, 153));
        customer_tbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(customer_tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, 210));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer (2).png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void applyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyMouseClicked
       application ap =  new application();
       ap.setVisible(true);
       ap.image.setEnabled(true);
       ap.remove.setEnabled(false);
        this.dispose();
    }//GEN-LAST:event_applyMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }       dbConnector dbc = new dbConnector();
                int actingUserId = Session.getInstance().getId(); 
                String action = "Exit";
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
    }//GEN-LAST:event_homeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void profilesettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilesettingsMouseClicked
        new CustomerProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilesettingsMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apply;
    private javax.swing.JLabel cellphone;
    private javax.swing.JTable customer_tbl;
    private javax.swing.JLabel date;
    private javax.swing.JPanel header;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel money;
    private javax.swing.JLabel profilesettings;
    private javax.swing.JLabel status;
    private javax.swing.JLabel topay;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}

package ApplicationPage;

import AdminPage.adminDashboard;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
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
            ResultSet rs = dbc.getData("SELECT a.user_id AS 'ID', a.amount AS 'Amount', a.amt_to_pay As 'To Pay', s.status_name AS 'Status'  "
                    + "FROM tbl_application a "
                    + "INNER JOIN tbl_user u ON a.user_id = u.u_id "
                    + "INNER JOIN tbl_status s ON a.loan_status_id = s.loan_status_id");

            application_tbl.setModel(DbUtils.resultSetToTableModel(rs));
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
        new adminDashboard().setVisible(true);
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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
//        int rowindex = application_tbl.getSelectedRow();
//
//        if(rowindex < 0){
//            JOptionPane.showMessageDialog(null, "Please SELECt data from Table");
//        }else{
//            TableModel model = user_tbl.getModel();
//            editUser eu = new editUser();
//            eu.id1.setText(""+model.getValueAt(rowindex, 0));
//            eu.fname.setText(""+model.getValueAt(rowindex, 1));
//            eu.lname.setText(""+model.getValueAt(rowindex, 2));
//            eu.status.setSelectedItem(model.getValueAt(rowindex, 3));
//            eu.role.setSelectedItem(model.getValueAt(rowindex, 4));
//            eu.setVisible(true);
//            this.dispose();
//        }
    }//GEN-LAST:event_editMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
//        new addUser().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
//        int rowIndex = user_tbl.getSelectedRow();
//        if(rowIndex < 0){
//            JOptionPane.showMessageDialog(null, "Please SELECt data from Table");
//        }else{
//            TableModel model = user_tbl.getModel();
//            Object value = model.getValueAt(rowIndex, 0);
//            String id = value.toString();
//            int a = JOptionPane.showConfirmDialog(null, "Are you sure to DELETE ID: " + id);
//            if(a == JOptionPane.YES_OPTION){
//                dbConnector dbc = new dbConnector();
//                int uId = Integer.parseInt(id);
//                dbc.deleteData(uId, "tbl_user", "u_id");
//                int actingUserId = Session.getInstance().getId();
//                String action = "Deleted User with ID: " + id;
//                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
//                displayData();
//            }
//        }
    }//GEN-LAST:event_deleteMouseClicked

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
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}

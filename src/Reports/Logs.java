package Reports;

import AdminPage.*;
import config.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;

public class Logs extends javax.swing.JFrame {

    public Logs() {
        initComponents();
        
        
//        log_tbl.setShowGrid(false);
//        log_tbl.setIntercellSpacing(new Dimension(0, 0)); 
//        log_tbl.setRowHeight(30);
//        log_tbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
          log_tbl.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//        log_tbl.getTableHeader().setVisible(false);
//        
//        log_tbl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//        public Component getTableCellRendererComponent(JTable table, Object value,
//                boolean isSelected, boolean hasFocus, int row, int column) {
//            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//
//            if (isSelected) {
//                c.setBackground(new Color(173, 216, 230)); 
//            } else {
//                c.setBackground(row % 2 == 0 ? Color.WHITE : new Color(245, 245, 245));
//            }
//            c.setForeground(Color.BLACK);
//            return c;
//        }
//    });
        displayData();
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT tbl_user.u_id AS 'ID', tbl_log.action AS 'Action', tbl_log.log_date AS 'Date' "
                    + "FROM tbl_log INNER JOIN tbl_user ON tbl_log.user_id = tbl_user.u_id");

            log_tbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
    
    JTextField searchField = new JTextField(20);
    JTable userTable = new JTable();
    DefaultTableModel model = (DefaultTableModel) userTable.getModel();

    
    public void search(String keyword) {
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    userTable.setRowSorter(sorter);
    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword)); 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        log_tbl = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(352, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 50, 20));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 40, 20));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 40, 20));

        log_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        log_tbl.setSelectionBackground(new java.awt.Color(255, 204, 153));
        log_tbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(log_tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 260, 400));

        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(null);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, 20));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 20, 20));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logs.png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 636));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
                dbConnector dbc = new dbConnector();
                int actingUserId = Session.getInstance().getId(); 
                String action = "Exit";
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
    }//GEN-LAST:event_homeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String keyword = searchField.getText();
        search(keyword);
    }//GEN-LAST:event_searchActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String keyword = searchField.getText();
        search(keyword);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable log_tbl;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}

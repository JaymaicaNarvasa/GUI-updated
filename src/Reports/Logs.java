package Reports;

import AdminPage.*;
import config.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

public class Logs extends javax.swing.JFrame {

    public Logs() {
        initComponents();
        
        log_tbl.setShowGrid(false);
        log_tbl.setIntercellSpacing(new Dimension(0, 0)); 
        log_tbl.setRowHeight(30);
        log_tbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        log_tbl.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        log_tbl.getTableHeader().setVisible(false);
        
        log_tbl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (isSelected) {
                c.setBackground(new Color(173, 216, 230)); 
            } else {
                c.setBackground(row % 2 == 0 ? Color.WHITE : new Color(245, 245, 245));
            }
            c.setForeground(Color.BLACK);
            return c;
        }
    });
        displayData();
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT tbl_user.u_id, tbl_log.action, tbl_log.log_date "
                    + "FROM tbl_log INNER JOIN tbl_user ON tbl_log.user_id = tbl_user.u_id");

            log_tbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logsname = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        userid = new javax.swing.JLabel();
        action = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        log_tbl = new javax.swing.JTable();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(352, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logsname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logsname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logsname.setText("LOGS");
        jPanel1.add(logsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

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

        header.setBackground(new java.awt.Color(255, 255, 255));

        userid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userid.setText("User ID");

        action.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        action.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        action.setText("Action");

        date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 270, 30));

        log_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        log_tbl.setSelectionBackground(new java.awt.Color(255, 204, 153));
        log_tbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(log_tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 270, 490));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReportsTable (2).png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 636));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel action;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel date;
    private javax.swing.JPanel header;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable log_tbl;
    private javax.swing.JLabel logsname;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables
}

package UsersPage;

import AdminPage.*;
import config.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;

public class ManageUser extends javax.swing.JFrame {

    public ManageUser() {
        initComponents();
        
        user_tbl.setShowGrid(false);
        user_tbl.setIntercellSpacing(new Dimension(0, 0)); 
        user_tbl.setRowHeight(30);
        user_tbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        user_tbl.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        user_tbl.getTableHeader().setVisible(false);

    user_tbl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
            ResultSet rs = dbc.getData("SELECT tbl_user.u_id, tbl_user.u_fname, tbl_user.u_lname, tbl_user.u_status, tbl_role.role_name "
                    + "FROM tbl_user INNER JOIN tbl_role ON tbl_user.role_id = tbl_role.role_id");

            user_tbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchIcon = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_tbl = new javax.swing.JTable();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(352, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchIcon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 30, 30));

        edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, 40));

        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, 40));

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 80, 40));

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(null);
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, 20));

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

        role.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        role.setText("Role");
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 50, 20));

        status.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("Status");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 40, 20));

        lname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lname.setText("Last Name");
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, 20));

        fname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fname.setText("First Name");
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, 20));

        idlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idlbl.setText("ID");
        jPanel1.add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 40, 20));

        header.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 270, 40));

        user_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        user_tbl.setGridColor(new java.awt.Color(255, 255, 255));
        user_tbl.setSelectionBackground(new java.awt.Color(255, 204, 153));
        user_tbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(user_tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 270, 440));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ManageUser (2).png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 630));

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
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = user_tbl.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please SELECt data from Table");
        }else{
            TableModel model = user_tbl.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to DELETE ID: " + id);
            if(a == JOptionPane.YES_OPTION){
                dbConnector dbc = new dbConnector();
                int uId = Integer.parseInt(id);
                dbc.deleteData(uId, "tbl_user", "u_id");
                int actingUserId = Session.getInstance().getId(); 
                String action = "Deleted User with ID: " + id;
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
                displayData();
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowindex = user_tbl.getSelectedRow();
        
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please SELECt data from Table");
        }else{
            TableModel model = user_tbl.getModel();
            editUser eu = new editUser();
            eu.id1.setText(""+model.getValueAt(rowindex, 0));
            eu.fname.setText(""+model.getValueAt(rowindex, 1));
            eu.lname.setText(""+model.getValueAt(rowindex, 2));
            eu.status.setSelectedItem(model.getValueAt(rowindex, 3));
            eu.role.setSelectedItem(model.getValueAt(rowindex, 4));
            eu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_editMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        new addUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel fname;
    private javax.swing.JPanel header;
    private javax.swing.JLabel home;
    private javax.swing.JLabel idlbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel role;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel status;
    private javax.swing.JTable user_tbl;
    // End of variables declaration//GEN-END:variables
}

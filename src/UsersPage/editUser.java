package UsersPage;

import config.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class editUser extends javax.swing.JFrame {

    public editUser() {
        initComponents();
    }
    
    Color exit = new Color(0,153,204);
    Color enter = new Color(255,203,67);    
    
    int validateTegister(){
        int result;
        
        if(fname.getText().trim().isEmpty() || lname.getText().trim().isEmpty()){
            result = 0;
        }else{
            result = 1;
        }
        return result;
    }          
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        role = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        save = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(352, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        role.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        role.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        role.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, -1));

        status.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Active" }));
        status.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 160, -1));

        fname.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setText("First Name");
        fname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 160, 20));

        lname.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setText("Last Name");
        lname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, 20));

        save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 440, 80, 50));

        id1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, 20));

        id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("ID");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 30, 20));

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

        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditUser (3).png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
         int check = validateTegister();
        dbConnector dbc = new dbConnector();
         
        if (check == 1) {
            String selectedRole = role.getSelectedItem().toString();
            int roleId = 0;

            try {
                ResultSet rs = dbc.getData("SELECT role_id FROM tbl_role WHERE role_name = '" + selectedRole + "'");
            if (rs.next()) {
                roleId = rs.getInt("role_id");
            }
                rs.close();
            } catch (SQLException e) {
                System.out.println("Error fetching role ID: " + e.getMessage());
            }

                if (roleId != 0) {
                    dbc.updateData("UPDATE tbl_user SET u_fname = '"+fname.getText().trim()+"', u_lname = '"+lname.getText().trim()+"',"
                            + "u_status = '"+status.getSelectedItem()+"', role_id = '"+roleId+"' "
                            + "WHERE u_id = '"+id1.getText()+"' ");
                    
                    int actingUserId = Session.getInstance().getId(); 
                    String action = "Updated User with ID: " + id1.getText();
                    dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
                }
            new ManageUser().setVisible(true);
            this.dispose();
        } else {
             JOptionPane.showMessageDialog(null, "ALL FIELDS REQUIRED!");
        }
        /*dbc.updateData("UPDATE tbl_user SET u_fname = '" + fname.getText().trim() + "', "
                 + "u_lname = '" + lname.getText().trim() + "', "
                 + "role_id = " + roleId + ","
                 + "u_status = '" + status.getSelectedItem() + "' "
                 + "WHERE u_id = '" + id1.getText().trim() + "'");
                */
    }//GEN-LAST:event_saveMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new ManageUser().setVisible(true);
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
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    public javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField lname;
    private javax.swing.JLabel minimize;
    public javax.swing.JComboBox<String> role;
    public javax.swing.JLabel save;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}

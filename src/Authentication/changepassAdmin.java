package Authentication;

import ProfilePage.adminProfile;
import config.*;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.*;

public class changepassAdmin extends javax.swing.JFrame {

    public changepassAdmin() {
        initComponents();
        Session ses = Session.getInstance();
        id.setText(""+ses.getId());
    }
    int validateTegister(){
        int result;
        if(oldpass.getText().isEmpty() || newpass.getText().isEmpty() || confirmpass.getText().isEmpty()){
            result = 0;
        }else if(newpass.getText().length() < 8 ){
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters.!");
             result = 0;
        }else if(confirmpass.equals(newpass)){
            JOptionPane.showMessageDialog(null, "Password don't match.!");
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
        save = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        oldpass = new javax.swing.JPasswordField();
        showpassword2 = new javax.swing.JLabel();
        showpassword1 = new javax.swing.JLabel();
        showpassword = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 70, 40));

        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 20));

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

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 30, 30));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 40, 30));

        id1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id1.setText("ID");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 70, 20));

        confirmpass.setBackground(new java.awt.Color(255, 212, 157));
        confirmpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpass.setBorder(null);
        jPanel1.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 140, 20));

        newpass.setBackground(new java.awt.Color(255, 212, 157));
        newpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.setBorder(null);
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, 20));

        oldpass.setBackground(new java.awt.Color(255, 212, 157));
        oldpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oldpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldpass.setBorder(null);
        jPanel1.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 270, 140, 20));

        showpassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(showpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 40, 30));

        showpassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(showpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 40, 30));

        showpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpasswordMouseClicked(evt);
            }
        });
        jPanel1.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 40, 30));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changepass (2).png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       dbConnector dbc = new dbConnector();
       Session sess = Session.getInstance();   

try {
    String sql = "SELECT u_password FROM tbl_user WHERE u_id = ?";
    PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql);
    pstmt.setInt(1, sess.getId()); 

    ResultSet rs = pstmt.executeQuery();
    
    int check = validateTegister();
if(check == 1){
    if (rs.next()) {
        String olddbpass = rs.getString("u_password");
        String oldhash = passwordHasher.hashPassword(oldpass.getText().trim());

        if (olddbpass.equals(oldhash)) {
            String npass = passwordHasher.hashPassword(newpass.getText().trim());

            String updateSQL = "UPDATE tbl_user SET u_password = ? WHERE u_id = ?";
            PreparedStatement updateStmt = dbc.getConnection().prepareStatement(updateSQL);
            updateStmt.setString(1, npass);
            updateStmt.setInt(2, sess.getId());
            
                int actingUserId = Session.getInstance().getId(); 
                String action = "Changing password of ID "+id;
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");

            int result = updateStmt.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "SAVE SUCCESS!");
                new adminProfile().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Update Failed!");
            }

            updateStmt.close();
        } else {
            JOptionPane.showMessageDialog(null, "Old Password Incorrect!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "User Not Found!");
    }
    }else{
        JOptionPane.showMessageDialog(null, "All Fields Required!");
    }

        rs.close();
        pstmt.close();
        
    } catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_saveMouseClicked

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        new adminProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void showpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpasswordMouseClicked
        
       
    }//GEN-LAST:event_showpasswordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with cellphoneault look and feel.
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
            java.util.logging.Logger.getLogger(changepassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepassAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changepassAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JLabel save;
    private javax.swing.JLabel showpassword;
    private javax.swing.JLabel showpassword1;
    private javax.swing.JLabel showpassword2;
    // End of variables declaration//GEN-END:variables
}

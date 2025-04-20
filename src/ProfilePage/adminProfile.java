package ProfilePage;

import Authentication.changepassAdmin;
import AdminPage.*;
import Authentication.*;
import config.*;
import java.sql.*;
import javax.swing.*;

public class adminProfile extends javax.swing.JFrame {

    public adminProfile() {
        initComponents();
        
        displayUserDetails();
    }
    private void displayUserDetails() {
    Session ses = Session.getInstance();

    if (ses == null || ses.getId() == 0) {
        JOptionPane.showMessageDialog(this, "No Account Found, Please Log In First.");
        LogIn lp = new LogIn();
        lp.setVisible(true);
        this.dispose();
    }else{
    id.setText(""+ses.getId());
    fname.setText(""+ses.getFname());
    lname.setText(""+ses.getLname());
    email.setText(""+ses.getEmail());
    contact.setText(""+ses.getContact());
    address.setText(""+ses.getAddress());
    }
}
    
    
    int validateTegister(){
        int result;
        
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || address.getText().isEmpty() ||
           email.getText().isEmpty() || contact.getText().isEmpty()){
            result = 0;
        }else{
            result = 1;
        }
        return result;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        save = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        coma = new javax.swing.JLabel();
        changepass = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

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
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 70, 40));

        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 70, 30));

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

        id1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id1.setText("ID");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 70, 20));

        id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 20));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 30, 30));

        coma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        coma.setText(",");
        jPanel1.add(coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 10, 20));

        changepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
        });
        jPanel1.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 90, 50));

        address.setBackground(new java.awt.Color(255, 212, 157));
        address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        address.setBorder(null);
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 150, 20));

        contact.setBackground(new java.awt.Color(255, 212, 157));
        contact.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contact.setBorder(null);
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 150, 20));

        email.setBackground(new java.awt.Color(255, 212, 157));
        email.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        email.setBorder(null);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 150, 20));

        fname.setBackground(new java.awt.Color(255, 212, 157));
        fname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fname.setBorder(null);
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 70, 20));

        lname.setBackground(new java.awt.Color(255, 212, 157));
        lname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lname.setBorder(null);
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 210, 70, 20));

        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, 90));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateadminProfile (2).png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dbConnector dbc = new dbConnector();
        int actingUserId = Session.getInstance().getId(); 
        String action = "Log Out";
        dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
           dbConnector dbc = new dbConnector();
            int check = validateTegister();
    
    if (check == 1) {
        try {
            String sql = "UPDATE tbl_user SET u_fname = ?, u_lname = ?, u_address = ?, u_contact = ?, u_email = ? WHERE u_id = ?";
            PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql);

            pstmt.setString(1, fname.getText().trim());
            pstmt.setString(2, lname.getText().trim());
            pstmt.setString(3, address.getText().trim());
            pstmt.setString(4, contact.getText().trim());
            pstmt.setString(5, email.getText().trim());
            pstmt.setInt(6, Integer.parseInt(id.getText().trim())); 
            
                int actingUserId = Session.getInstance().getId(); 
                String action = "Saving data admin profile";
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
            
            int result = pstmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "User details updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Update failed! User ID not found.");
            }
            pstmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something ERROR!");
            System.out.println("Error: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "ALL FIELDS REQUIRED!");
    }
    }//GEN-LAST:event_saveMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        new adminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        new changepassAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassMouseClicked

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked

    }//GEN-LAST:event_imageMouseClicked

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
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel changepass;
    private javax.swing.JLabel coma;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel save;
    // End of variables declaration//GEN-END:variables
}

package Authentication;

import ProfilePage.Profile;
import config.*;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;

public class newpass extends javax.swing.JFrame {

    public newpass() {
        initComponents();
    }
    int validateTegister(){
        int result;
        if(newpass.getText().isEmpty() || confirmpass.getText().isEmpty()){
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
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        showpassword2 = new javax.swing.JLabel();
        showpassword1 = new javax.swing.JLabel();
        showpassword = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 110, 40));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        home.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                homeKeyReleased(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 30, 30));

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
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 20, 10));

        confirmpass.setBackground(new java.awt.Color(255, 212, 157));
        confirmpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpass.setBorder(null);
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        jPanel1.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 170, 20));

        newpass.setBackground(new java.awt.Color(255, 212, 157));
        newpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.setBorder(null);
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 170, 20));

        showpassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(showpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, 20));

        showpassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(showpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 30, 20));

        showpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpasswordMouseClicked(evt);
            }
        });
        jPanel1.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 30, 20));

        jPanel2.setBackground(new java.awt.Color(255, 230, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 30, 20));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newpass.png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpasswordMouseClicked

    }//GEN-LAST:event_showpasswordMouseClicked

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked

    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void homeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKeyReleased

    private void homeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKeyPressed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }       
    }//GEN-LAST:event_homeMouseClicked

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
            String npass = passwordHasher.hashPassword(newpass.getText().trim());

            String updateSQL = "UPDATE tbl_user SET u_password = ? WHERE u_id = ?";
            PreparedStatement updateStmt = dbc.getConnection().prepareStatement(updateSQL);
            updateStmt.setString(1, npass);
            updateStmt.setInt(2, sess.getId());
            
            int result = updateStmt.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "SAVE SUCCESS!");
                new Profile().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Update Failed!");
            }

            updateStmt.close();
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
            java.util.logging.Logger.getLogger(newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cellphone;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JLabel save;
    private javax.swing.JLabel showpassword;
    private javax.swing.JLabel showpassword1;
    private javax.swing.JLabel showpassword2;
    // End of variables declaration//GEN-END:variables
}

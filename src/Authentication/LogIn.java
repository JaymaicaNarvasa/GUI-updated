package Authentication;

import AdminPage.*;
import UsersPage.*;
import config.*;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }
    
    Color exit = new Color(0,153,204);
    Color enter = new Color(255,203,67);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LuyoCp = new javax.swing.JPanel();
        forgotpassPane = new javax.swing.JPanel();
        forgot = new javax.swing.JLabel();
        signupPane = new javax.swing.JPanel();
        signup = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        loginpane = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        LuyoCp.setBackground(new java.awt.Color(0, 0, 0));
        LuyoCp.setPreferredSize(new java.awt.Dimension(480, 645));
        LuyoCp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotpassPane.setBackground(new java.awt.Color(255, 255, 255));
        forgotpassPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassPaneMouseClicked(evt);
            }
        });

        forgot.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        forgot.setForeground(new java.awt.Color(0, 102, 204));
        forgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot.setText("Forgot Password?");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout forgotpassPaneLayout = new javax.swing.GroupLayout(forgotpassPane);
        forgotpassPane.setLayout(forgotpassPaneLayout);
        forgotpassPaneLayout.setHorizontalGroup(
            forgotpassPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forgotpassPaneLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(forgot))
        );
        forgotpassPaneLayout.setVerticalGroup(
            forgotpassPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotpassPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(forgot)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        LuyoCp.add(forgotpassPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 360, 100, 40));

        signupPane.setBackground(new java.awt.Color(255, 255, 255));
        signupPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupPaneMouseClicked(evt);
            }
        });

        signup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 102, 204));
        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setText("Sign Up");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signupPaneLayout = new javax.swing.GroupLayout(signupPane);
        signupPane.setLayout(signupPaneLayout);
        signupPaneLayout.setHorizontalGroup(
            signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(signup)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        signupPaneLayout.setVerticalGroup(
            signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupPaneLayout.createSequentialGroup()
                .addComponent(signup)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        LuyoCp.add(signupPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 90, 20));

        username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        username.setText("Username");
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        LuyoCp.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 140, 30));

        pass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pass.setText("password");
        pass.setBorder(null);
        LuyoCp.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 140, 30));

        loginpane.setBackground(new java.awt.Color(0, 153, 204));
        loginpane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginpaneMouseExited(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 102, 153));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setText("Log In");

        javax.swing.GroupLayout loginpaneLayout = new javax.swing.GroupLayout(loginpane);
        loginpane.setLayout(loginpaneLayout);
        loginpaneLayout.setHorizontalGroup(
            loginpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpaneLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(login))
        );
        loginpaneLayout.setVerticalGroup(
            loginpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpaneLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(login))
        );

        LuyoCp.add(loginpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 210, 40));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LuyoCp.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 20, 20));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        LuyoCp.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 40, 20));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        LuyoCp.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 50, 20));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        cellphone.setPreferredSize(new java.awt.Dimension(350, 625));
        LuyoCp.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LuyoCp, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LuyoCp, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void forgotpassPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassPaneMouseClicked
        
    }//GEN-LAST:event_forgotpassPaneMouseClicked

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
         
    }//GEN-LAST:event_forgotMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        new Register().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_signupMouseClicked

    private void signupPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPaneMouseClicked
       
    }//GEN-LAST:event_signupPaneMouseClicked

    private void loginpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpaneMouseEntered
        loginpane.setBackground(enter);
    }//GEN-LAST:event_loginpaneMouseEntered

    private void loginpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpaneMouseClicked
        try{
        dbConnector dbc = new dbConnector();
        Connection conn = dbc.getConnection();
        
        String sql = "SELECT * FROM tbl_user WHERE u_username = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, username.getText().trim());
        
        ResultSet rs = pstmt.executeQuery();
        
        if(username.getText().isEmpty() || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "LOG IN FAILED! Fields must not be EMPTY");
        }else if(rs.next()){
             String storedHash = rs.getString("u_password"); 
             String userInputHash = passwordHasher.hashPassword(pass.getText().trim()); 

            if (!userInputHash.equals(storedHash)) {
            JOptionPane.showMessageDialog(null, "Login failed! Incorrect PASSWORD.");
            return;
            }
        
            String userStatus = rs.getString("u_status");
            if(userStatus.equalsIgnoreCase("Pending")){
                JOptionPane.showMessageDialog(this, "Your account is not yet activated!");
            }
            else if(userStatus.equalsIgnoreCase("Active")){
            Session ses = Session.getInstance();
            ses.setId(rs.getInt("u_id"));
            ses.setFname(rs.getString("u_fname"));
            ses.setLname(rs.getString("u_lname"));
            ses.setEmail(rs.getString("u_email"));
            ses.setContact(rs.getInt("u_contact"));
            ses.setAddress(rs.getString("u_address"));
            
                int actingUserId = Session.getInstance().getId(); 
                String action = "Log In";
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
                
            int roleId = rs.getInt("role_id");
            if(roleId == 1){
                new adminDashboard().setVisible(true);
            }else if(roleId == 2){
                new ManageUser().setVisible(true);
            }else if(roleId == 3){
                new CustomerDashboard().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "UNKNOWN ROLE!");
            }
            this.dispose();
            
            }else{
            JOptionPane.showMessageDialog(null, "Unknown Account Status");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Login failed! Incorrect USERNAME.");
        }
        
        rs.close();
        pstmt.close();
        conn.close();
        
        } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }   catch (NoSuchAlgorithmException ex) {   
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_loginpaneMouseClicked

    private void loginpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpaneMouseExited
        loginpane.setBackground(exit);
    }//GEN-LAST:event_loginpaneMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
       int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");
        
       if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }      
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LuyoCp;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel forgot;
    private javax.swing.JPanel forgotpassPane;
    private javax.swing.JLabel home;
    private javax.swing.JLabel login;
    private javax.swing.JPanel loginpane;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel signup;
    private javax.swing.JPanel signupPane;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

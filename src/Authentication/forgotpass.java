package Authentication;

import config.*;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class forgotpass extends javax.swing.JFrame {

    public forgotpass() {
        initComponents();
        Session ses = Session.getInstance();
        id.setText(""+ses.getId());
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
        answer1 = new javax.swing.JPasswordField();
        showpassword2 = new javax.swing.JLabel();
        showpassword1 = new javax.swing.JLabel();
        showpassword = new javax.swing.JLabel();
        secu1 = new javax.swing.JComboBox<>();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 110, 30));

        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, 20));

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
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 20, 10));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 40, 30));

        answer1.setBackground(new java.awt.Color(255, 212, 157));
        answer1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        answer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer1.setBorder(null);
        jPanel1.add(answer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 170, 20));

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

        secu1.setBackground(new java.awt.Color(255, 212, 157));
        secu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first pet?", " ", "What was your childhood nickname?", " ", "In what city were you born?", " ", "What is your mother’s maiden name?", " ", "What is your favorite book or movie?", " ", "What was the name of your elementary school?", " ", "What is the name of your best friend from high school?", " ", "What was the make/model of your first car?", " ", "What was the name of your first teacher?", " ", "Where did you go on your first vacation?" }));
        jPanel1.add(secu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, -1));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/security.png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 350, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
    try {
    dbConnector dbc = new dbConnector();

    String selectedQuestion = secu1.getSelectedItem().toString();
    String enteredAnswer = answer1.getText().trim();
    String hashedAnswer = passwordHasher.hashPassword(enteredAnswer);
    
    if(enteredAnswer.isEmpty()){
        JOptionPane.showMessageDialog(this, "Answer shoudn't be Empty.");
    }else{
    String query = "SELECT * FROM tbl_security WHERE u_id = ? AND question = ? AND answer = ?";
    PreparedStatement pst = dbc.getConnection().prepareStatement(query);
    pst.setInt(1, Session.getInstance().getId()); 
    pst.setString(2, selectedQuestion);
    pst.setString(3, hashedAnswer);

    ResultSet rs = pst.executeQuery();

    if (rs.next()) {
        new changepassAdmin().setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Incorrect answer or question. Please try again.");
    }

    rs.close();
    pst.close();
    }
    } catch (SQLException | NoSuchAlgorithmException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_saveMouseClicked

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void homeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKeyPressed

    private void homeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKeyReleased

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new LogIn().setVisible(true);
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
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField answer1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel save;
    private javax.swing.JComboBox<String> secu1;
    private javax.swing.JLabel showpassword;
    private javax.swing.JLabel showpassword1;
    private javax.swing.JLabel showpassword2;
    // End of variables declaration//GEN-END:variables
}

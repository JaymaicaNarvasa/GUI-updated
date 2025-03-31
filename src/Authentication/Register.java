package Authentication;

import config.*;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }
    
    Color exit = new Color(0,153,204);
    Color enter = new Color(255,203,67);
    
    int validateTegister(){
        int result;
        
        if(user.getText().trim().isEmpty() || pass.getText().trim().isEmpty() || fname.getText().trim().isEmpty() || lname.getText().trim().isEmpty() 
        || address.getText().trim().isEmpty() || Email.getText().trim().isEmpty() || contact.getText().trim().isEmpty()){
            result = 0;
        }else if(pass.getText().length() < 8 ){
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters.!");
             result = 0;
        }else if(!contact.getText().matches("\\d+")) {  
            JOptionPane.showMessageDialog(null, "Contact number should contain only numbers!");
             result = 0;
        }else if(!Email.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) { 
             JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
             result = 0;
        } else if(duplicateCheck()) {             
            JOptionPane.showMessageDialog(this, "DUPLICATE EXISTS!");
            result = 0;
        } else{
            result = 1;
        }
        return result;
    }          
    
    public boolean duplicateCheck() {
    boolean exists = false;
    dbConnector dbc = new dbConnector();
    
    try {
        Connection conn = dbc.getConnection(); 
        String sql = "SELECT * FROM tbl_user WHERE u_username = ? OR u_email = ?";
        
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getText());  
        pstmt.setString(2, Email.getText()); 
        
        ResultSet rs = pstmt.executeQuery(); 
        
        if (rs.next()) { 
            exists = true;
        }
        rs.close();
        pstmt.close();
        conn.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return exists;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luyoCp = new javax.swing.JPanel();
        contact = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        pass = new javax.swing.JPasswordField();
        addressjScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        registerPane = new javax.swing.JPanel();
        register = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        luyoCp.setBackground(new java.awt.Color(255, 255, 255));
        luyoCp.setPreferredSize(new java.awt.Dimension(350, 625));
        luyoCp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contact.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        luyoCp.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 20));

        Email.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setText("@gmail.com");
        Email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        luyoCp.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 20));

        user.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        luyoCp.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, 20));

        lname.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setText("Last Name");
        lname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        luyoCp.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 90, 20));

        fname.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setText("First Name");
        fname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        luyoCp.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, 20));

        role.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        role.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        role.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        luyoCp.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, 20));

        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setBorder(null);
        luyoCp.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 330, 160, 30));

        address.setColumns(20);
        address.setRows(5);
        addressjScrollPane1.setViewportView(address);

        luyoCp.add(addressjScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 220, 110));

        registerPane.setBackground(new java.awt.Color(0, 153, 204));
        registerPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerPaneMouseExited(evt);
            }
        });

        register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        register.setText("Register");

        javax.swing.GroupLayout registerPaneLayout = new javax.swing.GroupLayout(registerPane);
        registerPane.setLayout(registerPaneLayout);
        registerPaneLayout.setHorizontalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(register)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        registerPaneLayout.setVerticalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerPaneLayout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(register)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        luyoCp.add(registerPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 220, 30));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        luyoCp.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 20, 20));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registration (2).png"))); // NOI18N
        cellphone.setPreferredSize(new java.awt.Dimension(350, 625));
        luyoCp.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(luyoCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(luyoCp, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void registerPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerPaneMouseExited
        registerPane.setBackground(exit);
    }//GEN-LAST:event_registerPaneMouseExited

    private void registerPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerPaneMouseEntered
        registerPane.setBackground(enter);
    }//GEN-LAST:event_registerPaneMouseEntered

    private void registerPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerPaneMouseClicked
       int check = validateTegister();
        
    if(check == 1){
        dbConnector dbc = new dbConnector();
        try{
        String pass1 = passwordHasher.hashPassword(pass.getText());
        String selecrole = role.getSelectedItem().toString();
        int roleId = selecrole.equals("Admin") ? 1 : 2;
        
        int result = dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_username, u_password, u_address, u_email, u_contact, u_status , role_id)"
              + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+user.getText()+"', '"+pass1+"', '"+address.getText()+"', "
                      + "'"+Email.getText()+"', '"+contact.getText()+"', 'Pending', "+ roleId +" )");
      
        if(result == 1){
         JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULY!");
           new LogIn().setVisible(true);
           this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Saving Data FAILED!");
        }
        }catch(NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
        
    }else{
        System.out.println("ALL FIELDS REQUIRED!");
    }
    }//GEN-LAST:event_registerPaneMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextArea address;
    private javax.swing.JScrollPane addressjScrollPane1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel luyoCp;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel register;
    private javax.swing.JPanel registerPane;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

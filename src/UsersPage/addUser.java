package UsersPage;

import config.*;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class addUser extends javax.swing.JFrame {
    public addUser() {
        initComponents();
    }
    Color exit = new Color(0,153,204);
    Color enter = new Color(255,203,67);
    
    int validateRegister(){
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
        String sql = "SELECT * FROM tbl_user WHERE u_username = ? OR u_email = ?";
        
        PreparedStatement pstmt = dbc.connect.prepareStatement(sql);
        pstmt.setString(1, user.getText());  
        pstmt.setString(2, Email.getText()); 
        
        ResultSet rs = pstmt.executeQuery(); 
        
        if (rs.next()) { 
            exists = true;
        }
        rs.close();
        pstmt.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return exists;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luyoCp3 = new javax.swing.JPanel();
        contact = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        pass = new javax.swing.JPasswordField();
        addressjScrollPane4 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        addpane = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 625));

        luyoCp3.setBackground(new java.awt.Color(255, 255, 255));
        luyoCp3.setPreferredSize(new java.awt.Dimension(350, 625));
        luyoCp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contact.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        luyoCp3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 20));

        Email.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setText("@gmail.com");
        Email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        luyoCp3.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 20));

        user.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        luyoCp3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, 20));

        lname.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setText("Last Name");
        lname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        luyoCp3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 90, 20));

        fname.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setText("First Name");
        fname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        luyoCp3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, 20));

        role.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        role.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        role.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        luyoCp3.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, 20));

        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setBorder(null);
        luyoCp3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 330, 160, 30));

        address.setColumns(20);
        address.setRows(5);
        addressjScrollPane4.setViewportView(address);

        luyoCp3.add(addressjScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 220, 110));

        addpane.setBackground(new java.awt.Color(0, 153, 204));
        addpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addpaneMouseExited(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("ADD");

        javax.swing.GroupLayout addpaneLayout = new javax.swing.GroupLayout(addpane);
        addpane.setLayout(addpaneLayout);
        addpaneLayout.setHorizontalGroup(
            addpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(addpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addpaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(add)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        addpaneLayout.setVerticalGroup(
            addpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(addpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addpaneLayout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(add)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        luyoCp3.add(addpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 220, 30));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        luyoCp3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 20, 20));

        jPanel1.setBackground(new java.awt.Color(251, 174, 156));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD USER DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        luyoCp3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 20));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registration (2).png"))); // NOI18N
        cellphone.setPreferredSize(new java.awt.Dimension(350, 625));
        luyoCp3.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(luyoCp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(luyoCp3, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void addpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseClicked
       int check = validateRegister();

    if(check == 1){
        dbConnector dbc = new dbConnector();
        try{
            String pass1 = passwordHasher.hashPassword(pass.getText());
            String selecrole = role.getSelectedItem().toString();
            int roleId = selecrole.equals("Admin") ? 1 : 2;

            int result = dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_username, u_password, u_address, u_email, u_contact, u_status , role_id) "
                + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+user.getText()+"', '"+pass1+"', '"+address.getText()+"', "
                + "'"+Email.getText()+"', '"+contact.getText()+"', 'Pending', "+ roleId +" )");

            if(result == 1){
                int actingUserId =  Session.getInstance().getId();
                String action = "Added new user: " + user.getText();
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES ("+ actingUserId +", '"+ action +"', NOW())");

                JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY!");
                new ManageUser().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Adding Data FAILED!");
            }
        }catch(NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }

    }else{
        System.out.println("ALL FIELDS REQUIRED!");
    }

    }//GEN-LAST:event_addpaneMouseClicked

    private void addpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseEntered
        addpane.setBackground(enter);
    }//GEN-LAST:event_addpaneMouseEntered

    private void addpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseExited
        addpane.setBackground(exit);
    }//GEN-LAST:event_addpaneMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new ManageUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JLabel add;
    private javax.swing.JPanel addpane;
    private javax.swing.JTextArea address;
    private javax.swing.JScrollPane addressjScrollPane4;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel luyoCp3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

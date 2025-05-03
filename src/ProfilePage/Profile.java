package ProfilePage;

import AdminPage.*;
import Authentication.*;
import UsersPage.CustomerDashboard;
import config.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import javax.imageio.ImageIO;

public class Profile extends javax.swing.JFrame {

    public Profile() {
        initComponents();
        displayUserDetails();
        Image();
    }
    
    private void displayUserDetails() {
    Session ses = Session.getInstance();
    
    if (ses == null || ses.getId() == 0) {
        System.out.println("Session ID: "+ses.getId());
        JOptionPane.showMessageDialog(this, "No Account Found, Please Log In First.");
        //new LogIn().setVisible(true);
        LogIn login = new LogIn();
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
        return;
    }else{
    id.setText(""+ses.getId());
    fname.setText(""+ses.getFname());
    lname.setText(""+ses.getLname());
    email.setText(""+ses.getEmail());
    contact.setText(""+ses.getContact());
    address.setText(""+ses.getAddress());
    }
    }   


    public void Image (){
        try {
    dbConnector dbc = new dbConnector();
    Session sess = Session.getInstance();

    ResultSet rs = dbc.getData("SELECT profile_pic FROM tbl_user WHERE u_id = " + sess.getId());

    if (rs.next()) {
        String path = rs.getString("profile_pic");
        if (path == null || path.trim().isEmpty()) {
            image.setIcon(new ImageIcon("src/userimages/default.png"));
        } else {
            image.setIcon(new ImageIcon(path));
        }
    }
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Error loading profile image: " + ex.getMessage());
    }
    }
    
    
    int validateTegister(){
        int result;
        
        if(fname.getText().trim().isEmpty() || lname.getText().trim().isEmpty() || email.getText().trim().isEmpty() ||
                contact.getText().trim().isEmpty() || address.getText().trim().isEmpty()){
            result = 0;
        }else if(!contact.getText().matches("\\d+")) {  
            JOptionPane.showMessageDialog(null, "Contact number should contain only numbers!");
             result = 0;
        }else if(!email.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) { 
             JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
             result = 0;
        } else if(duplicateCheck()) {             
            JOptionPane.showMessageDialog(this, "EMAIL EXISTS!");
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
        String sql = "SELECT * FROM tbl_user WHERE u_email = ?";
        
        PreparedStatement pstmt = dbc.connect.prepareStatement(sql);
        pstmt.setString(1, email.getText()); 
        
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
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;

    
    
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }


//---------------------------------------------------------------------------

public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }

//--------------------------------------------------------------------------------------

public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

//----------------------------------------------------------------------------------------

    public void imageUpdater(String existingFilePath, String newFilePath) {
    try {
        File existingFile = new File(existingFilePath);
        File newFile = new File(newFilePath);
        
        if (existingFilePath.contains("default.png")) {
            System.out.println("Default image is protected. Skipping update.");
            return;
        }
        
        if (!existingFilePath.equals(newFilePath)) {
            File targetFile = new File(existingFile.getParent(), newFile.getName());

            Files.copy(newFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image updated successfully.");

            if (!existingFile.getName().equals(newFile.getName())) {
                existingFile.delete();
            }
        } else {
            System.out.println("No image change detected.");
        }

    } catch (IOException e) {
        System.out.println("Error occurred while updating the image: " + e.getMessage());
    }
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
        security = new javax.swing.JLabel();
        changepass = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
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
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 120, 40));

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
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 20, 20));

        id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 20));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 20, 20));

        coma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        coma.setText(",");
        jPanel1.add(coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 10, 20));

        security.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityMouseClicked(evt);
            }
        });
        jPanel1.add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 60, 50));

        changepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
        });
        jPanel1.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 70, 50));

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
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 90));

        image1.setText("Image");
        image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image1MouseClicked(evt);
            }
        });
        jPanel1.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 40, 20));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateadminProfile.png"))); // NOI18N
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
        }       
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
            String sql = "UPDATE tbl_user SET u_fname = ?, u_lname = ?, u_address = ?, u_contact = ?, u_email = ?, profile_pic = ? WHERE u_id = ?";
            PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql);

            pstmt.setString(1, fname.getText().trim());
            pstmt.setString(2, lname.getText().trim());
            pstmt.setString(3, address.getText().trim());
            pstmt.setString(4, contact.getText().trim());
            pstmt.setString(5, email.getText().trim());
            pstmt.setString(6, destination);
            pstmt.setInt(7, Integer.parseInt(id.getText().trim()));
                int actingUserId = Session.getInstance().getId(); 
                String action = "Saving data admin profile";
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
            
            int result = pstmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "User details updated successfully!");
            }else {
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
        try {
        dbConnector dbc = new dbConnector();
        String sql = "SELECT role_id FROM tbl_user WHERE u_id = ?";
        PreparedStatement pstmt = dbc.connect.prepareStatement(sql);
        pstmt.setInt(1, Session.getInstance().getId());
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int roleId = rs.getInt("role_id");

            if (roleId == 1) {
                new adminDashboard().setVisible(true);
            } else if (roleId == 2) {
                new staffDashboard().setVisible(true);
            } else if (roleId == 3) {
                new CustomerDashboard().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "UNKNOWN ROLE!");
            }

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "User not found!");
        }

        rs.close();
        pstmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    }
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         try {
        dbConnector dbc = new dbConnector();
        String sql = "SELECT role_id FROM tbl_user WHERE u_id = ?";
        PreparedStatement pstmt = dbc.connect.prepareStatement(sql);
        pstmt.setInt(1, Session.getInstance().getId());
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int roleId = rs.getInt("role_id");

            if (roleId == 1) {
                new adminDashboard().setVisible(true);
            } else if (roleId == 2) {
                new staffDashboard().setVisible(true);
            } else if (roleId == 3) {
                new CustomerDashboard().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "UNKNOWN ROLE!");
            }

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "User not found!");
        }

        rs.close();
        pstmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    }
    }//GEN-LAST:event_backMouseClicked

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        new changepassAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassMouseClicked

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
            JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }

    }//GEN-LAST:event_imageMouseClicked

    private void image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_image1MouseClicked

    private void securityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseClicked
        new SecurityDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_securityMouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
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
    private javax.swing.JLabel image1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel save;
    private javax.swing.JLabel security;
    // End of variables declaration//GEN-END:variables
}

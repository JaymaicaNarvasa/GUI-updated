package ApplicationPage;

import UsersPage.*;
import config.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.*;

public class application extends javax.swing.JFrame {

    public application() {
        initComponents();
    }
        
    Color enter = new Color(255,255,255);
    Color exit = new Color(255,204,153);
    
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
    
    public int getLoanTypeIdByName(String name) {
    int id = -1;
    try {
        dbConnector dbc = new dbConnector();
        PreparedStatement ps = dbc.connect.prepareStatement("SELECT loan_type_id FROM loan_type WHERE loan_name = ?");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            id = rs.getInt("loan_type_id");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
    }

    public int getLoanStatusIdByName(String name) {
    int id = -1;
    try {
        dbConnector dbc = new dbConnector();
        PreparedStatement ps = dbc.connect.prepareStatement("SELECT loan_status_id FROM loan_status WHERE status_name = ?");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            id = rs.getInt("loan_status_id");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luyoCp3 = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        interest = new javax.swing.JLabel();
        addpane = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        tenurebox = new javax.swing.JComboBox<>();
        yearbox = new javax.swing.JComboBox<>();
        monthbox = new javax.swing.JComboBox<>();
        loanamt = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        selec = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        luyoCp3.setBackground(new java.awt.Color(0, 0, 0));
        luyoCp3.setPreferredSize(new java.awt.Dimension(350, 625));
        luyoCp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setText("email@gmail.com");
        luyoCp3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 180, 30));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setText("Name");
        luyoCp3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, 30));

        type.setBackground(new java.awt.Color(204, 204, 204));
        type.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Personal", "Medical", "Education" }));
        type.setBorder(null);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        luyoCp3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, 20));

        interest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        interest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        interest.setText("%");
        luyoCp3.add(interest, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 280, 140, 20));

        addpane.setBackground(new java.awt.Color(255, 204, 153));
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
        add.setText("APPLY NOW");

        javax.swing.GroupLayout addpaneLayout = new javax.swing.GroupLayout(addpane);
        addpane.setLayout(addpaneLayout);
        addpaneLayout.setHorizontalGroup(
            addpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
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

        luyoCp3.add(addpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 140, 30));

        tenurebox.setBackground(new java.awt.Color(204, 204, 204));
        tenurebox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tenurebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Year" }));
        tenurebox.setBorder(null);
        tenurebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenureboxActionPerformed(evt);
            }
        });
        luyoCp3.add(tenurebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 70, 20));

        yearbox.setBackground(new java.awt.Color(204, 204, 204));
        yearbox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        yearbox.setBorder(null);
        luyoCp3.add(yearbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 40, 20));

        monthbox.setBackground(new java.awt.Color(204, 204, 204));
        monthbox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthbox.setBorder(null);
        luyoCp3.add(monthbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 50, 20));

        loanamt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loanamt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loanamt.setBorder(null);
        luyoCp3.add(loanamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 340, 210, 20));

        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });
        luyoCp3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 474, 210, 70));

        selec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecMouseClicked(evt);
            }
        });
        luyoCp3.add(selec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 160, 30));

        remove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remove.setText("X");
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });
        luyoCp3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 30, 30));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        luyoCp3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 40, 30));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        luyoCp3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 40, 30));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        luyoCp3.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 40, 30));

        cellphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Application1 (2).png"))); // NOI18N
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

    private void addpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseClicked
        String selectedLoanType = type.getSelectedItem().toString();
        double enteredAmount = Double.parseDouble(loanamt.getText());
        
        if(loanamt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Amount should not be Empty.");
        }
        boolean isValid = false;

    switch (selectedLoanType) {
        case "Home":
            isValid = enteredAmount >= 100000 && enteredAmount <= 2000000;
            break;
        case "Personal":
            isValid = enteredAmount >= 50000 && enteredAmount <= 1000000;
            break;
        case "Education":
            isValid = enteredAmount >= 5000 && enteredAmount <= 500000;
            break;
        case "Medical":
            isValid = enteredAmount >= 10000 && enteredAmount <= 300000;
            break;
    }

    if (!isValid) {
        JOptionPane.showMessageDialog(null, "Amount is not valid for selected loan type!");
        return;
    }
    
    dbConnector dbc = new dbConnector();
    int loanTypeId = getLoanTypeIdByName(selectedLoanType);
    int loanStatusId = getLoanStatusIdByName("Pending"); 
    String interestRateText = interest.getText(); 
    String amountText = loanamt.getText(); 
    String tenureValueText = monthbox.getSelectedItem().toString(); 
    String tenureUnit = tenurebox.getSelectedItem().toString(); 
    String validIdPath = image.toString();
    LocalDateTime date = LocalDateTime.now();

    int sql = dbc.insertData("INSERT INTO loan_application (user_id, loan_status_id, loan_type_id, amount, application_date, tenure_value, tenure_unit, "
            + "interest_rate, validid_path)"
            + " VALUES (" +
            "'" + loanStatusId + "', " +
            "'" + loanTypeId + "', " +
            "'" + amountText + "', " +
            "'" + date + "', " +
            "'" + tenureValueText + "', " +
            "'" + tenureUnit + "', " +
            "'" + interestRateText + "', " +
            "'" + validIdPath + "')");

    if (sql == 1) {
        JOptionPane.showMessageDialog(null, "Loan Application Submitted Successfully!");
        new CustomerDashboard().setVisible(true);
        this.dispose();
                int actingUserId = Session.getInstance().getId(); 
                String action = "Applied A Loan";
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
    } else {
        JOptionPane.showMessageDialog(null, "Connection Error!");
    }
    }//GEN-LAST:event_addpaneMouseClicked

    private void addpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseEntered
        addpane.setBackground(enter);
    }//GEN-LAST:event_addpaneMouseEntered

    private void addpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpaneMouseExited
        addpane.setBackground(exit);
    }//GEN-LAST:event_addpaneMouseExited

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        
    }//GEN-LAST:event_imageMouseClicked

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if(type.getSelectedItem().equals("Home")){
            interest.setText("5%");
        }else if (type.getSelectedItem().equals("Personal")){
            interest.setText("6%");
        }else if (type.getSelectedItem().equals("Medical")){
            interest.setText("4%");
        }else if (type.getSelectedItem().equals ("Education")){
            interest.setText("4.5%");
        }else{
            interest.setText("ERROR");
        }
    }//GEN-LAST:event_typeActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new CustomerDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
                dbConnector dbc = new dbConnector();
                int actingUserId = Session.getInstance().getId(); 
                String action = "Exit";
                dbc.insertData("INSERT INTO tbl_log(user_id, action, log_date) VALUES (" + actingUserId + ", '" + action + "', NOW())");
    }//GEN-LAST:event_homeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void tenureboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenureboxActionPerformed
        if(tenurebox.getSelectedItem().equals("Month")){
            yearbox.setEnabled(false);
            monthbox.setEnabled(true);
        }else{
            monthbox.setEnabled(false);
            yearbox.setEnabled(true);
        }
    }//GEN-LAST:event_tenureboxActionPerformed

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        selec.setEnabled(true);
        remove.setEnabled(false);
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeMouseClicked

    private void selecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecMouseClicked
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
                            selec.setEnabled(false);
                            remove.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!"+ex);
                    }
                }
    }//GEN-LAST:event_selecMouseClicked
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
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel addpane;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel email;
    private javax.swing.JLabel home;
    public javax.swing.JLabel image;
    private javax.swing.JLabel interest;
    private javax.swing.JTextField loanamt;
    private javax.swing.JPanel luyoCp3;
    private javax.swing.JLabel minimize;
    private javax.swing.JComboBox<String> monthbox;
    private javax.swing.JLabel name;
    public javax.swing.JLabel remove;
    public javax.swing.JLabel selec;
    private javax.swing.JComboBox<String> tenurebox;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> yearbox;
    // End of variables declaration//GEN-END:variables
}

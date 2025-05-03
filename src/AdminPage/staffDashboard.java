package AdminPage;

import ApplicationPage.*;
import ProfilePage.*;
import UsersPage.*;
import javax.swing.JOptionPane;

public class staffDashboard extends javax.swing.JFrame {

    public staffDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        profilesettings = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        manage = new javax.swing.JLabel();
        application = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome Back,");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 120, 20));

        name.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, 20));

        profilesettings.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profilesettings.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                profilesettingsAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        profilesettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilesettingsMouseClicked(evt);
            }
        });
        jPanel1.add(profilesettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 30, 30));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 40, 30));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 50, 20));

        manage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage user.png"))); // NOI18N
        manage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageMouseClicked(evt);
            }
        });
        jPanel1.add(manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 80));

        application.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        application.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/application.png"))); // NOI18N
        application.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationMouseClicked(evt);
            }
        });
        jPanel1.add(application, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 100, 100));

        jPanel2.setBackground(new java.awt.Color(255, 230, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 40, 20));

        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staffdashboard.png"))); // NOI18N
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profilesettingsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_profilesettingsAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_profilesettingsAncestorAdded

    private void profilesettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilesettingsMouseClicked
        new Profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilesettingsMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_homeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void manageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMouseClicked
        new ManageUserAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageMouseClicked

    private void applicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseClicked
        new ApplicationDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_applicationMouseClicked

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
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel application;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel manage;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel name;
    private javax.swing.JLabel profilesettings;
    // End of variables declaration//GEN-END:variables
}

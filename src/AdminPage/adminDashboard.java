package AdminPage;

import ApplicationPage.*;
import Reports.*;
import ProfilePage.*;
import UsersPage.*;
import java.awt.Color;
import javax.swing.*;

public class adminDashboard extends javax.swing.JFrame {
    
    public adminDashboard() {
        initComponents();
    }
    
    Color exit = new Color(0,153,204);
    Color enter = new Color(255,203,67);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Logs = new javax.swing.JMenuItem();
        activity = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        profilesettings = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        applicationpane2 = new javax.swing.JPanel();
        application = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reportspane2 = new javax.swing.JPanel();
        reports = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userpane2 = new javax.swing.JPanel();
        user3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();

        popupMenu.setBackground(new java.awt.Color(255, 204, 204));
        popupMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Logs.setBackground(new java.awt.Color(255, 204, 153));
        Logs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Logs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logs-35.png"))); // NOI18N
        Logs.setText("LOGS");
        Logs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogsMouseClicked(evt);
            }
        });
        Logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogsActionPerformed(evt);
            }
        });
        popupMenu.add(Logs);

        activity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        activity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/transaction-35 (2).png"))); // NOI18N
        activity.setText("TRANSACTIONS");
        activity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        activity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activityMouseClicked(evt);
            }
        });
        activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityActionPerformed(evt);
            }
        });
        popupMenu.add(activity);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome Back,");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 120, 20));

        profilesettings.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        applicationpane2.setBackground(new java.awt.Color(255, 255, 255));
        applicationpane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        applicationpane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationpane2MouseClicked(evt);
            }
        });

        application.setBackground(new java.awt.Color(0, 153, 204));
        application.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        application.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applicationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applicationMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Application");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/application.png"))); // NOI18N

        javax.swing.GroupLayout applicationLayout = new javax.swing.GroupLayout(application);
        application.setLayout(applicationLayout);
        applicationLayout.setHorizontalGroup(
            applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        applicationLayout.setVerticalGroup(
            applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicationLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout applicationpane2Layout = new javax.swing.GroupLayout(applicationpane2);
        applicationpane2.setLayout(applicationpane2Layout);
        applicationpane2Layout.setHorizontalGroup(
            applicationpane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicationpane2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(application, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        applicationpane2Layout.setVerticalGroup(
            applicationpane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicationpane2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(application, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(applicationpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 120, 110));

        reportspane2.setBackground(new java.awt.Color(255, 255, 255));
        reportspane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reportspane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportspane2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportspane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportspane2MouseExited(evt);
            }
        });

        reports.setBackground(new java.awt.Color(0, 153, 204));
        reports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportsMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reports");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reports.png"))); // NOI18N

        javax.swing.GroupLayout reportsLayout = new javax.swing.GroupLayout(reports);
        reports.setLayout(reportsLayout);
        reportsLayout.setHorizontalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(reportsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        reportsLayout.setVerticalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout reportspane2Layout = new javax.swing.GroupLayout(reportspane2);
        reportspane2.setLayout(reportspane2Layout);
        reportspane2Layout.setHorizontalGroup(
            reportspane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportspane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportspane2Layout.setVerticalGroup(
            reportspane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportspane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(reportspane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 110));

        userpane2.setBackground(new java.awt.Color(255, 255, 255));
        userpane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userpane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpane2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpane2MouseExited(evt);
            }
        });

        user3.setBackground(new java.awt.Color(0, 153, 204));
        user3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        user3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user3MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Manage User");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage user.png"))); // NOI18N

        javax.swing.GroupLayout user3Layout = new javax.swing.GroupLayout(user3);
        user3.setLayout(user3Layout);
        user3Layout.setHorizontalGroup(
            user3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16))
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        user3Layout.setVerticalGroup(
            user3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel16)
                .addGap(4, 4, 4)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout userpane2Layout = new javax.swing.GroupLayout(userpane2);
        userpane2.setLayout(userpane2Layout);
        userpane2Layout.setHorizontalGroup(
            userpane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(userpane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userpane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        userpane2Layout.setVerticalGroup(
            userpane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(userpane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userpane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(userpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 120, 110));

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage user.png"))); // NOI18N
        profile.setToolTipText("");
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 50, 50));

        cellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminDashboard.png"))); // NOI18N
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

    private void applicationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseEntered
        application.setBackground(enter);
    }//GEN-LAST:event_applicationMouseEntered

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");

        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }      
    }//GEN-LAST:event_homeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void applicationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseExited
        application.setBackground(exit);
    }//GEN-LAST:event_applicationMouseExited

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        reports.setBackground(enter);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(exit);
    }//GEN-LAST:event_reportsMouseExited

    private void profilesettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilesettingsMouseClicked
       new adminProfile().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_profilesettingsMouseClicked

    private void reportspane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reportspane2MouseClicked

    private void reportspane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspane2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_reportspane2MouseEntered

    private void reportspane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspane2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_reportspane2MouseExited

    private void userpane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userpane2MouseClicked

    private void userpane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_userpane2MouseEntered

    private void userpane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_userpane2MouseExited

    private void reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMousePressed
        popupMenu.show(reports, reports.getWidth()/2, reports.getHeight()/2);
    }//GEN-LAST:event_reportsMousePressed

    private void LogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsActionPerformed
       new Logs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogsActionPerformed

    private void activityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityActionPerformed
        new ActivityDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_activityActionPerformed

    private void user3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user3MouseClicked
        new ManageUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_user3MouseClicked

    private void LogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogsMouseClicked
        
    }//GEN-LAST:event_LogsMouseClicked

    private void activityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityMouseClicked
        
    }//GEN-LAST:event_activityMouseClicked

    private void user3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user3MouseEntered
       user3.setBackground(enter);
    }//GEN-LAST:event_user3MouseEntered

    private void user3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user3MouseExited
        user3.setBackground(exit);
    }//GEN-LAST:event_user3MouseExited

    private void applicationpane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationpane2MouseClicked
       
    }//GEN-LAST:event_applicationpane2MouseClicked

    private void applicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseClicked
        new ApplicationDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_applicationMouseClicked

    
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Logs;
    private javax.swing.JMenuItem activity;
    private javax.swing.JPanel application;
    private javax.swing.JPanel applicationpane2;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel profilesettings;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel reportspane2;
    private javax.swing.JPanel user3;
    private javax.swing.JPanel userpane2;
    // End of variables declaration//GEN-END:variables
}

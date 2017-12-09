
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tawfik
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
 
    public login() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textfeld_username = new javax.swing.JTextField();
        textfeld_passwort = new javax.swing.JPasswordField();
        button_cancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        button_login.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        button_login.setIcon(new javax.swing.ImageIcon("C:\\Users\\tawfik\\Desktop\\java\\sign-check-icon (1).png")); // NOI18N
        button_login.setText("login");
        button_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_loginMouseExited(evt);
            }
        });
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Username ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Passwort");

        textfeld_username.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        textfeld_passwort.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        button_cancel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        button_cancel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tawfik\\Desktop\\java\\actualiser .png")); // NOI18N
        button_cancel1.setText("Cancel");
        button_cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_cancel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_cancel1MouseExited(evt);
            }
        });
        button_cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_login)
                        .addGap(30, 30, 30)
                        .addComponent(button_cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textfeld_passwort, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfeld_username))
                        .addGap(196, 196, 196))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfeld_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfeld_passwort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancel1ActionPerformed
        clear();
    }//GEN-LAST:event_button_cancel1ActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        
        if (verf())
        {
        String name =  textfeld_username.getText();
        String  pass  = String.valueOf(textfeld_passwort.getPassword());
        MyConnection lo = new MyConnection();
        lo.login(name, pass);
        }
        else
        {
            
             JOptionPane.showMessageDialog(null,"Sie müssen alle felder ausfüllen ");
        }
      
        
      
        
    }//GEN-LAST:event_button_loginActionPerformed

    private void button_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseEntered
        button_login.setBackground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_button_loginMouseEntered

    private void button_cancel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_cancel1MouseEntered
        button_cancel1.setBackground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_button_cancel1MouseEntered

    private void button_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseExited
         button_login.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_button_loginMouseExited

    private void button_cancel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_cancel1MouseExited
        button_cancel1.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_button_cancel1MouseExited
    public void clear()
    {
         textfeld_username.setText("");
        textfeld_passwort.setText("");
    }
    public  boolean  verf()
    {
       if(textfeld_username.getText().equals ("")||  (String.valueOf(textfeld_passwort.getPassword())).equals(""))
       {
           return false;
       }
       else
       {
            return true;
       }
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel1;
    private javax.swing.JButton button_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPasswordField textfeld_passwort;
    public javax.swing.JTextField textfeld_username;
    // End of variables declaration//GEN-END:variables
}

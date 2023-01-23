import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201119359
 */

public class frmLibraryManager extends javax.swing.JFrame {

    /**
     * Creates new form frmLibraryManager
     */
    public frmLibraryManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenuPage = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        pnlLoginPage = new javax.swing.JPanel();
        pnlSignUpPage = new javax.swing.JPanel();
        lblLoginTitle = new javax.swing.JLabel();
        txtFullNameSignUp = new javax.swing.JTextField();
        txtEmailSignUp = new javax.swing.JTextField();
        pwdPassword1SignUp = new javax.swing.JPasswordField();
        pwdPassword2SignUp = new javax.swing.JPasswordField();
        btnMakeAccount = new javax.swing.JButton();
        btnBackSignUp = new javax.swing.JButton();
        pnlHomePage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Library Management Software");

        btnLogin.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        btnSignUp.setText("Sign up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInfo.setText("Made by Nooh Alavi (s201119359@ddsbstudent.ca, noohalavidev@gmail.com), 2023. Version 1.0.0. Last updated 22/01/2023.");

        javax.swing.GroupLayout pnlMenuPageLayout = new javax.swing.GroupLayout(pnlMenuPage);
        pnlMenuPage.setLayout(pnlMenuPageLayout);
        pnlMenuPageLayout.setHorizontalGroup(
            pnlMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuPageLayout.setVerticalGroup(
            pnlMenuPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuPageLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignUp)
                .addGap(75, 75, 75)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addContainerGap())
        );

        pnlLoginPage.setVisible(false);

        javax.swing.GroupLayout pnlLoginPageLayout = new javax.swing.GroupLayout(pnlLoginPage);
        pnlLoginPage.setLayout(pnlLoginPageLayout);
        pnlLoginPageLayout.setHorizontalGroup(
            pnlLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        pnlLoginPageLayout.setVerticalGroup(
            pnlLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        pnlSignUpPage.setVisible(false);

        lblLoginTitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("MAKE NEW ACCOUNT");

        txtFullNameSignUp.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        txtFullNameSignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFullNameSignUp.setBorder(javax.swing.BorderFactory.createTitledBorder("Please enter your full name:"));
        txtFullNameSignUp.setEnabled(false);
        txtFullNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameSignUpActionPerformed(evt);
            }
        });

        txtEmailSignUp.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        txtEmailSignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmailSignUp.setBorder(javax.swing.BorderFactory.createTitledBorder("Please enter your email address::"));
        txtEmailSignUp.setEnabled(false);
        txtEmailSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSignUpActionPerformed(evt);
            }
        });

        pwdPassword1SignUp.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        pwdPassword1SignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdPassword1SignUp.setToolTipText("");
        pwdPassword1SignUp.setBorder(javax.swing.BorderFactory.createTitledBorder("Please enter your password:"));
        pwdPassword1SignUp.setEnabled(false);
        pwdPassword1SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPassword1SignUpActionPerformed(evt);
            }
        });

        pwdPassword2SignUp.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        pwdPassword2SignUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdPassword2SignUp.setToolTipText("");
        pwdPassword2SignUp.setBorder(javax.swing.BorderFactory.createTitledBorder("Please confirm your password:"));
        pwdPassword2SignUp.setEnabled(false);
        pwdPassword2SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPassword2SignUpActionPerformed(evt);
            }
        });

        btnMakeAccount.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnMakeAccount.setText("CREATE ACCOUNT");
        btnMakeAccount.setEnabled(false);
        btnMakeAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeAccountActionPerformed(evt);
            }
        });

        btnBackSignUp.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBackSignUp.setText("<- Back");
        btnBackSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSignUpPageLayout = new javax.swing.GroupLayout(pnlSignUpPage);
        pnlSignUpPage.setLayout(pnlSignUpPageLayout);
        pnlSignUpPageLayout.setHorizontalGroup(
            pnlSignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignUpPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdPassword1SignUp)
                    .addComponent(txtFullNameSignUp)
                    .addComponent(lblLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addComponent(txtEmailSignUp)
                    .addComponent(pwdPassword2SignUp)
                    .addComponent(btnMakeAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSignUpPageLayout.createSequentialGroup()
                        .addComponent(btnBackSignUp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSignUpPageLayout.setVerticalGroup(
            pnlSignUpPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignUpPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(pwdPassword1SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdPassword2SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMakeAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnBackSignUp)
                .addContainerGap())
        );

        pnlHomePage.setVisible(false);

        javax.swing.GroupLayout pnlHomePageLayout = new javax.swing.GroupLayout(pnlHomePage);
        pnlHomePage.setLayout(pnlHomePageLayout);
        pnlHomePageLayout.setHorizontalGroup(
            pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        pnlHomePageLayout.setVerticalGroup(
            pnlHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlLoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlSignUpPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlLoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlSignUpPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private class User {        
        String[] borrowedBooks = {};
        
        void loadData() {
            
        }
        
        public User(String name, String email, String password) {
            System.out.println("Creation of new user " + name + "(" + email + ") successful.");
        }
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        changePage("menu", "login");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit program
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // Change to sign up page
        changePage("menu", "signup");
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtFullNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameSignUpActionPerformed
        if (txtFullNameSignUp.getText().length() > 0)
            txtEmailSignUp.setEnabled(true);
    }//GEN-LAST:event_txtFullNameSignUpActionPerformed

    private void txtEmailSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSignUpActionPerformed
        if (txtEmailSignUp.getText().length() > 0)
            pwdPassword1SignUp.setEnabled(true);
    }//GEN-LAST:event_txtEmailSignUpActionPerformed

    private void pwdPassword1SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPassword1SignUpActionPerformed
        if (pwdPassword1SignUp.getText().length() > 0)
            pwdPassword2SignUp.setEnabled(true);
    }//GEN-LAST:event_pwdPassword1SignUpActionPerformed

    private void pwdPassword2SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPassword2SignUpActionPerformed
        if (pwdPassword2SignUp.getText().length() > 0)
        btnMakeAccount.setEnabled(true);
    }//GEN-LAST:event_pwdPassword2SignUpActionPerformed

    private void btnMakeAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeAccountActionPerformed
        String fullName = txtFullNameSignUp.getText();
        String email = txtEmailSignUp.getText().toLowerCase();
        String password = pwdPassword1SignUp.getText();
        String confirmPassword = pwdPassword2SignUp.getText();
        
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match!");
            return;
        }
        
        createAccount(fullName, email, password);
    }//GEN-LAST:event_btnMakeAccountActionPerformed

    private void btnBackSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSignUpActionPerformed
        // Return to homepage
        changePage("signup", "menu");
    }//GEN-LAST:event_btnBackSignUpActionPerformed

    void changePage(String currentPage, String targetPage) {
        switch (currentPage.toLowerCase()) {
            case "menu":
                btnLogin.setEnabled(false);
                btnSignUp.setEnabled(false);
                btnExit.setEnabled(false);
                
                pnlMenuPage.setVisible(false);
                break;
            case "login":
                pnlLoginPage.setVisible(false);
                break;
            case "signup":
                txtFullNameSignUp.setEnabled(false);
                txtEmailSignUp.setEnabled(false);
                pwdPassword1SignUp.setEnabled(false);
                pwdPassword2SignUp.setEnabled(false);
                
                pnlSignUpPage.setVisible(false);
                break;
            case "home":
                pnlHomePage.setVisible(false);
                break;
        }
        switch (targetPage.toLowerCase()) {
            case "menu":
                btnLogin.setEnabled(true);
                btnSignUp.setEnabled(true);
                btnExit.setEnabled(true);
                
                pnlMenuPage.setVisible(true);
                break;
            case "login":
                pnlLoginPage.setVisible(true);
                break;
            case "signup":
                txtFullNameSignUp.setEnabled(true);
                
                pnlSignUpPage.setVisible(true);
                break;
            case "home":
                pnlHomePage.setVisible(true);
                break;
        }
    }
    
    void createAccount(String fullName, String email, String password) {
        // TODO check if email exists in db
        User newUser = new User(fullName, email, password);
        System.out.println(newUser);
        // TODO save account to db
    }
    
    void signInAccount() {
        
    }
    
    String borrowBook() {
        String receipt = "";
        return receipt;
    }
    
    void returnBook() {
        
    }
    
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
            java.util.logging.Logger.getLogger(frmLibraryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLibraryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLibraryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLibraryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLibraryManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSignUp;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMakeAccount;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlHomePage;
    private javax.swing.JPanel pnlLoginPage;
    private javax.swing.JPanel pnlMenuPage;
    private javax.swing.JPanel pnlSignUpPage;
    private javax.swing.JPasswordField pwdPassword1SignUp;
    private javax.swing.JPasswordField pwdPassword2SignUp;
    private javax.swing.JTextField txtEmailSignUp;
    private javax.swing.JTextField txtFullNameSignUp;
    // End of variables declaration//GEN-END:variables
}

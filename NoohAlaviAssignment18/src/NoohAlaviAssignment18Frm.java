
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201119359
 */
public class NoohAlaviAssignment18Frm extends javax.swing.JFrame {

    /**
     * Creates new form NoohAlaviAssignment18Frm
     */
    public NoohAlaviAssignment18Frm() {
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

        pnlPage = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblAnswersTitle = new javax.swing.JLabel();
        txtNumOfChars = new javax.swing.JTextField();
        lblNumOfChars = new javax.swing.JLabel();
        txtToUppercase = new javax.swing.JTextField();
        lblToUppercase = new javax.swing.JLabel();
        txtFourth = new javax.swing.JTextField();
        lblFourth = new javax.swing.JLabel();
        txtIdentical1 = new javax.swing.JTextField();
        txtIdentical2 = new javax.swing.JTextField();
        lblIdentical = new javax.swing.JLabel();
        txtCheckString = new javax.swing.JTextField();
        txtCheckLetter = new javax.swing.JTextField();
        lblStringLetter = new javax.swing.JLabel();
        txtFourToSix = new javax.swing.JTextField();
        lblFourToSix = new javax.swing.JLabel();
        txtReplaceWithX = new javax.swing.JTextField();
        lblReplaceWithX = new javax.swing.JLabel();
        btnRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPage.setBackground(new java.awt.Color(255, 255, 255));
        pnlPage.setBorder(new javax.swing.border.MatteBorder(null));

        lblTitle.setBackground(new java.awt.Color(174, 78, 95));
        lblTitle.setFont(new java.awt.Font("Andalus", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(174, 78, 95));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.png"))); // NOI18N
        lblTitle.setText("Super String Software");

        lblAnswersTitle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAnswersTitle.setText("Results");

        txtNumOfChars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumOfChars.setText("Example Text");
        txtNumOfChars.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a String. The program will output the number of characters in the String."));

        lblNumOfChars.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblNumOfChars.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumOfChars.setBorder(new javax.swing.border.MatteBorder(null));

        txtToUppercase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtToUppercase.setText("example text");
        txtToUppercase.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a String in lowercase letters. The program will output the String in all uppercase letters."));

        lblToUppercase.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblToUppercase.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblToUppercase.setBorder(new javax.swing.border.MatteBorder(null));

        txtFourth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFourth.setText("Example Text");
        txtFourth.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a String. The program will output the character at the fourth spot."));

        lblFourth.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblFourth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFourth.setBorder(new javax.swing.border.MatteBorder(null));

        txtIdentical1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentical1.setText("Example Text");
        txtIdentical1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter two Strings. The program will output whether or not they are identical."));

        txtIdentical2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentical2.setText("Different Example Text");
        txtIdentical2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblIdentical.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblIdentical.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdentical.setBorder(new javax.swing.border.MatteBorder(null));

        txtCheckString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCheckString.setText("Example Text");
        txtCheckString.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a String and a letter. The program will output whether or not the letter is in the String."));

        txtCheckLetter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCheckLetter.setText("a");
        txtCheckLetter.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblStringLetter.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblStringLetter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStringLetter.setBorder(new javax.swing.border.MatteBorder(null));

        txtFourToSix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFourToSix.setText("Example Text");
        txtFourToSix.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a String that is at least 8 characters long. The program will output characters 4-6."));

        lblFourToSix.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblFourToSix.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFourToSix.setBorder(new javax.swing.border.MatteBorder(null));

        txtReplaceWithX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReplaceWithX.setText("Example Text");
        txtReplaceWithX.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter a String that contains at least one \"a.\" The program will replace all occurences of the letter \"a\" with \"X.\"", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        lblReplaceWithX.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblReplaceWithX.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReplaceWithX.setBorder(new javax.swing.border.MatteBorder(null));

        btnRun.setBackground(new java.awt.Color(17, 178, 95));
        btnRun.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnRun.setText("RUN...");
        btnRun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPageLayout = new javax.swing.GroupLayout(pnlPage);
        pnlPage.setLayout(pnlPageLayout);
        pnlPageLayout.setHorizontalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPageLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlPageLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtReplaceWithX, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFourToSix, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckString, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentical2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentical1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFourth, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumOfChars, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToUppercase, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPageLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFourToSix, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(lblReplaceWithX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlPageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStringLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblFourth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(lblToUppercase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNumOfChars, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdentical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(btnRun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAnswersTitle)
                .addGap(170, 170, 170))
        );
        pnlPageLayout.setVerticalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPageLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAnswersTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumOfChars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumOfChars, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtToUppercase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblToUppercase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFourth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFourth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtIdentical1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(txtIdentical2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPageLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblIdentical, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPageLayout.createSequentialGroup()
                        .addComponent(txtCheckString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPageLayout.createSequentialGroup()
                        .addComponent(lblStringLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFourToSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFourToSix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReplaceWithX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReplaceWithX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnRun)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        // Length of String
        lblNumOfChars.setText(
                Integer.toString(
                        txtNumOfChars.getText().length()
                )
        );
        
        // Convert to uppercase letters
        lblToUppercase.setText(txtToUppercase.getText().toUpperCase());
        
        // Character at 4th spot
        lblFourth.setText(
                Character.toString(
                    txtFourth.getText().charAt(3) // The character at the 4th spot would have index 3
                )
        );
        
        // Are two strings identical
        if (txtIdentical1.getText().equals(txtIdentical2.getText())) {
            lblIdentical.setText("The two Strings are identical.");
        } else {
            lblIdentical.setText("The two Strings are NOT identical.");
        }
        
        // Check if letter is in String
        String checkLetter = Character.toString(
                txtCheckLetter.getText().charAt(0) // Only get first letter, in case of sequence
        ).toLowerCase(); 
        
        if (txtCheckString.getText().toLowerCase().contains(checkLetter)) {
            lblStringLetter.setText("The String contains '" + checkLetter + "'.");
        } else {
            lblStringLetter.setText("The String does not contain '" + checkLetter + "'.");
        }
            
        // Find char 4 - 6 in String
        lblFourToSix.setText(
                "'" + txtFourToSix.getText().substring(3, 6) + "'"
        );
        
        // Replace 'a' with 'X'
        String txt = txtReplaceWithX.getText().replace("a", "x");
        txt = txt.replace("A", "X");
        
        lblReplaceWithX.setText(txt);
    }//GEN-LAST:event_btnRunActionPerformed

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
            java.util.logging.Logger.getLogger(NoohAlaviAssignment18Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoohAlaviAssignment18Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoohAlaviAssignment18Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoohAlaviAssignment18Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoohAlaviAssignment18Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel lblAnswersTitle;
    private javax.swing.JLabel lblFourToSix;
    private javax.swing.JLabel lblFourth;
    private javax.swing.JLabel lblIdentical;
    private javax.swing.JLabel lblNumOfChars;
    private javax.swing.JLabel lblReplaceWithX;
    private javax.swing.JLabel lblStringLetter;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblToUppercase;
    private javax.swing.JPanel pnlPage;
    private javax.swing.JTextField txtCheckLetter;
    private javax.swing.JTextField txtCheckString;
    private javax.swing.JTextField txtFourToSix;
    private javax.swing.JTextField txtFourth;
    private javax.swing.JTextField txtIdentical1;
    private javax.swing.JTextField txtIdentical2;
    private javax.swing.JTextField txtNumOfChars;
    private javax.swing.JTextField txtReplaceWithX;
    private javax.swing.JTextField txtToUppercase;
    // End of variables declaration//GEN-END:variables
}

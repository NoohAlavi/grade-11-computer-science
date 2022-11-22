
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
     * Creates new form NoohAlaviAssignment17Frm
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
        txtCubeRoot = new javax.swing.JTextField();
        lblCubeRootAnswer = new javax.swing.JLabel();
        txtDegrees = new javax.swing.JTextField();
        lblDegreesAnswer = new javax.swing.JLabel();
        txtPower1 = new javax.swing.JTextField();
        txtPower2 = new javax.swing.JTextField();
        lblPowerAnswer = new javax.swing.JLabel();
        txtAbs = new javax.swing.JTextField();
        lblAbsAnswer = new javax.swing.JLabel();
        txtHyp1 = new javax.swing.JTextField();
        txtHyp2 = new javax.swing.JTextField();
        lblHypAnswer = new javax.swing.JLabel();
        txtSqrt = new javax.swing.JTextField();
        lblSqrtAnswer = new javax.swing.JLabel();
        txtRadians = new javax.swing.JTextField();
        lblRadiansAnswer = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        lblLogAnswer = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPage.setBackground(new java.awt.Color(255, 255, 255));
        pnlPage.setBorder(new javax.swing.border.MatteBorder(null));

        lblTitle.setBackground(new java.awt.Color(174, 78, 95));
        lblTitle.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(174, 78, 95));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.png"))); // NOI18N
        lblTitle.setText("Super String Software");

        lblAnswersTitle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAnswersTitle.setText("Results");

        txtCubeRoot.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCubeRoot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCubeRoot.setText("0");
        txtCubeRoot.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter an integer. The program will display the CUBE ROOT of the integer."));

        lblCubeRootAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblCubeRootAnswer.setText("0");
        lblCubeRootAnswer.setToolTipText("");

        txtDegrees.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtDegrees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDegrees.setText("0");
        txtDegrees.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter an angle in radians. The program will display the angle in DEGREES."));

        lblDegreesAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblDegreesAnswer.setText("0");
        lblDegreesAnswer.setToolTipText("");

        txtPower1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPower1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPower1.setText("0");
        txtPower1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter two numbers. The program will display the first number to the power of the second number."));

        txtPower2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPower2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPower2.setText("0");
        txtPower2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblPowerAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblPowerAnswer.setText("0");
        lblPowerAnswer.setToolTipText("");

        txtAbs.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtAbs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAbs.setText("0");
        txtAbs.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a number. The program will display the ABSOLUTE VALUE of the number."));

        lblAbsAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblAbsAnswer.setText("0");
        lblAbsAnswer.setToolTipText("");

        txtHyp1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtHyp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHyp1.setText("0");
        txtHyp1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter the length of two sides of a right angle triangle. The program will display the HYPOTENUSE of the triangle."));
        txtHyp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHyp1ActionPerformed(evt);
            }
        });

        txtHyp2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtHyp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHyp2.setText("0");
        txtHyp2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblHypAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblHypAnswer.setText("0");
        lblHypAnswer.setToolTipText("");

        txtSqrt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtSqrt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSqrt.setText("0");
        txtSqrt.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a positive integer. The program will display the SQUARE ROOT of the integer."));

        lblSqrtAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblSqrtAnswer.setText("0");
        lblSqrtAnswer.setToolTipText("");

        txtRadians.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtRadians.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRadians.setText("0");
        txtRadians.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter an angle in degrees. The program will display the angle in RADIANS."));

        lblRadiansAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblRadiansAnswer.setText("0");
        lblRadiansAnswer.setToolTipText("");

        txtLog.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtLog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLog.setText("0");
        txtLog.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a positive number. The program will display the NATURAL LOGARITHM of the number."));

        lblLogAnswer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblLogAnswer.setText("0");
        lblLogAnswer.setToolTipText("");

        btnCalculate.setBackground(new java.awt.Color(17, 178, 95));
        btnCalculate.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        btnCalculate.setText("RUN...");
        btnCalculate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPageLayout = new javax.swing.GroupLayout(pnlPage);
        pnlPage.setLayout(pnlPageLayout);
        pnlPageLayout.setHorizontalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPageLayout.createSequentialGroup()
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCubeRoot)
                                .addComponent(txtDegrees)
                                .addComponent(txtPower1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPower2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAbs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHyp1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                                .addComponent(txtSqrt)
                                .addComponent(txtHyp2)
                                .addComponent(txtRadians)
                                .addComponent(txtLog)))
                        .addGap(40, 40, 40)
                        .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCubeRootAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addGroup(pnlPageLayout.createSequentialGroup()
                                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLogAnswer)
                                    .addComponent(lblDegreesAnswer)
                                    .addComponent(lblPowerAnswer)
                                    .addComponent(lblAbsAnswer)
                                    .addComponent(lblHypAnswer)
                                    .addComponent(lblSqrtAnswer)
                                    .addComponent(lblRadiansAnswer))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnswersTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34))
        );
        pnlPageLayout.setVerticalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPageLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAnswersTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCubeRootAnswer))
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDegreesAnswer))
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPower1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPowerAnswer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPower2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbsAnswer))
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHyp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHypAnswer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHyp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSqrtAnswer))
                .addGap(18, 18, 18)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRadians, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRadiansAnswer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogAnswer))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Define variables
        DecimalFormat df = new DecimalFormat("0.00");
        double num1, num2, answer;

        // Cube root
        num1 = Integer.parseInt(txtCubeRoot.getText());
        answer = Math.cbrt(num1);
        
        lblCubeRootAnswer.setText(df.format(answer));
        
        // Radians to degrees
        num1 = Double.parseDouble(txtDegrees.getText());
        answer = Math.toDegrees(num1);
        
        lblDegreesAnswer.setText(df.format(answer));
        
        // First number to the power of the second number
        num1 = Double.parseDouble(txtPower1.getText());
        num2 = Double.parseDouble(txtPower2.getText());
        answer = Math.pow(num1, num2);
        
        lblPowerAnswer.setText(df.format(answer));
        
        // Absolute value
        num1 = Double.parseDouble(txtAbs.getText());
        answer = Math.abs(num1);
        
        lblAbsAnswer.setText(df.format(answer));
        
        // Hypotenuse triangle
        num1 = Double.parseDouble(txtHyp1.getText());
        num2 = Double.parseDouble(txtHyp2.getText());
        
        answer = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
        
        lblHypAnswer.setText(df.format(answer));
        
        // Square root
        num1 = Integer.parseInt(txtSqrt.getText());
        answer = Math.sqrt(num1);
        
        lblSqrtAnswer.setText(df.format(answer));
        
        // Degrees to radians
        num1 = Double.parseDouble(txtRadians.getText());
        answer = Math.toRadians(num1);
        
        lblRadiansAnswer.setText(df.format(answer));
        
        // Natural logarithm
        num1 = Double.parseDouble(txtLog.getText());
        answer = Math.log(num1);
        
        lblLogAnswer.setText(df.format(answer));
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtHyp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHyp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHyp1ActionPerformed

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
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lblAbsAnswer;
    private javax.swing.JLabel lblAnswersTitle;
    private javax.swing.JLabel lblCubeRootAnswer;
    private javax.swing.JLabel lblDegreesAnswer;
    private javax.swing.JLabel lblHypAnswer;
    private javax.swing.JLabel lblLogAnswer;
    private javax.swing.JLabel lblPowerAnswer;
    private javax.swing.JLabel lblRadiansAnswer;
    private javax.swing.JLabel lblSqrtAnswer;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlPage;
    private javax.swing.JTextField txtAbs;
    private javax.swing.JTextField txtCubeRoot;
    private javax.swing.JTextField txtDegrees;
    private javax.swing.JTextField txtHyp1;
    private javax.swing.JTextField txtHyp2;
    private javax.swing.JTextField txtLog;
    private javax.swing.JTextField txtPower1;
    private javax.swing.JTextField txtPower2;
    private javax.swing.JTextField txtRadians;
    private javax.swing.JTextField txtSqrt;
    // End of variables declaration//GEN-END:variables
}
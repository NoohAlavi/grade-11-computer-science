import javafx.embed.swing.JFXPanel;
import javax.swing.JPanel;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201119359
 */
public class FrmDiceGame extends javax.swing.JFrame {
    // declare and initialize variables
    int maxDiceNumber = 6;
    
    int totalRolls = 0;
    int totalCorrect = 0;
    int totalIncorrect = 0;
    double correctPercentage, incorrectPercentage = 0;
    int userGuess, diceRoll;
    
    // num of dice sides for each difficulty
    final int EASY_SIDES = 6;
    final int MEDIUM_SIDES = 24;
    final int HARD_SIDES = 60;
    final int IMPOSSIBLE_SIDES = 6000;
    
    /**
     * Creates new form FrmDiceGame
     */
    public FrmDiceGame() {
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

        pnlMainPage = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblInstruction1 = new javax.swing.JLabel();
        lblInstruction2 = new javax.swing.JLabel();
        btnRollDice = new javax.swing.JButton();
        txtUserGuess = new javax.swing.JTextField();
        lblRollValue = new javax.swing.JLabel();
        lblRollsValueTitle = new javax.swing.JLabel();
        lblRollsValue = new javax.swing.JLabel();
        lblCorrectValueTitle = new javax.swing.JLabel();
        lblCorrectValue = new javax.swing.JLabel();
        lblIncorrectValueTitle = new javax.swing.JLabel();
        lblIncorrectValue = new javax.swing.JLabel();
        lblCorrectPercentValueTitle = new javax.swing.JLabel();
        lblCorrectPercentValue = new javax.swing.JLabel();
        lblIncorrectPercentValueTitle = new javax.swing.JLabel();
        lblIncorrectPercentValue = new javax.swing.JLabel();
        lblDifficultySelect = new javax.swing.JLabel();
        cbDifficultySelect = new javax.swing.JComboBox();
        btnResetInfo = new javax.swing.JButton();
        pnlRollingDice = new javax.swing.JPanel();
        btnStopDice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(180, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("DICE GUESSING GAME");

        lblInstruction1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblInstruction1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruction1.setText("Enter a number in between 1 and 6");

        lblInstruction2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblInstruction2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruction2.setText("Click \"Roll dice\" and see if you guessed correctly!");

        btnRollDice.setBackground(new java.awt.Color(0, 150, 0));
        btnRollDice.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnRollDice.setForeground(new java.awt.Color(10, 10, 10));
        btnRollDice.setText("⚃ Roll dice 🎲");
        btnRollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollDiceActionPerformed(evt);
            }
        });

        txtUserGuess.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtUserGuess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserGuess.setText("0");
        txtUserGuess.setBorder(javax.swing.BorderFactory.createTitledBorder("Your Guess"));
        txtUserGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserGuessActionPerformed(evt);
            }
        });

        lblRollValue.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblRollValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRollValue.setText("0");
        lblRollValue.setBorder(javax.swing.BorderFactory.createTitledBorder("Dice Roll"));

        lblRollsValueTitle.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblRollsValueTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRollsValueTitle.setText("Number of Rolls");

        lblRollsValue.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblRollsValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRollsValue.setText("0");

        lblCorrectValueTitle.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCorrectValueTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorrectValueTitle.setText("Correct Guessed");

        lblCorrectValue.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCorrectValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorrectValue.setText("0");

        lblIncorrectValueTitle.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblIncorrectValueTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIncorrectValueTitle.setText("Incorrect Guesses");

        lblIncorrectValue.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblIncorrectValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIncorrectValue.setText("0");

        lblCorrectPercentValueTitle.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCorrectPercentValueTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorrectPercentValueTitle.setText("Correct Guess Percentage");

        lblCorrectPercentValue.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCorrectPercentValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorrectPercentValue.setText("0");

        lblIncorrectPercentValueTitle.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblIncorrectPercentValueTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIncorrectPercentValueTitle.setText("Incorrect Guess Percentage");

        lblIncorrectPercentValue.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblIncorrectPercentValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIncorrectPercentValue.setText("0");

        lblDifficultySelect.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblDifficultySelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDifficultySelect.setText("Choose Difficulty");

        cbDifficultySelect.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbDifficultySelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy (6 sides)", "Medium (24 sides)", "Hard (60 sides)", "Impossible (6000 sides)" }));
        cbDifficultySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDifficultySelectActionPerformed(evt);
            }
        });

        btnResetInfo.setBackground(new java.awt.Color(180, 0, 0));
        btnResetInfo.setForeground(new java.awt.Color(250, 250, 250));
        btnResetInfo.setText("Reset");
        btnResetInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainPageLayout = new javax.swing.GroupLayout(pnlMainPage);
        pnlMainPage.setLayout(pnlMainPageLayout);
        pnlMainPageLayout.setHorizontalGroup(
            pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblInstruction1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainPageLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(btnRollDice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstruction2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPageLayout.createSequentialGroup()
                        .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIncorrectValueTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlMainPageLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(lblCorrectValueTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblCorrectPercentValueTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlMainPageLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbDifficultySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDifficultySelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRollsValueTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblIncorrectPercentValueTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIncorrectPercentValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorrectPercentValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIncorrectValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorrectValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRollsValue, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPageLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPageLayout.createSequentialGroup()
                        .addComponent(txtUserGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(lblRollValue, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPageLayout.createSequentialGroup()
                        .addComponent(btnResetInfo)
                        .addGap(214, 214, 214))))
        );
        pnlMainPageLayout.setVerticalGroup(
            pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction2)
                .addGap(63, 63, 63)
                .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRollValue, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnRollDice)
                .addGap(31, 31, 31)
                .addComponent(btnResetInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainPageLayout.createSequentialGroup()
                        .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRollsValue)
                            .addComponent(lblRollsValueTitle))
                        .addGap(30, 30, 30)
                        .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorrectValue)
                            .addComponent(lblCorrectValueTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncorrectValue)
                            .addComponent(lblIncorrectValueTitle))
                        .addGap(24, 24, 24)
                        .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorrectPercentValue)
                            .addComponent(lblCorrectPercentValueTitle)))
                    .addGroup(pnlMainPageLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblDifficultySelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDifficultySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(pnlMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIncorrectPercentValue)
                    .addComponent(lblIncorrectPercentValueTitle))
                .addContainerGap())
        );

        pnlRollingDice.setVisible(false);

        btnStopDice.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnStopDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dice.gif"))); // NOI18N
        btnStopDice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Click anywhere to stop the dice!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 24))); // NOI18N
        btnStopDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopDiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRollingDiceLayout = new javax.swing.GroupLayout(pnlRollingDice);
        pnlRollingDice.setLayout(pnlRollingDiceLayout);
        pnlRollingDiceLayout.setHorizontalGroup(
            pnlRollingDiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRollingDiceLayout.createSequentialGroup()
                .addComponent(btnStopDice, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlRollingDiceLayout.setVerticalGroup(
            pnlRollingDiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnStopDice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(pnlRollingDice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(pnlRollingDice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setNumOfSides(int numOfSides) {
        maxDiceNumber = numOfSides;
        // Update the instructions with new number of sides
        lblInstruction1.setText("Enter a number in between 1 and " + numOfSides);
    }
    
    private int getRandomDiceRoll() {
        // Generate random number in between 1 and maxDiceNumber
        return (int)Math.round(Math.random() * (maxDiceNumber - 1) + 1);
    }
    
    private Boolean checkUserAnswer(int answer) {
        // Check to see if the user got the correct answer
        // Converts to double first to handle decimals
        userGuess = (int) Math.floor(Double.parseDouble(txtUserGuess.getText()));
        return userGuess == answer;
    }
    
    private void resetValues() {
        // Reset all the stats to 0 and then output them
        totalRolls = totalCorrect = totalIncorrect = userGuess = diceRoll = 0;
        correctPercentage = incorrectPercentage = 0;
        
        outputValues();
    }
    
    private void outputValues() {
        // Output all values to the screen
        lblRollValue.setText(String.valueOf(diceRoll));
        lblRollsValue.setText(String.valueOf(totalRolls));
        lblCorrectValue.setText(String.valueOf(totalCorrect));
        lblIncorrectValue.setText(String.valueOf(totalIncorrect));
        lblCorrectPercentValue.setText(String.valueOf(correctPercentage) + "%");
        lblIncorrectPercentValue.setText(String.valueOf(incorrectPercentage) + "%");
    }
    
    private void btnRollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollDiceActionPerformed
        // Get random dice roll
        diceRoll = getRandomDiceRoll();
        totalRolls += 1;
        
        // Calculate correct guesses, incorrect guesses, and guess percentage
        if (checkUserAnswer(diceRoll)) {
            totalCorrect += 1;
        } else {
            totalIncorrect += 1;
        }
        correctPercentage = ((double)totalCorrect / (double)totalRolls) * 100;
        correctPercentage *= 100;
        correctPercentage = Math.round(correctPercentage);
        correctPercentage /= 100;
        
        incorrectPercentage = 100 - correctPercentage; //calculating after rounding so that total is still 100%
        
        // Switch to rolling dice page
        pnlMainPage.setVisible(false);
        pnlRollingDice.setVisible(true);

        outputValues();
    }//GEN-LAST:event_btnRollDiceActionPerformed

    private void txtUserGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserGuessActionPerformed

    private void btnStopDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopDiceActionPerformed
        // Go back to main page when the button is clicked
        pnlRollingDice.setVisible(false);
        pnlMainPage.setVisible(true);
    }//GEN-LAST:event_btnStopDiceActionPerformed

    private void cbDifficultySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDifficultySelectActionPerformed
        // Check user's selected option and adjust number of sides accordingly
        String difficulty = cbDifficultySelect.getSelectedItem().toString();
        
        switch (difficulty) {
            case "Easy (6 sides)":
                setNumOfSides(EASY_SIDES);
                break;
            case "Medium (24 sides)":
                setNumOfSides(MEDIUM_SIDES);
                break;
            case "Hard (60 sides)":
                setNumOfSides(HARD_SIDES);
                break;
            case "Impossible (6000 sides)":
                setNumOfSides(IMPOSSIBLE_SIDES);
                break;
            default:
                System.out.println("Error!\nYou somehow selected " + difficulty +
                        ", even though that is not even an option!");
                break;
        }
                
         // reset values since difficulty changed
         resetValues();
    }//GEN-LAST:event_cbDifficultySelectActionPerformed

    private void btnResetInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetInfoActionPerformed
        // Set all values to 0 and then output them
        resetValues();
    }//GEN-LAST:event_btnResetInfoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDiceGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetInfo;
    private javax.swing.JButton btnRollDice;
    private javax.swing.JButton btnStopDice;
    private javax.swing.JComboBox cbDifficultySelect;
    private javax.swing.JLabel lblCorrectPercentValue;
    private javax.swing.JLabel lblCorrectPercentValueTitle;
    private javax.swing.JLabel lblCorrectValue;
    private javax.swing.JLabel lblCorrectValueTitle;
    private javax.swing.JLabel lblDifficultySelect;
    private javax.swing.JLabel lblIncorrectPercentValue;
    private javax.swing.JLabel lblIncorrectPercentValueTitle;
    private javax.swing.JLabel lblIncorrectValue;
    private javax.swing.JLabel lblIncorrectValueTitle;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JLabel lblInstruction2;
    private javax.swing.JLabel lblRollValue;
    private javax.swing.JLabel lblRollsValue;
    private javax.swing.JLabel lblRollsValueTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlMainPage;
    private javax.swing.JPanel pnlRollingDice;
    private javax.swing.JTextField txtUserGuess;
    // End of variables declaration//GEN-END:variables
}

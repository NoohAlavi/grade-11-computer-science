import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author noohalavi
 */
public class frmA27 extends javax.swing.JFrame {

    ArrayList<String> carNames = new ArrayList<>();
    ArrayList<String> carSpeeds = new ArrayList<>();
    ArrayList<String> animalNames = new ArrayList<>();
    ArrayList<String> animalSpeeds = new ArrayList<>();
    
    /**
     * Creates new form frmA27
     */
    public frmA27() {
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

        jPanel1 = new javax.swing.JPanel();
        btnLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCars = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnimals = new javax.swing.JTextArea();
        txtFastestNames = new javax.swing.JLabel();
        txtFastestDiff = new javax.swing.JLabel();
        txtSlowestNames = new javax.swing.JLabel();
        txtSlowestDiff = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoad.setText("LOAD DATA!");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        txtCars.setEditable(false);
        txtCars.setColumns(20);
        txtCars.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        txtCars.setRows(5);
        txtCars.setBorder(javax.swing.BorderFactory.createTitledBorder("-Car Data-"));
        jScrollPane1.setViewportView(txtCars);

        txtAnimals.setEditable(false);
        txtAnimals.setColumns(20);
        txtAnimals.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        txtAnimals.setRows(5);
        txtAnimals.setBorder(javax.swing.BorderFactory.createTitledBorder("-Animal Data-"));
        jScrollPane2.setViewportView(txtAnimals);

        txtFastestNames.setText("The fastest car is () with a speed of () mpH, and the fastest animal is () with a speed of () mpH.");
        txtFastestNames.setVisible(false);

        txtFastestDiff.setText("The difference between the fastest car and the fastest animal is () mpH.");
        txtFastestDiff.setVisible(false);

        txtSlowestNames.setText("The slowestCar is () with a speed of () mpH, and the slowest animal is () with a speed of () mpH.");
        txtSlowestNames.setVisible(false);

        txtSlowestDiff.setText("The difference between the slowest car and the slowest animal is () mpH.");
        txtSlowestDiff.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAR VS ANIMAL SPEED ANALYSIS TOOL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFastestNames, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(txtFastestDiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSlowestNames, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                        .addComponent(txtSlowestDiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtFastestNames)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtFastestDiff)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtSlowestNames)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtSlowestDiff)
                    .addGap(18, 18, 18)
                    .addComponent(btnLoad)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
//        btnLoad.setVisible(false);
        btnLoad.setText("RELOAD DATA!");
        loadData();
        calculateNewData();
    }//GEN-LAST:event_btnLoadActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmA27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmA27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmA27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmA27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmA27().setVisible(true);
            }
        });
    }
    
    private void loadData() {
        try {
            // Load cars file            
            BufferedReader carsReader = new BufferedReader(new FileReader("src/carSpeeds.csv"));
            String line;

            while ((line = carsReader.readLine()) != null) {
                carNames.add(line.split(",")[0]);
                carSpeeds.add(line.split(",")[1]);
            }
            carsReader.close();
            
            String cars = "";
            
            for (int i = 0; i < carNames.size(); i++) {
                cars += carNames.get(i) + ": " + carSpeeds.get(i) + " mpH\n";
            }
            
            txtCars.setText(cars);
            
            // Load animals file
            BufferedReader animalsReader = new BufferedReader(new FileReader("src/animalSpeeds.csv"));
            String animalsLine;
            
            while ((line = animalsReader.readLine()) != null) {
                animalNames.add(line.split(",")[0]);
                animalSpeeds.add(line.split(",")[1]);
            }
            animalsReader.close();
            
            String animals = "";
            
            for (int i = 0; i < animalNames.size(); i++) {
                animals += animalNames.get(i) + ": " + animalSpeeds.get(i) + " mpH\n";
            }
            
            txtAnimals.setText(animals);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void calculateNewData() {
        // Calculate car data
        int slowestCarSpeed = 2147483647, fastestCarSpeed = 0; //2147483647 is max for ints
        String slowestCarName = "", fastestCarName = "";
        
        for (int i = 0; i < carNames.size(); i++) {
            int carSpeed = Integer.parseInt(carSpeeds.get(i));
            
            if (carSpeed < slowestCarSpeed) {
                slowestCarSpeed = carSpeed;
                slowestCarName = carNames.get(i);
            } 
            if (carSpeed > fastestCarSpeed) {
                fastestCarSpeed = carSpeed;
                fastestCarName = carNames.get(i);
            }
        }
        
        // Calculate animal data
        int slowestAnimalSpeed = 2147483647, fastestAnimalSpeed = 0; //2147483647 is max for ints
        String slowestAnimalName = "", fastestAnimalName = "";
        
        for (int i = 0; i < animalNames.size(); i++) {
            int animalSpeed = Integer.parseInt(animalSpeeds.get(i));
            
            if (animalSpeed < slowestAnimalSpeed) {
                slowestAnimalSpeed = animalSpeed;
                slowestAnimalName = animalNames.get(i);
            } 
            if (animalSpeed > fastestAnimalSpeed) {
                fastestAnimalSpeed = animalSpeed;
                fastestAnimalName = animalNames.get(i);
            }
        }
        
        // Output new data
        
        txtFastestNames.setText("The fastest car is the '" + fastestCarName + "' with a speed of " + fastestCarSpeed + " mpH, and the fastest animal is the '" + fastestAnimalName + "' with a speed of " + fastestAnimalSpeed + " mpH.");
        txtFastestDiff.setText("The speed difference between the fastest car and the fastest animal is " + Math.abs(fastestCarSpeed - fastestAnimalSpeed) + " mpH.");
        
        txtSlowestNames.setText("The slowest car is the '" + slowestCarName + "' with a speed of " + slowestCarSpeed + " mpH, and the slower animal is the '" + slowestAnimalName + "' with a speed of " + slowestAnimalSpeed + " mpH.");
        txtSlowestDiff.setText("The speed difference between the slowest car and the slowest animal is " + Math.abs(slowestCarSpeed - slowestAnimalSpeed) + " mpH.");
    
        txtFastestNames.setVisible(true);
        txtFastestDiff.setVisible(true);
        txtSlowestNames.setVisible(true);
        txtSlowestDiff.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAnimals;
    private javax.swing.JTextArea txtCars;
    private javax.swing.JLabel txtFastestDiff;
    private javax.swing.JLabel txtFastestNames;
    private javax.swing.JLabel txtSlowestDiff;
    private javax.swing.JLabel txtSlowestNames;
    // End of variables declaration//GEN-END:variables
}

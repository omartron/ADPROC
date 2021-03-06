/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.ButtonGroup;
/**
 *
 * @author Omar
 */
public class Input extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Input() {
        initComponents();
        groupButtons();
    }
    
    private void groupButtons(){
        buttonGroupColourPanel.add(noColour);
        buttonGroupColourPanel.add(oneColour);
        buttonGroupColourPanel.add(twoColour);
        buttonGroupReinforcementPanel.add(noReinforcement);
        buttonGroupReinforcementPanel.add(cornerReinforcement);
        buttonGroupReinforcementPanel.add(bottomReinforcement);
        sealableTopButtonGroup.add(yesSealable);
        sealableTopButtonGroup.add(noSealable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupColourPanel = new javax.swing.ButtonGroup();
        buttonGroupReinforcementPanel = new javax.swing.ButtonGroup();
        sealableTopButtonGroup = new javax.swing.ButtonGroup();
        orderButtonGroup = new javax.swing.ButtonGroup();
        boxDimensionPanel = new javax.swing.JPanel();
        lblLength = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblDimensions = new javax.swing.JLabel();
        txtLength = new java.awt.TextField();
        txtWidth = new java.awt.TextField();
        txtHeight = new java.awt.TextField();
        coloursPanel = new javax.swing.JPanel();
        lblColours = new javax.swing.JLabel();
        noColour = new javax.swing.JRadioButton();
        oneColour = new javax.swing.JRadioButton();
        twoColour = new javax.swing.JRadioButton();
        reinforcementPanel = new javax.swing.JPanel();
        lblReinforcement = new javax.swing.JLabel();
        noReinforcement = new javax.swing.JRadioButton();
        bottomReinforcement = new javax.swing.JRadioButton();
        cornerReinforcement = new javax.swing.JRadioButton();
        sealablePanel = new javax.swing.JPanel();
        lblSealableTop = new javax.swing.JLabel();
        yesSealable = new javax.swing.JRadioButton();
        noSealable = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        buttonPanel = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quote");

        boxDimensionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblLength.setText("Length:");

        lblWidth.setText("Width:");

        lblHeight.setText("Height:");

        lblDimensions.setText("Dimensions of box (m):");

        txtLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLengthActionPerformed(evt);
            }
        });

        txtWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWidthActionPerformed(evt);
            }
        });

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxDimensionPanelLayout = new javax.swing.GroupLayout(boxDimensionPanel);
        boxDimensionPanel.setLayout(boxDimensionPanelLayout);
        boxDimensionPanelLayout.setHorizontalGroup(
            boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxDimensionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxDimensionPanelLayout.createSequentialGroup()
                        .addGroup(boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxDimensionPanelLayout.createSequentialGroup()
                                    .addComponent(lblWidth)
                                    .addGap(15, 15, 15))
                                .addGroup(boxDimensionPanelLayout.createSequentialGroup()
                                    .addComponent(lblHeight)
                                    .addGap(12, 12, 12)))
                            .addGroup(boxDimensionPanelLayout.createSequentialGroup()
                                .addComponent(lblLength)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLength, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWidth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblDimensions))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxDimensionPanelLayout.setVerticalGroup(
            boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxDimensionPanelLayout.createSequentialGroup()
                .addComponent(lblDimensions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLength)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWidth, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtWidth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxDimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        coloursPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblColours.setText("Colours needed:");

        noColour.setSelected(true);
        noColour.setText("0");

        oneColour.setText("1");

        twoColour.setText("2");

        javax.swing.GroupLayout coloursPanelLayout = new javax.swing.GroupLayout(coloursPanel);
        coloursPanel.setLayout(coloursPanelLayout);
        coloursPanelLayout.setHorizontalGroup(
            coloursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coloursPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblColours)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(coloursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(twoColour)
                    .addComponent(oneColour)
                    .addComponent(noColour))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coloursPanelLayout.setVerticalGroup(
            coloursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coloursPanelLayout.createSequentialGroup()
                .addGroup(coloursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColours)
                    .addGroup(coloursPanelLayout.createSequentialGroup()
                        .addComponent(noColour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneColour)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoColour)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        reinforcementPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblReinforcement.setText("Reinforcement:");

        noReinforcement.setSelected(true);
        noReinforcement.setText("None");

        bottomReinforcement.setText("Bottom of box");

        cornerReinforcement.setText("Corners of box");
        cornerReinforcement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cornerReinforcementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reinforcementPanelLayout = new javax.swing.GroupLayout(reinforcementPanel);
        reinforcementPanel.setLayout(reinforcementPanelLayout);
        reinforcementPanelLayout.setHorizontalGroup(
            reinforcementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reinforcementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReinforcement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reinforcementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cornerReinforcement)
                    .addComponent(bottomReinforcement)
                    .addComponent(noReinforcement))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reinforcementPanelLayout.setVerticalGroup(
            reinforcementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reinforcementPanelLayout.createSequentialGroup()
                .addGroup(reinforcementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReinforcement)
                    .addComponent(noReinforcement))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomReinforcement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cornerReinforcement))
        );

        sealablePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSealableTop.setText("Sealable top:");

        yesSealable.setText("Yes");

        noSealable.setSelected(true);
        noSealable.setText("No");

        javax.swing.GroupLayout sealablePanelLayout = new javax.swing.GroupLayout(sealablePanel);
        sealablePanel.setLayout(sealablePanelLayout);
        sealablePanelLayout.setHorizontalGroup(
            sealablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sealablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSealableTop)
                .addGap(22, 22, 22)
                .addComponent(yesSealable)
                .addGap(18, 18, 18)
                .addComponent(noSealable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sealablePanelLayout.setVerticalGroup(
            sealablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sealablePanelLayout.createSequentialGroup()
                .addGroup(sealablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSealableTop)
                    .addGroup(sealablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yesSealable)
                        .addComponent(noSealable)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Quantity needed:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnOK.setText("Next");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Page 1 of 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(reinforcementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boxDimensionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(coloursPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(sealablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxDimensionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coloursPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sealablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLengthActionPerformed

    private void txtWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWidthActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void cornerReinforcementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cornerReinforcementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cornerReinforcementActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        new InputGradeOfCard().setVisible(true);
        
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bottomReinforcement;
    private javax.swing.JPanel boxDimensionPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup buttonGroupColourPanel;
    private javax.swing.ButtonGroup buttonGroupReinforcementPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel coloursPanel;
    private javax.swing.JRadioButton cornerReinforcement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColours;
    private javax.swing.JLabel lblDimensions;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblReinforcement;
    private javax.swing.JLabel lblSealableTop;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JRadioButton noColour;
    private javax.swing.JRadioButton noReinforcement;
    private javax.swing.JRadioButton noSealable;
    private javax.swing.JRadioButton oneColour;
    private javax.swing.ButtonGroup orderButtonGroup;
    private javax.swing.JPanel reinforcementPanel;
    private javax.swing.JPanel sealablePanel;
    private javax.swing.ButtonGroup sealableTopButtonGroup;
    private java.awt.TextField textField1;
    private javax.swing.JRadioButton twoColour;
    private java.awt.TextField txtHeight;
    private java.awt.TextField txtLength;
    private java.awt.TextField txtWidth;
    private javax.swing.JRadioButton yesSealable;
    // End of variables declaration//GEN-END:variables
}

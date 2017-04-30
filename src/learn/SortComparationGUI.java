/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author cristiano
 */
public class SortComparationGUI extends javax.swing.JFrame {

    /**
     * Creates new form SortComparationGUI
     */
    public SortComparationGUI() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Inserisci la dimensione dell'array e scegli tipo di sort");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcola = new javax.swing.JButton();
        ComboSort = new javax.swing.JComboBox<>();
        txtNumberOfElement = new javax.swing.JTextField();
        lblElement = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblValTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        btnCalcola.setText("Calcola");
        btnCalcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcolaActionPerformed(evt);
            }
        });

        ComboSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quick sort", "Bitonic sort", "Insertion sort", "Selection sort", "Shaker sort", "Bubble sort", "Counting sort", "Radix sort" }));
        ComboSort.setToolTipText("Choose sort method");
        ComboSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSortActionPerformed(evt);
            }
        });

        txtNumberOfElement.setText("0");
        txtNumberOfElement.setToolTipText("Array dimension");
        txtNumberOfElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfElementActionPerformed(evt);
            }
        });

        lblElement.setText("Elements");

        lblTime.setText("Time");

        lblValTime.setText("10s");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalcola))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumberOfElement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblElement))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValTime)))
                        .addGap(0, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfElement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElement))
                .addGap(49, 49, 49)
                .addComponent(ComboSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(lblValTime))
                .addGap(59, 59, 59)
                .addComponent(btnCalcola)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumberOfElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfElementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberOfElementActionPerformed

    private void ComboSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSortActionPerformed

    private void btnCalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcolaActionPerformed
       int indice;
        try{
             indice = Integer.parseInt(txtNumberOfElement.getText());
            if(indice < 1)            
                JOptionPane.showMessageDialog(null, "Dimensione vettore non possibile", "Errore", JOptionPane.WARNING_MESSAGE);  
            else
                v = new int[indice];
        }
        catch(Exception e){
        } 
        if(v.length > 0)
        {
            Random n = new Random();
            for (int i = 0; i < v.length; i++) {
                v[i] = n.nextInt();
            }
            //chiamare eventuale metodo sort
            //alert attuale
            JOptionPane.showMessageDialog(null, "Vettore ancora da Ordinare", "Wait!", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcolaActionPerformed

    /*private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
                // TODO add your handling code here:
                int vettore [] = new int [Integer.parseInt(jTextField1.getText())];
                Random r = new Random();
                for (int i = 0; i < Integer.parseInt(jTextField1.getText()); i++)
                    vettore [i] = r.nextInt();
                System.out.println("Ho popolato l'array");
                
                        
                
    }GEN-LAST:event_jButton1MouseClicked*/

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
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortComparationGUI().setVisible(true);
            }
        });
    }
//variabili dichiarate da me
    private int[] v;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSort;
    private javax.swing.JButton btnCalcola;
    private javax.swing.JLabel lblElement;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblValTime;
    private javax.swing.JTextField txtNumberOfElement;
    // End of variables declaration//GEN-END:variables
}
